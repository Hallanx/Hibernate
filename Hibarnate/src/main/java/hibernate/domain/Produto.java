/**
 * 
 */
package hibernate.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * 
 */
@Entity
@Table(name = "TB_PRODUTO")
public class Produto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="prod_seq")
	@SequenceGenerator(name="prod_seq", sequenceName = "sq_produto", initialValue = 1, allocationSize = 10)
	private Long id;
	
	@Column(name="CODIGO", length = 10, nullable = false, unique = true)
	private String codigo;
	
	@Column(name="NOME", length = 50, nullable = false)
	private String nome;
	
	@Column(name="CODIGO_DE_BARRAS", nullable = false)
	private Long codigoDeBaras;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getCodigoDeBaras() {
		return codigoDeBaras;
	}

	public void setCodigoDeBaras(Long codigoDeBaras) {
		this.codigoDeBaras = codigoDeBaras;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	
	
}
