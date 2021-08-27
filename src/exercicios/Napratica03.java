package exercicios;

/** Exercicio "Na Pratica 03". */
//3: Imprima todos os múltiplos de 3, entre 1 e 100.
public class Napratica03 {
  /** Executa o programa. */
  public static void main(String[] args) {
    //laço para impressão dos múltiplos
    for (int cont = 3; cont < 100; cont++) {
      //condicional confere se é múltiplo de 3
      if (cont % 3 == 0) {
        System.out.println(cont);
      }
    }
  }
}