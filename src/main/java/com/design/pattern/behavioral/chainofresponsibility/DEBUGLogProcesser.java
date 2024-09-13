package com.design.pattern.behavioral.chainofresponsibility;

public class DEBUGLogProcesser extends  LogProcesser {


    public DEBUGLogProcesser(LogProcesser nextProcesser) {
        super(nextProcesser);
    }

    public void log(int level, String message) {
        if (level == DEBUG) {
            System.out.println(" DEBUG: " + " message: " + message);
        } else {
            nextProcesser.log(level, message);
        }
    }
}
