package exercicios;

/** Exercicio "Na Pratica 04". */
//4: Imprima os fatoriais de 1 a 10.
public class Napratica04 {
  /** Executa o programa. */
  public static void main(String[] args) {
    //inicializa variável primitiva
    int fatorial = 1;
    //laço para imprimir os fatoriais
    for (int cont = 1; cont <= 10; cont++) {
      fatorial = cont * fatorial;
      System.out.println("Fatorial de " + cont + " (" + cont +
                         "!) é: " + fatorial + ".");
    }
  }
}
