package Banco;

import java.sql.Connection;
import java.sql.SQLException;

public class Banco {
    public static String usuario, senha, servidor, bd;
    public static int porta;
    public static java.sql.Connection conexao = null;
    
    static {
        usuario = "root";
        senha = "";
        servidor = "localhost";
        bd = "fairmacia";
        porta = 3306;
    }
    
    public static void abrir() 
        throws ClassNotFoundException,SQLException {
        
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://" + servidor + ":" + porta + "/" + bd;
                     
        conexao = java.sql.DriverManager.getConnection(url, usuario, senha);
    }
    
    public static void fechar() 
        throws SQLException {
        conexao.close();
    }
    
    public static Connection getConexao() {
        return conexao;
    }
}
