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
public class Triangulo extends Formas {
    
    public Triangulo(){
        setDibujar("Triangulo");
        
        int base=10;
        int altura=2;
        double area;
        
        area = (base*altura)/2;
        
        setEstablecerColor("" + area);
    }
    
}
