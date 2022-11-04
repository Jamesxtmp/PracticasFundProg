package SwitchCase;

import java.util.Scanner;

public class tabla {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int tabla, repeat;
        do {
            System.out.println("Que tabla quieres?");
            tabla = leer.nextInt();
            int i = 1;
            do {            
                System.out.println(tabla + " * " + i + " = " + (tabla * i));
                i++;
            } while (i <= 10);
            System.out.println("Repetir? (1) Si");
            repeat = leer.nextInt();
        } while (repeat == 1);
    }
}
