/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficas;

/**
 *
 * @author HP
 */
public class CPlotter {
  
    
    
 public double  grapher(double a, double b, double c, double w2, double a2, double x) {
	 double idk= (-a*a2*sin(x))-(a*(w2*w2)*cos(x))+(b*((a*a2*cos(x)-a*(w2*w2)*sin(x)+b*Math.pow(((a/b)*((cos(x))/(cos(asin(-((a*sin(x)-c)/(b)))+180)))*w2),2)*sin(asin(-((a*sin(x)-c)/(b)))+180))/(b*cos(asin(-((a*sin(x)-c)/(b)))+180)))*sin(asin(-((a*sin(x)-c)/(b)))+180))+(b*(Math.pow(((a/b)*((cos(x))/(cos(asin(-((a*sin(x)-c)/(b)))+180)))*w2),2))*cos(asin(-((a*sin(x)-c)/(b)))+180));

	 return idk;
 }
 
 public double grapher1(double a, double b, double c, double w2, double a2, double x) {
	 double idk= (a*a2*cos(x)-a*(w2*w2)*sin(x)+b*Math.pow(((a/b)*((cos(x))/(cos(asin(-((a*sin(x)-c)/(b)))+180)))*w2),2)*sin(asin(-((a*sin(x)-c)/(b)))+180))/(b*cos(asin(-((a*sin(x)-c)/(b)))+180));
	 return idk;
 }
 
 public double  grapher2(double a, double b, double c, double w2, double a2, double x) {
	 double idk= (a/b)*((cos(x))/(cos(asin(-((a*sin(x)-c)/(b)))+180)))*w2;
	 return idk;
 }
 
 public double grapher3(double a, double b, double c, double w2, double a2, double x) {
	 double idk = asin(-((a*sin(x)-c)/(b)))+180;
 return idk;
 }
 
 public double graphera31(double a, double b, double c, double w2, double a2, double x) {
	 double idk = ((a*a2*cos(x)-a*(w2*w2)*sin(x)+b*Math.pow(((a/b)*((cos(x))/(cos(asin((a*sin(x)-c)/(b)))))),2)*sin(asin((a*sin(x)-c)/(b))))/(b*cos(asin((a*sin(x)-c)/(b)))));

 return idk;
 }
 
 public double grapheraB1(double a, double b, double c, double w2, double a2, double x) {
	 double idk = (-a*a2*sin(x)-a*(w2*w2)*cos(x)+b*(((a*a2*cos(x)-a*(w2*w2)*sin(x)+b*Math.pow(((a/b)*((cos(x))/(cos(asin((a*sin(x)-c)/(b)))))),2)*sin(asin((a*sin(x)-c)/(b))))/(b*cos(asin((a*sin(x)-c)/(b))))))*sin(asin((a*sin(x)-c)/(b)))+b*Math.pow(((a/b)*((cos(x))/(cos(asin((a*sin(x)-c)/(b)))))),2)*cos(asin((a*sin(x)-c)/(b))));
         
 return idk;
 }
 
    
    public double sin(double a){
     double x = Math.sin(Math.toRadians(a));
     return x;   
    }
    
    public double asin(double a){
        double x = Math.asin(Math.toRadians(a));
        return x;   
       }
    
    public double cos(double a){
        double x = Math.cos(Math.toRadians(a));
        return x;
    }
    
}
