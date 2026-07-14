package com.example.sa.controller;


import java.util.Scanner;

import org.hibernate.annotations.Comment;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.sa.utils.ConsoleUtils;

public class Controller {
	
	@Component
	public class CliController implements CommandLineRunner {
		@Override
		public void run(String... args) throws Exception {

			Scanner input = new Scanner(System.in);
			int opcao;
 
			System.out.print("\n=== selecine uma opção  ===\n");

			do {

				ConsoleUtils.exibirMenu();

				opcao = input.nextInt();

				try {
					switch (opcao) {
					case 1 -> cadastrarColaborador();
					case 2 -> listarColaboradores();
					case 3 -> atualizarColaborador();
					case 4 -> deletarColaborador();
					case 5 -> cadastrarEpi();
					case 6 -> listarEpis();
					case 7 -> atualizarEpi();
					case 8 -> deletarEpi();
					case 9 -> cadastrarEmprestimo();
					case 10 -> listarEmprestimos();
					case 0 -> System.out.println("Saindo da aplicação...");
					default -> {
						System.out.println("Opção inválida\n");
						ConsoleUtils.exibirMenu();
						opcao = input.nextInt();
					}
					}

				} catch (Exception e) {
					System.out.println(e.getMessage());
				}

			} while (opcao != 0);

		}
		
	}
}