# Exercício 2 — Algoritmos de troco e Fibonacci

## Questão do ENADE 2017

**Alternativa C.** A afirmação I é verdadeira para o conjunto de moedas de 1, 5, 10, 25 e 50 centavos: a estratégia apresentada produz a quantidade mínima de moedas. A afirmação II é falsa, porque métodos gulosos não garantem a melhor solução para qualquer problema. Por exemplo, com moedas de 1, 3 e 4 centavos, para pagar 6 centavos o guloso escolhe 4 + 1 + 1 (3 moedas), enquanto 3 + 3 usa apenas 2 moedas.

## Fibonacci

O arquivo `Fibonacci.java` compara duas formas de calcular a sequência de Fibonacci. A versão recursiva chama a si mesma repetidas vezes, enquanto a iterativa usa um laço e armazena somente os dois valores anteriores.

### Como executar

```bash
javac Fibonacci.java
java Fibonacci
```

Os testes usam n = 10, 20, 50, 100 e 1000. A versão recursiva simples é executada apenas para 10 e 20; para os outros valores, o programa registra que não executou devido ao crescimento exponencial do número de chamadas. A versão iterativa executa todos os casos e usa `BigInteger` para evitar estouro numérico.

### Comparação

| n | Recursivo | Iterativo |
|---:|---|---|
| 10 | Executado | Executado |
| 20 | Executado | Executado |
| 50 | Inviável na versão simples | Executado |
| 100 | Inviável na versão simples | Executado |
| 1000 | Inviável na versão simples | Executado |

O tempo em milissegundos é exibido pelo próprio programa e pode variar conforme o computador. Para preencher uma tabela com tempos reais, execute o programa e copie os resultados.

### Tempo e memória

A versão recursiva simples possui tempo **O(2^n)** como limite superior e utiliza **O(n)** de memória na pilha de chamadas. A versão iterativa realiza **O(n)** iterações e mantém apenas algumas variáveis, embora os números grandes armazenados em `BigInteger` também ocupem memória proporcional ao número de dígitos.

**Conclusão:** a implementação iterativa é mais adequada para valores grandes de n, enquanto a recursiva simples é útil para demonstrar como chamadas repetidas prejudicam o desempenho.
