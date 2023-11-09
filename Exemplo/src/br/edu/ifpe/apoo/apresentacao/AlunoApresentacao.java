package br.edu.ifpe.apoo.apresentacao;

import java.util.Scanner;

import br.edu.ifpe.apoo.entidades.Aluno;
import br.edu.ifpe.apoo.excecoes.ExcecaoAlunoInvalido;
import br.edu.ifpe.apoo.negocio.ControladorAluno;

public class AlunoApresentacao {

	public void exibirMenu() throws ExcecaoAlunoInvalido {
		System.out.println("Digite a opção desejada");
		System.out.println("1 para inserir um aluno;");
		System.out.println("2 para consultar um aluno;");
		System.out.println("3 para remover um aluno;");
		System.out.println("4 para alterar um aluno;");
		
		Scanner scanner = new Scanner(System.in);
		int opcao = Integer.parseInt(scanner.nextLine());
		if (opcao == 1) {
			this.inserir();
		}
		else if (opcao == 2) {
			this.atualizar();
		}
		else if (opcao == 3) {
			this.remover();
		}
		else if (opcao == 4) {
			this.consultar();
		}
	}
	
	private void inserir() throws ExcecaoAlunoInvalido {
		Aluno aluno = new Aluno();
		aluno.setCpf("789.333.577-77"); // scanner.next...
		aluno.setNome("Victor");
		aluno.setEmail("vl@cin.upfe.br");
		//validação 
		
		ControladorAluno controlador = new ControladorAluno();
		controlador.inserir(aluno);
	}
	
	private void atualizar() throws ExcecaoAlunoInvalido {
	
	}
	
	private void remover() throws ExcecaoAlunoInvalido {
		//
	}
	
	private void consultar() throws ExcecaoAlunoInvalido {
		//
	}
} 

