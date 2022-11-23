package entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.*;

import antlr.collections.List;

/**
 * Entity implementation class for Entity: Aluno
 *
 */
@Entity

public class Aluno implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@Column
	private String matricula;

	@Column(nullable = false)
	private String nome;
	
	@Column
	private String endereco;
	
	@Column(name="data_ingresso", nullable = false)
	private LocalDate dataIngresso;
	
	@Column(name="data_conclusao")
	private LocalDate dataConclusao;
	
	@OneToMany(mappedBy="aluno")
	private List disciplinas;
	
	@ManyToMany
	@JoinTable(
			  name = "disciplinas_semestre", 
			  joinColumns = @JoinColumn(name = "matricula"), 
			  inverseJoinColumns = @JoinColumn(name = "codigo"))
	private List disciplinas1;
	
	public List getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(List disciplinas) {
		this.disciplinas = disciplinas;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public LocalDate getDataIngresso() {
		return dataIngresso;
	}
	public void setDataIngresso(LocalDate dataIngresso) {
		this.dataIngresso = dataIngresso;
	}
	public LocalDate getDataConclusao() {
		return dataConclusao;
	}
	public void setDataConclusao(LocalDate dataConclusao) {
		this.dataConclusao = dataConclusao;
	}
	
	@Override
	public String toString() {
		return "AlunoPOJO [matricula=" + matricula + ", nome=" + nome + ", endereco=" + endereco + ", dataIngresso="
				+ dataIngresso + ", dataConclusao=" + dataConclusao + "]";
	}
   
}
