package com.company;

public class ModifiedEulerSolver {
    private Function function; //dxdt

    public ModifiedEulerSolver(Function function) { //ustalanie, z jakim równnniem różniczkowym mamy do czynienia
        this.function = function;
    }
    public double[] integrateOdE(int n, double h, double x0){
        double [] result = new double[n+1];//n+1 bo chcemy zapamiętać początkową wartość
        result[0]=x0;
        double t=0;
        for(int i=0; i<n; i++){
            double temp=result[i]+function.f(result[i], t)*h/2;
            t+=h/2;
            result[i+1]=result[i]+function.f(temp, t)*h;
            t+=h/2;
        }
        return result;
    }
}
