package com.design.pattern.behavioral.chainofresponsibility;

public class INFOLogProcesser extends LogProcesser {

    public INFOLogProcesser(LogProcesser nextProcesser) {
        super(nextProcesser);
    }

    public void log(int level, String message) {
        if (level == INFO) {
            System.out.println(" INFO: " + " message: " + message);
        } else {
            nextProcesser.log(level, message);
        }
    }
}
