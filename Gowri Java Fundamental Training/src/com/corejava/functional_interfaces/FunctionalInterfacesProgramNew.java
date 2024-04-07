package com.corejava.functional_interfaces;

public class FunctionalInterfacesProgramNew {

    public static void main(String[] args) {

        Runnable anonymousRun = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable with anonymous class");
            }
        };
        anonymousRun.run();

        Runnable runnable = () -> System.out.println("Runnable lambda");
        runnable.run();

        new Thread(() -> System.out.println("Thread")).start();

        new Thread(()->{
            System.out.println("Lambda 1st line");
            System.out.println("Lambda 2nd Line");
            System.out.println("Lambda 3rd Line");
        }).start();


    }
}
