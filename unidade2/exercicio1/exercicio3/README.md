# Unidade 2 — Atividade 3 (Aula 6)

## Questão 1 — ENADE 2017: Fibonacci

**Resposta: alternativa D (I e III).** A implementação recursiva ingênua repete cálculos e tem tempo exponencial, aproximadamente O(φ^n). A memória utilizada pela pilha de chamadas é O(n), portanto a afirmação II é falsa. Uma implementação iterativa pode calcular os termos em O(n) de tempo e O(1) de espaço.

## Questão 2 — Percursos em árvore binária

**Resposta: alternativa D.** Para a árvore apresentada:

- Em-ordem (esquerda, raiz, direita): **4 2 5 1 3**
- Pré-ordem (raiz, esquerda, direita): **1 2 4 5 3**
- Pós-ordem (esquerda, direita, raiz): **4 5 2 3 1**

## Questão 3 — Contagem de nomes com dicionário

O programa `ContaNomesComDicionario.java` lê um arquivo de texto com um nome por linha. Para cada nome, consulta o `HashMap` e soma 1 à quantidade registrada. Linhas vazias são ignoradas. No final, mostra os nomes e suas contagens em ordem alfabética.

### Como executar

No terminal, dentro desta pasta:

```bash
javac ContaNomesComDicionario.java
java ContaNomesComDicionario
```

Por padrão o programa lê `nomes.txt`, incluído como exemplo. Também é possível passar outro caminho:

```bash
java ContaNomesComDicionario outro_arquivo.txt
```

### Resultado com o arquivo de exemplo

```text
Contagem de nomes:
Ana: 3
Carlos: 2
Joao: 1
Maria: 2
```

### Análise

O `HashMap` permite consultar e atualizar as contagens em tempo médio O(1) por nome. Para n linhas, a leitura e a contagem têm tempo médio O(n). A ordenação final dos k nomes distintos para exibição acrescenta O(k log k).
