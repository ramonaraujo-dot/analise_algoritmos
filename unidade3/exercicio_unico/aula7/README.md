# Unidade 3 — Aula 7: Árvores e grafos

## Questão de concurso

**Resposta: alternativa E.** Na árvore da questão, a raiz é 1; à esquerda está 2, com filhos 4 e 5; à direita está 3.

- **Em-ordem:** 4 2 5 1 3 (esquerda, raiz, direita).
- **Pré-ordem:** 1 2 4 5 3 (raiz, esquerda, direita).
- **Pós-ordem:** 4 5 2 3 1 (esquerda, direita, raiz).

## Código Java

O programa `PercorreArvoreBinaria.java` usa uma árvore binária de busca com 25 números inteiros. A inserção coloca os menores valores à esquerda e os maiores à direita. Mantive os métodos de exibição e de percurso do código da aula.

O arquivo `resultado.txt` registra a saída real do programa, com a árvore apresentada de lado e as três sequências de percurso.

Na execução, o percurso **em-ordem** apresenta os números em ordem crescente, porque a estrutura utilizada é uma árvore binária de busca.

## Como executar

Na pasta que contém a subpasta `aula7`, execute:

```bash
javac aula7/PercorreArvoreBinaria.java
java aula7.PercorreArvoreBinaria
```

Para gerar novamente o resultado:

```bash
java aula7.PercorreArvoreBinaria > aula7/resultado.txt
```

## Entrega

Enviar `PercorreArvoreBinaria.java`, `resultado.txt` e `README.md` ao repositório da disciplina, no caminho indicado pelo professor para o exercício único das aulas 7, 8 e 9. O código mantém `package aula7`, portanto deve ser compilado a partir da pasta acima de `aula7`.
