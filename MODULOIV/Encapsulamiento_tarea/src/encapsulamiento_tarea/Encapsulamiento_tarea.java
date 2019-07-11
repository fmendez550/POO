/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamiento_tarea;

import helpers.Estudiante;

/**
 *
 * @author TANIA
 */
public class Encapsulamiento_tarea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante estudiante = new Estudiante();
        
        //Establecer valor a variable privada
        estudiante.setNombre("Rolando Estrada");
        estudiante.setEdad(22);
        estudiante.setAnio(1);
        
        //Imprimir valor de variables privadas
        System.out.println(estudiante.getNombre());
        System.out.println(estudiante.getEdad());
        System.out.println(estudiante.getAnio());
        
    }
    
}
