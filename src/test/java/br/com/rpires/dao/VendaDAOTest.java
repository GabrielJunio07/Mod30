package br.com.rpires.dao;

import br.com.rpires.model.Cliente;
import br.com.rpires.model.Produto;
import br.com.rpires.model.Venda;
import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.*;

public class VendaDAOTest {

    @Test
    public void testSalvarEBuscar() {
        VendaDAO dao = new VendaDAO();
        Cliente c = new Cliente(1L, "João", "123.456.789-00");
        Produto p = new Produto(1L, "Notebook", 3500.0, 10);
        Venda v = new Venda(1L, c, Arrays.asList(p));

        dao.salvar(v);
        assertEquals(1, dao.buscarTodos().size());
        assertEquals("João", dao.buscarTodos().get(0).getCliente().getNome());
        assertEquals("Notebook", dao.buscarTodos().get(0).getProdutos().get(0).getNome());
    }
}
