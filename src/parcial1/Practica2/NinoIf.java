package Practica2;

import java.util.Scanner;

public class NinoIf {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int r;
        System.out.println("Cuanos años tiene el niño");
        r = leer.nextInt();
        if( r > 5 ){
            System.out.println("Te regalo un Osito");
        }
        else{
            System.out.println("Te regalo una Pelota");
        }
    }
}
