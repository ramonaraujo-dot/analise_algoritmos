import java.util.Arrays;

public class Troco {
    public static void calcularTroco(int valor, int[] cedulas) {
        int[] usadas = new int[cedulas.length];
        int restante = valor;

        for (int i = 0; i < cedulas.length; i++) {
            usadas[i] = restante / cedulas[i];
            restante = restante % cedulas[i];
        }

        System.out.println("Troco de R$ " + valor + ",00 com " + Arrays.toString(cedulas));
        int total = 0;
        for (int i = 0; i < cedulas.length; i++) {
            if (usadas[i] > 0) {
                System.out.println("R$ " + cedulas[i] + ",00: " + usadas[i] + " cedula(s)");
                total += usadas[i];
            }
        }
        System.out.println("Total de cedulas: " + total);
        if (restante != 0) {
            System.out.println("Nao foi possivel completar o troco. Restam R$ " + restante + ",00");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int valor = 12;
        calcularTroco(valor, new int[]{9, 6, 1});
        calcularTroco(valor, new int[]{10, 5, 2, 1});
        calcularTroco(valor, new int[]{20, 10, 5, 2, 1});
        calcularTroco(valor, new int[]{100, 50, 20, 10, 5, 2, 1});
    }
}
