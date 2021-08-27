package exercicios;

/*
Desafio 1: Resolver a série de Fibonacci usando um método que chama
           a si mesmo. Este método não pode ter nenhum laço, só
           pode chamar-se a si mesmo como método.
Desafio 2: Escreva o método recursivo novamente usando apenas uma linha.
           Pesquise sobre operadores ternários.
 */
/** Desafio 1 "Na Pratica 09". */
public class Napratica09 {
  /** Calcula série Fibonacci.*/
  public int calculaFibonacci(int n) {
    if (n <= 2) {
      return 1;
    } else {
      return calculaFibonacci(n - 1) + calculaFibonacci(n - 2);
    }
  }
}
