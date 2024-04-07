package com.corejava.concurrency;

public class Main {

    public static void main(String[] args) {


//        Thread one = new ThreadOne();
//        one.start();
//
//        Thread two = new ThreadTwo();
//        two.start();
//
//        Thread three = new ThreadThree();
//        three.start();
//
//        Thread four = new ThreadFour();
//        four.start();

        (new Thread(new RunnableOne())).start();


        Thread runnableR1 = new Thread(new RunnableOne());
        runnableR1.start();



        Thread nextThread = new Thread(new MyRunnable());
        nextThread.start();

        System.out.println("getContextClassLoader() " + nextThread.getContextClassLoader());
        System.out.println("getId() " + nextThread.getId());
        System.out.println("getThreadGroup() " + nextThread.getThreadGroup());



        new Thread(){
            public void run() {
                System.out.println("Anonymous Thread");
            }
        }.start();
    }
}
