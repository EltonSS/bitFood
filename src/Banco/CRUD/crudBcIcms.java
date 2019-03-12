package Banco.CRUD;

import Banco.Conexao.ConectaBanco;
import java.sql.*;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class crudBcIcms {

    private int id_Bc_Icms;
    private String desc_Bc_Icms, status_Bc_Icms;

    public int getId_Bc_Icms() {
        return id_Bc_Icms;
    }

    public String getDesc_Bc_Icms() {
        return desc_Bc_Icms;
    }

    public String getStatus_Bc_Icms() {
        return status_Bc_Icms;
    }

    ConectaBanco conBanco = new ConectaBanco();

    public void InserirBcIcms(String descBcIcms, String statusBcIcms) {

        conBanco.conexao();
        try {
            PreparedStatement pstBcIcms = (PreparedStatement) conBanco.conn.prepareStatement("insert into tab_bc_icms (desc_bc_icms, status_bc_icms) values(?,?)");
            pstBcIcms.setString(1, descBcIcms);
            pstBcIcms.setString(2, statusBcIcms);
            pstBcIcms.execute();
            JOptionPane.showMessageDialog(null, "O BC ICMS " + descBcIcms + " foi registrado com sucesso!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar inserir o BC ICMS!!\n Erro: " + ex);
        }
        conBanco.desconecta();
    }

    public void DesativarBcIcms(String descBcIcms, String statusBcIcms) {

        ConsultarBcIcms(descBcIcms);
        conBanco.conexao();
        try {
            PreparedStatement pstBcIcms = (PreparedStatement) conBanco.conn.prepareStatement("update tab_bc_icms set status_bc_icms =? where id_bc_icms =?");
            pstBcIcms.setString(1, statusBcIcms);
            pstBcIcms.setInt(2, id_Bc_Icms);
            pstBcIcms.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar desativar o BC ICMS!!\n Erro: " + ex);
        }
        conBanco.desconecta();
    }

    public void AlterarBcIcms(int idBcIcms, String descBcIcms, String statusBcIcms) {

        conBanco.conexao();
        try {
            PreparedStatement pstBcIcms = (PreparedStatement) conBanco.conn.prepareStatement("update tab_bc_icms set desc_bc_icms =?, status_bc_icms =? where id_bc_icms =?");
            pstBcIcms.setString(1, descBcIcms);
            pstBcIcms.setString(2, statusBcIcms);
            pstBcIcms.setInt(3, idBcIcms);
            pstBcIcms.execute();
            JOptionPane.showMessageDialog(null, "BC ICMS: " + descBcIcms + " alterada com sucesso!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar alterar BC ICMS!!\n Erro: " + ex);
        }
        conBanco.desconecta();
    }

    public void ConsultarBcIcms(String descBcIcms) {

        conBanco.conexao();
        try {
            conBanco.executaSQL("select * from tab_bc_icms where desc_bc_icms ='" + descBcIcms + "'");
            conBanco.rs.first();
            id_Bc_Icms = conBanco.rs.getInt("id_bc_icms");
            desc_Bc_Icms = conBanco.rs.getString("desc_bc_icms");
            status_Bc_Icms = conBanco.rs.getString("status_bc_icms");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar consultar BC ICMS!!\n Erro: " + ex);
        }
        conBanco.desconecta();
    }
}
