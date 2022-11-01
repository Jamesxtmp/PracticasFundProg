package SwitchCase;

import java.util.Scanner;

public class switchcase {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int option, a, b, ans = 0, repeat;
        System.out.println("Escribe el primer numero");
        a = leer.nextInt();
        System.out.println("Escribe el segundo numero");
        b = leer.nextInt();
        do {            
            System.out.println("<<Menu>>"
                    + "\n(1) Suma"
                    + "\n(2) Resta"
                    + "\n(3) Multiplicacion"
                    + "\nElige una opcion");
            option = leer.nextInt();
            switch (option){
                case 1: 
                    ans = a + b;
                    System.out.println("La suma es:" + ans);
                break;
                case 2:
                    ans = a - b;
                    System.out.println("La resta es:" + ans);
                break;
                case 3: 
                    ans = a * b;
                    System.out.println("La multiplicaion es: " + ans);
                break;
                default: System.out.println("Opcion Invalida");
            }
            System.out.println("Repetir? (1)Si");
            repeat = leer.nextInt();
        } while (repeat == 1);
    }
}