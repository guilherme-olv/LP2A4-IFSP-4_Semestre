package entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: AlunoDisciplinaEntidade
 *
 */
@Entity
@Table(name="aluno_has_disciplina1")

public class AlunoDisciplinaEntidade implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private Aluno_Disciplina_PK matricula_aluno_codigo;
	
	@MapsId("matricula")	
	@ManyToOne
	@JoinColumn(name="matricula")
	private Aluno aluno;  
	
	@MapsId("codigo")
	@JoinColumn(name="codigo")
	@ManyToOne
	private Disciplina disciplina;
	
	private int nota;
	
	
	public void AlunoDisciplina() {
		super();
	}

	public Aluno_Disciplina_PK getMatricula_codigo() {
		return  matricula_aluno_codigo;
	}

	public void setMatricula_codigo(Aluno_Disciplina_PK matricula_aluno_codigo) {
		this. matricula_aluno_codigo =  matricula_aluno_codigo;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}     
	
}


