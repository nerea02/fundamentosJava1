/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentosjava1;

/**
 *
 * @author Nerea
 */
public class FundamentosJava1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear tres variables una para la edad, otra para el nombre, y una última para su salario
        System.out.println("VARIABLES");
        int edad;
        String nombre = "Nerea";
        double salario = 200;
        edad = 30;
        // Mostrar por pantalla Soy <nombre> tengo <edad> y mi sueldo es de <salario>}
        System.out.println("Soy " + nombre + " tengo " + edad + " años y mi sueldo es de " + salario);
        //paso por paso
        System.out.println("Nombre: " + nombre);
        System.out.println("edad: " + edad);
        System.out.println("salario: " + salario);
        System.out.println("-------------------------------------------");
        System.out.println("ESTRUCTURA DE CONTROL - CONDICIONALES");
        
        edad = 35;
        
        if(edad >= 18){
            System.out.println("Es mayor de 18");
        }
        if (edad es >= 35){
            System.out.println("No está en el rango de edad");
    }
        else {
            System.out.println("Es menor de 18");
        }
        
    }
    
}
