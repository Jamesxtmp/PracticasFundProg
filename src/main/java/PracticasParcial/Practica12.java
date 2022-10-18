package PracticasParcial;

import java.util.Scanner;

/*
Utiliza el for/while/switch, para mostrar las tablas de multiplicar del 2 al 5,
por medio de un menú el usuario elegirá qué tabla quiere.
 */
public class Practica12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int tabla, repeat = 1;
        while (repeat == 1) {

            System.out.println("Elige una tabla entre 2 al 5");
            tabla = leer.nextInt();
            switch (tabla) {
                case 2:
                    for (int i = 1; i <= 10; i++) {
                        System.out.println("2 * " + i + " = " + i * 2);
                    }
                    break;
                case 3:
                    for (int i = 1; i <= 10; i++) {
                        System.out.println("3 * " + i + " = " + i * 3);
                    }
                    break;
                case 4:
                    for (int i = 1; i <= 10; i++) {
                        System.out.println("4 * " + i + " = " + i * 4);
                    }
                    break;
                case 5:
                    for (int i = 1; i <= 10; i++) {
                        System.out.println("5 * " + i + " = " + i * 5);
                    }
                    break;
                default:
                    System.out.println("Opcion Invalida");

            }
            System.out.println("Quieres Repetir? (1)Si (0)No ");
            repeat = leer.nextInt();
        }
    }
}
