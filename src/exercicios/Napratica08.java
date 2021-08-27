package exercicios;

/** Exercicio "Na Pratica 08". */
//8: Faça o exercício da série de Fibonacci (nº 5) usando só 2 variáveis.
public class Napratica08 {
  /** Executa o programa.*/
  public static void main(String[] args) {
    //inicializa as variáveis primitivas
    int num1 = 0;
    int num2 = 1;
    int cont = 2;
    //escreve primeiro número inicial que é padrão
    System.out.println("1: " + num1);
    //laço para imprimir a sequência de Fibonacci
    while (cont < 100) {
      System.out.println(cont + ": " + num1);
      //recebe o próximo número
      num2 = num1 + num2;
      //atualiza o número anterior
      num1 = num2 - num1;
      cont++;
      //para o laço quando recebe primeiro valor > 100
      if (num1 > 100) {
        System.out.println(cont + ": " + num1);
        break;
      }
    }
  }
}
