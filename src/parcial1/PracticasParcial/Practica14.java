package PracticasParcial;

/*
Desarrolla el programa para mostrar la sucesión de 2 en 2 hasta el 100.
*/
public class Practica14 {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i += 2) {
            if( i == 100 ){ System.out.println(i); break; }
            System.out.print(i + ",");
        }
    }
}