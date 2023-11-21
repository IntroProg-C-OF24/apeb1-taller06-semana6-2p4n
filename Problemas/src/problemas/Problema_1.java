/*
Facturación de 2 productos: La empresa Amazon.com le contrata como desarrollador
de Sistemas Informáticos para programar su sistema de compras online, el cual
calcule el precio total de la compra para un cliente. Para ello, se necesita utilizar
estructuras secuenciales y de selección (if simple, doble y/o anidadas), sin aplicar ciclos repetitivos.

Requisitos:

1. La empresa inicialmente venderá solo 2 tipos de productos distintos, a costos variantes.
Al costo total de la factura, se debe incluir los gastos por concepto de transporte/envío
2. del paquete, del cual no se aplican ningún tipo de descuentos o impuestos dada
la excepción descrita en el punto 3.b.
3. El objetivo es presentar al usuario los detalles de su compra: costos, impuestos,
descuentos, monto final dadas las siguientes condiciones: a. Si el subtotal de la 
compra (sin descuentos o gastos de envío), supera los $1000, se le otorga un 20%
de descuento; y si es al menos los $1000 el descuento es como mínimo 5%. b. Adicional,
si la compra es mayor a $5000, el envío será gratuito. c. El IVA del 10% se debe
aplicar a todos los artículos antes de agregar cualquier tipo de descuesto o promoción.
 */
package problemas;

import java.util.Scanner;

public class Problema_1 {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        double precioProducto1, precioProducto2, precioTotal, iva, subTotal, subTotaliva, descuento, envio, valorFinal;
        System.out.println("Precio del primer producto");
        precioProducto2 = tc.nextDouble();
        System.out.println("Precio del segundo producto");
        precioProducto1 = tc.nextDouble();
        System.out.println("Gastos de envio");
        envio = tc.nextDouble();
        precioTotal = precioProducto2 + precioProducto1;
        iva = precioTotal * 0.10;
        subTotal = precioTotal;
        subTotaliva = precioTotal + iva;
        if (subTotaliva <= 1000) {
            descuento = subTotaliva * 0.05;
        } else {
            descuento = subTotaliva * 0.20;
        }
        if (subTotal < 5000) {
            envio = envio;
        } else {
            envio = 0;
        }
        valorFinal = subTotaliva - descuento + envio;
        System.out.println("========================");
        System.out.println("Precio iphone " + precioProducto1 + " $");
        System.out.println("Precio Ipad " + precioProducto2 + " $");
        System.out.println("Subtotal " + subTotal + " $");
        System.out.println("IVA " + iva + " $");
        System.out.println("Subtotal + IVA " + subTotaliva + " $");
        System.out.println("Descuento " + descuento + " $");
        System.out.println("Gastos de envio " + envio + " $");
        System.out.println("Monto factura " + valorFinal + " $");
    }
}
