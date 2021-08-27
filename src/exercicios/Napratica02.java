package exercicios;

/** Exercicio "Na Pratica 02".  */
//2: Imprima na tela  a soma de 1 até 1000.
public class Napratica02 {
  /** Executa o programa. */
  public static void main(String[] args) {
    //Inicializa variváveis primitivas
    int valor1 = 1;
    int valor2 = 1000;
    //Fórmula da soma sem mostrar as etapas
    int soma = (valor1 + valor2) * ((valor2 - valor1 + 1) / 2);
    System.out.println("A soma de 1 a 1000 é " + soma + ".");
  }
}
/* Outra solução, mas usando o laço FOR e mostrando as etapas

        int soma =0;
        int ultimoValor;
        for (int cont = 1; cont <= 1000; cont++) {
            ultimoValor = resultado;
            soma += cont;
            System.out.printf("%d = %d + %d\n", soma, ultimoValor, cont);
        }
*/