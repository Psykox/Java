
package javaprimerproyecto01;

import java.util.Scanner;

public class Ejercicio2Condicionales {
    public static void main(String[] args) {
        System.out.println("Escriba una palabra");
        Scanner teclado = new Scanner (System.in);
        String frase = teclado.next();
        String frase2= "eureka";
        
        if (frase.equals(frase2)){
            System.out.println("Correcto");
            
        }else{System.out.println("Incorrecto");
                
        }
    }
}