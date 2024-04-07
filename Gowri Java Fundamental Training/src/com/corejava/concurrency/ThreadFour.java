package com.corejava.concurrency;

public class ThreadFour extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Four");
        }
    }
}