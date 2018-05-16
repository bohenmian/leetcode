package com.javaPlus.designpattern.responsibility;

public class Handler {

    protected Handler successor;    //链表中的后继节点

    public Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    //处理请求
    public void handleRequest(int request) {

    }
}
