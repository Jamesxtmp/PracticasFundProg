package jamesxtmp.practicasfundprog;

import java.util.Scanner;

/*
Realiza el programa para sumar 4 números diferentes y mostrar
el promedio de ellos.
 */
public class Practica1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2, num3, num4;
        float prom;

        System.out.println("Digita el PRIMER numero");
        num1 = leer.nextInt();
        System.out.println("Digita el SEGUNDO numero");
        num2 = leer.nextInt();
        System.out.println("Digita el TERCER numero");
        num3 = leer.nextInt();
        System.out.println("Digita el CUARTO numero");
        num4 = leer.nextInt();

        prom = (float) (num1 + num2 + num3 + num4) / 4;
        System.out.println("--------------------------------------");
        System.out.println("El PROMEDIO es de: " + prom);

    }
}
