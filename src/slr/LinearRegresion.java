/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slr;

/**
 *
 * @author ftm
 */
public class LinearRegresion {

    private double dataset[][];
    private double sumx, sumy, sumxy, sumxsq, x;

    public LinearRegresion(double[][] dataset, double x) {
        this.dataset = dataset;
        this.x = x;
        Generate();
    }

    private void Generate() {
        for (int i = 0; i < dataset.length; i++) {
            sumx += dataset[i][1];
            sumy += dataset[i][0];
            sumxsq += dataset[i][1] * dataset[i][1];
            sumxy += dataset[i][1] * dataset[i][0];
        }
    }

    private double B0() {
        return (sumxsq * sumy - sumx * sumxy) / (dataset.length * sumxsq - (sumx * sumx));
    }

    private double B1() {
        return (dataset.length * sumxy - sumx * sumy) / (dataset.length * sumxsq - (sumx * sumx));
    }

    private double CalculateYH() {
        return (B0() + B1() * x);
    }

    //regresion ecuation
    public void RE() {
        System.out.println("Y" + (char) 94 + "=" + B0() + "+"+B1() + "(" + x + ")");
    } 
    
    public void PrintYH() {
        System.out.println("Y" + (char) 94 + "="+ CalculateYH());
    } 
    
}
