package com.javaPlus.designpattern.adapter.interfaceAdapter;

import java.io.File;

//给定接口,但是只需要实现其中的Create和Delete方法,但是如果实现该接口的话就要实现接口中的所有方法,所以此时可以用适配器适配一个接口
public interface FileAlterationListener {

    void onDirectoryCreate(final File directory);

    void onDirectoryChange(final File directory);

    void onDirectoryDelete(final File directory);

    void onFileCreate(final File file);

    void onFileChange(final File file);

    void onFileDelete(final File file);

}
