package Cadastros;

import java.util.List;

public class Menu {
	public static void main(String[] args) {
		PessoaDao pd = new PessoaDao();
		try {
			/*
			// Incluir uma pessoa
			Pessoa p1 = new Pessoa(1, "jose", "jose@gmail.com");
			Pessoa p2 = new Pessoa(2, "joao", "joao@gmail.com");
			pd.incluirPessoa(p1);
			pd.incluirPessoa(p2);
			*/
			// Alterar uma Pessoa
			// - Verificar se o código da pessoa existe 
			// - Alterar a informação desejada usando o set(Classe encapsulada)
			Pessoa pes = pd.consultarPessoaIndividual(2);
			if (pes != null) {
				pes.setEmail("jose2@gmail.com");
				// Chamar o método que contém o comando update
				pd.alterarPessoa(pes);

			// Listando todas as pessoas
			List<Pessoa> listaPessoas = pd.ListarPessoas();
			
			for(Pessoa p : listaPessoas){
				System.out.println(p);
			}
			}	
			/*
			// Excluir uma pessoa
			// verificar se a pessoa existe por código
			Pessoa pes = pd.consultarPessoaIndividual(2);
			// chamar o método que contém o comando delete
			pd.excluirPessoa(pes);
			// Listando todas as pessoas
			List<Pessoa> listaPessoas = pd.ListarPessoas();
			
			for(Pessoa p : listaPessoas) {
				System.out.println(p);
			
			*/
	} catch (Exception e) {
		System.out.println("Error: " + e.getMessage());
	}
	
  }
}
