/**
 * 
 */
package hibernate;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import hibernate.dao.CursoDAO;
import hibernate.dao.ICursoDAO;
import hibernate.domain.Curso;

/**
 * @author rafael.andrade
 */
public class CursoTest {
	
	private ICursoDAO cursoDAO;
	
	public CursoTest() {
		cursoDAO = new CursoDAO();
	}

	@Test
	public void cadastrar( ) {
		Curso curso = new Curso();
		curso.setCodigo("A1");
		curso.setDescricao("CURSO TESTE");
		curso.setNome("Curso de Java Backend");
		curso = cursoDAO.cadastrar(curso);
		
		assertNotNull(curso);
		assertNotNull(curso.getId());
	}

}

