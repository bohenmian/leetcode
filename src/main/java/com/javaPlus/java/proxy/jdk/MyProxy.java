package com.javaPlus.java.proxy.jdk;


import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//生成代理对象的代码
public class MyProxy {

    private static String ln = "\r\n";

    public static Object newProxyInstance(MyClassLoader loader,
                                          Class<?>[] interfaces,
                                          MyInvocationHandler h)
            throws IllegalArgumentException {
        try {
            //1. 生成源代码
            String proxySrc = generateSrc(interfaces[0]);
            //2. 将生成的源代码保存为.java文件

            //3. 编译源代码,生成.class文件
            String filePath = MyProxy.class.getResource("").getPath();
            File file = new File(filePath + "$Proxy0.java");
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(proxySrc);
            fileWriter.flush();

            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager manager = compiler.getStandardFileManager(null, null, null);
            Iterable iterable = manager.getJavaFileObjects(file);
            JavaCompiler.CompilationTask task = compiler.getTask(null, manager, null, null, null, iterable);
            task.call();
            manager.close();

            //4. 将class文件动态加载到JVM中
            Class proxyClass = loader.findClass("$Proxy0");

            //5. 返回被代理后的对象
            Constructor constructor = proxyClass.getConstructor(MyInvocationHandler.class);
            file.delete();
            return constructor.newInstance(h);
        } catch (IOException | ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InvocationTargetException | InstantiationException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static String generateSrc(Class<?> interfaces) {
        StringBuffer buffer = new StringBuffer();
        buffer.append("package com.javaPlus.java.proxy.jdk;" + ln);
        buffer.append(ln);
        buffer.append("import java.lang.reflect.Method;" + ln);
        buffer.append(ln);
        buffer.append("public final class $Proxy0 implements" + " " + interfaces.getName() + " {" + ln);
        buffer.append(ln);
        buffer.append("    MyInvocationHandler h;" + ln);
        buffer.append(ln);
        buffer.append("    public $Proxy0(MyInvocationHandler h) {" + ln);
        buffer.append("        this.h = h;" + ln);
        buffer.append("    }" + ln);
        buffer.append(ln);
        for (Method m : interfaces.getMethods()) {
            buffer.append("    public " + m.getReturnType().getName() + " " + m.getName() + "() {" + ln);
            buffer.append("        try {" + ln);
            buffer.append("            Method m = " + interfaces.getName() + ".class.getMethod(\"" + m.getName() + "\", new Class[]{});" + ln);
            buffer.append("            this.h.invoke(this, m, null);" + ln);
            buffer.append("        } catch (Throwable e) {" + ln);
            buffer.append("            e.printStackTrace();" + ln);

            buffer.append("        }" + ln);
            buffer.append("    }" + ln);
        }
        buffer.append("}");
        return buffer.toString();
    }
}
