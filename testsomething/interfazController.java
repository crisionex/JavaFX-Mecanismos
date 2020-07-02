/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsomething;

import Constructor.Resultados;
import Metodos.MetodosM1;
import Metodos.Metodo2;
import Metodos.Metodo3;
import Metodos.Metodo4;
import Metodos.Metodo5;
import animatefx.animation.*;
import graficas.CPlotter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Quilantan
 */
public class interfazController implements Initializable {
    @FXML
    private Button informacion;
    @FXML
    private Pane inf;
    

    //variable de ejemplo, so is no useful
    @FXML
    private VBox some;
    @FXML
    private Button salvar;
    @FXML
    private ComboBox cbox;

    //botones para accionar paneles (1 por mecanismo)
    @FXML
    private Button test;
    @FXML
    private Button test1;
    @FXML
    private Button test2;
    @FXML
    private Button test3;
    @FXML
    private Button test4;
    @FXML
    private Button btnC;

    //declaracion de botones de calculo
    @FXML
    private Button calcular;
    @FXML
    private Button calcular2;
    @FXML
    private Button calcular3;
    @FXML
    private Button calcular1;
    @FXML
    private Button calcular4;
    @FXML
    private Button plotter;

    //declaracion de paneles a usar (1 panel por mecanismo)
    @FXML
    private Pane barrasSimple;
    @FXML
    private Pane barrasDescentrado;
    @FXML
    private Pane desc;
    @FXML
    private Pane invertido;
    @FXML
    private Pane barrasDesfazado;

    //elementos del primer mecanismo
    @FXML
    private TextField txta;
    @FXML
    private TextField txtb;
    @FXML
    private TextField txtc;
    @FXML
    private TextField txtd;
    @FXML
    private TextField txt2;
    @FXML
    private TextField txta2;
    @FXML
    private TableView<Resultados> tblResultados;
    @FXML
    private TableColumn<Resultados, String> d3;
    @FXML
    private TableColumn<Resultados, String> d4;
    @FXML
    private TableColumn<Resultados, String> seccion3;
    @FXML
    private TableColumn<Resultados, String> seccion4;

    //elementos del segundo mecanismo
    @FXML
    private TextField txta1;
    @FXML
    private TextField txtb1;
    @FXML
    private TextField txtc1;
    @FXML
    private TextField txtd1;
    @FXML
    private TextField txt21;
    @FXML
    private TextField txtan1;
    @FXML
    private TableView<Resultados> tblResultados1;
    @FXML
    private TableColumn<Resultados, String> d31;
    @FXML
    private TableColumn<Resultados, String> d41;
    @FXML
    private TableColumn<Resultados, String> seccion31;
    @FXML
    private TableColumn<Resultados, String> seccion41;

    //elementos del tercer mecanismo
    @FXML
    private TextField txta222;
    @FXML
    private TextField txtb2;
    @FXML
    private TextField txtc2;
    @FXML
    private TextField txt22;
    @FXML
    private TextField txta22;
    @FXML
    private TableView<Resultados> tblResultados2;
    @FXML
    private TableColumn<Resultados, String> d32;
    @FXML
    private TableColumn<Resultados, String> d42;
    @FXML
    private TableColumn<Resultados, String> seccion32;
    @FXML
    private TableColumn<Resultados, String> seccion42;

    //elementos de cuarto mecanismo
    @FXML
    private TextField txta3;
    @FXML
    private TextField txtb3;
    @FXML
    private TextField txtc3;
    @FXML
    private TextField txt3;
    @FXML
    private TextField txtac3;
    @FXML
    private TextField txtve3;
    @FXML
    private TableView<Resultados> tblResultados3;
    @FXML
    private TableColumn<Resultados, String> d33;
    @FXML
    private TableColumn<Resultados, String> d43;
    @FXML
    private TableColumn<Resultados, String> seccion33;
    @FXML
    private TableColumn<Resultados, String> seccion43;

