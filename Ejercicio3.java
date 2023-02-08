import java.util.Scanner;
public class Ejercicio3 {
    //declaracion de variables estaticas
    public static double valor1;
    public static double valor2;

public static void main(String[] args) {
    //declaracion de la clase Scanner y asignacion de valores a las variables
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce el primer valor: ");
    valor1 = sc.nextDouble();
    System.out.println("Introduce el segundo valor: ");
    valor2 = sc.nextDouble();
    //imprimir los valores 1 y 2
    System.out.println("Valor 1: " + valor1 + " Valor 2: " + valor2);
    }
}