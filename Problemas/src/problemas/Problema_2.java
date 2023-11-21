/*
Clasificación de un triángulo Dado tres valores que representan las longitudes de
los lados de un triángulo, determinar su tipo. Las reglas son:

- Si todos los lados son iguales, mostrar "Triángulo equilátero".
- Si dos lados son iguales, mostrar "Triángulo isósceles".
- Si todos los lados son diferentes, mostrar "Triángulo escaleno".
- Si la suma de dos lados no es mayor que el tercer lado, mostrar "No es un triángulo".
 */
package problemas;

import java.util.Scanner;

public class Problema_2 {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        double lado1, lado2, lado3, sum;
        System.out.println("Ingrese el primer lado");
        lado1 = tc.nextDouble();
        System.out.println("Ingrese el segundo lado");
        lado2 = tc.nextDouble();
        System.out.println("Ingrese el tercer lado");
        lado3 = tc.nextDouble();
        sum = lado1+lado2;
        if (sum < lado3) {
            System.out.println("No es un triangulo");
        } else {
            if (lado1 == lado2 && lado1 == lado3) {
                System.out.println("Triangulo Equilatero");
            } else {
                if (lado1 == lado2 && lado2 != lado3) {
                    System.out.println("Triangulo Isosceles");
                } else {
                    if (lado1 != lado2 && lado2 != lado3) {
                        System.out.println("Triangulo Escaleno");
                    }
                }
            }
        }
    }
}
