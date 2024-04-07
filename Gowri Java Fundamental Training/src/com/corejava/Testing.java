package com.corejava;

public class Testing {

    public static void main(String[] args) {

        int[][] array_var = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        {int sum = 0;
            for (int i=0;i<3;++i) for (int j=0;i<3;++j)
                sum = sum + array_var[i][j];
            System.out.println(sum / 5);}
    }
}
