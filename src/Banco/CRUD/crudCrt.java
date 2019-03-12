package Banco.CRUD;

import Banco.Conexao.ConectaBanco;
import java.sql.*;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class crudCrt {

    private int id_Crt;
    private String desc_Crt, status_Crt;

    public int getId_Crt() {
        return id_Crt;
    }

    public String getDesc_Crt() {
        return desc_Crt;
    }

    public String getStatus_Crt() {
        return status_Crt;
    }

    ConectaBanco conBanco = new ConectaBanco();

    public void InserirCrt(String descCrt, String statusCrt) {

        conBanco.conexao();
        try {
            PreparedStatement pstCrt = (PreparedStatement) conBanco.conn.prepareStatement("insert into tab_crt (desc_crt, status_crt) values(?,?)");
            pstCrt.setString(1, descCrt);
            pstCrt.setString(2, statusCrt);
            pstCrt.execute();
            JOptionPane.showMessageDialog(null, "O Crt " + descCrt + " foi registrado com sucesso!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar inserir o crt!!\n Erro: " + ex);
        }
        conBanco.desconecta();
    }

    public void DesativarCrt(String descCrt, String statusCrt) {

        ConsultarCrt(descCrt);
        conBanco.conexao();
        try {
            PreparedStatement pstCrt = (PreparedStatement) conBanco.conn.prepareStatement("update tab_crt set status_crt =? where id_crt =?");
            pstCrt.setString(1, statusCrt);
            pstCrt.setInt(2, id_Crt);
            pstCrt.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar desativar o crt!!\n Erro: " + ex);
        }
        conBanco.desconecta();
    }

    public void AlterarCrt(int idCrt, String descCrt, String statusCrt) {

        conBanco.conexao();
        try {
            PreparedStatement pstCrt = (PreparedStatement) conBanco.conn.prepareStatement("update tab_crt set desc_crt =?, status_crt =? where id_crt =?");
            pstCrt.setString(1, descCrt);
            pstCrt.setString(2, statusCrt);
            pstCrt.setInt(3, idCrt);
            pstCrt.execute();
            JOptionPane.showMessageDialog(null, "Crt: " + descCrt + " alterado com sucesso!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar alterar o crt!!\n Erro: " + ex);
        }
        conBanco.desconecta();
    }

    public void ConsultarCrt(String descCrt) {

        conBanco.conexao();
        try {
            conBanco.executaSQL("select * from tab_crt where desc_crt ='" + descCrt + "'");
            conBanco.rs.first();
            id_Crt = conBanco.rs.getInt("id_crt");
            desc_Crt = conBanco.rs.getString("desc_crt");
            status_Crt = conBanco.rs.getString("status_crt");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar consultar o crt!!\n Erro: " + ex);
        }
        conBanco.desconecta();
    }
}
