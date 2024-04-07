package com.idc.Constructors;

import org.springframework.context.annotation.Bean;

public class DebitCard implements InterfaceClass {

    int limit;
    String bankName;

    public DebitCard(int limit, String bankName) {
        this.limit = limit;
        this.bankName = bankName;
    }

    @Override
    public void details() {
        System.out.println("This is debit card and credit limit is " +
                limit + "issued from bank "+
                bankName);
    }
}
