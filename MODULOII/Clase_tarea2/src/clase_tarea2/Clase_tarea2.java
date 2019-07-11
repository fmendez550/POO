/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_tarea2;

/**
 *
 * @author TANIA
 */
public class Clase_tarea2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        resources resources = new resources(); //Instancia de la clase Mensajes
        resources.Mensaje();                  //Llamar los métodos en esa clase por medio de objeto mensajes
        resources.nota(70);               //Llamar el segundo método
        resources.division(40,10,0);       // Llamar el tercer método
        resources.lista(20);        //Llamar el cuarto método
        resources.Despedida();      //Llama el quinto método
        }

            public static class resources {

          //Método que no recibe parámetro de entrada ni retorna valor
          public void Mensaje() {
            System.out.println("Estoy aprendiendo, pero sere el mejor programador");
        }

          //Método que  recibe parámetro entero para imprimir un valor
          public void nota(int calificacion) {
          if (calificacion >= 70){
             System.out.println("Aprobado");
          }else{
             System.out.println("Reprobado");
             }
        }
          
          //Método que recibe dos parametros para realizar la división
          public void division (int numero1, int numero2, double divisi){
              if (numero2 !=0){
                  divisi= numero1 / numero2;
                  System.out.println("La división es: " + divisi);
              }
              else{
                  System.out.println("El denominador no puede ser 0 ");
              }
              
          }
          
          //Método que recibe un parametro x
          public void lista (int x){
            System.out.println("Acontinuacion se muestra la lista de números del 1 al X");
            for (int i = 1; i <=x; i++){
                System.out.println("Número: " + i);
            }
              
          }
          
          //Método para despedirme
          public void Despedida() {
            System.out.println("Saludos Ing. Le saluda Rolando Estrada");
        }

    }
    
}
