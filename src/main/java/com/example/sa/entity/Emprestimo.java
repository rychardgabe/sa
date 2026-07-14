package com.example.sa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "emprestimo")
public class Emprestimo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_Emprestimo")
	private int idEmprestimo;

	@Column(name = "nome_Emprestimo")
	private String nomeEmprestimo;

	public Emprestimo(int idEmprestimo, String nomeEmprestimo) {
		super();
		this.idEmprestimo = idEmprestimo;
		this.nomeEmprestimo = nomeEmprestimo;
	}

	public Emprestimo() {

	}

	public int getIdEmprestimo() {
		return idEmprestimo;
	}

	public void setIdEmprestimo(int idEmprestimo) {
		this.idEmprestimo = idEmprestimo;
	}

	public String getNomeEmprestimo() {
		return nomeEmprestimo;
	}

	public void setNomeEmprestimo(String nomeEmprestimo) {
		this.nomeEmprestimo = nomeEmprestimo;
	}

	@Override
	public String toString() {
		return "Emprestimo [idEmprestimo=" + idEmprestimo + ", nomeEmprestimo=" + nomeEmprestimo + "]";
	}

}


