# Sistema de Pedido Online (Tipo iFood)

## Descrição

Este projeto é um **Sistema de Pedido Online**, onde o cliente pode navegar por um cardápio, adicionar produtos ao carrinho, escolher o método de pagamento e confirmar o pedido. O sistema utiliza **padrões de projeto** como **Facade**, **Singleton** e **Builder** para garantir uma estrutura modular e fácil de manutenção.

O objetivo deste projeto é demonstrar como os padrões de design podem ser aplicados em sistemas reais para melhorar a organização e flexibilidade do código.

## Funcionalidades

- **Carrinho de Compras**: O cliente pode adicionar produtos ao carrinho e ver o total do pedido.
- **Escolha de Produtos**: O cliente escolhe os produtos disponíveis no cardápio.
- **Formas de Pagamento**: O cliente pode escolher entre várias formas de pagamento.
- **Tempo de Entrega**: O cliente escolhe o tempo estimado para a entrega.
- **Confirmar Pedido**: O cliente visualiza o resumo do pedido, confirma os detalhes e finaliza a compra.

## Padrões de Projeto Utilizados

- **Facade**: Implementado na classe `PedidoFacade`, simplifica a interação com o sistema de pedidos.
- **Singleton**: Implementado na classe `Carrinho`, garantindo que o carrinho de compras seja único durante toda a sessão.
- **Builder**: Implementado na classe `PedidoBuilder`, permitindo a construção flexível de objetos `Pedido` com vários parâmetros opcionais.

## Como Usar

### Pré-requisitos

Certifique-se de ter o **Java** instalado no seu sistema. Você pode baixar o Java [aqui](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).

### Rodando o Projeto

1. Clone este repositório para sua máquina local:
   ```bash
   git clone https://github.com/seu-usuario/sistema-pedido-online.git
