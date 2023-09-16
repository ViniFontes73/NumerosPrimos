package com.mycompany.numerosprimos;
/**
 *
 * @author Vinicius
 */
public class NumerosPrimos {
       public static void main(String[] args) {
        int limite = 100;  // pedir ao usuario um valor posteriormente
        int contador = 0;
        for (int numero = 2; numero <= limite; numero++) {
            if (Primo.isPrimo(numero)) {
                System.out.printf(numero + " - ");
                contador = contador + 1;
            }
        }                
        System.out.println();
        System.out.println(contador + " Numeros são primos.");
    }
}
   
