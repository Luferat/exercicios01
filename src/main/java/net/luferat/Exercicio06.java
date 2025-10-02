/**
 * Exercício 06) Comparações com if / else
 * <p>
 * Declare duas variáveis inteiras x e y.
 * <p>
 * Se x for maior que y, imprima “x é maior que y”.
 * Se x for igual a y, imprima “x é igual a y”.
 * Caso contrário, imprima “x é menor que y”.
 */

package net.luferat;

public class Exercicio06 {

    public static void main(String[] args) {

        int x = 50;
        int y = 50;

        if (x > y) {
            System.out.println("x é maior que y");
        } else if (x == y) {
            System.out.println("x é igual a y");
        } else {
            System.out.println("x é menor que y");
        }
    }
}
