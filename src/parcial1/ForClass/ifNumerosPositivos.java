package ForClass;

import java.util.Scanner;

public class ifNumerosPositivos {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero;
        System.out.println("Ingresa un numero");
        numero = leer.nextInt();
        if(numero > 0){
            System.out.println("Es un numero Positivo");
        }else{
            System.out.println("Es un numero Negativo");
        }
    }
}
