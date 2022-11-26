package Lessons;

import java.util.Scanner;

public class Metodos {

    public void suma() {
        Scanner leer = new Scanner(System.in);
        int a, b;

        System.out.println("----SUMANDO----");
        System.out.println("Escribe un numero");
        a = leer.nextInt();
        System.out.println("Escribe otro numero");
        b = leer.nextInt();

        System.out.println("Suma:" + (a + b));
    }
    public void resta() {
        Scanner leer = new Scanner(System.in);
        int a, b;

        System.out.println("----RESTANDO----");
        System.out.println("Escribe un numero");
        a = leer.nextInt();
        System.out.println("Escribe otro numero");
        b = leer.nextInt();

        System.out.println("Resta:" + (a - b));
    }

    public static void main(String[] args) {
        Metodos obj = new Metodos();
        obj.suma();
        obj.resta();
    }
}
