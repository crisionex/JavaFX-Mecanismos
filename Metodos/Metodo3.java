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
public class Metodo3 {
    
    public double A(double a, double T2, double T4){
        double A = -2*a*(Math.cos((T2-T4) * (Math.PI / 180)));   
        return A;
    }
    
    public double B(double a, double b, double c, double T2, double T4){
        double B =2*(c*a)*Math.sin((T2-T4)* (Math.PI / 180))+(a*a)-(b*b)+(c*c);
        return B;
    }
    
    public double d1 (double A, double B){
        double d1 =((-A+ Math.sqrt((A*A)-4*B)))/2;
        return d1;
    }
    
        public double d2 (double A, double B){
        double d2 =((-A- Math.sqrt((A*A)-4*B)))/2;
        return d2;
    }
             
    public double T31(double a, double b, double c, double T2, double T4){
        double G = b*Math.sin(T4*(Math.PI/180));
        System.out.println(G);
        double H = -b*Math.cos(T4*(Math.PI/180));
        System.out.println(H);
        double I = -c-a*Math.sin((T2-T4)*(Math.PI/180));
        System.out.println(I);
        double T32= 2*Math.atan((-H -Math.sqrt((G*G)+(H*H)-(I*I)))/(I-G));
        return T32*(180/Math.PI);
    }
    
        public double T32(double a, double b, double c, double T2, double T4){
        double G = b*Math.sin(T4*(Math.PI/180));
        System.out.println(G);
        double H = -b*Math.cos(T4*(Math.PI/180));
        System.out.println(H);
        double I = -c-a*Math.sin((T2-T4)*(Math.PI/180));
        System.out.println(I);
        double T32= 2*Math.atan(((-H + Math.sqrt((G*G)+(H*H)-(I*I)))/(I-G)));
        return T32*(180/Math.PI);
    }

    
}