    //elementos del quinto y ultimo mecanismo
    @FXML
    private TextField txta4;
    @FXML
    private TextField txtb4;
    @FXML
    private TextField txtan41;
    @FXML
    private TextField txtan42;
    @FXML
    private TableView<Resultados> tblResultados4;
    @FXML
    private TableColumn<Resultados, String> d34;
    @FXML
    private TableColumn<Resultados, String> d44;
    @FXML
    private TableColumn<Resultados, String> seccion34;
    @FXML
    private TableColumn<Resultados, String> seccion44;
    
    @FXML
    private CategoryAxis x;
    
    @FXML
    private NumberAxis y;
    
    @FXML
    private LineChart<?,?> plotterx;
    
    boolean Salvar = false;

    String txt = "   ";
    
    double T31, T32, T41, T42, D41, D42, w31, w32, w41, w42, a31, a32, a41, a42;
    double AaB1, AaB2, AmB1, AmB2, AnAA;
    double xi,x2,x3,x4;
    double ga,gb,gc,gT2,gw2,ga2,aa,aba1,aba2, VA,VB1,VB2, VAB1, VAB2, Anaa;
    int xc=0;
    
    MetodosM1 met1 = new MetodosM1();
    Metodo2 met2 = new Metodo2();
    Metodo3 met3 = new Metodo3();
    Metodo4 met4 = new Metodo4();
    Metodo5 met5 = new Metodo5();
    CPlotter plot = new CPlotter();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //creando tablas para cada no de los paneles (mecanismos)

        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Tabla del mecanismo 1>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>        
        d3.setCellValueFactory(new PropertyValueFactory<>("D3"));

        seccion3.setCellValueFactory(new PropertyValueFactory<>("Seccion3"));

        d4.setCellValueFactory(new PropertyValueFactory<>("D4"));

        seccion4.setCellValueFactory(new PropertyValueFactory<>("Seccion4"));

        tblResultados.setItems(getResultados());

        //linea de creacion de tabla en caso de no usarla dentro del POM de FXML, buena alternativa si se busca tener mas libertad en los datos a insertar xdxdxd
        //tblResultados.getColumns().addAll(d3, seccion3, d4, seccion4);
        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Tabla de mecanismo 2>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        d31.setCellValueFactory(new PropertyValueFactory<>("D3"));

        seccion31.setCellValueFactory(new PropertyValueFactory<>("Seccion3"));

        d41.setCellValueFactory(new PropertyValueFactory<>("D4"));

        seccion41.setCellValueFactory(new PropertyValueFactory<>("Seccion4"));

        tblResultados1.setItems(getResultados1());

        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Tabla del mecanismo 3>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        d32.setCellValueFactory(new PropertyValueFactory<>("D3"));

        seccion32.setCellValueFactory(new PropertyValueFactory<>("Seccion3"));

        d42.setCellValueFactory(new PropertyValueFactory<>("D4"));

        seccion42.setCellValueFactory(new PropertyValueFactory<>("Seccion4"));

        tblResultados2.setItems(getResultadosdes());

        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Tabla del mecanismo 4>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        d33.setCellValueFactory(new PropertyValueFactory<>("D3"));

        seccion33.setCellValueFactory(new PropertyValueFactory<>("Seccion3"));

        d43.setCellValueFactory(new PropertyValueFactory<>("D4"));

        seccion43.setCellValueFactory(new PropertyValueFactory<>("Seccion4"));

        tblResultados3.setItems(getResultadosb());

        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Tabla del mecanismo 5>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        d34.setCellValueFactory(new PropertyValueFactory<>("D3"));

        seccion34.setCellValueFactory(new PropertyValueFactory<>("Seccion3"));

        d44.setCellValueFactory(new PropertyValueFactory<>("D4"));

        seccion44.setCellValueFactory(new PropertyValueFactory<>("Seccion4"));

        tblResultados4.setItems(getResultadosi());
        
        
        //iniciando componentes del combobox
        cbox.getItems().removeAll(cbox.getItems());
        cbox.getItems().addAll("Grafica-1", "Grafica-2");
        cbox.getSelectionModel().select("Graficas");
            String r =(String) cbox.getValue();
            
