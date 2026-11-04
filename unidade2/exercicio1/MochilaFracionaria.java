import java.util.Arrays;
import java.util.Comparator;

public class MochilaFracionaria {
    static class Item {
        int peso, valor;
        Item(int peso, int valor) { this.peso = peso; this.valor = valor; }
    }

    static void testar(String estrategia, Item[] itens, int capacidade) {
        Item[] ordem = itens.clone();
        if (estrategia.equals("Maior valor"))
            Arrays.sort(ordem, (a, b) -> Integer.compare(b.valor, a.valor));
        else if (estrategia.equals("Menor peso"))
            Arrays.sort(ordem, Comparator.comparingInt(a -> a.peso));
        else
            Arrays.sort(ordem, (a, b) -> Double.compare((double)b.valor / b.peso, (double)a.valor / a.peso));

        double restante = capacidade;
        double total = 0;
        System.out.println("\nEstratégia: " + estrategia);
        for (Item item : ordem) {
            if (restante <= 0) break;
            double quantidade = Math.min(1.0, restante / item.peso);
            double pesoUsado = quantidade * item.peso;
            double valorObtido = quantidade * item.valor;
            total += valorObtido;
            restante -= pesoUsado;
            System.out.printf("Item (%d kg, R$ %d): %.1f%%, valor R$ %.2f%n",
                    item.peso, item.valor, quantidade * 100, valorObtido);
        }
        System.out.printf("Valor total: R$ %.2f%n", total);
    }

    public static void main(String[] args) {
        int capacidade = 50;
        Item[] itens = {new Item(10, 60), new Item(20, 100), new Item(30, 120)};
        testar("Maior valor", itens, capacidade);
        testar("Menor peso", itens, capacidade);
        testar("Melhor valor por peso", itens, capacidade);
    }
}
