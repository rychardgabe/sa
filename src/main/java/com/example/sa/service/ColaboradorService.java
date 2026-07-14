package com.example.sa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.sa.entity.Colaborador;
import com.example.sa.entity.Emprestimo;

import com.example.sa.repository.*;

public class ColaboradorService {

	@Autowired
	ColaboradorRepository ColaboradorRepository;

	//Create
	public void cadastrarColaborador(Colaborador colaborador) {
		ColaboradorRepository.save(colaborador);
	}
	
	
	
	//Read
	public List<Colaborador> listaColaborador() {
		return ColaboradorRepository.findAll();
	}
	
	
	public Colaborador obterColaboradorPorId(int id) {
		return ColaboradorRepository.findById(id).orElseThrow(() ->new RuntimeException(" Colaborador não encontrado"));
	}
	
	
	//Update
	public void atualizarColaborador(Colaborador colaborador) {
		ColaboradorRepository.save(colaborador);
	}
	
	//delete
	public void deletarColaborador(int id){ 
		ColaboradorRepository.deleteById(id);
	}
	
	
	
	
	
	
}

	

	

