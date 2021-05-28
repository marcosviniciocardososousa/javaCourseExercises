package criandoConexao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabelaPessoas {

	public static void main(String[] args) throws SQLException {

		Connection conexao = FabricaConexao.getConexao();
		
		Statement statement = conexao.createStatement();
		
		String sql = "create table if not exists pessoa ("
				   + "codigo int auto_increment primary key,"
				   + "nome varchar(80) not null"
			 	   + ")";
		
		statement.execute(sql);
		
		System.out.println("Tabela criada com sucesso...");
		conexao.close();
	}

}
