package desafioUpdate;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import criandoConexao.Pessoa;

public class MainUpdate {

	public static void main(String[] args) throws SQLException {

		Connection conexao = DbconnectionService.getConnection();
		String sql = "update pessoa set nome = ? where codigo = ?";
		String trazTudo = "select * from pessoa";
		Scanner input = new Scanner(System.in);
		
		try {
			System.out.println("Informe a opção:");
			System.out.println("1 - Consultar todos os nomes");
			System.out.println("2 - Atualizar um nome");
			int op = input.nextInt();
			
			while(op > 2 || op < 0) {
				System.out.print("Informe uma opcao valida: ");
				op = input.nextInt();
			}
			
			switch(op) {
			case 1:
				Statement stmt = conexao.createStatement();
				ResultSet resultado = stmt.executeQuery(trazTudo);
				List<Pessoa> pessoas  = new ArrayList<>();
				
				while(resultado.next()) {
					int cod = resultado.getInt("codigo");
					String nome_db = resultado.getString("nome");
					pessoas.add(new Pessoa(cod, nome_db));
				}
				
				for(Pessoa p : pessoas) {
					System.out.println("COD : " + p.getCodigo() + " NOME : " + p.getNome());
				}
					
				break;
			case 2:
				System.out.print("Informe o codigo do nome a ser alterado: ");
				Integer cod = input.nextInt();
				input.nextLine();
				System.out.println("Informe o novo nome: ");
				String nome = input.nextLine();
				


				
				PreparedStatement atualizacao = conexao.prepareStatement(sql);
				atualizacao.setString(1, nome);
				atualizacao.setInt(2, cod);
				atualizacao.execute();
				System.out.println("Alterado com successo...");
				
			
				break;
			default:
				System.out.println("Algo inesperado aconteceu ...");
				}
			}catch (RuntimeException e) {
				input.close();
				conexao.close();
				System.out.println("Foi relatado um erro inesperado ...");
				main(args);
		}
		
		
		
		
		
		input.close();
		conexao.close();
		
	
		
	}
}
	