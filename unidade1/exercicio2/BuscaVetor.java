import java.util.Arrays;

public class BuscaVetor {
    public static void main(String[] args) {
        int tamanho = 10_000_000;
        int[] vetor = new int[tamanho];
        for (int i = 0; i < tamanho; i++) vetor[i] = i * 2;

        int procurado = vetor[tamanho - 1];
        long somaLinear = 0, somaBinaria = 0;
        int repeticoes = 5;

        for (int vez = 1; vez <= repeticoes; vez++) {
            long inicio = System.nanoTime();
            int posLinear = buscaLinear(vetor, procurado);
            long tempoLinear = System.nanoTime() - inicio;

            inicio = System.nanoTime();
            int posBinaria = Arrays.binarySearch(vetor, procurado);
            long tempoBinaria = System.nanoTime() - inicio;

            if (posLinear != posBinaria) throw new IllegalStateException("Resultados diferentes");
            somaLinear += tempoLinear;
            somaBinaria += tempoBinaria;
            System.out.printf("Teste %d: linear = %.4f ms, binaria = %.4f ms%n",
                    vez, tempoLinear / 1_000_000.0, tempoBinaria / 1_000_000.0);
        }
        System.out.printf("Media linear: %.4f ms%n", somaLinear / (repeticoes * 1_000_000.0));
        System.out.printf("Media binaria: %.4f ms%n", somaBinaria / (repeticoes * 1_000_000.0));
    }

    static int buscaLinear(int[] vetor, int valor) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valor) return i;
        }
        return -1;
    }
}
