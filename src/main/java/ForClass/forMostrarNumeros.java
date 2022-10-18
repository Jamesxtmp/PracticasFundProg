package ForClass;

import java.util.Scanner;

public class forMostrarNumeros {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num, countP = 0, countN = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("  >Ingresa un numero");
            num = leer.nextInt();
            if(num > 0){
                countP++;
            }else{
               countN++;
            }
        }
        System.out.println("Cantidad de Positivos: " + countP);
        System.out.println("Cantidad de Negativos: " + countN);
    }
}
