package com.idc.Constructors;

public class CreditCard implements InterfaceClass{

    int limit;
    String bankName;

    public CreditCard(int limit, String bankName) {
        this.limit = limit;
        this.bankName = bankName;
    }

    public void details() {
        System.out.println("This is credit card and credit limit is " +
                limit + "issued from bank "+
                bankName);
    }
}
