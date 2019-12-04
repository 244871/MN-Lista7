package com.company;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

import java.io.IOException;

public class WykresyFreeFall extends Application {


    @Override
    public void start(Stage primaryStage) throws IOException {
        FreeFall freeFall = new FreeFall();
        ModifiedEulerSolver modifiedEulerSolver = new ModifiedEulerSolver(freeFall);
        double [] solutionFreeFall = modifiedEulerSolver.integrateOdE(10, 0.5, 0);
        FreeFallExtended freeFallExtended = new FreeFallExtended();
        ModifiedEulerSolver modifiedEulerSolverExtended = new ModifiedEulerSolver(freeFallExtended);
        double [] solutionFreeFallExtended = modifiedEulerSolverExtended.integrateOdE(10, 0.5, 0);

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Wykresy dla FreeFall");

        int bound=30;
        final NumberAxis xAxis = new NumberAxis(-bound, bound, 10);
        final NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("t");
        yAxis.setLabel("v");
        yAxis.setTickUnit(2);

        final LineChart<Number, Number> chart = new LineChart(xAxis,yAxis);
        XYChart.Series<Number, Number> seriesfreefall = new XYChart.Series<>();
        seriesfreefall.setName("series free fall");
        XYChart.Series<Number, Number> seriesfreefallExtended = new XYChart.Series<>();
        seriesfreefallExtended.setName("series extended free fall");

        for (int i=0; i<solutionFreeFall.length;i++){
            seriesfreefall.getData().add(new XYChart.Data(i, solutionFreeFall[i]));
        }

        for (int i=0; i<solutionFreeFallExtended.length;i++){
            seriesfreefallExtended.getData().add(new XYChart.Data(i, solutionFreeFallExtended[i]));
        }


        Scene scena = new Scene(chart,1000,800);
        chart.getData().addAll(seriesfreefall, seriesfreefallExtended);
        chart.setCreateSymbols(false);
        primaryStage.setScene(scena);
        primaryStage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }
}
