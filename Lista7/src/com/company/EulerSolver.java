package com.company;

public class EulerSolver {
    private Function function; //dxdt

    public EulerSolver(Function function) { //ustalanie, z jakim równnniem różniczkowym mamy do czynienia
        this.function = function;
    }
    public double[] integrateOdE(int n, double h, double x0){
        double [] result = new double[n+1];//n+1 bo chcemy zapamiętać początkową wartość
        result[0]=x0;
        double t=0;
        for(int i=0; i<n; i++){
            result[i+1]=result[i]+function.f(result[i], t)*h;
            t+=h;
        }
        return result;
    }
}
