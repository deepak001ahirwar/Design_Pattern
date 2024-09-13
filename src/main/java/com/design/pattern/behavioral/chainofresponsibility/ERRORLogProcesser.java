package com.design.pattern.behavioral.chainofresponsibility;

public class ERRORLogProcesser extends LogProcesser {

    public ERRORLogProcesser(LogProcesser nextProcesser) {
        super(nextProcesser);
    }

    @Override
    public void log(int loglevel, String message) {

        if (loglevel == ERROR) {
            System.out.println("ERROR: " + message);
        } else {
            nextProcesser.log(loglevel, message);
        }

    }
}
