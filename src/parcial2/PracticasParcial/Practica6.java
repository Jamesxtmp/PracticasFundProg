package PracticasParcial;

import java.util.Scanner;

/*
Realiza una aplicación para hacer el cambio de pesos a dolar y euro
 */
public class Practica6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float pesos, mxUS, mxEUR;

        System.out.println("> | 1US = $20.03 | 1EUR = $19.76 | (18/10/22)");
        System.out.println("Cantidad en PESOS");
        pesos = leer.nextFloat();
        System.out.println("--------------------------------------");

        mxUS = (float) (pesos / 20.03);
        mxEUR = (float) (pesos / 19.76);
        
        System.out.println("Valor en Dolares: " + mxUS);
        System.out.println("Valor en Euros: " + mxEUR);
    }
}
