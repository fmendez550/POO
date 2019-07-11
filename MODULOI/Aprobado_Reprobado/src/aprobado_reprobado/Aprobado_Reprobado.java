/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprobado_reprobado;

/**
 *
 * @author TANIA
 */
public class Aprobado_Reprobado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] compañeros = new String[1];
        
        compañeros[0] = "Kenia Paola";
        int nota = 65;
        
        System.out.println(" "
                + compañeros[0] 
        );
        
        System.out.println(" "
                + nota
        );
        
        if(nota<=70){
            System.out.println(" Reprobado ");
        }
        else{
            System.out.println("Aprobado ");
        }
        
        
    }
    
}