            if(r.equals("1")){
                grafica1(ga,gb,gc,gw2,ga2);
            }else if(r.equals("2")){
                grafica2(ga,gb,gc,gw2,ga2);
            }

        //iniciando animacion de los botones al iniciar el programa
        test.setDisable(true);
        test1.setDisable(true);
        test2.setDisable(true);
        test3.setDisable(true);
        test4.setDisable(true);
        
        new ZoomIn(test).play();
        new ZoomIn(test1).play();
        new ZoomIn(test2).play();
        new ZoomIn(test3).play();
        new ZoomIn(test4).play();
       
    }

    @FXML
    public void infox(ActionEvent e){
        inf.toFront();
        new FadeIn(inf).play();
    }
    
    //iniciando mecanismo 1 (mostrara el panel del mecanismo y asu vez se vera una animacion slide jeje)
    @FXML
    public void mbcd(ActionEvent e) {
        new Pulse(test4).play();
        desc.toFront();
        new SlideInLeft(desc).play();
    }

    //iniciando mecanismo 2 (mostrara el panel del mecanismo y asu vez se vera una animacion slide jeje)
    @FXML
    public void mbci(ActionEvent e) {
        new Pulse(test3).play();

        invertido.toFront();
        new SlideInLeft(invertido).play();
    }

    //iniciando mecanismo 3 (mostrara el panel del mecanismo y asu vez se vera una animacion slide jeje)
    @FXML
    public void barraDesc(ActionEvent e) {
        new Pulse(test2).play();

        barrasDescentrado.toFront();
        new SlideInLeft(barrasDescentrado).play();
    }

    //iniciando mecanismo 4 (mostrara el panel del mecanismo y asu vez se vera una animacion slide jeje)
    @FXML
    public void barraDes(ActionEvent e) {
        new Pulse(test1).play();

        barrasDesfazado.toFront();
        new SlideInLeft(barrasDesfazado).play();
    }

    //iniciando mecanismo 5 (mostrara el panel del mecanismo y asu vez se vera una animacion slide jeje)
    @FXML
    public void barSim(ActionEvent e) {
        new Pulse(test).play();

        barrasSimple.toFront();
        new SlideInLeft(barrasSimple).play();
    }

    //Metodo para salir del programa
    @FXML
    public void Cerrar(ActionEvent e) {
        if (e.getSource() == btnC) {
            System.exit(0);
        }
    }

    // Calculos del mecanismo 1
    @FXML
    public void Calcular(ActionEvent e) {
            try {
                calcular.setStyle("-fx-background-color: #636363");
                new FadeIn(calcular).play();

                double A1, B1, C1, D1;

                double a1, b1, c1, d1, e1, f1, theta;
                
                double w2, del3, a2, aa,ab,ac,ad,ae,af;
                

                A1 = Double.parseDouble(txta.getText());
                B1 = Double.parseDouble(txtb.getText());
                C1 = Double.parseDouble(txtc.getText());
                D1 = Double.parseDouble(txtd.getText());

                theta = Double.parseDouble(txt2.getText());

                double k1 = met1.k1(A1, D1);
                double k2 = met1.k2(D1, C1);
                double k3 = met1.k3(A1, B1, C1, D1);
                double k4 = met1.k4(D1, B1);
                double k5 = met1.k5(A1, B1, C1, D1);

                a1 = met1.a(theta, k1, k2, k3);
                b1 = met1.b(theta);
                c1 = met1.c(theta, k1, k2, k3);
                d1 = met1.d(theta, k1, k4, k5);
                e1 = met1.e(theta);
                f1 = met1.f(theta, k1, k4, k5);

                T31 = met1.theta31(d1, e1, f1);
                T32 = met1.theta32(d1, e1, f1);
                T41 = met1.theta41(a1, b1, c1);
                T42 = met1.theta42(a1, b1, c1);

                /*a2 = Double.parseDouble(txta2.getText());

                aa = met1.aa(C1, T41);
                ab = met1.ab(B1, T31);
                ad = met1.ad(C1, T41);
                ae = met1.ae(B1, T31);*/

                //inhabilitado por consumo
               /* txt = (",,,===Mecanismo 4 Barras simple===\n\nConstantes   ,, ,Angulos   ,, ,Velocidades   ,, ,Aceleraciones\n"+"K1: ,"+k1+",,Theta 3-1: ,"+T31
                        +",,W3: ,"+w31+",,a3: ,"+a31+"\nK2: ,"+k2+",,Theta 3-2: ,"+T32+",,W4: ,"+w41+",,a4: ,"+a41+"\nK3: ,"+k3+",,Theta 4-1: ,"+T41+"\nK4: ,"+k4
                        +",,Theta 4-2: ,"+T42+"\n"+"K5: ,"+k5+"\n\n\n");*/

                tblResultados.setItems(getResultados());
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Datos ingresados Erroneos, verifique", "ERROR", JOptionPane.ERROR_MESSAGE);
                calcular.setStyle("-fx-background-color: #f54d4d");
                new Shake(calcular).play();
            }
        
    }

    //calculos del mecanismo 2
    @FXML
    public void Calcular1(ActionEvent e) {
        if (txta1.getText().equals("") || txtb1.getText().equals("") || txtc1.getText().equals("") || txtd1.getText().equals("") || txt21.getText().equals("")) {

            calcular1.setStyle("-fx-background-color: #f54d4d");
            new Shake(calcular1).play();
        } else {

            try {
                calcular1.setStyle("-fx-background-color: #636363");
                new FadeIn(calcular1).play();

                double A1, B1, C1, D1;

                double a1, b1, c1, d1, e1, f1, theta1, theta2;

                A1 = Double.parseDouble(txta1.getText());
                B1 = Double.parseDouble(txtb1.getText());
                C1 = Double.parseDouble(txtc1.getText());
                D1 = Double.parseDouble(txtd1.getText());

                theta2 = Double.parseDouble(txt21.getText());
                theta1 = Double.parseDouble(txtan1.getText());

                a1 = met2.A(A1, C1, D1, theta1, theta2);
                b1 = met2.B(A1, C1, D1, theta1, theta2);
                c1 = met2.C(A1, B1, C1, D1, theta1, theta2);
                d1 = met2.D(A1, B1, D1, theta1, theta2);
                e1 = met2.E(A1, B1, D1, theta1, theta2);
                f1 = met2.F(A1, B1, C1, D1, theta1, theta2);

                double R31 = met2.R31(d1, e1, f1);
                double R32 = met2.R32(d1, e1, f1);
                double R41 = met2.R41(a1, b1, c1);
                double R42 = met2.R42(a1, b1, c1);

                T31 = met2.T31(R31);
                T32 = met2.T32(R32);
                T41 = met2.T41(R41);
                T42 = met2.T42(R42);
                //inhabilitado por consumo
                //txt += ("\n,===Datos TBLM2===\n\nTheta 3 ,, Theta  4\n"+"Theta 3-1: ,"+T31+",Theta 4-1: ,"+T41+"\nTheta 3-2: ,"+T32+",Theta 4-2: ,"+T42);
                
                tblResultados1.setItems(getResultados1());
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Datos ingresados Erroneos, verifique", "ERROR", JOptionPane.ERROR_MESSAGE);
                calcular1.setStyle("-fx-background-color: #f54d4d");
                new Shake(calcular1).play();
            }
        }
    }

    //calculos del mecanismo 3
    @FXML
    public void Calcular2(ActionEvent e) {
        if (txta222.getText().equals("") || txtb2.getText().equals("") || txtc2.getText().equals("") || txt22.getText().equals("") || txta22.getText().equals("")) {

            calcular2.setStyle("-fx-background-color: #f54d4d");
            new Shake(calcular2).play();
        } else {

            try {
                calcular2.setStyle("-fx-background-color: #636363");
                new FadeIn(calcular2).play();
                double a, b, c, A, B, T2, T4;

                a = Double.parseDouble(txta222.getText());
                b = Double.parseDouble(txtb2.getText());
                c = Double.parseDouble(txtc2.getText());
                T2 = Double.parseDouble(txt22.getText());
                T4 = Double.parseDouble(txta22.getText());

                A = met3.A(a, T2, T4);
                B = met3.B(a, b, c, T2, T4);

                D41 = met3.d1(A, B);
                D42 = met3.d2(A, B);

                if (D42 < 0) {
                    D42 *= -1;
                }

                T31 = met3.T31(a, b, c, T2, T4);
                T32 = met3.T32(a, b, c, T2, T4);
                
                
                //inhabilitado por consumo
               // txt += ("\n\n\n\n===Tabla Mecanismo 3===\n\n Constantes ,, Barras ,, Angulos\n"+"A: ,"+A+", D4-1: ,"+D41+",Theta 3-1: ,"+T31+"\nB: ,"+B+",D4-2: ,"+D42+",Theta 3-2: ,"+T32);

                tblResultados2.setItems(getResultadosdes());
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Datos ingresados Erroneos, verifique", "ERROR", JOptionPane.ERROR_MESSAGE);
                calcular2.setStyle("-fx-background-color: #f54d4d");
                new Shake(calcular2).play();
            }
        }
    }

    //calculos del mecanismo 4
    @FXML
    public void Calcular3(ActionEvent e) {
        if (txta3.getText().equals("") || txtb3.getText().equals("") || txtc3.getText().equals("")  || txta3.getText().equals("") || txtac3.getText().equals("") || txtve3.getText().equals("")) {

            calcular3.setStyle("-fx-background-color: #f54d4d");
            new Shake(calcular3).play();
        } else {

            try {
                calcular3.setStyle("-fx-background-color: #636363");
                new FadeIn(calcular3).play();
                double a, b, c, T2, w2, a2, temp31, temp32;

                a = Double.parseDouble(txta3.getText());
                ga = a;
                b = Double.parseDouble(txtb3.getText());
                gb = b;
                c = Double.parseDouble(txtc3.getText());
                gc = c;
                T2 = Double.parseDouble(txt3.getText());
                //setgT2(T2);
                w2 = Double.parseDouble(txtve3.getText());
                gw2 = w2;
                a2 = Double.parseDouble(txtac3.getText());
                ga2 = a2;
                
                T31 = met4.T31(a, b, c, T2);
               // System.out.println(T31);
                T32 = met4.T32(a, b, c, T2);
               // System.out.println(T32);
                
                temp31 = T31;
                temp32 = T32;   
                if(T31<T32){
                    T31 = temp32;
                    T32 = temp31;
                }
                
                
                D41 = met4.D(a, b, T2, T31);
                D42 = met4.D(a, b, T2, T32);
                
                w31 = met4.w3(a, b, T2, T31, w2);
                w32 = met4.w3(a, b, T2, T32, w2);
                
                a31 = met4.a3(a, b, a2, w2, w31, T2, T31);
                a32 = met4.a3(a, b, a2, w2, w32, T2, T32);
                
                aba1 = met4.BA(b, a31, w31, T2);
                aba2 = met4.BA(b, a32, w32, T2);
                
                VA = Math.abs(met4.VA(a, w2));
                VAB1 = Math.abs(met4.VA(b, w31));
                VAB2 = Math.abs(met4.VA(b, w32));
                VB1 = met4.VB(a, b, w2, T2, w31, T31);
                VB2 = met4.VB(a, b, w2, T2, w32, T32);
                
                AnAA = met4.anAA(a, a2, w2,T2);
                System.out.println(AnAA);
                
                
                
                AmB1 = met4.AB(a, b, a2, w2, w31, a31, T2, T31);
                if(AmB1 <0){
                    AmB1*=-1;
                    AaB1 = 180;
                }else{
                    AaB1 = 0;
                }
                
                AmB2 = met4.AB(a, b, a2, w2, w32, a32, T2, T32);               
                if(AmB2 <0){
                    AmB2 *=-1;
                    AaB2 = 180;
                }  else{
                    AaB2 = 0;
                }
                
                if(D41<0){
                    D41 *=-1;
                }
                if(D42<0){
                    D42 *=-1;
                }
                aa = met4.AA(a, a2, w2);
                
                txt += ("\n\n===Datos TblMBCD===\n\n\nAngulos,,,Barras,,,Velocidades,,,Aceleraciones\n"+"Theta 3-1: ,"+T31+",,Barra d-1: ,"+D41+",,W3-1: ,"+w31+",,a31: ,"+a31
                        +"\nTheta 3-2: ,"+T32+",,Barra d-2: ,"+D42+",,W3-2: ,"+w32+",,a32: ,"+a32+"\n Angulo AB1: ,"+AaB1+",,,,,,,,"+"Aceleracion AB1: ,"+AmB1+"\n Angulo AB2: ,"+AaB2+",,,,,,,,"+"Aceleracion AB2: ,"+AmB2
                        +"\n,"+",,,,,,,,"+"Aceleracion ABA1: ,"+aba1+"\n ,"+",,,,,,,,"+"Aceleracion ABA2: ,"+aba2+"\n,"+",,,,,,,,"+"Aceleracion AA1: ,"+aa+"\n ,"+",,,,,,,,"+"Aceleracion AA2: ,"+aa);

                tblResultados3.setItems(getResultadosb());
                
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Datos ingresados Erroneos, verifique", "ERROR", JOptionPane.ERROR_MESSAGE);
                calcular3.setStyle("-fx-background-color: #f54d4d");
                new Shake(calcular3).play();
            }
        }
    }

    //calculos del mecanismo 5 uwu
    @FXML
    public void Calcular4(ActionEvent e) {
        if (txta4.getText().equals("") || txtb4.getText().equals("") || txtan41.getText().equals("") || txtan42.getText().equals("")) {

            calcular4.setStyle("-fx-background-color: #f54d4d");
            new Shake(calcular4).play();
        } else {

            try {
                calcular4.setStyle("-fx-background-color: #636363");
                new FadeIn(calcular4).play();
                double a, b, T1, T2;

                a = Double.parseDouble(txta4.getText());
                b = Double.parseDouble(txtb4.getText());

                T1 = Double.parseDouble(txtan41.getText());
                T2 = Double.parseDouble(txtan42.getText());

                T41 = met5.T41(a, b, T1, T2);

                if (T41 < 0) {
                    T41 += 180;
                }
                
                D41 = met5.D4(a, b, T1, T2);
                //inhabilitado por consumo
                //txt += ("===Datos TBLM5===\n\n\n"+"--Angulos--\n"+"Theta 4: "+T41+"\n\n"+"--Barras--\n"+"D4: "+D41+"\n");
                
                tblResultados4.setItems(getResultadosi());
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Datos ingresados Erroneos, verifique", "ERROR", JOptionPane.ERROR_MESSAGE);
                calcular4.setStyle("-fx-background-color: #f54d4d");
                new Shake(calcular4).play();
            }
        }
    }

    //metodos para insertar informacion dentro del super constructor, jejeje un poquito de polimorfismo
    //tabla 1, mecanismo 1 
    public ObservableList<Resultados> getResultados() {
        ObservableList<Resultados> resultados = FXCollections.observableArrayList();
        resultados.add(new Resultados("Theta 3 Abierto", String.format("%.4f", T31), "Theta4 Abierto", String.format("%.4f", T41)));
        resultados.add(new Resultados("Theta 3 Cerrado", String.format("%.4f", T32), "Theta4 Cerrado", String.format("%.4f", T42)));
       // resultados.add(new Resultados("Aceleracion 3"  , String.format("%.4f", a31) , "Aceleracion 4" , String.format("%.4f" , a41)));
        //resultados.add(new Resultados("Velocidad 3"    , String.format("%.4f", w31) , "Velocidad 4"   , String.format("%.4f" , w41)));
        return resultados;
    }
    
        //tabla 1, mecanismo  2
        public ObservableList<Resultados> getResultados1() {
        ObservableList<Resultados> resultados = FXCollections.observableArrayList();
        resultados.add(new Resultados("Theta 3 Abierto", String.format("%.4f", T31), "Theta4 Abierto", String.format("%.4f", T41)));
        resultados.add(new Resultados("Theta 3 Cerrado", String.format("%.4f", T32), "Theta4 Cerrado", String.format("%.4f", T42)));
        //resultados.add(new Resultados("Ac 3", String.format("%.4f", a3), "Ac 4", String.format("%.4f", a4)));
        //resultados.add(new Resultados("Ve 3", String.format("%.4f", w3), "Ve 4", String.format("%.4f", w4)));
        return resultados;
    }

    //tabla 2, mecanismo 3 
    public ObservableList<Resultados> getResultadosdes() {
        ObservableList<Resultados> resultados = FXCollections.observableArrayList();
        resultados.add(new Resultados("Theta 3 Abierto", String.format("%.4f", T31), "D4-1", String.format("%.4f", D41)));
        resultados.add(new Resultados("Theta 3 Cerrado", String.format("%.4f", T32), "D4-2", String.format("%.4f", D42)));
        //resultados.add(new Resultados("Ac 3", "", "", ""));
        //resultados.add(new Resultados("Ve 3", "", "", ""));
        return resultados;
    }

    //tabla 3, mecanismo 4
    public ObservableList<Resultados> getResultadosb() {
        ObservableList<Resultados> resultados = FXCollections.observableArrayList();
        resultados.add(new Resultados("Theta 3", Double.toString(T31),"Theta 3", Double.toString(T32)));
        resultados.add(new Resultados("Barra d", String.format("%.4f", D41), "Barra d", String.format("%.4f", D42)));
       
        resultados.add(new Resultados("ω3", String.format("%.4f", w31), "ω3", String.format("%.4f", w32)));
        resultados.add(new Resultados("VA", String.format("%.4f", VA), "VA", String.format("%.4f", VA)));
        resultados.add(new Resultados("VAB", String.format("%.4f", VAB1), "VAB", String.format("%.4f", VAB2)));
        resultados.add(new Resultados("VB", String.format("%.4f", VB1), "VB", String.format("%.4f", VB2)));
        
        resultados.add(new Resultados("α3", String.format("%.4f", a31), "α3", String.format("%.4f", a32)));
        resultados.add(new Resultados("AB", String.format("%.4f", AmB1), "AB", String.format("%.4f", AmB2)));
        resultados.add(new Resultados("Angulo AB", String.format("%.4f", AaB1), "Angulo AB", String.format("%.4f", AaB2)));
        resultados.add(new Resultados("AA", String.format("%.4f", aa), "AA", String.format("%.4f", aa)));
        resultados.add(new Resultados("Angulo AA", String.format("%.4f", AnAA), "Angulo AA", String.format("%.4f", AnAA)));
        resultados.add(new Resultados("ABA", String.format("%.4f", aba1), "ABA", String.format("%.4f", aba2)));
        return resultados;
    }

    //tabla 4, mecanismo 5
    public ObservableList<Resultados> getResultadosi() {
        ObservableList<Resultados> resultados = FXCollections.observableArrayList();
        resultados.add(new Resultados("Theta 4", String.format("%.4f", T41), "Barra D", String.format("%.4f", D41)));
        //resultados.add(new Resultados("Ac 4", "", "", ""));
        //resultados.add(new Resultados("Ve 4", "", "", ""));
        return resultados;
    }
    
    
    public void setSalvar(ActionEvent e) throws FileNotFoundException{
        Calendar c = new GregorianCalendar();
        int m, s,h;
        h = c.get(Calendar.HOUR_OF_DAY);
        m = c.get(Calendar.MINUTE);
        s = c.get(Calendar.SECOND);

        
        if(txt == null){    
         System.out.println("ctm");
        JOptionPane.showMessageDialog(null, "No hay nada que guardar", "Sin datos", JOptionPane.ERROR_MESSAGE);            
        }
        else{
        try (PrintWriter out = new PrintWriter("Tablas de "+h+m+s+".csv")) {
        out.println(txt);
          }
        
             FileChooser fileChooser = new FileChooser();
              //Set extension filter
              FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("Archivos de Datos Excel(*.csv)", "*.csv");
              fileChooser.getExtensionFilters().add(extFilter);
              
              //Show save file dialog
              File file = fileChooser.showSaveDialog(null);
              
              if(file != null){
                  SaveFile(txt, file);
              }
                 JOptionPane.showMessageDialog(null, "Guardado Correctamente", "", JOptionPane.INFORMATION_MESSAGE);   
        }
        }


    private void SaveFile(String content, File file){
        try {
            FileWriter fileWriter = null;
             
            fileWriter = new FileWriter(file);
            fileWriter.write(content);
            fileWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(interfazController.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }
 
    public void grafica2(double ga,double gb,double gc,double gw2,double ga2){    
        xc=0;
            try{
                XYChart.Series series = new XYChart.Series();
                series.setName("AB-1");
                XYChart.Series series2 = new XYChart.Series();
                series2.setName("w3-1");
                plotterx.getData().clear();
                plotterx.setCreateSymbols(false);                    
                for(double i=0;i<360;i+=0.1) {            
	        double gT31 = met4.T32(ga, gb, gc, i);
	        double gw31 = met4.w3(ga, gb, i, gT31, gw2);	        
	        double ga31 = met4.a3(ga, gb, ga2, gw2, gw31, i, gT31);      
                double ABx = met4.AB(ga, gb, ga2, gw2, gw31, ga31, i, gT31);
                xi = ABx;      
                x2 = met4.w3(ga,gb, i, T31, gw2);
                series.getData().add(new XYChart.Data(Integer.toString(xc/10),xi));
                series2.getData().add(new XYChart.Data(Integer.toString(xc/10),x2));
                xc++;
                }
                plotterx.getData().addAll(series2);
                plotterx.getData().addAll(series);
            }catch(Exception x){
                
            }
    }
    
        public void grafica1(double ga,double gb,double gc,double gw2,double ga2){
            xc=0;
            try{
                XYChart.Series series = new XYChart.Series();
                series.setName("AB-1");
                XYChart.Series series2 = new XYChart.Series();
                series2.setName("w3-1");
                plotterx.getData().clear();
                plotterx.setCreateSymbols(false);                    
                for(double i=0;i<360;i+=0.1) {            
	        double gT31 = met4.T31(ga, gb, gc, i);
	        double gw31 = met4.w3(ga, gb, i, gT31, gw2);	        
	        double ga31 = met4.a3(ga, gb, ga2, gw2, gw31, i, gT31);      
                double ABx = met4.AB(ga, gb, ga2, gw2, gw31, ga31, i, gT31);
                xi = ABx;      
                x2 = met4.w3(ga,gb, i, T31, gw2);
                series.getData().add(new XYChart.Data(Integer.toString(xc/10),xi));
                series2.getData().add(new XYChart.Data(Integer.toString(xc/10),x2));
                xc++;
                }
                plotterx.getData().addAll(series2);
                plotterx.getData().addAll(series);

            }catch(Exception x){
                
            }
    }
        
        @FXML
        public void basement(ActionEvent e){
           String r =(String) cbox.getValue();
            
            if(r.equals("Grafica-1")){
                grafica1(ga,gb,gc,gw2,ga2);
            }else if(r.equals("Grafica-2")){
                grafica2(ga,gb,gc,gw2,ga2);
            }
        }
        
        @FXML
        public void setConfirmar(ActionEvent e){
            new FadeOut(inf).play();
            barrasSimple.toFront();
        test.setDisable(false);
        test1.setDisable(false);
        test2.setDisable(false);
        test3.setDisable(false);
        test4.setDisable(false);
            //new FadeOut(inf).play();
        }
        
        
        @FXML
        public void setCancelar(ActionEvent e){
            System.exit(0);
            
        }
        
}
