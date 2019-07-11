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
public class Cuadrado extends Formas {
    
    public Cuadrado(){
        setDibujar("Cuadrado");
        
        int lado1=5;
        int lado2=5;
        double area;
        
        area = lado1 * lado2;
        
        setEstablecerColor("" + area);
    }
    
}
