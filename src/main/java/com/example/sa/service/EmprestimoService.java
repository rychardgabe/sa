package com.example.sa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.sa.entity.*;
import com.example.sa.repository.*;

public class EmprestimoService {

	
	@Autowired
	EmprestimoRepository EmprestimoRepository;

	//Create
	public void cadastrarEmprestimo(Emprestimo emprestimo) {
		EmprestimoRepository.save(emprestimo);
	}
	
	
	
	//Read
	public List<Emprestimo> listarEmprestimo() {
		return EmprestimoRepository.findAll();
	}
	
	
	public Emprestimo obterEmprestimoPorId(int id) {
		return EmprestimoRepository.findById(id).orElseThrow(() ->new RuntimeException("Emprestimo não encontrado"));
	}
	
	
	//Update
	public void atualizarEmprestimo(Emprestimo emprestimo) {
		EmprestimoRepository.save(emprestimo);
	}
	
	//delete
	public void deletarEmprestimo(int id){ 
		EmprestimoRepository.deleteById(id);
	}
	
	
	
	
	
	
}

	

