package br.edu.ifpe.apoo.negocio;

import br.edu.ifpe.apoo.dao.AlunoDAO;
import br.edu.ifpe.apoo.dao.AlunoDAOAbstractFactory;
import br.edu.ifpe.apoo.dao.AlunoDAOArquivos;
import br.edu.ifpe.apoo.entidades.Aluno;
import br.edu.ifpe.apoo.excecoes.ExcecaoAlunoInvalido;

public class ControladorAluno {
	
	public void inserir(Aluno aluno) throws ExcecaoAlunoInvalido {
		if (!this.isValido(aluno)) {
				throw new ExcecaoAlunoInvalido("Aluno inválido");
		}
		//regras de negocio

		AlunoDAO dao = AlunoDAOAbstractFactory.getDAO();
		dao.inserir(aluno);
	}
	
	public void atualizar(Aluno aluno) {
		/**
		 * ....
		 */
		AlunoDAO dao = AlunoDAOAbstractFactory.getDAO();
		dao.atualizar(aluno);
	}
	
	public void remover(long id) {
		
	}
	
	public void get(long id) {
		//
	}

	private boolean isValido(Aluno aluno) {
		throw new UnsupportedOperationException();
	}
}
