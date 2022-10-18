package Practica1;

import java.util.Scanner;

public class Promedio {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2, num3, num4;
        float resultado;
        System.out.println("JAIME MORALES CERON");
        System.out.println("--Promedio de 4 numeros--");
        System.out.println("-------------------------------");
        System.out.println("Ingresa el Primer Numero");
        num1 = leer.nextInt();
        System.out.println("Ingresa el Segundo Numero");
        num2 = leer.nextInt();
        System.out.println("Ingresa el Tercer Numero");
        num3 = leer.nextInt();
        System.out.println("Ingresa el Cuarto Numero");
        num4 = leer.nextInt();
        
        resultado = (float)( num1 + num2 + num3 + num4 ) / 4;
        System.out.println("-------------------------------");
        System.out.println("El Promedio es: " + resultado);
    }
}