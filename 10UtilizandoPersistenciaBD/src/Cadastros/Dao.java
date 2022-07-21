package Cadastros;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Dao {
	
	Connection con; // Conexao ao Banco de Dados 
	// Preparar o comando para ser executado
	PreparedStatement stmt; // Acessa a Tabela (insert, update, delete, select)
	// Guardar dentro do objeto o resultado da consulta
	ResultSet rs; // Consulta a Tabela (select)
	CallableStatement call; // Procedures e Function
	
	public void open() throws Exception {
		// Dá o caminho, a porta e o database do banco
		String url = "jdbc:postgresql://localhost:5432/cadastros";
		// Usuário
		String user = "postgres";
		// Senha
		String password = "123456";
		try { 
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException | ClassNotFoundException ex) {
			System.out.println("Erro ao conectar com o banco");
			
		}
	}
	
	public void close() throws Exception {
		con.close();
	}

}
