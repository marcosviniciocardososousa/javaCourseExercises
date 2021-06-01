package exlusaoDeRegistros;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbconnectionService {

	
	public static Connection getConnection() throws IOException {
		
		try {
			Properties prop = getProperties();
			final String url = prop.getProperty("banco.url");
			final String user = prop.getProperty("banco.user");
			final String password = prop.getProperty("banco.password");
			return DriverManager.getConnection(url,user,password);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
		
	}
	
	private static Properties getProperties() throws IOException {
		Properties prop = new Properties();
		String caminho = "/conexao.properties";
		prop.load(DbconnectionService.class.getResourceAsStream(caminho));
		return prop;
	}
	
	
}
