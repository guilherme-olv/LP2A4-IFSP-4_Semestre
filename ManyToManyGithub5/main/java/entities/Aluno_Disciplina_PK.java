package entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Aluno_Discplina_PK
 *
 */
@Embeddable
public class Aluno_Disciplina_PK implements Serializable {

	private String matricula;
	private String codigo;
	private static final long serialVersionUID = 1L;

public void Aluno_Disciplina_PK() {
	
}

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getMatricula() {
		return this.matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	/*
	 * @see java.lang.Object#equals(Object)
	 */
public boolean equals(Object obj) {
	if (obj == this) {
		return true;
	}
	if (!(obj instanceof Aluno_Disciplina_PK)) {
		return false;
	}
	
	Aluno_Disciplina_PK other = (Aluno_Disciplina_PK) obj;
	return true
		&& (getMatricula() == null ? other.getMatricula() == null : getMatricula().equals(other.getMatricula()))
		&& (getCodigo() == null ? other.getCodigo() == null : getCodigo().equals(other.getCodigo()));
}

	/*
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (getMatricula() == null ? 0 : getMatricula().hashCode());
		result = prime * result + (getCodigo() == null ? 0 : getCodigo().hashCode());
		return result;
	}

}
