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
public class Estudiante {
 
    //Mi nombre
    private String nombre;
    
    //Mi edad
    private int edad;
    
    //Años de experiencia
    private int anio;
    
    public void setNombre(String _nombre){
        this.nombre = _nombre;
    }
    
    //Métodos Set y Get nombre
    public String getNombre(){
        return nombre;
    }
    
    //Métodos Set y Get Edad
    public void setEdad(int _edad){
        this.edad = _edad;
    }
    
    public int getEdad(){
        return edad;
    }
    
    //Métodos Set y Get Años de experiencia
    public void setAnio(int _anio){
        this.anio = _anio;
    }
    
    public int getAnio(){
        return anio;
    }
    
}
