package PracticasParcial;

import java.util.Scanner;

/*
Calcular el pago de un trabajador tomando como referencia que el sueldo base a
la semana está en 2500, pero por aniversario se está otorgando el 5% de aumento
al pago si el empleado lleva trabajando más de 10 años, de lo contrario solo se
otorga el 3%.
 */
public class Practica7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int anios;
        float sueldo;

        System.out.println("> Sueldo por semana $2500");
        System.out.println("> +10 años trabajando, 5% de aumento");
        System.out.println("> De lo contrario, 3% de aumento");
        System.out.println("AÑOS de trabajo");
        anios = leer.nextInt();
        System.out.println("--------------------------------------");

        if (anios > 10) {
            System.out.println("Obtienes 5% de aumento");
            sueldo = 2500 + 125;
        }else{
            System.out.println("Obtienes 3% de aumento");
            sueldo = 2500 + 75;
        }
        System.out.println("Tu SUELDO SEMANAL sera de: $" + sueldo);
    }
}
