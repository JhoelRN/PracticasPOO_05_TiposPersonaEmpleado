/*
 * CLASE BASE PERSONA
 */
package utp.edu.poo.jerarquia;

/**
 * Versión 1.0
 * @author Jhoel RN MH
 */
public class Persona {
    
    //ATRIBUTOS
    private String nombre;
    private String fechaNacimiento;
    private int dni;
    
    
    //CONSTRUCTORES
    public Persona(){
    }
    
    public Persona(String nombre, String fechaNacimiento, int dni) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
    }    
    
    //METODOS GETTER Y SETTER
    public String getNombre() {        return nombre;    }
    public void setNombre(String nombre) {        this.nombre = nombre;    }
    public String getFechaNacimiento() {        return fechaNacimiento;    }
    public void setFechaNacimiento(String fechaNacimiento) {this.fechaNacimiento = fechaNacimiento;}
    public int getDni() {        return dni;    }
    public void setDni(int dni) {        this.dni = dni;    }

    // METODOS PUBLICOS
    public void imprimirDatos(){
        System.out.println("-----------------");
        System.out.println("DATOS PERSONALES \n -----------------");
        System.out.println("DNI: "+dni);
        System.out.println("NOMBRE: "+nombre);
        System.out.println("FECHA DE NACIMIENTO: "+fechaNacimiento);
    }
}
