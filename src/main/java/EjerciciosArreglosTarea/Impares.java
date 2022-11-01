package EjerciciosArreglosTarea;

/*
    imprimir los números impares que contiene un arreglo de longitud 5.
*/
public class Impares {
    public static void main(String[] args) {
        int nums[] = { 3, 2, 9, 7, 4 };
        for (int i = 0; i < 5; i++) {
            if( (nums[i] % 2) != 0 ){
                System.out.println(i + " : " + nums[i]);
            }
        }
    }
}
