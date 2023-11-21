/*
Costo de envío de paquetes: Un servicio de envío cobra diferentes tarifas según
la región y el peso del paquete. Si el peso es menor de 5 kg y la región es "local",
el costo es de $5. Si pesa entre 5 y 10 kg, el costo es de $10 para la región "nacional".
Para cualquier otro caso, el costo es de $15.
 */
package problemas;

import java.util.Scanner;

public class Problema_3 {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
         int region, costo1 = 5, costo2 = 10, costo3 = 15;
        double peso;
        System.out.println("Cuanto pesa el paquete:  ");
        peso = tc.nextDouble();
        System.out.println("[1] Local");
        System.out.println("[2] Nacional ");
        System.out.println("[3] Internacional");
        region = tc.nextInt();
        switch (region){
            case 1:
                System.out.println("Envio Local");
                break;
            case 2:
                System.out.println("Envio Nacional");
                break;
            case 3:
                System.out.println("Envio Internacional");
                break;
        }
        if (peso < 5 && region == 1){
            System.out.println("Costo de envio igual a: " + costo1);
        } else {
            if (peso >= 5 && peso < 10 && region == 2){
                System.out.println("Costo de envio igual a: " + costo2);
            } else {
                System.out.println("Costo de envio igual a: " + costo3);
            }
        }
    }   
}