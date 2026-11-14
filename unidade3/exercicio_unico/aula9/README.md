# Aula 9 — Revisão e exercícios gerais

O exercício compara Bubble Sort, Selection Sort e Merge Sort. Completei os três métodos do exemplo fornecido na aula e usei cópias do mesmo vetor para garantir que cada algoritmo receba os mesmos dados.

## Teste inicial

Vetor original: `64, 34, 25, 12, 22, 11, 90`.

Os três métodos retornaram: `11, 12, 22, 25, 34, 64, 90`.

## Tempos medidos

Foram feitas três execuções para cada algoritmo e tamanho de vetor. Os números abaixo são as médias medidas no ambiente de teste, em milissegundos, e podem variar em outros computadores.

| Elementos | Bubble Sort | Selection Sort | Merge Sort |
|---:|---:|---:|---:|
| 1.000 | 3,3194 | 2,3055 | 0,3699 |
| 5.000 | 18,7343 | 7,0728 | 1,4623 |
| 10.000 | 132,5907 | 30,9114 | 1,6804 |

## Análise

Bubble Sort e Selection Sort têm complexidade de tempo O(n²) no caso médio. Bubble Sort compara elementos vizinhos e os troca quando necessário. Selection Sort procura o menor elemento restante a cada passagem. Merge Sort divide o vetor, ordena as partes e depois as combina, com tempo O(n log n).

Nos testes, Merge Sort foi o mais rápido, especialmente com vetores maiores. Bubble Sort teve o maior tempo com 10 mil elementos. Os tempos não crescem exatamente na proporção teórica por causa da JVM, da otimização e das condições de execução, mas a tendência é compatível com a análise de complexidade.

Em memória auxiliar, Merge Sort usa O(n), enquanto as versões usadas de Bubble Sort e Selection Sort usam O(1).

## Como executar

```bash
javac RevisaoAlgoritmos.java
java RevisaoAlgoritmos
```

O arquivo `resultado.txt` contém a saída de uma execução real. Os tempos são ilustrativos do ambiente usado e não representam uma medição feita no computador do aluno.
