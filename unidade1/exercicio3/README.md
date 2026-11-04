# Atividade 3 - Troco guloso

Nesta atividade, implementei em Java um algoritmo guloso para calcular o troco de R$ 12,00. A ideia é começar pela maior cédula disponível e usar quantas forem possíveis. Depois, o algoritmo passa para as próximas cédulas até completar o valor.

## Testes

| Cédulas disponíveis | Troco encontrado | Quantidade de cédulas |
|---|---|---:|
| 9, 6, 1 | 9 + 1 + 1 + 1 | 4 |
| 10, 5, 2, 1 | 10 + 2 | 2 |
| 20, 10, 5, 2, 1 | 10 + 2 | 2 |
| 100, 50, 20, 10, 5, 2, 1 | 10 + 2 | 2 |

## Análise

O programa percorre as cédulas da maior para a menor, calculando quantas vezes cada uma cabe no valor restante. Ao aumentar o conjunto de cédulas, o algoritmo continua funcionando sem precisar mudar a lógica.

No teste com cédulas de 9, 6 e 1, ele usa quatro cédulas (9 + 1 + 1 + 1), embora duas cédulas de 6 fossem suficientes. Isso mostra que a estratégia gulosa nem sempre produz o menor número de cédulas. Para os outros conjuntos testados, o troco de R$ 12,00 foi feito com duas cédulas.

Se as cédulas já estiverem ordenadas, o algoritmo percorre o vetor uma vez, então o tempo de execução é O(n), sendo n a quantidade de tipos de cédulas.

## Como executar

No terminal, dentro da pasta que contém o código:

```bash
javac Troco.java
java Troco
```
