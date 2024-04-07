package com.corejava.systemio;

public class NameThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        try {
            Thread.sleep(100);

        } catch (InterruptedException interruptedException) {
            System.out.println("Angry NameThread");
        }
    }
}
