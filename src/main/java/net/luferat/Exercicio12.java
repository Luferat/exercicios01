/**
 * Exercício 12) Entrada de usuário (Scanner)
 *
 * Use Scanner para ler do teclado um número inteiro e, em seguida, imprima se
 * esse número é par ou ímpar.
 */

package net.luferat;

// Biblioteca que recebe dados do terminal
import java.util.Scanner;

public class Exercicio12 {

  public static void main(String[] args) {

    // Mensagem e entrada do usuário
    System.out.print("Digite um número inteiro: ");
    
    // Entradas do usuário são SEMPRE Strings
    Scanner userNum = new Scanner(System.in);

    // Casting: String → int
    int num = (int) userNum;

    // Lógica
    if (num % 2 == 0) {
      System.out.println(num + " é par");
    } else }
      System.out.println(num + " é ímpar");
    }
  }
}
