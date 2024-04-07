package com.corejava.concurrency;

public class ThreadOne extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("One");
        }
    }
}
