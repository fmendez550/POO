/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_herencia;

import helpers.Circulo;
import helpers.Cuadrado;
import helpers.Linea;
import helpers.Triangulo;

/**
 *
 * @author TANIA
 */
public class Tarea_herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circulo circulo = new Circulo();
        Linea linea = new Linea();
        Triangulo triangulo = new Triangulo();
        Cuadrado cuadrado = new Cuadrado();
        
        System.out.println("Forma 1:");
        circulo.imprimirInformacion();
        
        System.out.println("Forma 2:");
        linea.imprimirInformacion();
        
        System.out.println("Forma 3:");
        triangulo.imprimirInformacion();
        
        System.out.println("Forma 4:");
        cuadrado.imprimirInformacion();
    }
    
}
