package com.corejava;

public class DecisionMaking {

    public static void main(String[] args) {

        int mark = 20;
        String result = (50 <= mark) ? "Pass" : "Failed";
        System.out.println(result);


        if (0 <= mark && mark <= 100) {

            int grade = mark / 20;

            switch (grade) {

                case 0:
                    System.out.println("Ungraded - 0 to 19");
                    break;
                case 1:
                    System.out.println("Very Poor - 20 to 39");
                    break;
                case 2:
                    System.out.println("Poor - 40 to 59");
                    break;
                case 3:
                    System.out.println("Average - 60 to 79");
                    break;
                case 4:
                    System.out.println("Good - 80 to 99");
                    break;
                case 5:
                    System.out.println("Perfect - 100%");
                    break;
            }

        } else
            System.out.println("Invalid mark");

    }
}
