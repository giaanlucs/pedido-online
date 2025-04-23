package pedidoonline.builder;

import java.util.List;
import pedidoonline.model.Produto;

public class Pedido {
    private String cliente;
    private List<Produto> produtos;
    private double total;

    public Pedido(String cliente, List<Produto> produtos, double total) {
        this.cliente = cliente;
        this.produtos = produtos;
        this.total = total;
    }

    public void imprimirResumo() {
        System.out.println("Cliente: " + cliente);
        produtos.forEach(p -> System.out.println("- " + p));
        System.out.println("Total: R$" + total);
    }
}

