package PracticasParcial;

import java.util.Scanner;

/*
Desarrolla lo necesario para que por medio de switch manejes la práctica 9, 13
y 14. Asi mismo do while por si el usuario quiere otra ejecución.     
 */
public class Practica15 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int repeatP = 1, option;
        while (repeatP == 1) {

            System.out.println("Elige una opcion: "
                    + "\n(9) Practica 9 - Numero al cubo"
                    + "\n(13) Practica 13 - Cualquier tabla"
                    + "\n(14) Practica 14 - Sucesión de 2 en 2 hasta el 100");
            option = leer.nextInt();
            switch (option) {
                case 9:
                    float num,
                     resultado;

                    System.out.println("> Debe ser un valor mayor a 0");
                    System.out.println("Dijita el numero");
                    num = leer.nextInt();
                    System.out.println("--------------------------------------");

                    if (num > 0) {
                        resultado = (float) Math.pow(num, 3);
                        System.out.println("El RESULTADO es: " + resultado);
                    } else {
                        System.out.println("Numero invalido");
                    }
                    break;
                case 13:
                    int tabla,
                     repeat = 1;
                    while (repeat == 1) {
                        System.out.println("Elige una tabla cualquiera");
                        tabla = leer.nextInt();
                        for (int i = 1; i <= 10; i++) {
                            System.out.println(tabla + " * " + i + " = " + i * tabla);
                        }
                        System.out.println("¿Repetir? Si(1) No(0) ");
                        repeat = leer.nextInt();
                    }
                    break;
                case 14:
                    for (int i = 2; i <= 100; i += 2) {
                        if (i == 100) {
                            System.out.println(i);
                            break;
                        }
                        System.out.print(i + ",");
                    }
                    break;
                default:
                    System.out.println("Opcion invalida");
                    ;
            }

            System.out.println("Elejir otra practica? (1)Si (0)No ");
            repeatP = leer.nextInt();
        }
    }
}
