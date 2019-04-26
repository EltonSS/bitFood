package Banco.Conexao;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
import java.sql.*;
import javax.swing.JOptionPane;

public class ConectaBanco {

    Connection con = null;
    String banco = "bitFood", host = "localhost:5432", login = "postgres", senha = "bitfood2019";
    private String driver = "org.postgresql.Driver";
    public Connection conn;
    public ResultSet rs;
    public Statement stm;

    public void conexao() {

        try {
            System.setProperty("jdbc.Drivers", driver);
            conn = (Connection) DriverManager.getConnection("jdbc:postgresql://" + host + "/" + banco, login, senha);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar conectar com o banco de dados!!"
                    + "\nPor favor configure a conexao com o banco.");
        }
    }

    public void executaSQL(String sql) {

        try {
            stm = (Statement) conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao executar o SQL!!\n Erro: " + ex.getMessage());
        }
    }

    public void desconecta() {

        try {
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar desconectar com o banco de dados!!\n Erro: " + ex.getMessage());
        }
    }
}
