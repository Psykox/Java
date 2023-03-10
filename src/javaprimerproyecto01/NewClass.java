
package javaprimerproyecto01;

import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese dos numeros enteros");
        int num1= leer.nextInt();
        int num2= leer.nextInt();
        int suma;
        int resta;
        int division;
        double multiplicacion;
        int opcion;
        String resp;
        
        
        do{
            System.out.println("Elige una opcion");
            System.out.println("1: Sumar");
            System.out.println("2: Resta");
            System.out.println("3: Multiplicacion");
            System.out.println("4: Division");
            System.out.println("5: Salir");
            
            opcion = leer.nextInt();
            switch(opcion) {
                case 1: 
                    suma= num1 + num2;
                    System.out.println("El resultado de la suma es " +suma);
                    continue;
                case 2: 
                    resta= num1-num2;
                    System.out.println("El resultado de la resta es " +resta);
                    continue;
                case 3: 
                    multiplicacion= num1*num2;
                    System.out.println("El resultado de la multiplicacion es " +multiplicacion);
                   continue;
                case 4:
                    division= num1 / num2;
                    System.out.println("El resultado de la division es " +division);
                    continue;
                case 5: System.out.println("¿Usted desea salir del programa? Utilice S para (si) y N para (no)" );
                         resp= leer.next();
                        if (resp.equalsIgnoreCase("s")){
                            num1=-1;
                            num2=-1;
                                    
                        }else {
                        }
           } 
        }while (num1 !=-1 && num2 !=-1);
        
        
        
    }
    
}
