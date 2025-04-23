package pedidoonline.facade;

import pedidoonline.singleton.Carrinho;
import pedidoonline.builder.Pedido;
import pedidoonline.builder.PedidoBuilder;
import pedidoonline.model.Produto;

public class PedidoFacade {
    public void fazerPedido(String nomeCliente) {
        Carrinho carrinho = Carrinho.getInstancia();

        Pedido pedido = new PedidoBuilder()
                .setCliente(nomeCliente)
                .setProdutos(carrinho.getProdutos())
                .calcularTotal()
                .build();

        pedido.imprimirResumo();
        carrinho.limpar();
    }
}

