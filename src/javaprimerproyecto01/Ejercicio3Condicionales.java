
package javaprimerproyecto01;

import java.util.Scanner;


public class Ejercicio3Condicionales {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese una frase o palabra");
        String frase = leer.nextLine();
        int length = frase.length();
        if (length==8){
            System.out.println("Correcto");
        }else {
            System.out.println("Incorrecto");
        }
    }
}
