package jamesxtmp.practicasfundprog;

import java.util.Scanner;

/*
Insertar IF a la práctica 3 para otorgar un descuento del 2% si es que la
persona viaja más de 5 kilómetros, mostrar el pago final.
 */
public class Practica4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float price = 5.5F;
        float km, total;
        System.out.println("> Costo por KM recorido: $5.5");
        System.out.println("> Si viajas mas de 5km optines 2% de descuento");
        System.out.println("¿Cuantos KMs viajara?");
        km = leer.nextFloat();
        

        if (km > 5) {
            System.out.println("Obtubiste 2% de descuento");
            total = (float) (km * price - (km * price * 0.02));
        }
        else{
            System.out.println("No obtubiste descuento");
            total = (float) (km * price);
        }
        
        System.out.println("El PRECIO de su boleto es: $" + total);
    }
}
