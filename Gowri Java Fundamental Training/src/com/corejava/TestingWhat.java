package com.corejava;

import java.util.ArrayList;

class TestingWhat {

    public static void main(String[] args) {
        for (int i = 0; i < 3; ++i) {
            System.out.print(i + " ");
        }

        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
        }

//        19,

        Object ojb = new Object();
        System.out.println(ojb.getClass());
    }


    void add() {
    ArrayList trytyriji = new ArrayList<>();

        trytyriji.add(this);
    }

}
