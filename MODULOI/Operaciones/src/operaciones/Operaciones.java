/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

/**
 *
 * @author TANIA
 */
public class Operaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double suma = 0;
        double resta = 0;
        double multiplicacion = 0;
        double division = 0;
        
        int numero1 = 40;
        int numero2 = 20;
        
        //Operaciones
        suma = numero1 + numero2;
        resta = numero1 - numero2;
        multiplicacion = numero1 * numero2;
        
        if (numero2 !=0){
        division = numero1 / numero2;
        }
        
        System.out.println("Suma: "+ suma);
        System.out.println("Resta: "+ resta);
        System.out.println("Multiplicación: "+ multiplicacion);
        System.out.println("División: "+ division);
    }
    
}
