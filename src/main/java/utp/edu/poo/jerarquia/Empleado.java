/*
 * Clase Padre: Persona
 * CLASE DERIVADA EMPLEADO
 */
package utp.edu.poo.jerarquia;

/**
 * Versión 1.0
 * @author Jhoel RN MH
 */

public class Empleado extends Persona{
    
    
    //ATRIBUTOS
    //private double sueldoBase;
    protected double sueldoBase;  // uso de protected!!!!
    
    //CONSTRUCTORES
    public Empleado(){
        
    }
    public Empleado(double sueldoBase, String nombre, String fechaNacimiento, int dni) {
        //LLAMADA AL CONSTRUCTOR DE CLASE PADRE: Persona
        super(nombre, fechaNacimiento, dni);
        this.sueldoBase = sueldoBase;
    }

    
    //METODOS GETTER Y SETTER
    public double getSueldoBase() {
        return sueldoBase;
    }
    //METODOS PUBLICOS
    public void imprimirDatos(){
        System.out.println("-----------------");
        System.out.println("EMPLEADO \n -----------------");
        super.imprimirDatos(); // LLAMADA A METODO DEL PADRE
        System.out.println("SUELDO: "+getSueldoBase());
        System.out.println("-----------------");
    }
    

    

    
    
    
    
    
    
    
    
    
}
