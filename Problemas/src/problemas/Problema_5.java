/*
Determinar el tipo de operación matemática. Dado un número del 1 al 4 que 
representa una operación matemática básica (suma, resta, multiplicación, división), 
muestra el nombre de la operación correspondiente. Por ejemplo, si el usuario ingresa 1, 
debe mostrar "Suma"; si ingresa 2, debe mostrar "Resta", y así sucesivamente.
*/
package problemas;

import java.util.Scanner;

public class Problema_5 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int num;
        System.out.println("Escriba un numero del 1 al 4 para generar una operacion matematica");
        num = tc.nextInt();
        switch (num){
            case 1:
                System.out.println("Suma");
                
                break;
            case 2:
                System.out.println("Resta");
                break;
            case 3:
                System.out.println("Multiplicacion");
                break;
            case 4:
                System.out.println("Division");
                break;
            default:
                System.out.println("Escriba un numero del 1 al 4");
        }
    }
}
