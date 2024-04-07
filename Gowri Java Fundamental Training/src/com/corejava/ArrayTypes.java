package com.corejava;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayTypes {

    public static void main(String[] args) {

        int[] arr={1,2,3,4,5};
        for (int k : arr) {
            System.out.print(k + " ");
        }
        System.out.println();

        int numberOfRows = 6;
        int rows = 'A' + numberOfRows;
        int numberOfSeats = 8;

        for (char row = 'A'; row <= rows; row++) {
            for (int i = 1; i <= numberOfSeats; i++) {
                System.out.print((char)row + "" + i + " ");
            }
            System.out.println();
        }

        int[][] twoDimensionArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(twoDimensionArray[i][j]+ " ");
            }
            System.out.println();
        }

        System.out.println();
        int[] copyOfArray = new int[arr.length];
        copyOfArray = Arrays.copyOf(arr, copyOfArray.length);
        for (int elements : copyOfArray) {
            System.out.println(copyOfArray[elements-1]);
        }
        System.out.println(copyOfArray.length);
    }
}