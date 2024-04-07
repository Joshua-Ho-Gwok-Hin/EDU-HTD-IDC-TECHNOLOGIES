package com.corejava.concurrency;

public class RunnableOne implements Runnable {
    @Override
    public void run() {
        for (int i=0;i<20;i++)
        System.out.print("R1 ");
    }
}
