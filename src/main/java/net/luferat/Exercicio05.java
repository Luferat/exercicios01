/**
 * Exercício 05) Operadores aritméticos
 *
 * Faça um programa que receba (ou declare) dois números inteiros x e y e
 * calcule +, –, ×, ÷ (divisão inteira) e resto (módulo). Exiba cada resultado
 * numa linha separada.
 */

package net.luferat;

public class Exercicio05 {

    public static void main(String[] args) {
        int x, y;

        x = 13;
        y = 5;

        System.out.println(x + " + " + y + " = " + (x + y)); // Soma
        System.out.println(x + " - " + y + " = " + (x - y)); // Subtração
        System.out.println(x + " x " + y + " = " + (x * y)); // Multiplicação
        System.out.println(x + " ÷ " + y + " = " + (x / y)); // Divisão
        System.out.println(x + " % " + y + " = " + (x % y)); // Módulo

    }

}
