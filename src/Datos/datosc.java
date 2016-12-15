/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import static java.lang.reflect.Array.set;
import javax.swing.JOptionPane;
import static javax.swing.UIManager.get;

/**
 *
 * @author officedepot61417
 */
public class datosc {
    
    //String cliente,String nombre,String paterno,String materno,String direccion,String Telefono
    String cli;
    String nom; 
    String pat;
    String mat; 
    String dir;
    String tel;
    
    public datosc(){
        paterno();
    }
    
    public datosc(String cliente,String nombre,String paterno,String materno,String direccion,String telefono){
        this.cli=cliente;
        this.nom=nombre;
        this.pat=paterno;
        this.mat=materno;
        this.dir=direccion;
        this.tel=telefono;
    }
    
    public String cliente(){return this.cli;}
    public String nom(){return nom;}
    public String paterno(){return pat;}
    public String materno(){return mat;}
    public String direccion(){return dir;}
    public String telefono(){return tel;}
    
}
