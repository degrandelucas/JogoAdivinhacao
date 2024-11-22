# Projeto: Jogo de Adivinhação em Java

Este projeto é um jogo simples de adivinhação em Java, no qual o jogador deve acertar um número aleatório entre 1 e 50. Ele tem 5 tentativas para descobrir o número, recebendo dicas se o número correto é maior ou menor.

---

## Objetivo

Criar um jogo interativo que:
- Gere um número aleatório.
- Permita ao usuário fazer tentativas.
- Informe ao jogador se ele acertou, errou e se o número sorteado é maior ou menor.
- Limite o número de tentativas a 5.

---

## Pré-requisitos

- **Java SE Development Kit (JDK)**: Necessário para compilar e executar o código.
- **IDE**: Recomendada para facilitar o desenvolvimento (ex.: IntelliJ IDEA, Eclipse, NetBeans).
- **Bibliotecas utilizadas**:
    - `java.util.Random`: Para gerar o número aleatório.
    - `java.util.Scanner`: Para capturar entradas do usuário.

## Fluxo do Programa

- O programa exibe uma mensagem de boas-vindas e explica as regras. 
- Um número aleatório entre 1 e 50 é gerado.
- O jogador faz uma tentativa, digitando um número.
- O programa verifica:
- Acerto: Mostra uma mensagem de vitória e encerra o jogo.
- Erro: Indica se o número sorteado é maior ou menor.
- Se o jogador não acertar em 5 tentativas, o programa exibe o número correto e encerra.


### Tecnologias Utilizadas
- Java: Linguagem de programação usada.
- Bibliotecas padrão: Random para geração de números e Scanner para entrada do usuário.

### Autor
- Lucas Degrande