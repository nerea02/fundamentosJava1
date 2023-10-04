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
        if(edad >= 35) {
            System.out.println("No está en el rango de edad");
        }
        else {
            System.out.println("Es menor de 18");
        }
        // sout + tab
        System.out.println("BUCLE FOR");
        // El bucle FOR  se utiliza cuando ya sabemos de antemano cuantas veces 
        // queremos que se ejecute un bloque de código.
        /*
        for (inicialización; condición; actualización){
        instrucciones
        }
        */
        for (int i = 0; i < 10; i++) {
            System.out.println("Número: "+ i);
        }
        // Crear un bucle que inicie en 1 y me muestre hasta el numero 5
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("Número: "+i);
            
        }
        // Estudiar estructuras de un arreglo en Java, y como acceder, y como
        // agregar, y borrar a sus datos
        
        System.out.println("------------------------");
        // Almacena varios valores a la vez
        int[] numeros = {1,2,3,4,5};
        /*for (int j = 0; j < numeros.length; j++) {
            System.out.println("Elemento " + j + ": " + numeros [j]);
        }
        System.out.println("-------------------------");
        System.out.println("BUCLE WHILE");
        /*
        El bucle while se utiliza cuando no sabemos de antemano cuantas veces 
        debe ejecutarse el bloque de codigo; que depende de una condicion para 
        detenerse
        */
        
        // While (condicion){
        //      instrucciones (cuerpo);
        //  }
        int contador = 1;
        /*while (contador <= 5) {
            System.out.println("Número: " + contador);
            contador ++;
        }
        */
        //int[] numeros = {1,2,3,4,5};
        // recorrer arreglo con while
        while(contador < numeros.length) {
            System.out.println("Número: " + contador + ":" + numeros[contador]);
            contador ++; }           
            
        }
        
                }
}
