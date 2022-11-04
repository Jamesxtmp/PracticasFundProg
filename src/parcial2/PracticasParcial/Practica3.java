package PracticasParcial;

import java.util.Scanner;

/*
Realizar lo necesario para calcular el precio de un boleto de viaje sabiendo,
que cada kilómetro cuesta $5.5
 */
public class Practica3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float price = 5.5F;
        float km, total;
        
        System.out.println("> Costo por KM recorido: $5.5");
        System.out.println("¿Cuantos KMs viajara?");
        km = leer.nextFloat();
        
        total = km * price;
        
        System.out.println("El PRECIO de su boleto es: $" + total);
    }
}
