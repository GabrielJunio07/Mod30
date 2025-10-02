package br.com.rpires.dao;

import br.com.rpires.model.Venda;
import java.util.ArrayList;
import java.util.List;

public class VendaDAO {
    private List<Venda> vendas = new ArrayList<>();

    public void salvar(Venda venda) {
        vendas.add(venda);
    }

    public List<Venda> buscarTodos() {
        return vendas;
    }
}
