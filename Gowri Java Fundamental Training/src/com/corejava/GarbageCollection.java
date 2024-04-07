package com.corejava;

public class GarbageCollection {

    public static void main(String[] args) {

        GarbageCollection garbageCollection = new GarbageCollection();
        GarbageCollection garbageCollection1 = new GarbageCollection();

        garbageCollection = null;
        garbageCollection1 = null;
        GarbageCollection garbageCollection2 = new GarbageCollection();
        GarbageCollection garbageCollection3 = new GarbageCollection();
        garbageCollection2 = garbageCollection3;
        System.gc();
    }

    protected void finalize() {
        System.out.println("Garbage collection done successfully");
    }
}
