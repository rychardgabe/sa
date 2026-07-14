package com.example.sa.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "epi")
public class Epi {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_epi")
	private int idEpi;

	@Column(name = "nome_epi")
	private String nomeEpi;

	@Column(name = "tipo")
	private String tipo;

	@Column(name = "quantidade_estoque")
	private int quantidadeEstoque;

	@Column(name = "validade")
	private LocalDate validade;
	
	@Column(name = "ca")
	private int ca;


	public Epi() {

	}


	public int getIdEpi() {
		return idEpi;
	}


	public void setIdEpi(int idEpi) {
		this.idEpi = idEpi;
	}


	public String getNomeEpi() {
		return nomeEpi;
	}


	public void setNomeEpi(String nomeEpi) {
		this.nomeEpi = nomeEpi;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}


	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}


	public LocalDate getValidade() {
		return validade;
	}


	public void setValidade(LocalDate validade) {
		this.validade = validade;
	}


	public int getCa() {
		return ca;
	}


	public void setCa(int ca) {
		this.ca = ca;
	}


	@Override
	public String toString() {
		return "Epi [idEpi=" + idEpi + ", nomeEpi=" + nomeEpi + ", tipo=" + tipo + ", quantidadeEstoque="
				+ quantidadeEstoque + ", validade=" + validade + ", ca=" + ca + "]";
	}
	
	

}