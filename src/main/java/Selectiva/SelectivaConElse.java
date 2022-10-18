package Selectiva;
import java.util.Scanner;


public class SelectivaConElse {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String esc;
        System.out.println("Estudias en el Tec. de Libres Si/No");
        esc = leer.nextLine();
        if(esc.equalsIgnoreCase("si")){
            System.out.println("Felicidades");
            System.out.println("Tendras un \n descuento 5%");
        }else{
            System.out.println("No tendras descuento porque no estudias en el Tec.");
        }
    }
}
