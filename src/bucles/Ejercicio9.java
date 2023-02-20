package bucles;

import java.util.Scanner;
/*

 */
public class Ejercicio9 {

    public static void main(String[] args) {
        // Número introducido por el usuario
        int numero;

        // Con esta variable determinamos si el número es primo o no
        boolean esPrimo = true;

        // Creamos el Scanner
        Scanner sc = new Scanner(System.in);

        // Pedimos un número entero positivo
        System.out.println("Introduzca un entero positivo:");
        numero = sc.nextInt();

        // Comprobamos que el número introducido es positivo
        if (numero > 0) {
            // Recorremos los números desde 2 hasta número-1
            for (int i = 2; i < numero; i++) {
                // Si el número es divisible por i deja de ser primo
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
            System.out.println((esPrimo && numero != 1) ? "Es primo" : "No es primo");

        } else {
            System.out.println("No ha introducido un entero positivo");
        }

        sc.close();
    }
}