package criandoConexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {

	public static void main(String[] args) throws SQLException {
		/*
		 * Chamar o Connection gera uma exceção tratada, é necessário então implementar SQLException
		 */
		
		//com essa url estamos dizendo nao verifique o certificado, mas estabeleca uma conexao segura
		final String url = "jdbc:mysql://localhost:3306?verifyServerCertificate=false&useSSL=true";
		
		final String usuario         = "root";
		final String senha           = "12345678";
		
		Connection conexao = DriverManager
				.getConnection(url, usuario, senha);

		System.out.println("Conexão efetuada com sucesso!");
		conexao.close();
		
		/*
		 * Exception in thread "main" java.sql.SQLException: No suitable driver found for jdbc:mysql://localhost:3306
		 * se isso aparecer significa que não foi encontrado nenhum drive de conexão compatível com a url
		 */
		
	}
	
}
