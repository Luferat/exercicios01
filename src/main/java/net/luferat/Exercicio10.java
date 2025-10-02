/**
 * Exercício 10) Array e loop
 *
 * Declare um array de inteiros, por exemplo int[] numeros = {3, 5, 7, 9, 11}.
 * Use um loop (for ou for-each) para percorrer o array e exibir cada elemento
 * no console.
 */

package net.luferat;

public class Exercicio10 {

    public static void main(String[] args) {

        int[] numeros = {3, 5, 7, 9, 11, 14, 112, 99, 1};

        // Usando for
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        // Usando for-each
        for (int numero : numeros) {
            System.out.println(numero);
        }

    }

}
