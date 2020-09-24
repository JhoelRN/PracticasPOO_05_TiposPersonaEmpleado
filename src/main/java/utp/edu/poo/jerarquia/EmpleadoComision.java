/*
 * Clase Padre: Empleado
 * CLASE DERIVADA EmpleadoComision
 */
package utp.edu.poo.jerarquia;
/**
 * Versión 1.0
 * @author Jhoel RN MH
 */
public class EmpleadoComision extends Empleado{
    
    //ATRIBUTOS
    private double porcentajeComision;
    private double dineroVentas;
    
    //CONSTRUCTORES

    public EmpleadoComision(double porcentajeComision, double sueldoBase, String nombre, String fechaNacimiento, int dni) {
        //LLAMADO AL CONSTRUCTOR DE CLASE PADRE: Empleado
        super(sueldoBase, nombre, fechaNacimiento, dni);
        this.porcentajeComision = porcentajeComision;
        this.dineroVentas = 0; //lo inicializa en cero
    }
    
    //METODOS GETTER Y SETTER
    public double getSueldo(){
        //return sueldoBase + (int) (dineroVentas*porcentajeComision/100);  
        //***error el sueldoBase es atributo privado de otra clase
        // entonces cambiamos privado to protected
        return sueldoBase + (int) (dineroVentas*porcentajeComision/100);
    }
    
    //METODOS PUBLICOS
    public void vender(double dineroVenta){
        this.dineroVentas+= dineroVenta;
    }
    
    public void imprimirDatos(){
        System.out.println("--------------------------");
        System.out.println("EMPLEADO POR COMISION");
        super.imprimirDatos(); // LLAMADO A METODO DEL PADRE
        System.out.println("SUELDO: "+getSueldo());
        System.out.println("--------------------------");
        
        
    }
    
    
    
    
    
}
