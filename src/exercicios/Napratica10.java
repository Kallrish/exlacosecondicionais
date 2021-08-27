package exercicios;

/*
Desafio 2: Escreva o método recursivo novamente usando apenas uma linha.
           Pesquise sobre operadores ternários.
 */
/** Desafio 2 "Na Pratica 10". */
public class Napratica10 {
    /** Calcula série Fibonacci.*/
    public static int calculaFibonacci2(int n) {
            return (n <=2) ? 1 : calculaFibonacci2(n - 1)
                    + calculaFibonacci2(n - 2);
    }
}

