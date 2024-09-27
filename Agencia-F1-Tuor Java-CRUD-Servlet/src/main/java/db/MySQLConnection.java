package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnection {
	
	private static final String url = "jdbc:mysql://localhost:3306/AgenciaDeViagensF1";
    private static final String user = "root";
    private static final String password = "13$21hj56%H";

    public static Connection createConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.printf("[LOG] Driver de banco de dados encontrado.\n");
        } catch (ClassNotFoundException e) {
            System.out.printf("[ERROR] Driver de banco de dados não encontrado. Message:\n%s .\n", e.getMessage());
        }

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("[LOG] Conectado ao banco de dados.\n");
            return connection;
        } catch (SQLException e) {
            System.out.printf("[ERROR] Não é possível conectar ao banco de dados. Message:\n%s .\n", e.getMessage());
            return null;
        }
    }
}


