/*
 * JERARQUÍA DE CLASES
 */
package edu.utp.poo.ejemplo02_herencia;
import java.util.Scanner;
import utp.edu.poo.jerarquia.*;
import javax.swing.JOptionPane;
/**
 * Versión 1.0
 * @author Jhoel RN MH
 */
public class MainHerencia {

    public static void main(String[] args) {
        
        Scanner consola = new Scanner(System.in);
        String nombre, nacimiento;
        int dni;
        double sueldo, porcentajeComision, venta;
        
        int opcion;
        do
        {   System.out.println(
                    "--------------------------------------------------------\n"+
                    "1. Empleado\n"+
                    "2. Estudiante\n"+
                    "3. Empleado por Comisión\n"+
                    "0. FIN\n"+
                    "--------------------------------------------------------\n"+
                    "Ingrese la opción [1 - 3]");
            opcion = consola.nextInt();
            
            //INGRESAMOS DATOS DE LA PERSONA
            System.out.println("Ingresar el Nombre : ");
            nombre = consola.next();
            System.out.println("Ingresar la Fecha de Nacimiento : ");
            nacimiento = consola.next();
            System.out.println("Ingresar el DNI : ");
            dni = consola.nextInt();
            
            switch(opcion)
            {
               case 1:
                    System.out.println("Ingresar el SUELDO : ");
                    sueldo = consola.nextDouble();
                    Empleado objEmpleado = new Empleado(sueldo,nombre,nacimiento,dni);
                    objEmpleado.imprimirDatos();
                    break;
                case 2:
                    Estudiante objEstudiante = new Estudiante(0,0,nombre,nacimiento,dni);
                    objEstudiante.nuevaCalificacion(18);
                    objEstudiante.imprimirDatos();
                    break;
                case 3:
                    System.out.println("Ingresar el SUELDO : ");
                    sueldo = consola.nextDouble();
                    System.out.println("Ingresar Porcentaje COMISION : ");
                    porcentajeComision = consola.nextDouble();
                    System.out.println("Ingresar la VENTA : ");
                    venta = consola.nextDouble();
                    EmpleadoComision objEmpComision = new EmpleadoComision(porcentajeComision,sueldo,nombre, 
                                        nacimiento, dni );
                    objEmpComision.vender(venta);
                    objEmpComision.imprimirDatos();
                    break;
               case 0:                         
                    System.exit(0);
                    break;
                default: 
                    System.out.println("Error: Ingrese una opción valida");
                    break;
            }
        }while(true); 
        
        
        
        /*Scanner consola = new Scanner(System.in);
        
        String nombre, nacimiento;
        int dni;
        double sueldo, porcentajeComision;
        
        
        
        
        
        
        //INGRESAMOS DATOS DE LA PERSONA
        System.out.println("Ingresar el Nombre: ");
        nombre = consola.next();
        System.out.println("Ingresar la Fecha de Nacimiento: ");
        nacimiento = consola.next();
        System.out.println("Ingresar el DNI: ");
        dni = consola.nextInt();        
        
        //CREAMOS LA INSTANCIA Y PÁSAMOS LOS DATOS POR EL CONSTRUCTOR
        Persona objPersona = new Persona(nombre,nacimiento,dni);
        objPersona.imprimirDatos();
        
        
        //INGRESAMOS DATOS DEL EMPLEADO
        System.out.println("Ingresar el Nombre: ");
        nombre = consola.next();
        System.out.println("Ingresar la Fecha de Nacimiento: ");
        nacimiento = consola.next();
        System.out.println("Ingresar el DNI: ");
        dni = consola.nextInt();  
        System.out.println("Ingresar el Sueldo: ");
        sueldo = consola.nextDouble();  
        
        Empleado objEmpleado = new Empleado(sueldo,nombre,nacimiento,dni);
        objEmpleado.imprimirDatos();
        
        
        //INGRESAMOS DATOS DEL ESTUDIANTE
        System.out.println("Ingresar el Nombre: ");
        nombre = consola.next();
        System.out.println("Ingresar la Fecha de Nacimiento: ");
        nacimiento = consola.next();
        System.out.println("Ingresar el DNI: ");
        dni = consola.nextInt();  
        
        
        Estudiante objEstudiante = new Estudiante(0,0,nombre,nacimiento,dni);
        objEstudiante.nuevaCalificacion(18);
        objEstudiante.imprimirDatos();
        
        
        //INGRESAMOS DATOS DEL EMPLEADO POR COMISION
        System.out.println("Ingresar el Nombre: ");
        nombre = consola.next();
        System.out.println("Ingresar la Fecha de Nacimiento: ");
        nacimiento = consola.next();
        System.out.println("Ingresar el DNI: ");
        dni = consola.nextInt();  
        System.out.println("Ingresar el Sueldo: ");
        sueldo = consola.nextDouble();  
        System.out.println("Ingresar el porcentaje de Comision: ");
        porcentajeComision = consola.nextDouble();  
        
        
        EmpleadoComision objEmpleadoComision = new EmpleadoComision(porcentajeComision,sueldo,nombre,nacimiento,dni);
                
        objEmpleadoComision.vender(1000);
        System.out.println("Sueldo Vendedor: " +objEmpleadoComision.getSueldo());
        
        objEmpleadoComision.vender(2000);
        System.out.println("Sueldo Vendedor: " +objEmpleadoComision.getSueldo());
        */
    }
    
}



