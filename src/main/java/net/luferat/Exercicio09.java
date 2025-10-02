/**
 * Exercício 09) Trabalhando com Strings
 *
 * Leia (ou declare) uma String, por exemplo "Olá Mundo", e depois imprima o
 * comprimento da string (length()), e a mesma string em letra maiúscula
 * (toUpperCase()).
 */

package net.luferat;

public class Exercicio09 {

    public static void main(String[] args) {
        String coisa = "Olá Mundo!";
        System.out.println(coisa + " tem " + coisa.length() + " caracteres.");
        System.out.println(coisa.toUpperCase());
    }

}
