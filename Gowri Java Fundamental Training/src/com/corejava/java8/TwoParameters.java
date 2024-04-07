package com.corejava.java8;

@FunctionalInterface
interface TwoParameters {
    int twoParameters(int a, int b);
}

class AverageClass {
    static int getAverage(int a, int b) {
        return (a+b)/2;
    }
}

class SumClass {
    static int getSum(int a, int b) {
        return a+b;
    }
}

class FunctionInterfaceProgram2 {

    public static void main(String[] args) {

        TwoParameters twoParameters = AverageClass::getAverage;
        int result = twoParameters.twoParameters(10,20);

        System.out.println("lambda = " + result);



        TwoParameters twoParameters1 = AverageClass::getAverage;
        int result2 = twoParameters1.twoParameters(10, 20);

        System.out.println("method reference = " + result2);



        TwoParameters twoParameters2 = SumClass::getSum;
        int result3 = twoParameters2.twoParameters(10, 20);

        System.out.println(result3);

        TwoParameters twoParameters3 = new TwoParameters() {
            @Override
            public int twoParameters(int a, int b) {
                return a - b;
            }
        };
        System.out.println("overriding = " + twoParameters3.twoParameters(30,2));

        new TwoParameters() {
            @Override
            public int twoParameters(int a, int b) {
                int something = (a + b) * 10;
                System.out.println("Anonymous interface = " + something);
                return something;
            }
        }.twoParameters(9, 1);









    }

}
