package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	private static Connection conexao = null;
	
	public static Connection getConexao() throws ClassNotFoundException, SQLException{
		if(conexao == null){
			//Mapeio o driver do SGBD que estou utilizando
			Class.forName("org.postgresql.Driver");
			
			//Defino a string de conexão com o banco
			String url ="jdbc:postgresql://localhost:5432/AulaJDBC";
	
			//Tento fazer a conexão passando o login e a senha.		
			conexao = DriverManager.getConnection(url,"postgres","123456");
		}

		return conexao;  
	
	}	
}
