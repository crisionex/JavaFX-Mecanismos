/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructor;

/**
 *
 * @author HP
 */
public class Resultados {
   private  String d3 = "";
   private  String seccion3 = "";
   private  String d4 = "";
   private  String seccion4 = "";
    
    
    public Resultados(String d3, String seccion3, String d4, String seccion4){
        this.d3  =  d3;
        this.seccion3 = seccion3;
        this.d4 = d4;
        this.seccion4 = seccion4;
       
        
    }

    public String getD3() {
        return d3;
    }

    public void setD3(String d3) {
        this.d3 = d3;
    }

    public String getSeccion3() {
        return seccion3;
    }

    public void setSeccion3(String seccion3) {
        this.seccion3 = seccion3;
    }

    public String getD4() {
        return d4;
    }

    public void setD4(String d4) {
        this.d4 = d4;
    }

    public String getSeccion4() {
        return seccion4;
    }

    public void setSeccion4(String seccion4) {
        this.seccion4 = seccion4;
    }

   

    
}
