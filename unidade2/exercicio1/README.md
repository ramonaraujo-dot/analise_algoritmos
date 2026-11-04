# Atividade 4 - Mochila Fracionária

## Objetivo

O objetivo desta atividade é implementar um algoritmo guloso para resolver o problema da mochila fracionária, comparando diferentes formas de escolher os itens.

## Implementação

O programa foi desenvolvido em Java. Foram utilizados três itens, com pesos de 10, 20 e 30 kg e valores de R$ 60, R$ 100 e R$ 120.

A mochila possui capacidade máxima de 50 kg.

Foram comparadas três estratégias:

- Maior valor: escolhe primeiro os itens mais caros.
- Menor peso: escolhe primeiro os itens mais leves.
- Melhor valor por peso: prioriza os itens com maior valor em relação ao peso.

Como a mochila é fracionária, é possível colocar apenas uma parte de um item quando não existe espaço suficiente.

## Resultados

| Estratégia | Valor obtido |
|---|---|
| Maior valor | R$ 220,00 |
| Menor peso | R$ 240,00 |
| Melhor valor/peso | R$ 240,00 |

## Análise dos resultados

Nos testes, a estratégia de maior valor apresentou um resultado inferior às outras duas.

A estratégia de menor peso conseguiu atingir R$ 240,00, assim como a estratégia de melhor valor por peso.

A escolha pela relação valor/peso é a mais indicada para o problema da mochila fracionária, pois permite aproveitar melhor a capacidade disponível e obter o maior valor possível.

## Conclusão

Com essa atividade, foi possível entender melhor o funcionamento dos algoritmos gulosos. Percebi que a ordem em que os itens são escolhidos influencia diretamente o resultado.

No caso da mochila fracionária, escolher os itens pela melhor relação entre valor e peso garante a solução ótima, considerando que os itens podem ser divididos.
