package exercicios;

/*7:
Imprima a seguinte tabela usando for's encadeados:
1
2 4
3 6 9
4 8 12 16
n n*2 n*3 ... n*n
 */
/** Exercicio "Na Pratica 07". */

public class Napratica07 {
  /** Executa o programa.*/
  public static void main(String[] args) {
    //quantidade de linhas a serem impressas
    int num = 4;
    //laço para impressão das linhas
    for (int linha = 1; linha <= num; linha++) {
      //laço para impressão das colunas
      for (int coluna = 1; coluna <= linha; coluna++) {
        System.out.print(linha * coluna + " ");
      }
      //pula para próxima linha
      System.out.println(" ");
    }
  }
}
