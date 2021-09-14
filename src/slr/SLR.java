/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slr;

import java.io.File;
import java.util.Scanner;
import slr.dummyData;
/**
 *
 * @author ftm
 */
public class SLR {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     dummyData Data = new dummyData();
     final double [][] dataset = Data.getDummyData();
     LinearRegresion SLP;
     double x;
     
     System.out.println("Please introduce the x value");
     x = sc.nextDouble();
     SLP = new LinearRegresion(dataset, x);
     
     SLP.RE();
     SLP.PrintYH();
     

      
        
    }
    
}
