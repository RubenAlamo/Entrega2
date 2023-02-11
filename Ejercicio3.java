import java.util.Scanner;
public class Ejercicio3 {
    //declaración de variables estaticas
    public static double valor1;
    public static double valor2;

public static void main(String[] args) {
    //declaración de la clase Scanner y asignación de valores a las variables
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce el primer valor: ");
    valor1 = sc.nextDouble();
    System.out.println("Introduce el segundo valor: ");
    valor2 = sc.nextDouble();
    //imprimir los valores 1 y 2
    System.out.println("Valor 1: " + valor1 + " Valor 2: " + valor2);
    }
}

/*
al ejecutar el programa se obtiene el siguiente resultado: (Ejemplo)
Introduce el primer valor:
3
Introduce el segundo valor:
5
Valor 1: 3.0 Valor 2: 5.0
*/
