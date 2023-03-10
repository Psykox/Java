
package javaprimerproyecto01;

import java.util.Scanner;

public class Ejercicio3Condicionale {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        String pletra = frase.substring(0,1);
        
       
        if (pletra.equals("A")){
            System.out.println("Correcto");
        }else 
            System.out.println("Incorrecto");
     
        }
     
    }

