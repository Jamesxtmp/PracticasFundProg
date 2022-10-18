package PracticasParcial;

import java.util.Scanner;

/*
Utilizar SWITCH, realiza lo necesario para calcular el perímetro y área de las
figuras: círculo, triángulo, cuadrado, pentágono.
 */
public class Practica10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opttion;
        double area = 0;
        double perimetro = 0;
        
        System.out.println("Elige una opcion:");
        System.out.println("(1) Circulo");
        System.out.println("(2) Triangulo");
        System.out.println("(3) Cuadrado");
        System.out.println("(4) Pentagono");
        opttion = leer.nextInt();
        
        switch(opttion){
            case 1 :
                float radio;
                System.out.println("Digita el ( radio )");
                radio = leer.nextFloat();
                
                area = Math.PI * Math.pow(radio, 2); //A = π r^2
                perimetro = 2 * Math.PI * radio; //2π r
                break;
                
            case 2 :
                float base, l2, l3, altura;
                System.out.println("Digita la ( base )");
                base = leer.nextFloat();
                System.out.println("Digita el ( segundo lado )");
                l2 = leer.nextFloat();
                System.out.println("Digita el ( tercer lado )");
                l3 = leer.nextFloat();
                System.out.println("Digita la ( altura )");
                altura = leer.nextFloat();
                area = ( base * altura ) / 2; //(b * h)/2
                perimetro = base + l2 + l3 ; // b + L2 + L3
                break;
            case 3 :
                float lado;
                System.out.println("Digita el ( lado )");
                lado = leer.nextFloat();
                
                area = Math.pow(lado, 2);
                perimetro = 4 * lado;
                break;
            case 4 :
                float lad;
                System.out.println("Digita el ( lado )");
                lad = leer.nextFloat();
                area = (5 * lad * ( lad / ( 2 * Math.toDegrees(Math.tan(36))))) / 2;   //A = 5L( L/(2*tan(36))))/2
                perimetro = 5 * lad;
                break;
            default : System.out.println("Opcion invalida");
        }
        
        System.out.println("El Area es: " + area);
        System.out.println("El Perimetro es: " + perimetro);
    }
}
