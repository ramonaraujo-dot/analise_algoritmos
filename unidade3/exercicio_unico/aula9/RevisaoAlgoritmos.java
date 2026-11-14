import java.util.Arrays;
import java.util.Random;

public class RevisaoAlgoritmos {
    public static void main(String[] args) {
        int[] vetor = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Teste com o vetor do professor:");
        testarVetor(vetor);

        System.out.println("\nComparacao de tempos (milissegundos):");
        System.out.println("Tamanho | Bubble | Selection | Merge");
        int[] tamanhos = {1000, 5000, 10000};
        for (int tamanho : tamanhos) {
            int[] dados = new int[tamanho];
            Random sorteio = new Random(42);
            for (int i = 0; i < tamanho; i++) dados[i] = sorteio.nextInt(100000);
            double[] tempos = new double[3];
            for (int repeticao = 0; repeticao < 3; repeticao++) {
                for (int algoritmo = 0; algoritmo < 3; algoritmo++) {
                    int[] copia = dados.clone();
                    long inicio = System.nanoTime();
                    if (algoritmo == 0) bubbleSort(copia);
                    else if (algoritmo == 1) selectionSort(copia);
                    else mergeSort(copia, 0, copia.length - 1);
                    tempos[algoritmo] += (System.nanoTime() - inicio) / 1_000_000.0;
                    if (!ordenado(copia)) throw new IllegalStateException("Erro na ordenacao");
                }
            }
            System.out.printf("%d | %.4f | %.4f | %.4f%n", tamanho,
                    tempos[0] / 3, tempos[1] / 3, tempos[2] / 3);
        }
        System.out.println("Analise de complexidade concluida");
    }

    static void testarVetor(int[] vetor) {
        int[] a = vetor.clone(), b = vetor.clone(), c = vetor.clone();
        bubbleSort(a);
        selectionSort(b);
        mergeSort(c, 0, c.length - 1);
        System.out.println("Bubble: " + Arrays.toString(a));
        System.out.println("Selection: " + Arrays.toString(b));
        System.out.println("Merge: " + Arrays.toString(c));
    }

    static boolean ordenado(int[] arr) {
        for (int i = 1; i < arr.length; i++) if (arr[i - 1] > arr[i]) return false;
        return true;
    }

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
        int[] aux = new int[r - l + 1];
        int i = l, j = meio + 1, k = 0;
        while (i <= meio && j <= r) {
            if (arr[i] <= arr[j]) aux[k++] = arr[i++];
            else aux[k++] = arr[j++];
        }
        while (i <= meio) aux[k++] = arr[i++];
        while (j <= r) aux[k++] = arr[j++];
        System.arraycopy(aux, 0, arr, l, aux.length);
    }
}
