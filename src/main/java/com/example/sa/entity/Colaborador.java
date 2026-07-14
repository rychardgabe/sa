package com.example.sa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "colaborador")
public class Colaborador {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_Colaborador")
	private int idColaborador;

	@Column(name = "nome")
	private String nome;

	@Column(name = "cpf")
	private String cpf;

	@Column(name = "telefone")
	private String telefone;

	@Column(name = "setor")
	private String setor;
	
	@Column(name = "cargo")
	private String cargo;

	@ManyToOne
	@JoinColumn(name = "id_colaborador", referencedColumnName = "id_colaborador")
	private Emprestimo emprestimo;

	public Colaborador(int Colaborador, String nome, String cpf, String telefone, String setor, String cargo, int idColaborador, 
			Emprestimo emprestimo) {
		super();
		this.idColaborador = idColaborador;
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.setor = setor;
		this.emprestimo = emprestimo;
		this.cargo = cargo ;
	}

	public Colaborador() {

	}

	public int getIdColaborador() {
		return idColaborador;
	}

	public void setIdColaborador(int idColaborador) {
		this.idColaborador = idColaborador;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;}

	public Emprestimo getEmprestimo() {
		return emprestimo;
	}

	public void setEmprestimo(Emprestimo emprestimo) {
		this.emprestimo = emprestimo;
	}

	@Override
	public String toString() {
		return "Colaborador [idColaborador=" + idColaborador + ", nome=" + nome + ", cpf=" + cpf + ", telefone="
				+ telefone + ", setor=" + setor + ", cargo=" + cargo+" emprestimo=" + emprestimo + "]";
	}

}
	

