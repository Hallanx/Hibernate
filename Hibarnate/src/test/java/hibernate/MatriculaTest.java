/**
 * 
 */
package hibernate;

import static org.junit.Assert.assertNotNull;

import java.time.Instant;

import org.junit.Test;

import hibernate.dao.IMatriculaDAO;
import hibernate.dao.MatriculaDAO;
import hibernate.domain.Matricula;

/**
 * @author rafael.andrade
 */
public class MatriculaTest {
	
	private IMatriculaDAO matriculaDAO;
	
	public MatriculaTest() {
		matriculaDAO = new MatriculaDAO();
	}
	
	@Test
	public void cadastrar() {
		Matricula mat = new Matricula();
		mat.setCodigo("A1");
		mat.setDataMatricula(Instant.now());
		mat.setStatus("ATIVA");
		mat.setValor(2000d);
		matriculaDAO.cadastrar(mat);
		
		assertNotNull(mat);
		assertNotNull(mat.getId());
		
	}
}
