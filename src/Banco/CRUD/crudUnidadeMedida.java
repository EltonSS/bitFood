package Banco.CRUD;

import Banco.Conexao.ConectaBanco;
import java.sql.*;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class crudUnidadeMedida {

    private int id_Unid_Med;
    private String desc_Unid_Med, status_Unid_Med;

    public int getId_Unid_Med() {
        return id_Unid_Med;
    }

    public String getDesc_Unid_Med() {
        return desc_Unid_Med;
    }

    public String getStatus_Unid_Med() {
        return status_Unid_Med;
    }

    ConectaBanco conBanco = new ConectaBanco();

    public void InserirUnidadeMedida(String descUnidMed, String statusUnidMed) {

        conBanco.conexao();
        try {
            PreparedStatement pstUnidMed = (PreparedStatement) conBanco.conn.prepareStatement("insert into tab_unidade_medida (desc_unid_med, status_unid_med) values(?,?)");
            pstUnidMed.setString(1, descUnidMed);
            pstUnidMed.setString(2, statusUnidMed);
            pstUnidMed.execute();
            JOptionPane.showMessageDialog(null, "A unidade de medida " + descUnidMed + " foi registrada com sucesso!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar inserir a unidade de medida!!\n Erro: " + ex);
        }
        conBanco.desconecta();
    }

    public void DesativarUnidadeMedida(String descUnidMed, String statusUnidMed) {

        ConsultarUnidadeMedida(descUnidMed);
        conBanco.conexao();
        try {
            PreparedStatement pstUnidMed = (PreparedStatement) conBanco.conn.prepareStatement("update tab_unidade_medida set status_unid_med =? where id_unid_med =?");
            pstUnidMed.setString(1, statusUnidMed);
            pstUnidMed.setInt(2, id_Unid_Med);
            pstUnidMed.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar desativar a unidade de medida!!\n Erro: " + ex);
        }
        conBanco.desconecta();
    }

    public void AlterarUnidadeMedida(int idUnidMed, String descUnidMed, String statusUnidMed) {

        conBanco.conexao();
        try {
            PreparedStatement pstUnidMed = (PreparedStatement) conBanco.conn.prepareStatement("update tab_unidade_medida set desc_unid_med =?, status_unid_med =? where id_unid_med =?");
            pstUnidMed.setString(1, descUnidMed);
            pstUnidMed.setString(2, statusUnidMed);
            pstUnidMed.setInt(3, idUnidMed);
            pstUnidMed.execute();
            JOptionPane.showMessageDialog(null, "Unidade de mediada: " + descUnidMed + " alterada com sucesso!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar alterar a unidade de medida!!\n Erro: " + ex);
        }
        conBanco.desconecta();
    }

    public void ConsultarUnidadeMedida(String descUnidMed) {

        conBanco.conexao();
        try {
            conBanco.executaSQL("select * from tab_unidade_medida where desc_unid_med ='" + descUnidMed + "'");
            conBanco.rs.first();
            id_Unid_Med = conBanco.rs.getInt("id_unid_med");
            desc_Unid_Med = conBanco.rs.getString("desc_unid_med");
            status_Unid_Med = conBanco.rs.getString("status_unid_med");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar consultar a unidade medida!!\n Erro: " + ex);
        }
        conBanco.desconecta();
    }
}
