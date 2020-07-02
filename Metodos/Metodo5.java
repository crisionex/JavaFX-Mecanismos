/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

/**
 *
 * @author HP
 */
public class Metodo5 {
    
    public double D4(double a, double b, double T1, double T2){
        double D4 = Math.sqrt((a*a)+(b*b)-2*(a*b*Math.cos((T2-T1)*(Math.PI/180)))); 
        return D4;
    }
    
    public double T41(double a, double b, double T1, double T2){
    double T41 = Math.atan((b*Math.sin(Math.toRadians(T2))-a*Math.sin(Math.toRadians(T1)))/(b*Math.cos(Math.toRadians(T2))-a*Math.cos(Math.toRadians(T1))));
    return Math.toDegrees(T41);
}
    
}
