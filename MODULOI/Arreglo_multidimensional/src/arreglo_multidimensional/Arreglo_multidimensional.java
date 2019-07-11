/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglo_multidimensional;

/**
 *
 * @author TANIA
 */

public class Arreglo_multidimensional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [][] arrMulticompañeros ={  {"Ruth","Juarez", "Ing. Electrónica","",""},
                             {"Mario","Rivera", "Ing. Producción Industrial","",""},
                             {"Juan","Rodríguez", "Ing. Producción Industrial","",""},
                             {"David","Mejía", "Ing. Electrónica","",""},
                             {"Ana","Chavez", "Ing. Producción Industrial","",""}, 
                          };
    
    String ax="";
    
    for(int i=0; i<5; i++){
        for(int j=0; j<5; j++){
           ax+= arrMulticompañeros[i][j]+"        ";
        }
        ax+="";
    }
    
    System.out.println("" +ax);

    }
    
}
