package Banco.CRUD;

import Banco.Conexao.ConectaBanco;
import java.sql.*;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class crudFormulario {

    private int idFrm;
    private String descFrm;
    private String statusFrm;

    public int getIdFrm() {
        return idFrm;
    }

    public void setIdFrm(int idFrm) {
        this.idFrm = idFrm;
    }

    public String getDescFrm() {
        return descFrm;
    }

    public void setDescFrm(String descFrm) {
        this.descFrm = descFrm;
    }

    public String getStatusFrm() {
        return statusFrm;
    }

    public void setStatusFrm(String statusFrm) {
        this.statusFrm = statusFrm;
    }

    ConectaBanco conBanco = new ConectaBanco();

    public void InserirFormulario() {

        conBanco.conexao();
        try {
            PreparedStatement pstformulario = (PreparedStatement) conBanco.conn.prepareStatement("insert into tab_formulario (desc_frm , status_frm) values(?,?)");
            pstformulario.setString(1, descFrm);
            pstformulario.setString(2, statusFrm);
            pstformulario.execute();
            JOptionPane.showMessageDialog(null, "Formulário: " + descFrm + " registrado com sucesso!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar inserir o formulário!!\n Erro: " + ex);
        }
        conBanco.desconecta();
    }

    public void DesativarFormulario(int id_frm, String status_Frm) {

        ConsultarFormulario();
        conBanco.conexao();
        try {
            PreparedStatement pstformulario = (PreparedStatement) conBanco.conn.prepareStatement("update tab_formulario set status_frm =? where id_frm =?");
            pstformulario.setString(1, status_Frm);
            pstformulario.setInt(2, id_frm);
            pstformulario.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar desativar o formulário!!\n Erro: " + ex);
        }
        conBanco.desconecta();
    }

    public void AlterarFormulario(int id_frm, String desc_Frm, String status_Frm) {

        conBanco.conexao();
        try {
            PreparedStatement pstformulario = (PreparedStatement) conBanco.conn.prepareStatement("update tab_formulario set desc_frm =? , status_frm =? where id_frm=?");
            pstformulario.setString(1, desc_Frm);
            pstformulario.setString(2, status_Frm);
            pstformulario.setInt(3, id_frm);
            pstformulario.execute();
            JOptionPane.showMessageDialog(null, "Formulário: " + desc_Frm + " alterada com sucesso!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar alterar o formulário!!\n Erro: " + ex);
        }
        conBanco.desconecta();
    }

    public void ConsultarFormulario() {

        conBanco.conexao();
        try {
            conBanco.executaSQL("select * from tab_formulario where desc_frm ='" + descFrm + "'");
            conBanco.rs.first();
            idFrm = conBanco.rs.getInt("id_frm");
            descFrm = conBanco.rs.getString("desc_frm");
            statusFrm = conBanco.rs.getString("status_frm");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar consultar a formulário!!\n Erro: " + ex);
        }
        conBanco.desconecta();
    }
}
