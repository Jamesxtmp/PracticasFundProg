package EjerciciosArreglosTarea;

import java.util.Arrays;

/*
Ordenar de menor a mayor los elementos de un arreglo de una longitud de 4.
Imprimir como quedarían ordenados.
 */
public class Ordenamiento {
    public static void main(String[] args) {
        
        int nums[] = {65, 9, -4, 6};
        int numsOrder[] = Arrays.copyOf(nums, 4);

        Arrays.sort(numsOrder);

        for (int i = 0; i < 4; i++) {
            System.out.println(i + " : " + nums[i] + "\t|  "
                    + i + " : " + numsOrder[i]);
        }
        
    }
}
