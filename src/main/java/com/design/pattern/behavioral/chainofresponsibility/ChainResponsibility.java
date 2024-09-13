package com.design.pattern.behavioral.chainofresponsibility;

public class ChainResponsibility {

    public static void main(String[] args) {
        // Example usage of Chain of Responsibility Pattern
        LogProcesser logProcesser = new INFOLogProcesser(
                new DEBUGLogProcesser(
                        new ERRORLogProcesser(null)));

        logProcesser.log(1, " INFO Hello world");
        logProcesser.log(2, "Debug occurred");
        logProcesser.log(3, "ERROR Something went wrong");

    }
}
