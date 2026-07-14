package com.example.sa.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "emprestimo")
public class Emprestimo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_Emprestimo")
	private int idEmprestimo;

	@Column(name = "data_emprestimo")
	private LocalDate dataEmprestimo;
	
	@Column(name = "data_devolucao")
	private LocalDate  dataDevolucao;
	
	@Column(name = "status")
	private int status;
	
	@Column(name = "quantidade")
	private int quantidade;
	
	@Column(name = "id_colaborador")
	private int idColaborador ;
	 
	
	@ManyToOne
	@JoinColumn(name = "id_epi", referencedColumnName = "id_epi")
	private Epi epi; 
	
	@ManyToOne
	@JoinColumn(name = "id_colaborador", referencedColumnName = "id_colaborador")
	private Colaborador colaborador;
	


	public Emprestimo() {

	}



	public int getIdEmprestimo() {
		return idEmprestimo;
	}



	public void setIdEmprestimo(int idEmprestimo) {
		this.idEmprestimo = idEmprestimo;
	}



	public LocalDate getDataEmprestimo() {
		return dataEmprestimo;
	}



	public void setDataEmprestimo(LocalDate dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}



	public LocalDate getDataDevolucao() {
		return dataDevolucao;
	}



	public void setDataDevolucao(LocalDate dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}



	public int getStatus() {
		return status;
	}



	public void setStatus(int status) {
		this.status = status;
	}



	public int getQuantidade() {
		return quantidade;
	}



	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}



	public int getIdColaborador() {
		return idColaborador;
	}



	public void setIdColaborador(int idColaborador) {
		this.idColaborador = idColaborador;
	}



	public Epi getEpi() {
		return epi;
	}



	public void setEpi(Epi epi) {
		this.epi = epi;
	}



	public Colaborador getColaborador() {
		return colaborador;
	}



	public void setColaborador(Colaborador colaborador) {
		this.colaborador = colaborador;
	}

	@Override
	public String toString() {
		return "Emprestimo [idEmprestimo=" + idEmprestimo + ", dataEmprestimo=" + dataEmprestimo + ", dataDevolucao="
				+ dataDevolucao + ", status=" + status + ", quantidade=" + quantidade + ", idColaborador="
				+ idColaborador + ", epi=" + epi + ", colaborador=" + colaborador + "]";}
	
}

