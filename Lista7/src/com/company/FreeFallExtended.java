package com.company;

public class FreeFallExtended implements Function {
    private final double g=9.81;
    private double c=12.5;
    private double m=68.1;
    private double a=8.3;
    private double b=2.2;
    private double vmax=46;


    @Override
    public double f(double x, double t) {
        return (g-(c*x/m)*(x+a*(Math.pow((x/vmax), b))));
    }
}
