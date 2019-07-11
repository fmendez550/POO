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
public class Circulo extends Formas {
    //Constructor
    public Circulo(){
        setDibujar("Circulo");
        
        int c=15;
        double pi=3.14;
        double radio;
        double denom;
        
        denom=2*pi;
        
        radio=c/denom;
        
        setEstablecerColor("" + radio);
    }
    
}
