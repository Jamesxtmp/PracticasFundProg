package Lessons;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class ArregloBidimensional {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int matriz[][], filas, columnas;
        
        filas = Integer.parseInt(JOptionPane.showInputDialog("Digita el numero de filas"));
        columnas = Integer.parseInt(JOptionPane.showInputDialog("Digita el numero de columnas"));
        
        matriz = new int[filas][columnas];
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println("Ingresa el valor: [" + i + "][" + j + "]: ");
                matriz[i][j] = leer.nextInt();
            }
        }
        System.out.println("----------------------------");
        System.out.println("Tu Matriz es:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print( matriz[i][j] );
            }
            System.out.print("\n");
        }
    }
}