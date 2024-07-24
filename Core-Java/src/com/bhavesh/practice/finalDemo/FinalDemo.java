package com.bhavesh.practice.finalDemo;

public class FinalDemo {

    public static final String GREETING_MSG = "hello Pune";
    public final String GREETING_MSG_TO_WORLD = "Hello World";

    public static void main(String[] args) {
        FinalDemo finalDemo = new FinalDemo();
        System.out.println("Msg = " + GREETING_MSG );
        System.out.println("Msg = " + finalDemo.GREETING_MSG_TO_WORLD);
    }
}
