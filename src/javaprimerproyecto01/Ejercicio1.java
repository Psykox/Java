
package javaprimerproyecto01;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String [] args) {
    
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese su primer numero entero"); 
        int numer1 =    leer.nextInt();
        System.out.println("Ingrese el segundo numero entero");
        int numer2 = leer.nextInt();
        System.out.println("La suma de los numeros ingresados es: ");
        System.out.println(numer1+numer2);
        
    }
    
    
    
    
    
}
