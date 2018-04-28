package com.javaPlus.designpattern.adapter.interfaceAdapter;

import java.io.File;

public class FileMonitor extends InterfaceAdapter {

    //暴露给用户的类,只需要实现Create和Delete方法

    @Override
    public void onDirectoryCreate(File directory) {
        super.onDirectoryCreate(directory);//自己的实现逻辑
    }

    @Override
    public void onDirectoryDelete(File directory) {
        super.onDirectoryDelete(directory);
    }
}
