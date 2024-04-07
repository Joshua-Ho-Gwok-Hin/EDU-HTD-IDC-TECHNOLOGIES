package com.corejava.concurrency;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("My Runnable Thread");
    }
}
