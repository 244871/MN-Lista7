package com.company;

public class OdETester {
    FreeFall freeFall = new FreeFall();
    EulerSolver eulerSolver = new EulerSolver(freeFall); //ma być EulerSolver
    double[] solution = eulerSolver.integrateOdE(100, 0.1, 0);

}
