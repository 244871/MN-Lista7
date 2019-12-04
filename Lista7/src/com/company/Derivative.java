package com.company;

public class Derivative implements Function{

    @Override
    public double f(double x, double t) {
        return x*Math.pow(t,2)-1.1*x;
    }
}
