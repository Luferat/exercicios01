/**
 * Exercício 04) Tipo de dados e conversão simples (casting)
 * <p>
 * Declare uma variável do tipo double com valor 9.78. Converta-a para int (casting) e exiba o valor convertido, por exemplo:
 * <p>
 * Valor original: 9.78
 * Valor convertido para inteiro: 9
 */


package net.luferat;

public class Exercicio04 {

    public static void main(String[] args) {

        double original = 9.78d;
        int convertido = (int) original; // Down casting

        System.out.println("Valor original: " + original);
        System.out.println("Valor convertido para inteiro: " + convertido);

    }

}
