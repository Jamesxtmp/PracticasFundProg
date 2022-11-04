package Selectiva;
import java.util.Scanner;


public class If3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String esc;
        System.out.println("Estudias en el Tec/UTO/otro");
        esc = leer.nextLine();
        if(esc.equalsIgnoreCase("tec")){
            System.out.println("Felicidades");
            System.out.println("Tendras un \n descuento 5%");
        }else if( esc.equalsIgnoreCase("UTO") ){
            System.out.println("No tendras descuento porque no estudias en el Tec.");
            System.out.println("Pero Tendras un regalo");
        }else{
            System.out.println("Tendras un pase a la biblioteca");
        }
    }
}
