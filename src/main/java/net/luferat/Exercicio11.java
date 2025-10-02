/**
 * Exercício 11) Método simples (função)
 *
 * Crie um método estático chamado multiplicaPorDois que receba um inteiro e
 * retorne esse número multiplicado por 2. No método main, chame
 * multiplicaPorDois(5) e exiba o resultado:
 *
 * 5 multiplicado por 2 é 10
 */

package net.luferat;

public class Exercicio11 {

    static int multiplicaPorDois(int x){
        return x * 2;
    }

    public static void main(String[] args) {
        int y = 5;
        System.out.println(y + " multiplicado por 2 é " + multiplicaPorDois(5));
    }

}
