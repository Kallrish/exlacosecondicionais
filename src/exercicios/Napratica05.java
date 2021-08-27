package exercicios;

/** Exercicio "Na Pratica 05". */
//5: Imprima os primeiros números da série de Fibonacci até passar de 100.
public class Napratica05 {
  /** Executa o programa. */
  public static void main(String[] args) {
    //inicializa variáveis primitivas
    int fibo;
    int ant1 = 0;
    int ant2 = 0;
    //laço para verificar quantidade indeterminada, mas menor que 100.
    for (int cont = 2; cont <= 100; cont++) {
      //condional para imprimir os valores iniciais 0 e 1 da Fibonnaci.
      if (ant1 == 0) {
        ant1 = 1;
        System.out.println("1: " + ant2);
        System.out.println(cont + ": " + ant1);
        continue;
      }
      fibo = ant1 + ant2;
      System.out.println(cont + ": " + fibo);
      ant2 = ant1;
      ant1 = fibo;
      //condicional para parar o laço conforme enunciado
      if (fibo > 100) {
        break;
      }
    }

  }
}