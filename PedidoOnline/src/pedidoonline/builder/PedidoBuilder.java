package pedidoonline.builder;

import java.util.List;
import pedidoonline.model.Produto;

public class PedidoBuilder {
    private String cliente;
    private List<Produto> produtos;
    private double total;

    public PedidoBuilder setCliente(String cliente) {
        this.cliente = cliente;
        return this;
    }

    public PedidoBuilder setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
        return this;
    }

    public PedidoBuilder calcularTotal() {
        this.total = produtos.stream().mapToDouble(Produto::getPreco).sum();
        return this;
    }

    public Pedido build() {
        return new Pedido(cliente, produtos, total);
    }
}

