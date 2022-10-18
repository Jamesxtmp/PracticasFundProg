package PracticasParcial;

import java.util.Scanner;

/*
Realiza lo necesario para incrementar un número al cubo siempre que este sea
mayor a 0.
 */
public class Practica9 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float num, resultado;

        System.out.println("> Debe ser un valor mayor a 0");
        System.out.println("Dijita el numero");
        num = leer.nextInt();
        System.out.println("--------------------------------------");

        if (num > 0) {
            resultado = (float) Math.pow(num, 3);
            System.out.println("El RESULTADO es: " + resultado);
        }else{
            System.out.println("Numero invalido");
        }
    }
}
