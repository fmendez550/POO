/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

/**
 *
 * @author TANIA
 */
public class Formas {
    
    //atributo
    private String dibujar;
    
    private String establecercolor;
    
    //Constructor
    public Formas(){
        //Constructor sin parametros
    }
    
    //Establecer y obtener
    public void setDibujar(String dibujar){
        this.dibujar = dibujar;
    }
    
    public String getDibujar(){
        return this.dibujar;
    }
    
    //Establecer y obtener
    public void setEstablecerColor(String establecercolor){
        this.establecercolor = establecercolor;
    }
    
    public String getEstablecerColor(){
        return this.establecercolor;
    }
    
    //Método general
    public void imprimirInformacion(){
        System.out.println("Nombre:" + dibujar);
        System.out.println("Resultado:" + establecercolor);
    }
    
    
    
}
