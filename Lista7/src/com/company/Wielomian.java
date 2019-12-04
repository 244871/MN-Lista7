package com.company;

public class Wielomian implements Function {

    @Override
    public double f(double x, double t) {
        return -2*Math.pow(x,3)+12*Math.pow(x,2)-20*x+8.5;
    }
}

