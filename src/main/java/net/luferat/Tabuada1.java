/**
 * Tabuada usando função
 */

package net.luferat;

public class Tabuada1 {

    // Função que executa a tabuada
    static void tabuadaDe(int x) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(x + " x " + i + " = " + (x * i));
        }
        System.out.println("\n----------------------\n");
    }

    // Main
    public static void main(String[] args) {
        // Loop dp multiplicando
        for (int j = 1; j <= 10; j++) {
            tabuadaDe(j);
        }
    }

}



