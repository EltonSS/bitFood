package Banco.CRUD;

import Banco.Conexao.ConectaBanco;
import java.sql.*;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class crudCst {

    private int id_Cst;
    private String desc_Cst, status_Cst;

    public int getId_Cst() {
        return id_Cst;
    }

    public String getDesc_Cst() {
        return desc_Cst;
    }

    public String getStatus_Cst() {
        return status_Cst;
    }

    ConectaBanco conBanco = new ConectaBanco();

    public void InserirCst(String descCst, String statusCst) {

        conBanco.conexao();
        try {
            PreparedStatement pstCst = (PreparedStatement) conBanco.conn.prepareStatement("insert into tab_cst (desc_cst, status_cst) values(?,?)");
            pstCst.setString(1, descCst);
            pstCst.setString(2, statusCst);
            pstCst.execute();
            JOptionPane.showMessageDialog(null, "O Cst " + descCst + " foi registrado com sucesso!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar inserir o cst!!\n Erro: " + ex);
        }
        conBanco.desconecta();
    }

    public void DesativarCst(String descCst, String statusCst) {

        ConsultarCst(descCst);
        conBanco.conexao();
        try {
            PreparedStatement pstCst = (PreparedStatement) conBanco.conn.prepareStatement("update tab_cst set status_cst =? where id_cst =?");
            pstCst.setString(1, statusCst);
            pstCst.setInt(2, id_Cst);
            pstCst.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar desativar o cst!!\n Erro: " + ex);
        }
        conBanco.desconecta();
    }

    public void AlterarCst(int idCst, String descCst, String statusCst) {

        conBanco.conexao();
        try {
            PreparedStatement pstCst = (PreparedStatement) conBanco.conn.prepareStatement("update tab_cst set desc_cst =?, status_cst =? where id_cst =?");
            pstCst.setString(1, descCst);
            pstCst.setString(2, statusCst);
            pstCst.setInt(3, idCst);
            pstCst.execute();
            JOptionPane.showMessageDialog(null, "Cst: " + descCst + " alterado com sucesso!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar alterar o cst!!\n Erro: " + ex);
        }
        conBanco.desconecta();
    }

    public void ConsultarCst(String descCst) {

        conBanco.conexao();
        try {
            conBanco.executaSQL("select * from tab_cst where desc_cst ='" + descCst + "'");
            conBanco.rs.first();
            id_Cst = conBanco.rs.getInt("id_cst");
            desc_Cst = conBanco.rs.getString("desc_cst");
            status_Cst = conBanco.rs.getString("status_cst");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar consultar o cst!!\n Erro: " + ex);
        }
        conBanco.desconecta();
    }
}
