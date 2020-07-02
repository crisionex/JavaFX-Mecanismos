package Metodos;
public class Metodo4 {
    public double T31(double a, double b, double c, double T2) { double T31 = Math.asin((a * Math.sin(T2 * (Math.PI / 180)) - c) / b);return Math.toDegrees(T31);  }
    
    public double T32(double a, double b, double c, double T2) {double T32 = Math.asin(-((a * Math.sin(T2 * (Math.PI / 180)) - c) / b)) + Math.PI; return Math.toDegrees(T32);}
    
    public double D(double a, double b, double T2, double T3) { double D = a * Math.cos(Math.toRadians(T2)) - b * Math.cos(Math.toRadians(T3)); return D;}
    
    public double w3(double a, double b, double T2, double T3, double w2) { double w3 = (a / b) * (cos(T2) / cos(T3)) * w2; return w3;}
    
    public double a3(double a, double b, double a2, double w2, double w3, double T2, double T3) {double a3 = (a * a2 * cos(T2) - a * (w2 * w2) * sin(T2) + b * (w3 * w3) * sin(T3)) / (b * cos(T3));return a3;}
    
    public double AB(double a, double b, double a2, double w2, double w3, double a3, double T2, double T3) {double ab = (-a * a2 * sin(T2) - a * (w2 * w2) * cos(T2) + b * a3 * sin(T3) + b * (w3 * w3) * cos(T3));return ab;}
    
    public double AA(double a, double a2, double w2) {double AA = Math.sqrt(Math.pow((a * a2), 2) + Math.pow((-a * (w2 * w2)), 2));return AA;}
    
    public double anAA(double a, double a2, double w2,double T2) {
    double ax = (a * a2 * -Math.sin(T2 * Math.PI / 180)) - (a * w2 * w2* Math.cos(T2 * Math.PI / 180));
    double ay = (a * a2 * Math.cos(T2 * Math.PI / 180)) - (a * w2 * w2 * Math.sin(T2 * Math.PI / 180));
    double angAa = Math.atan(ay / ax);
    return Math.toDegrees(angAa);
    }
    
    public double BA(double b, double a3, double w3, double T2) {double BA = Math.sqrt(Math.pow((b * a3 ), 2) + Math.pow((-b * (w3 * w3) ), 2));return BA;}
    
    public double VA(double a, double w2){double VA = a*w2;return VA;}
    
    public double VAB(double b, double w3){double VAB = b*w3;return VAB;}
    
    public double VB(double a,double b, double w2, double T2, double w3, double T3){double VB =-a*w2*sin(T2)+b*w3*sin(T3); return VB;}
    
    public double sin(double a) {double x = Math.sin(Math.toRadians(a));return x;}
    public double cos(double a) {double x = Math.cos(Math.toRadians(a));return x;}
    public double atan(double x) {double a = Math.atan(Math.toRadians(x));return a;}
}
