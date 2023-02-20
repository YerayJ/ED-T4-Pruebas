package funciones;

public class Maximo {

    /**
     * Función que devuelve el máximo de dos números
     * @param numero1 Primer número
     * @param numero2 Segundo número
     * @return El máximo de los dos números introducidos por parámetro
     */
    static int maximo (int numero1, int numero2) {
        // Suponemos que el máximo es numero1
        int maximo = numero1;

        // Si numero2 es mayor que numero1
        if(numero2 > numero1) {
            // El máximo es numero2
            maximo = numero2;
        }

        return maximo;
    }
}