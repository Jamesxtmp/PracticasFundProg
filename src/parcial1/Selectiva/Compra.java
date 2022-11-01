package Selectiva;
import java.util.Scanner;

public class Compra {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre, signo;
        int edad, compra;
        
        System.out.println("Cual es tu nombre");
        nombre = leer.nextLine();
        System.out.println("Cual es tu edad");
        edad = leer.nextInt();
        System.out.println("Cual es tu signo");
        signo = leer.next();
        System.out.println("Cuanto Compraste");
        compra = leer.nextInt();
        
        if( nombre.equalsIgnoreCase("Ramon") && edad < 18 ){
            if( signo.equalsIgnoreCase("cancer") ){
                System.out.println("Ramon menor de 18 y de signo Cancer");
                System.out.println("Obtienes un descunto del 15% + 2%");
                System.out.println("Tu pago es de: " + (compra - compra * 0.17));
                
            }else{
                System.out.println("Ramon menor de 18");
                System.out.println("Obtienes un descunto del 15%");
                System.out.println("Tu pago es de: " + (compra - compra * 0.15));
            }
        }else{
            System.out.println("Obtienes un descunto del 5%");
            System.out.println("Tu pago es de: " + (compra - compra * 0.05));
        }
    }
}
