package Banco.CRUD;

import Banco.Conexao.ConectaBanco;
import java.sql.*;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class crudPermissao {

    private int idPrm;
    private String descPrm;
    private String statusPrm;
    private int idIPrm;
    private int idFrm;
    private String descFrm;
    private String statusIPrm;
    private String mensagem;

    public int getIdPrm() {
        return idPrm;
    }

    public void setIdPrm(int idPrm) {
        this.idPrm = idPrm;
    }

    public String getDescPrm() {
        return descPrm;
    }

    public void setDescPrm(String descPrm) {
        this.descPrm = descPrm;
    }

    public String getStatusPrm() {
        return statusPrm;
    }

    public void setStatusPrm(String statusPrm) {
        this.statusPrm = statusPrm;
    }

    public int getIdIPrm() {
        return idIPrm;
    }

    public void setIdIPrm(int idIPrm) {
        this.idIPrm = idIPrm;
    }

    public int getIdIFrm() {
        return idFrm;
    }

    public void setIdIFrm(int idFrm) {
        this.idFrm = idFrm;
    }

    public String getDescFrm() {
        return descFrm;
    }

    public void setDescFrm(String descFrm) {
        this.descFrm = descFrm;
    }

    public String getStatusIPrm() {
        return statusIPrm;
    }

    public void setStatusIPrm(String statusIPrm) {
        this.statusIPrm = statusIPrm;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    ConectaBanco conBanco = new ConectaBanco();

    public void InserirPermissao() {

        conBanco.conexao();
        try {
            PreparedStatement pstPermissao = (PreparedStatement) conBanco.conn.prepareStatement("insert into tab_permissao (desc_prm , status_prm) values(?,?)");
            pstPermissao.setString(1, descPrm);
            pstPermissao.setString(2, statusPrm);
            pstPermissao.execute();
            JOptionPane.showMessageDialog(null, "Permissão: " + descPrm + " registrado com sucesso!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar inserir a permissao!!\n Erro: " + ex);
        }
        conBanco.desconecta();
    }

    public void InserirItemPermissao(int idPrm, String descFrm, String statusIPrm) {

        ConsultarFormularios(descFrm);
        conBanco.conexao();
        try {
            PreparedStatement pstItemPermissao = (PreparedStatement) conBanco.conn.prepareStatement("insert into tab_itens_permissao (id_prm, id_frm, status_it_prm) values(?,?,?)");
            pstItemPermissao.setInt(1, idPrm);
            pstItemPermissao.setInt(2, idFrm);
            pstItemPermissao.setString(3, statusIPrm);
            pstItemPermissao.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar inserir a permissao!!\n Erro: " + ex);
        }
        conBanco.desconecta();
    }

    public void DesativarPermissao(int id_Prm, String status_Prm) {

        ConsultarPermissao();
        conBanco.conexao();
        try {
            PreparedStatement pstPermissao = (PreparedStatement) conBanco.conn.prepareStatement("update tab_permissao set status_prm =? where id_prm =?");
            pstPermissao.setString(1, status_Prm);
            pstPermissao.setInt(2, id_Prm);
            pstPermissao.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar desativar a permissão!!\n Erro: " + ex);
        }
        conBanco.desconecta();
    }

    public void DesabilitarFormularioPermitido(int id_Prm, String desc_Frm) {

        ConsultarItemPermitido(id_Prm, desc_Frm);
        conBanco.conexao();
        try {
            PreparedStatement pstItemPermissao = (PreparedStatement) conBanco.conn.prepareStatement("update tab_itens_permissao set status_it_prm =? where id_it_prm =?");
            pstItemPermissao.setString(1, "não ativo");
            pstItemPermissao.setInt(2, idIPrm);
            pstItemPermissao.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar desativar a permissão!!\n Erro: " + ex);
        }
        conBanco.desconecta();
    }

    public void ReabilitarFormularioPermitido(int id_Prm, String desc_Frm) {

        ConsultarItemPermitido(id_Prm, desc_Frm);
        conBanco.conexao();
        try {
            PreparedStatement pstItemPermissao = (PreparedStatement) conBanco.conn.prepareStatement("update tab_itens_permissao set status_it_prm =? where id_it_prm =?");
            pstItemPermissao.setString(1, "ativo");
            pstItemPermissao.setInt(2, idIPrm);
            pstItemPermissao.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar desativar a permissão!!\n Erro: " + ex);
        }
        conBanco.desconecta();
    }

    public void AlterarPermissao(int id_Prm, String desc_Prm, String status_Prm) {

        conBanco.conexao();
        try {
            PreparedStatement pstPermissao = (PreparedStatement) conBanco.conn.prepareStatement("update tab_permissao set desc_prm =? , status_prm =? where id_prm=?");
            pstPermissao.setString(1, desc_Prm);
            pstPermissao.setString(2, status_Prm);
            pstPermissao.setInt(3, id_Prm);
            pstPermissao.execute();
            JOptionPane.showMessageDialog(null, "Permissão: " + desc_Prm + " alterada com sucesso!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar alterar a permissão!!\n Erro: " + ex);
        }
        conBanco.desconecta();
    }

    public void ConsultarPermissao() {

        conBanco.conexao();
        try {
            conBanco.executaSQL("select * from tab_permissao where desc_prm ='" + descPrm + "'");
            conBanco.rs.first();
            idPrm = conBanco.rs.getInt("id_prm");
            descPrm = conBanco.rs.getString("desc_prm");
            statusPrm = conBanco.rs.getString("status_prm");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar consultar a permissão!!\n Erro: " + ex);
        }
        conBanco.desconecta();
    }

    public void ConsultarFormularios(String desc_Frm) {

        conBanco.conexao();
        try {
            conBanco.executaSQL("select * from tab_formulario where desc_frm ='" + desc_Frm + "'");
            conBanco.rs.first();
            idFrm = conBanco.rs.getInt("id_frm");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar consultar o formulario!!\n Erro: " + ex);
        }
        conBanco.desconecta();
    }

    public void ConsultarItemPermitido(int id_Prm, String desc_Frm) {

        conBanco.conexao();
        try {
            conBanco.executaSQL("select * from vw_item_permissao where desc_frm ='" + desc_Frm + "' and id_prm ='" + id_Prm + "'");
            conBanco.rs.first();
            idIPrm = conBanco.rs.getInt("id_it_prm");
            descFrm = conBanco.rs.getString("desc_frm");
        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Erro ao tentar consultar o formulario!!\n Erro: " + ex);
//            mensagem = "registro inexistente";
        }
        conBanco.desconecta();
    }
}
