import java.util.Arrays;
import java.util.Locale;

public class ComparaBuscas {
    private static volatile int resultado;

    public static int buscaLinear(int[] vetor, int alvo) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == alvo) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] tamanhos = {10, 100, 1000, 10000, 100000, 1000000};
        System.out.println("tamanho,linear_ms,binaria_ms");
        for (int n : tamanhos) {
            int[] vetor = new int[n];
            for (int i = 0; i < n; i++) vetor[i] = i * 2;
            int alvo = vetor[n - 1];
            // Aquecimento da JVM, fora da medição.
            for (int i = 0; i < 3000; i++) {
                resultado = buscaLinear(vetor, alvo);
                resultado = Arrays.binarySearch(vetor, alvo);
            }
            // Lotes de buscas reduzem o erro de cronômetro em operações rápidas.
            int repeticoes = Math.max(100, Math.min(100000, 10000000 / n));
            double somaLinear = 0, somaBinaria = 0;
            for (int rodada = 0; rodada < 5; rodada++) {
                long inicio = System.nanoTime();
                for (int i = 0; i < repeticoes; i++) resultado = buscaLinear(vetor, alvo);
                somaLinear += (System.nanoTime() - inicio) / 1_000_000.0 / repeticoes;
                inicio = System.nanoTime();
                for (int i = 0; i < repeticoes; i++) resultado = Arrays.binarySearch(vetor, alvo);
                somaBinaria += (System.nanoTime() - inicio) / 1_000_000.0 / repeticoes;
            }
            System.out.printf(Locale.US, "%d,%.9f,%.9f%n", n, somaLinear / 5, somaBinaria / 5);
        }
    }
}
