///Escriba un programa en el cual se ingrese un valor límite positivo, y a continuacion
///solicite números al usuario hasta que la suma de los números introducidos supere 
///el límite inicial
package javaprimerproyecto01;

import java.util.Scanner;

public class Ejercicio5Bucles { 
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese numeros enteros");
  
        int suma = 0;
     
        
        while (suma<400){
        int num = teclado.nextInt();
        suma  = suma + num;
            System.out.println("El numero es " +suma);
        
        }
       
        
     
        
        
    }
    
    
}
