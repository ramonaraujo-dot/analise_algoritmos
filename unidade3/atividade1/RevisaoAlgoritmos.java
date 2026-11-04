import java.util.Arrays;
import java.util.Random;

public class RevisaoAlgoritmos {
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean trocou = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j]; arr[j] = arr[j + 1]; arr[j + 1] = temp;
                    trocou = true;
                }
            }
            if (!trocou) break;
        }
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int menor = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[menor]) menor = j;
            }
            int temp = arr[i]; arr[i] = arr[menor]; arr[menor] = temp;
        }
    }

    public static void mergeSort(int[] arr, int l, int r) {
        if (l >= r) return;
        int meio = l + (r - l) / 2;
        mergeSort(arr, l, meio);
        mergeSort(arr, meio + 1, r);
        int[] temp = new int[r - l + 1];
        int i = l, j = meio + 1, k = 0;
        while (i <= meio && j <= r)
            temp[k++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
        while (i <= meio) temp[k++] = arr[i++];
        while (j <= r) temp[k++] = arr[j++];
        System.arraycopy(temp, 0, arr, l, temp.length);
    }

    public static void main(String[] args) {
        int[] tamanhos = {7, 1000, 5000, 10000};
        System.out.println("Algoritmo,Tamanho,Tempo_ms");
        for (int n : tamanhos) {
            int[] original = new int[n];
            Random sorteio = new Random(42);
            for (int i = 0; i < n; i++) original[i] = sorteio.nextInt(100000);
            for (int algoritmo = 0; algoritmo < 3; algoritmo++) {
                int[] copia = Arrays.copyOf(original, n);
                long inicio = System.nanoTime();
                if (algoritmo == 0) bubbleSort(copia);
                else if (algoritmo == 1) selectionSort(copia);
                else mergeSort(copia, 0, copia.length - 1);
                double tempo = (System.nanoTime() - inicio) / 1_000_000.0;
                for (int i = 1; i < copia.length; i++)
                    if (copia[i] < copia[i - 1]) throw new IllegalStateException("Erro na ordenacao");
                String nome = algoritmo == 0 ? "Bubble Sort" : algoritmo == 1 ? "Selection Sort" : "Merge Sort";
                System.out.printf(java.util.Locale.US, "%s,%d,%.6f%n", nome, n, tempo);
            }
        }
    }
}
