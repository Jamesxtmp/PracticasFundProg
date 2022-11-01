package EjerciciosArreglosTarea;

/*
Dado un arregloA de 10 valores y otro arregloB de 10 valores  se debe generar un
arregloC, calculado así: 
   -La suma del primer valor del arregloA mas el último valor del arregloB,
    corresponde al primer valor del arregloC.      
   -El segundo valor de arregloC será: el segundo valor de arregloA mas el
    penúltimo de arregloB; y así sucesivamente. 
 */
public class Suma {
    public static void main(String[] args) {
        int arrA[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int arrB[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int arrC[] = new int[10];
     
        for (int i = 0; i < 10; i++) {
            arrC[i] = arrA[i] + arrB[9-i];
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " : " + arrC[i]);
        }
    }
}
