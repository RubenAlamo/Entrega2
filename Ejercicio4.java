import java.util.Scanner;
public class Ejercicio4 {
    //declaración de variables
    public static double distancia;
    public static double tiempo;
    public static double velocidad;
    //declaración de la clase Scanner
    public static Scanner sc = new Scanner(System.in);
    //metodo main
    public static void main(String[] args) {
        //asignación de valores a las variables
        System.out.println("Introduce la distancia recorrida en km: ");
        distancia = sc.nextDouble();
        System.out.println("Introduce el tiempo empleado en horas: ");
        tiempo = sc.nextDouble();
        //cálculo de la velocidad
        velocidad = distancia / tiempo;
        //imprimir la velocidad
        System.out.println("La velocidad media es: " + velocidad + " km/h");
        }
}
/*
al ejecutar el programa se obtiene la velocidad en relación a kilómetros recorridos y el tiempo que tarda en hacerlos. Ejemplo:
Introduce la distancia recorrida en km:
370 km
Introduce el tiempo empleado en horas:
4 horas
La velocidad media es: 92.5 km/h
*/
