package hibernate;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import hibernate.dao.IProdutoDAO;
import hibernate.dao.ProdutoDAO;
import hibernate.domain.Produto;

public class ProdutoTest {
	
	private IProdutoDAO produtoDAO;
	
	public ProdutoTest() {
		produtoDAO = new ProdutoDAO();
	}
	
	@Test
	public void cadastrar() {
		Produto prod = new Produto();
		prod.setCodigo("A1");
		prod.setNome("Celular");
		prod.setCodigoDeBaras(123456348L);
		produtoDAO.cadastrar(prod);
		
		assertNotNull(prod);
		assertNotNull(prod.getId());
	}
}
