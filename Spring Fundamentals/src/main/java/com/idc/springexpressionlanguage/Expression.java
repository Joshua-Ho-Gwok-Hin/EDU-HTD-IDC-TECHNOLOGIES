package com.idc.springexpressionlanguage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Expression {

    @Value("#{22+11}")
    private int x;

    @Value("#{22+11}")
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Expression{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
