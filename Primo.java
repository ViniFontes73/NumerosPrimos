package com.mycompany.numerosprimos;
/**
 *
 * @author Vinicius
 */
public class Primo {
        public static boolean isPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        if (numero <= 3) {
            return true;
        }
        if (numero % 2 == 0 || numero % 3 == 0) {
            return false;
        }
        int i = 5;
        while (i * i <= numero) {
            if (numero % i == 0 || numero % (i + 2) == 0) {
                return false;
            }
            i += 1;  
        }
        return true;
    }
}
