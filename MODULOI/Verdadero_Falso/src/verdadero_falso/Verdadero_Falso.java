/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verdadero_falso;

/**
 *
 * @author TANIA
 */
public class Verdadero_Falso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int M = 6, T=1, K=-10;
        
        //Evaluando si M es mayor que
        if(M>T){
            System.out.println("Verdadero");
        }
        else{
            System.out.println("Falso");
        }
        
        //Evaluando si T entre K es igual a -5
        if(T/K == -5){
            System.out.println("Verdadero");
        }
        else{
            System.out.println("Falso");
        }
        
        //Evaluando si (M+T==7) o (M-T==5)
        if(M+T == 7 || M-T==5){
            System.out.println("Verdadero");
        }
        else{
            System.out.println("Falso");
        }
    }
    
}
