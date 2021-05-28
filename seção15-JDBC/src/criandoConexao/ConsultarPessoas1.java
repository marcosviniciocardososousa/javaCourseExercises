package criandoConexao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConsultarPessoas1 {

	/*
	 * Esta classe consulta todas as pessoas da tabela
	 */
	
	public static void main(String[] args) throws SQLException{
		
		Connection conexao = FabricaConexao.getConexao();
		String sql = "select * from pessoa";
		
		Statement stmt = conexao.createStatement();
		ResultSet resultado = stmt.executeQuery(sql);
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		while(resultado.next()) { //traz os registros do banco de dados
			int codigo = resultado.getInt("codigo");
			String nome = resultado.getString("nome");
			pessoas.add(new Pessoa(codigo,nome));
		}
		
		//lista os registros encontrados
		for(Pessoa registros : pessoas) {
			System.out.println("CÓDIGO: " + registros.getCodigo() + " NOME: "+registros.getNome());
		}
		
		
		stmt.close();
		conexao.close();
	}
	
}
