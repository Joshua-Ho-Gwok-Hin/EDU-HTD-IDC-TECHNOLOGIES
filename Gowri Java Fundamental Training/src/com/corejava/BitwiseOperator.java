package com.corejava;

public class BitwiseOperator {

    public static void main(String[] args) {

        int num1 = 1;
        int num2 = 2;
        System.out.println("Bitwise |(or) of " + num1 + " and "+ num2 + " is " + (num1 | num2));
        System.out.println("Bitwise &(and) of " + num1 + " and "+ num2 + " is " + (num1 & num2));
        System.out.println("Bitwise ~(complement) of " + num1 + " and "+ num2 + " is " + (num1 & num2));
        System.out.println("Bitwise ^(xor) of " + num1 + " and "+ num2 + " is " + (num1 ^ num2));
        System.out.println("Bitwise >>(signed right shift) of " + num1 + " and "+ num2 + " is " + (num1 >> num2));
        System.out.println("Bitwise <<(signed left shift) of " + num1 + " and "+ num2 + " is " + (num1 << num2));

        int num3 = Integer.MAX_VALUE;
        for (int i=0; i<6; i++){
            num3 >>= i;
            System.out.println(num3);
        }
    }
}