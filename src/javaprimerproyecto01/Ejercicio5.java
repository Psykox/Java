
package javaprimerproyecto01;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("Ingrese un numero entero");
        Scanner leer = new Scanner(System.in);
        int num = leer.nextInt();
        System.out.println("El doble de su numero ingresado es " +num*2);
        System.out.println("El triple de su numero ingresado es " +num*3);
        System.out.println("La raiz cuadrada del numero ingresado es " +Math.sqrt(num));
        
        
        
        
    }
    
}
