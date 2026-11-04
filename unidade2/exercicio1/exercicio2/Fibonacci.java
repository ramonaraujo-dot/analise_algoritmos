import java.math.BigInteger;

public class Fibonacci {
    // Versao recursiva simples, usada para comparar o custo das chamadas.
    public static long fibRecursivo(int n) {
        if (n <= 1) return n;
        return fibRecursivo(n - 1) + fibRecursivo(n - 2);
    }

    // BigInteger evita estouro para n = 100 e 1000.
    public static BigInteger fibIterativo(int n) {
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        for (int i = 0; i < n; i++) {
            BigInteger proximo = a.add(b);
            a = b;
            b = proximo;
        }
        return a;
    }

    public static void main(String[] args) {
        int[] testes = {10, 20, 50, 100, 1000};
        for (int n : testes) {
            System.out.println("\nn = " + n);
            if (n <= 40) {
                long inicio = System.nanoTime();
                long resultado = fibRecursivo(n);
                double ms = (System.nanoTime() - inicio) / 1_000_000.0;
                System.out.printf("Recursivo: %d | %.4f ms%n", resultado, ms);
            } else {
                System.out.println("Recursivo: nao executado (tempo exponencial muito alto)");
            }
            long inicio = System.nanoTime();
            BigInteger resultado = fibIterativo(n);
            double ms = (System.nanoTime() - inicio) / 1_000_000.0;
            System.out.printf("Iterativo: %s | %.4f ms%n", resultado, ms);
        }
    }
}
