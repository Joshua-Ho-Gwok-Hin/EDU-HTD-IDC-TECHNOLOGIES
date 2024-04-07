//package com.corejava.systemio;
//
//class Book implements Runnable{
//
//    public void run() {
//        for (int i = 0; i < 10; i++) {
////            if (i == 5) {
////                try {
////                    Thread.sleep(1000);
////                } catch (InterruptedException e) {
////
////                }
////            }
//            System.out.println("Running Book Runnable " + i);
//        }
//    }
//}
//
//class Display extends Thread {
//    public void run() {
//
//
//        for (int i = 0; i < 10; i++) {
////            if (i == 5) {
////                try {
////                    Thread.sleep(1000);
////                } catch (InterruptedException e) {
////
////                }
////            }
//            System.out.println("Running Display Thread " + i);
//        }
//    }
//}
//
//public class MultithreadingProgram{
//
//    public static void main(String[] args) {
//
//        Book book = new Book();
//        Display display = new Display();
//        Thread tDisplay = new Thread(display);
//        System.out.println(display.isAlive());
//        tDisplay.start();
//        book.run();
////        display.start();
//        System.out.println("Java Program");
//    }
//}
