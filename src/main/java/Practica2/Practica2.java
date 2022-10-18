package Practica2;

import java.util.Scanner;

public class Practica2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String r;
        System.out.println("Te vas con Melon o con Sandia");
        r = leer.nextLine();
        if( r.equals("melon") ){
            System.out.println("Te fuiste con melon");
        }
        else{
            System.out.println("Te fuiste con sandia");
        }
    }
    
}
