package br.com.rpires.model;

import java.util.List;

public class Venda {
    private Long id;
    private Cliente cliente;
    private List<Produto> produtos;

    public Venda() {}

    public Venda(Long id, Cliente cliente, List<Produto> produtos) {
        this.id = id;
        this.cliente = cliente;
        this.produtos = produtos;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }

    public List<Produto> getProdutos() { return produtos; }
    public void setProdutos(List<Produto> produtos) { this.produtos = produtos; }
}
