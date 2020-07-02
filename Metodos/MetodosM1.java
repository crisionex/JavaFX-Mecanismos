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
public class MetodosM1 {

    public double k1(double a, double d) {
        double result = 0;

        result = d / a;

        return result;
    }

    public double k2(double d, double c) {
        double result = 0;

        result = d / c;

        return result;
    }

    public double k3(double a, double b, double c, double d) {
        double result = 0;
        result = ((Math.pow(a, 2) - Math.pow(b, 2) + Math.pow(c, 2) + Math.pow(d, 2)) / (2 * a * c));
        return result;
    }

    public double k4(double d, double b) {
        double result = 0;
        result = d / b;

        return result;
    }

    public double k5(double a, double b, double c, double d) {
        double result = 0;

        result = ((Math.pow(c, 2) - Math.pow(d, 2) - Math.pow(a, 2) - Math.pow(b, 2)) / (2 * a * b));
        return result;
    }

    public double a(double theta, double k1, double k2, double k3) {
        double result = 0;
        theta = Math.toRadians(theta);
        result = (Math.cos(theta) - k1 - k2 * Math.cos(theta) + k3);

        return result;
    }

    public double b(double theta) {
        double result = 0;

        theta = Math.toRadians(theta);
        result = -(2 * Math.sin(theta));

        return result;
    }

    public double c(double theta, double k1, double k2, double k3) {
        double result = 0;
        theta = Math.toRadians(theta);
        System.out.println(Math.cos(theta));

        result = (k1 - (k2 + 1) * Math.cos(theta) + k3);

        return result;
    }

    public double d(double theta, double k1, double k4, double k5) {
        double result = 0;
        theta = Math.toRadians(theta);
        result = (Math.cos(theta) - k1 + k4 * Math.cos(theta) + k5);
        return result;
    }

    public double e(double theta) {
        double result = 0;
        theta = Math.toRadians(theta);
        result = -(2 * Math.sin(theta));
        return result;
    }

    public double f(double theta, double k1, double k4, double k5) {
        double result = 0;
        theta = Math.toRadians(theta);
        result = (k1 + (k4 - 1) * Math.cos(theta) + k5);
        return result;
    }

    public double theta31(double D, double E, double F) {
        double result = 0;
        double ang = (-E - (Math.sqrt(Math.pow(E, 2) - 4 * D * F))) / (2 * D);
        result = 2 * Math.toDegrees(Math.atan(ang));

        return result;

    }

    public double theta32(double D, double E, double F) {
        double result = 0;
        double ang = (-E + (Math.sqrt(Math.pow(E, 2) - 4 * D * F))) / (2 * D);
        result = 2 * Math.toDegrees(Math.atan(ang));

        return result;
    }

    public double theta41(double A, double B, double C) {
        double result = 0;
        double ang = (-B - (Math.sqrt(Math.pow(B, 2) - 4 * A * C))) / (2 * A);
        result = 2 * Math.toDegrees(Math.atan(ang));

        return result;
    }

    public double theta42(double A, double B, double C) {
        double result = 0;
        double ang = (-B + (Math.sqrt(Math.pow(B, 2) - 4 * A * C))) / (2 * A);
        result = 2 * Math.toDegrees(Math.atan(ang));

        return result;
    }
    
    
    public double w3(double a, double b, double w2, double T2, double T3, double T4){
    double w3 = (((a*w2)/(b))*((sin(T4-T2))/(sin(T3-T4))));
    return w3;
    }
    
    public double w4(double a, double c, double w2, double T2, double T3, double T4){
    double w4 = (((a*w2)/(c))*((sin(T2-T3))/(sin(T4-T3))));
    return w4;
    }
    

    public double aa(double c, double T41){
     double aa = c*sin(T41);
        return aa;   
    }
    
    public double ab(double b, double T31){
        double ab=b*sin(T31);
     return ab;   
    }
    
    public double ac(double a, double a2, double T2, double w2, double b, double w3, double T3, double c, double w4, double T4){
    double ac =a*a2*sin(T2)+a*(w2*w2)*cos(T2)+b*(w3*w3)*cos(T3)-c*(w4*w4)*cos(T4);
        return ac;
    }
    
    public double ad(double c, double T4){
        double ad =c*cos(T4);
        return ad;
    }
    
    public double ae(double b, double T3){
       double ae = b*cos(T3);
        return ae;
    }
    
    public double af(double a, double a2, double T2, double w2, double b, double w3, double T3, double c, double w4, double T4){
    double ac =a*a2*cos(T2)-a*(w2*w2)*sin(T2)-b*(w3*w3)*sin(T3)+c*(w4*w4)*sin(T4);
    return ac;
    }
        
    public double a3(double aa,double ab, double ac, double ad, double ae, double af){
       double a3=(((ac*ad)-(aa*af))/((aa*ae)-(ab*ad)));
        return a3;
    }
    
   public double a4(double aa,double ab, double ac, double ad, double ae, double af){
       double a4=(((ac*ae)-(ab*af))/((aa*ae)-(ab*ad)));
        return a4;
    }
    
    public double sin(double a){
     double x = Math.sin(Math.toRadians(a));
     return x;   
    }
    
    public double cos(double a){
        double x = Math.cos(Math.toRadians(a));
        return x;
    }
    
}
