package jamesxtmp.practicasfundprog;

import java.util.Scanner;

/*
Realiza el programa para una compra de 5 productos para esto es necesario pedir
el precio y el número de artículos, obtener el pago final de la compra,
solicitar con cuánto pagará, calcular el cambio que recibirá.
 */
public class Practica2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int quant1, quant2, quant3, quant4, quant5;
        float price1, price2, price3, price4, price5;
        float subT1, subT2, subT3, subT4, subT5;
        float total, payment, cambio;

        System.out.println("Precio del ARTICULO[1]");
        price1 = leer.nextFloat();
        System.out.println("Cantidad del ARTICULO[1]");
        quant1 = leer.nextInt();
        System.out.println("Precio del ARTICULO[2]");
        price2 = leer.nextFloat();
        System.out.println("Cantidad del ARTICULO[2]");
        quant2 = leer.nextInt();
        System.out.println("Precio del ARTICULO[3]");
        price3 = leer.nextFloat();
        System.out.println("Cantidad del ARTICULO[3]");
        quant3 = leer.nextInt();
        System.out.println("Precio del ARTICULO[4]");
        price4 = leer.nextFloat();
        System.out.println("Cantidad del ARTICULO[4]");
        quant4 = leer.nextInt();
        System.out.println("Precio del ARTICULO[5]");
        price5 = leer.nextFloat();
        System.out.println("Cantidad del ARTICULO[5]");
        quant5 = leer.nextInt();

        subT1 = price1 * quant1;
        subT2 = price2 * quant2;
        subT3 = price3 * quant3;
        subT4 = price4 * quant4;
        subT5 = price5 * quant5;
        total = subT1 + subT2 + subT3 + subT4 + subT5;
        
        System.out.println("--------------------------------------");
        System.out.println("NOMBRE\t\tCANTIDAD\tPRECIO");
        System.out.println("Artic.1\t\t" + quant1 + "\t\t" + subT1);
        System.out.println("Artic.2\t\t" + quant2 + "\t\t" + subT2);
        System.out.println("Artic.3\t\t" + quant3 + "\t\t" + subT3);
        System.out.println("Artic.4\t\t" + quant4 + "\t\t" + subT4);
        System.out.println("Artic.5\t\t" + quant5 + "\t\t" + subT5);
        System.out.println("--------------------------------------");
        System.out.println("Su TOTAL es de: " + total);
        System.out.println("¿Con cuanto pagara?");
        payment = leer.nextFloat();
        
        cambio = payment - total;
        
        System.out.println("--------------------------------------");
        System.out.println("Su CAMBIO es de: " + cambio);
    }
}
