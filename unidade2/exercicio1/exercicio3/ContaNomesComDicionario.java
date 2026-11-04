import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ContaNomesComDicionario {
    public static void main(String[] args) {
        Map<String, Integer> contagem = new HashMap<>();
        String arquivo = args.length > 0 ? args[0] : "nomes.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String nome = linha.trim();
                if (nome.isEmpty()) continue;
                contagem.put(nome, contagem.getOrDefault(nome, 0) + 1);
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
            return;
        }

        System.out.println("Contagem de nomes:");
        for (Map.Entry<String, Integer> entrada : new TreeMap<>(contagem).entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }
    }
}
