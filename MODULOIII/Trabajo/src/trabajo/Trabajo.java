/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo;

/**
 *
 * @author TANIA
 */
public class Trabajo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creando el objeto persona 
        Científico profesion = new Científico();
        profesion.setProfesion("Científico");
        profesion.setActividades("Diseñar, planificar, dirigir ensayos, investigar");
        profesion.setPerfil ("Disfrutar resolviendo problemas, habilidades prácticas, imaginación y creatividad");
        profesion.setCompetencias ("Aptitudes matemáticas, creativo, habilidad para evaluar, habilidades informáticas, observador, persistente");

    System.out.println("Profesión: " + profesion.getProfesion() );
    System.out.println("Actividades: " + profesion.getActividades() );
    System.out.println("Perfil Profesional: " + profesion.getPerfil() );
    System.out.println("Competencias: " + profesion.getCompetencias() );

    }

    public static class Científico{
    //Private hace que los atributos sean accedidos dentro de la clase
        private String profesion;
        private String actividades;
        private String perfil;
        private String competencias;   

    //Métodos públicos para acceder a los datos
        public String getProfesion(){
            return profesion;
        }
        public String getActividades(){
            return actividades;
        }
        public String getPerfil(){
            return perfil;
        }
        public String getCompetencias(){
            return competencias;
        }

        //Métodos públicos para establecer los datos

        public void setProfesion(String profesion){
            this.profesion = profesion;
        }
        public void setActividades(String actividades){
            this.actividades = actividades;
        }
        public void setPerfil(String perfil){
            this.perfil = perfil;
        }
        public void setCompetencias(String competencias){
            this.competencias = competencias;
        }

    }
    
}
