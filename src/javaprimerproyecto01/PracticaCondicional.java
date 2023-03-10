
package javaprimerproyecto01;

import java.util.Scanner;

public class PracticaCondicional {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese 2 numeros enteros");
        int n1 = leer.nextInt();
        int n2 = leer.nextInt();
        
        if (n1>25 && n2>25){
            if (n1> 25 ){ 
            System.out.println("El primer numero ingresado es mayor a 25");
            }else {System.out.println("El primer numero ingresado no es mayor a 25");
            if ( n2 > 25 ){ System.out.println("El segundo numero es mayor a 25");
        
            }else { System.out.println("El segundo numero ingresado no es mayor a 25");
            }
        } 
    } else { System.out.println("Ninguno de los numeros es mayor a 25");
    
    
    
    
}
