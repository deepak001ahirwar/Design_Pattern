package com.design.pattern.behavioral.chainofresponsibility;

public abstract  class LogProcesser {

    public static  int INFO = 1;
    public static  int DEBUG = 2;
    public static  int ERROR = 3;

    protected LogProcesser nextProcesser;

    public  LogProcesser(LogProcesser nextProcesser) {
        this.nextProcesser = nextProcesser;
    }

    public void log(int loglevel,String message) {

        if (nextProcesser != null) {
            nextProcesser.log(loglevel, message);
        }
    }
}
