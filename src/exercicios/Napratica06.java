package exercicios;

//importar biblioteca para captar entrada do usuário
import java.util.Scanner;
/*6:
Escreva um programa em que, dado uma variável x com algum valor inteiro,
temos um novo x de acordo com a seguinte regra:
Se x é par, x = x / 2 ;
Se x é impar, x = 3 * x + 1;
Imprime x;
O programa deve parar quando x tiver o valor final de 1. Por exemplo,
para x = 13, a saída será:
40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1
 */

/** Exercicio "Na Pratica 06". */

public class Napratica06 {
  /** Executa o programa. */
  public static void main(String[] args) {
    //inicializa variável primitiva
    int x = 0;
    System.out.println("Digite um número inteiro:");
    //implementa objeto para receber opção do usuário
    Scanner leia = new Scanner(System.in);
    x = leia.nextInt();
    System.out.println("Processando seu número:");
    //laço verifica a expressão pedida
    do {
      if (x % 2 == 0) {
        x = x / 2;
      } else {
        x = 3 * x + 1;
      }
      //exita escrever "->" caso seja o último número
      if (x == 1)  {
        System.out.println(x);
      } else {
        System.out.print(x + " -> ");
      }
    //para o laço caso X seja 1
    } while (x != 1);
  }
}
