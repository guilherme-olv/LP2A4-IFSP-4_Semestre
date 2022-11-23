package entities;

import java.io.Serializable;
import javax.persistence.*;

import antlr.collections.List;

/**
 * Entity implementation class for Entity: Disciplina
 *
 */
@Entity

public class Disciplina implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@Column
	private String codigo;
	
	@Column
	private String nome;
	
	@ManyToMany(mappedBy = "disciplinas")
	private List alunos;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List getAlunos() {
		return alunos;
	}

	public void setAlunos(List alunos) {
		this.alunos = alunos;
	}
   
}
