package Cadastros;

import java.util.ArrayList;
import java.util.List;


public class PessoaDao extends Dao {
	
	public void incluirPessoa(Pessoa p) throws Exception {
		open(); // Abrir o Banco
		// Cada ? é um campo que está inserindo na tabela
		// Que será substituido pelo argumentos que serão passados/instanciados
		stmt = con.prepareStatement("Insert into pessoa values(?,?,?)"); 	
		// Pegar idPessoa, NomePessoa, Email
		stmt.setInt(1, p.getIdPessoa());
		stmt.setString(2, p.getNomePessoa());
		stmt.setString(3, p.getEmail());
		stmt.execute();
		stmt.close();
		close();
	}

	public void alterarPessoa(Pessoa p) throws Exception {
		open();
		stmt = con.prepareStatement("update Pessoa nome = ?, email = ? where idPessoa = ?");
		stmt.setString(1, p.getNomePessoa());
		stmt.setString(2, p.getEmail());
		stmt.setInt(3, p.getIdPessoa());
		stmt.execute();
		stmt.close();
		close();
	}
	
	public void excluirPessoa(Pessoa p) throws Exception {
		open();
		stmt = con.prepareStatement("delete from Pessoa where idPessoa = ?");
		// Substituir a interrogação por 1
		stmt.setInt(1, p.getIdPessoa());
		stmt.execute();
		stmt.close();
		close();		
	}
	
	public Pessoa consultarPessoaIndividual(int cod) throws Exception {
		open(); 
		stmt = con.prepareStatement("select * from pessoa where idPessoa = ?");
		rs = stmt.executeQuery();
		Pessoa p = null;
		if(rs.next()) {
			// Criar novo objeto
			p = new	Pessoa();
			// Setar/selecionar os campos 
			p.setIdPessoa(rs.getInt("idPessoa"));
			p.setNomePessoa(rs.getString("nomePessoa"));
			p.setEmail(rs.getString("email"));
		}
		close();
		return p;
	}
	
	public List<Pessoa> ListarPessoas(){
		try {
			open();
			stmt = con.prepareStatement("select * from pessoa order by idpessoa");
			rs = stmt.executeQuery();
			List<Pessoa> listaPessoas = new ArrayList<>();
			while (rs.next()) {
				Pessoa p = new Pessoa();
				p.setIdPessoa(rs.getInt("idPessoa"));
				p.setNomePessoa(rs.getString("nomePessoa"));
				p.setEmail(rs.getString("email"));
				listaPessoas.add(p);
			}
			close();
			return listaPessoas;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
			
		}
		
	}
}
