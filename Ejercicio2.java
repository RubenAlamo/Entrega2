public class Ejercicio2 {
    public static int valor1;
    public static int valor2;
    public static String cadena1;
    //variable constante
    public static final double CST = 49.78;

    public static void main(String[] args) {
        valor1 = 92 % 8;
        valor2 = (2 * valor1);
        cadena1 = "Test";
        System.out.println(cadena1 + " , valor2 = " + valor2);
        System.out.println(valor1 + " # " + CST);
    }
}

/*
al ejecutar el programa se obtiene el siguiente resultado:
 Test , valor2 = 4
 4 # 49.78
*/
