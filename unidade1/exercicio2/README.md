# Atividade 2 — Busca em vetor

Nesta atividade comparei a busca linear com a busca binária em um vetor de 10 milhões de números inteiros. Usei Java para fazer os testes.

## Como executar

```bash
javac BuscaVetor.java
java BuscaVetor
```

O vetor é preenchido em ordem crescente, com números pares. O número procurado é o último elemento, para testar um caso em que a busca linear precisa percorrer o vetor inteiro. A busca binária é feita com `Arrays.binarySearch`, que precisa de um vetor ordenado.

O programa faz cinco testes e mostra os tempos em milissegundos e a média. Os resultados devem ser anotados depois de executar o código no computador usado para a atividade.

## Resultados

| Método | Média (ms) |
|---|---:|
| Busca linear | Preencher após executar |
| Busca binária | Preencher após executar |

## Análise

A busca linear verifica os números um por um. Como o valor procurado está no fim, ela precisa passar pelos 10 milhões de elementos. Sua complexidade nesse caso é O(n).

A busca binária divide a região de busca pela metade a cada passo, por isso faz bem menos comparações. Sua complexidade é O(log n). A expectativa é que ela seja muito mais rápida nesse teste, mas os tempos exatos dependem do computador e da execução.

A comparação considera somente o tempo de busca, sem incluir o preenchimento do vetor. Como o vetor já está ordenado, não é necessário medir uma ordenação antes da busca binária.
