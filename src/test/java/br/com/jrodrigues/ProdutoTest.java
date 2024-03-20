package br.com.jrodrigues;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import br.com.jrodrigues.dao.IProdutoDao;
import br.com.jrodrigues.dao.ProdutoDao;
import br.com.jrodrigues.domain.Produto;

public class ProdutoTest {
	
	IProdutoDao produtoDao;
	
	public ProdutoTest() {
		produtoDao = new ProdutoDao();
	}
	
	@Test
	public void cadastrar() {
		Produto prod = new Produto();
		prod.setCodigo("A1");
		prod.setNome("Computer");
		prod.setPrice(2000d);
		
		produtoDao.cadastrar(prod);
		
		assertNotNull(prod);
		assertNotNull(prod.getId());
		
		Produto prodDB = produtoDao.buscarPorID(prod.getId());
		assertNotNull(prodDB);
		assertEquals(prod.getId(), prodDB.getId());
		assertEquals(prod.getNome(), prodDB.getNome());
		
		produtoDao.excluir(prod);
		Produto prodDBEX = produtoDao.buscarPorID(prod.getId());
		assertNull(prodDBEX);
		
	}

}
