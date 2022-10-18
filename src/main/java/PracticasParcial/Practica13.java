package PracticasParcial;

import java.util.Scanner;

/*
Utilizando for y while para mostrar cualquier tabla.
 */
public class Practica13 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int tabla, repeat = 1;
        while (repeat == 1) {
            System.out.println("Elige una tabla cualquiera");
            tabla = leer.nextInt();
            for (int i = 1; i <= 10; i++) {
                System.out.println(tabla + " * " + i + " = " + i * tabla);
            }
            System.out.println("¿Repetir? Si(1) No(0) ");
            repeat = leer.nextInt();
        }
    }
}
