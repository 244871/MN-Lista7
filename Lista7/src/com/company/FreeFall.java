package com.company;

public class FreeFall implements Function {
    private final double g=9.81;
    private double c=12.5;
    private double m=68.1;


    @Override
    public double f(double x, double t) {
        return g-c*x/m;
    }
}
