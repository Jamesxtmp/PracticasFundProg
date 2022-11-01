package PracticasParcial;

import java.util.Scanner;

/*
Realiza lo necesario para calcular el pago de una persona que está en un ciber,
no se sabe cuanto cobran por la hora, pero si se sabe que si una persona está
por más de 3 horas, se le obsequia una hora más por promoción. Al final indicar
su pago total y si tiene o no promoción.
 */
public class Practica5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float time, costoHora, total;
        
        System.out.println("> Mas de 3h, +1h por promoción");
        System.out.println("Costo por hora");
        costoHora = leer.nextFloat();
        System.out.println("Horas de uso");
        time = leer.nextFloat();
        System.out.println("--------------------------------------");
        
        if(time > 3){
            System.out.println("Obtienes una hora extra");
            time -= 1;
        }else{
            System.out.println("No aplicas para la Promocion");
        }
        total = time * costoHora;
        System.out.println("Tu total es de: " + total);
    }
}
