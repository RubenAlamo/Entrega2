import java.util.Scanner;
public class Ejercicio4 {
    //genera un algoritmo que calcule la velocidad media de desplazamiento de usuario
    //declaracion de variables
    public static double distancia;
    public static double tiempo;
    public static double velocidad;
    //declaracion de la clase Scanner
    public static Scanner sc = new Scanner(System.in);
    //metodo main
    public static void main(String[] args) {
        //asignacion de valores a las variables
        System.out.println("Introduce la distancia recorrida en km: ");
        distancia = sc.nextDouble();
        System.out.println("Introduce el tiempo empleado en horas: ");
        tiempo = sc.nextDouble();
        //calculo de la velocidad
        velocidad = distancia / tiempo;
        //imprimir la velocidad
        System.out.println("La velocidad media es: " + velocidad + " km/h");
        }

}