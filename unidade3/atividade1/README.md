# Unidade 3 - Aula 9 - Análise comparativa de algoritmos

## Objetivo
Comparar o funcionamento e o tempo de execução dos algoritmos Bubble Sort, Selection Sort e Merge Sort.

## Como executar
Com Java instalado, abra um terminal nesta pasta e execute:

```bash
javac RevisaoAlgoritmos.java
java RevisaoAlgoritmos
```

O programa testa vetores com 7, 1.000, 5.000 e 10.000 números. Os três algoritmos recebem cópias dos mesmos dados em cada tamanho. O tempo é mostrado em milissegundos.

## Comparação

| Algoritmo | Complexidade de tempo (caso médio) | Característica |
|---|---|---|
| Bubble Sort | O(n²) | Compara e troca elementos vizinhos. |
| Selection Sort | O(n²) | Procura o menor elemento e o coloca na posição correta. |
| Merge Sort | O(n log n) | Divide o vetor em partes e depois junta as partes ordenadas. |

## Resultados

Preencha esta tabela após executar o programa na máquina usada na entrega:

| Tamanho | Bubble Sort (ms) | Selection Sort (ms) | Merge Sort (ms) |
|---:|---:|---:|---:|
| 7 | | | |
| 1.000 | | | |
| 5.000 | | | |
| 10.000 | | | |

## Análise
O Bubble Sort e o Selection Sort têm crescimento quadrático no caso médio, então tendem a ficar mais lentos quando aumentamos o tamanho do vetor. O Merge Sort tem crescimento O(n log n) e tende a se sair melhor com vetores grandes. Em vetores pequenos, os tempos podem ser muito próximos. As medições também variam conforme a máquina e a execução do Java.

O programa usa `System.nanoTime()` para medir apenas a ordenação, sem incluir a criação do vetor. Para uma comparação mais confiável, é interessante repetir as execuções e calcular a média.
