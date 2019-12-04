package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

/*
        FreeFall freeFall = new FreeFall(12.5,68.1);
        EulerSolver eulerSolver = new EulerSolver(freeFall);
        double[] solutionFreeFall = eulerSolver.integrateOdE(10, 0.1, 0.9);
        System.out.println(Arrays.toString(solutionFreeFall));
*/


        Wielomian wielomian = new Wielomian();
        FreeFall freeFall = new FreeFall();
        FreeFallExtended freeFallExtended = new FreeFallExtended();
        Derivative derivative = new Derivative();


        EulerSolver eulerSolver1 = new EulerSolver(wielomian);
        double [] solutionWielomian = eulerSolver1.integrateOdE(10,0.5, 1);
        System.out.println("Wielomian metodą Eulera dla kroku całkowania = 0.5");
        System.out.println(Arrays.toString(solutionWielomian));

        ModifiedEulerSolver modifiedEulerSolver = new ModifiedEulerSolver(wielomian);
        double [] solutionWielomian2 = modifiedEulerSolver.integrateOdE(10, 0.5, 1);
        System.out.println("Wielomian zmodyfikowaną metodą Eulera dla kroku całkowania = 0.5");
        System.out.println(Arrays.toString(solutionWielomian2));

        EulerSolver eulerSolver3 = new EulerSolver(wielomian);
        double [] solutionWielomian3 = eulerSolver3.integrateOdE(10,0.25, 1);
        System.out.println("Wielomian metodą Eulera dla kroku całkowania = 0.25");
        System.out.println(Arrays.toString(solutionWielomian3));

        ModifiedEulerSolver modifiedEulerSolver4 = new ModifiedEulerSolver(wielomian);
        double [] solutionWielomian4 = modifiedEulerSolver4.integrateOdE(10, 0.25, 1);
        System.out.println("Wielomian zmodyfikowaną metodą Eulera dla kroku całkowania = 0.25");
        System.out.println(Arrays.toString(solutionWielomian4));



        ModifiedEulerSolver modifiedEulerSolver5 = new ModifiedEulerSolver(freeFall);
        double [] solutionFreeFall = modifiedEulerSolver5.integrateOdE(10, 0.5, 0);
        System.out.println("Free Fall zmodyfikowaną metodą Eulera dla kroku całkowania = 0.5");
        System.out.println(Arrays.toString(solutionFreeFall));

        ModifiedEulerSolver modifiedEulerSolver6 = new ModifiedEulerSolver(freeFallExtended);
        double [] solutionFreeFallExtended = modifiedEulerSolver6.integrateOdE(10, 0.5, 0);
        System.out.println("Free Fall dokładniejsze zmodyfikowaną metodą Eulera dla kroku całkowania = 0.5");
        System.out.println(Arrays.toString(solutionFreeFallExtended));



        EulerSolver eulerSolver7 = new EulerSolver(derivative);
        double [] solutionDerivate = eulerSolver7.integrateOdE(10,0.5, 0);
        System.out.println("Równanie metodą Eulera dla kroku całkowania = 0.5");
        System.out.println(Arrays.toString(solutionDerivate));

        ModifiedEulerSolver modifiedEulerSolver8 = new ModifiedEulerSolver(derivative);
        double [] solutionDerivate2 = modifiedEulerSolver8.integrateOdE(10, 0.5, 0);
        System.out.println("Równanie zmodyfikowaną metodą Eulera dla kroku całkowania = 0.5");
        System.out.println(Arrays.toString(solutionDerivate2));

        EulerSolver eulerSolver9 = new EulerSolver(derivative);
        double [] solutionDerivate3 = eulerSolver9.integrateOdE(10,0.25, 0);
        System.out.println("Równanie metodą Eulera dla kroku całkowania = 0.25");
        System.out.println(Arrays.toString(solutionDerivate3));

        ModifiedEulerSolver modifiedEulerSolver10 = new ModifiedEulerSolver(derivative);
        double [] solutionDerivate4 = modifiedEulerSolver10.integrateOdE(10, 0.25, 0);
        System.out.println("Równanie zmodyfikowaną metodą Eulera dla kroku całkowania = 0.25");
        System.out.println(Arrays.toString(solutionDerivate4));
    }
}
//podaj funkcję jako interface, potem lambdą przekażesz wartość

//dx/dt = f(x,t)  <-nie potrzebujemy różńiczki, bonieważ za nachylenie przyjmiemy wartość tej funkcji
//A, a interface ma się nazywać function