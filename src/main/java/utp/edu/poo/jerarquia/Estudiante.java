/*
 * Clase Padre: Persona
 * CLASE DERIVADA ESTUDIANTE
 */
package utp.edu.poo.jerarquia;
/**
 * Versión 1.0
 * @author Jhoel RN MH
 */
public class Estudiante extends Persona {
    
    //ATRIBUTOS
    private int puntuacionTotal;
    private int numeroCalificaciones;
    
    //CONSTRUCTORES

    

    public Estudiante(int puntuacionTotal, int numeroCalificaciones, String nombre, String fechaNacimiento, int dni) {
        super(nombre, fechaNacimiento, dni);
        this.puntuacionTotal = puntuacionTotal;
        this.numeroCalificaciones = numeroCalificaciones;
    }
    
    //METODOS GETTER Y SETTER
    public double getNotaMedia(){
        return (double) puntuacionTotal/numeroCalificaciones;
    }
    //METODOS PUBLICOS
    public void nuevaCalificacion(int puntos){
        puntuacionTotal += puntos;
        numeroCalificaciones++;
    }
    
    
    public void imprimirDatos(){
        System.out.println("--------------");
        System.out.println("ESTUDIANTE");
        super.imprimirDatos();  // LLAMADO A METODO DEL PADRE
        System.out.println("NOTA MEDIA: "+getNotaMedia());
        System.out.println("--------------");
    }
    
}
