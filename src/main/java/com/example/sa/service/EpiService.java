package com.example.sa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.sa.entity.Colaborador;
import com.example.sa.entity.Epi;
import com.example.sa.repository.ColaboradorRepository;
import com.example.sa.repository.*;

public class EpiService {

	@Autowired
	EpiRepository EpiRepository;

	//Create
	public void cadastrarEpi(Epi epi) {
		EpiRepository.save(epi);
	}
	
	
	
	//Read
	public List<Epi> listaEpi() {
		return EpiRepository.findAll();
	}
	
	
	public Epi obterEpiPorId(int id) {
		return EpiRepository.findById(id).orElseThrow(() ->new RuntimeException(" Epi não encontrado"));
	}
	
	
	//Update
	public void atualizarEpi(Epi epi) {
		EpiRepository.save(epi);
	}
	
	//delete
	public void deletarEpi(int id){ 
		EpiRepository.deleteById(id);
	}
	

}
	

