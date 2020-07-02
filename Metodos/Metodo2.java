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
public class Metodo2 {

    public double A(double a, double c, double d, double T1, double T2) {
        double A = 2 * c * ((d * Math.cos(T1 * (Math.PI / 180))) - (a * Math.cos(T2 * (Math.PI / 180))));
        System.out.println(A);
        return A;
    }

    public double B(double a, double c, double d, double T1, double T2) {
        double B = 2 * c * ((d * Math.sin(T1 * (Math.PI / 180))) - (a * Math.sin(T2 * (Math.PI / 180))));
        System.out.println(B);
        return B;
    }

    public double C(double a, double b, double c, double d, double T1, double T2) {
        double C = (d * d) + (a * a) - (b * b) + (c * c) - 2 * d * a * Math.cos((T1 - T2) * (Math.PI / 180));
        return C;
    }

    public double R41(double A, double B, double C) {
        double R41 = (-B - (Math.sqrt((A * A) + (B * B) - (C * C)))) / (C - A);
        return R41;
    }

    public double R42(double A, double B, double C) {
        double R42 = (-B + (Math.sqrt((A * A) + (B * B) - (C * C)))) / (C - A);
        return R42;
    }

    public double T41(double R41) {
        double T41 = 2 * Math.atan(R41) * (180 / Math.PI);
        return T41;
    }

    public double T42(double R42) {
        double T42 = 2 * Math.atan(R42) * (180 / Math.PI);
        return T42;
    }

    public double D(double a, double b, double d, double T1, double T2) {
        double D = 2 * b  * ((a * Math.cos(T2 * (Math.PI / 180))) - (d * Math.cos(T1 * (Math.PI / 180))));
        return D;
    }

    public double E(double a, double b, double d, double T1, double T2) {
        double E = 2 * b * ((a * Math.sin(T2 * (Math.PI / 180))) - (d * Math.sin(T1 * (Math.PI / 180))));
        return E;
    }

    public double F(double a, double b, double c, double d, double T1, double T2) {
        double F = (d * d) + (a * a) + (b * b) - (c * c) - 2 * d * a * Math.cos((T2 - T1) * (Math.PI / 180));
        return F;
    }

    public double R31(double D, double E, double F) {
        double R31 = (-E + (Math.sqrt((D * D) + (E * E) - (F * F)))) / (F - D);
        return R31;
    }

    public double R32(double D, double E, double F) {
        double R32 = (-E - (Math.sqrt((D * D) + (E * E) - (F * F)))) / (F - D);
        return R32;
    }

    public double T31(double R31) {
        double T31 = 2 * Math.atan(R31) * (180 / Math.PI);
        return T31;
    }

    public double T32(double R32) {
        double T32 = 2 * Math.atan(R32) * (180 / Math.PI);
        return T32;
    }

}
