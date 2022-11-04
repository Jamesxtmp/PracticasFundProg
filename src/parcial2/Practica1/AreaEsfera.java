package Practica1;

import java.util.Scanner;

public class AreaEsfera {
    public static void main(String[] args) {
       Scanner leer = new Scanner( System.in );
       
       double rad, resultado;
       System.out.println("JAIME MORALES CERON");
       System.out.println("--Area de una Esfera--");
       System.out.println("-------------------------------");
       System.out.println("Ingresa Radio");
       rad = leer.nextFloat();
       resultado = 4 * Math.PI * Math.pow(rad, 2) ;
       System.out.println("-------------------------------");
       System.out.println("El Area es: " + resultado);
    }
}
