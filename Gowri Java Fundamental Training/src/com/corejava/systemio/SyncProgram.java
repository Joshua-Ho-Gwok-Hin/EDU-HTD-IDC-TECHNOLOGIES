package com.corejava.systemio;

class Table {
    void printTable(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Table.printTable() Error");
        }
    }
}

public class SyncProgram{

//    public SyncProgram() {
//        (new Table()).printTable(5);
//
//    }

    public static void main(String[] args) {




        Table table = new Table();
//        table.printTable(5);
//        (new SyncProgram()).start();
        Thread thread1 = new Thread(){
            public void run() {
                table.printTable(5);

            }
        };

        Thread t2 = new Thread(thread1);





    }
}
