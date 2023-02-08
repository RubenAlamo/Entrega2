public class Ejercicio1 {
    // Declaración de variables a y b static para que sean globales sin necesidad de crear objetos
    private static int a;
    private static int b;

public static void main(String[] args) {
    // Asignación de valores a las variables
    a = 3;
    // Impresión de valores de las variables
    System.out.println("a = " + a);
    b = a + 5;
    System.out.println("a = " + a + " b = " + b);
    a = 7;
    System.out.println("a = " + a + " b = " + b);
    }
}