package com.corejava.collection;

public class ArrayListProgram {

    private String name;
    private int number;
    private int mark;

    public ArrayListProgram(String name, int number, int mark) {
        this.name = name;
        this.number = number;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public int getMark() {
        return mark;
    }

    public static void main(String[] args) {
        ArrayListProgram martin = new ArrayListProgram("Martin", 101, 50);
        ArrayListProgram john = new ArrayListProgram("John", 102, 60);
        ArrayListProgram smith = new ArrayListProgram("Smith", 103, 88);
        ArrayListProgram peter = new ArrayListProgram("Peter", 104, 40);
        ArrayListProgram[] abc = {martin, john, smith, peter};

        System.out.println(abc);

        for (int i = 0; i < abc.length; i++) {
            System.out.print(abc[i].getName() + " ");
            System.out.println(abc[i].getName());
        }
    }
}
