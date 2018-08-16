package com.javaPlus.java.proxy.jdk;


import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

//将类文件加载到JVM虚拟机中
public class MyClassLoader extends ClassLoader {

    private File fileDir;

    public MyClassLoader() {
        String basePath = MyClassLoader.class.getResource("").getPath();
        this.fileDir = new File(basePath);
    }


    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        String className = MyClassLoader.class.getPackage().getName() + "." + name;
        if (fileDir != null) {
            File classFile = new File(fileDir, name.replaceAll("\\.", "/") + ".class");
            if (classFile.exists()) {
                FileInputStream inputStream = null;
                try {
                    inputStream = new FileInputStream(classFile);
                    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                    byte[] bytes = new byte[1024];
                    int len;
                    while ((len = inputStream.read(bytes)) != -1) {
                        outputStream.write(bytes, 0, len);
                    }
                    return defineClass(className, outputStream.toByteArray(), 0, outputStream.size());
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    classFile.delete();
                }
            }
        }
        return null;
    }
}
