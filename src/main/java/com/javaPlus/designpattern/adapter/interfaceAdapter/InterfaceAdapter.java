package com.javaPlus.designpattern.adapter.interfaceAdapter;

import java.io.File;

//接口适配器,接口的实现均为钩子方法,具体实现给需要暴露给用户的类实现
public class InterfaceAdapter implements FileAlterationListener {

    @Override
    public void onDirectoryCreate(File directory) {

    }

    @Override
    public void onDirectoryChange(File directory) {

    }

    @Override
    public void onDirectoryDelete(File directory) {

    }

    @Override
    public void onFileCreate(File file) {

    }

    @Override
    public void onFileChange(File file) {

    }

    @Override
    public void onFileDelete(File file) {

    }
}
