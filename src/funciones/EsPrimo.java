package funciones;

public class EsPrimo {

    /**
     * Función que dado un número nos dice si es o no primo
     * @param numero Número a comprobar si es primo o no
     * @return true si numero es primo. false en caso contrario
     */
    public static boolean esPrimo(int numero) {
        boolean esPrimo = true;
        int divisor = 2;

        while(esPrimo && divisor<=numero/2) {
            if(numero%divisor==0) {
                esPrimo = false;
            }
            divisor++;
        }
        return esPrimo;
    }
}