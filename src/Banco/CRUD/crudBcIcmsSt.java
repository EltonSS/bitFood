package Banco.CRUD;

import Banco.Conexao.ConectaBanco;
import java.sql.*;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class crudBcIcmsSt {

    private int id_Bc_Icms_St;
    private String desc_Bc_Icms_St, status_Bc_Icms_St;

    public int getId_Bc_Icms_St() {
        return id_Bc_Icms_St;
    }

    public String getDesc_Bc_Icms_St() {
        return desc_Bc_Icms_St;
    }

    public String getStatus_Bc_Icms_St() {
        return status_Bc_Icms_St;
    }

    ConectaBanco conBanco = new ConectaBanco();

    public void InserirBcIcmsSt(String descBcIcmsSt, String statusBcIcmsSt) {

        conBanco.conexao();
        try {
            PreparedStatement pstBcIcmsSt = (PreparedStatement) conBanco.conn.prepareStatement("insert into tab_bc_icms_st (desc_bc_icms_st, status_bc_icms_st) values(?,?)");
            pstBcIcmsSt.setString(1, descBcIcmsSt);
            pstBcIcmsSt.setString(2, statusBcIcmsSt);
            pstBcIcmsSt.execute();
            JOptionPane.showMessageDialog(null, "O BC ICMS ST " + descBcIcmsSt + " foi registrado com sucesso!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar inserir o BC ICMS ST!!\n Erro: " + ex);
        }
        conBanco.desconecta();
    }

    public void DesativarBcIcmsSt(String descBcIcmsSt, String statusBcIcmsSt) {

        ConsultarBcIcmsSt(descBcIcmsSt);
        conBanco.conexao();
        try {
            PreparedStatement pstBcIcmsSt = (PreparedStatement) conBanco.conn.prepareStatement("update tab_bc_icms_st set status_bc_icms_st =? where id_bc_icms_st =?");
            pstBcIcmsSt.setString(1, statusBcIcmsSt);
            pstBcIcmsSt.setInt(2, id_Bc_Icms_St);
            pstBcIcmsSt.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar desativar o BC ICMS ST!!\n Erro: " + ex);
        }
        conBanco.desconecta();
    }

    public void AlterarBcIcmsSt(int idBcIcmsSt, String descBcIcmsSt, String statusBcIcmsSt) {

        conBanco.conexao();
        try {
            PreparedStatement pstBcIcmsSt = (PreparedStatement) conBanco.conn.prepareStatement("update tab_bc_icms_st set desc_bc_icms_st =?, status_bc_icms_st =? where id_bc_icms_st =?");
            pstBcIcmsSt.setString(1, descBcIcmsSt);
            pstBcIcmsSt.setString(2, statusBcIcmsSt);
            pstBcIcmsSt.setInt(3, idBcIcmsSt);
            pstBcIcmsSt.execute();
            JOptionPane.showMessageDialog(null, "BC ICMS ST: " + descBcIcmsSt + " alterada com sucesso!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar alterar BC ICMS ST!!\n Erro: " + ex);
        }
        conBanco.desconecta();
    }

    public void ConsultarBcIcmsSt(String descBcIcmsSt) {

        conBanco.conexao();
        try {
            conBanco.executaSQL("select * from tab_bc_icms_st where desc_bc_icms_st ='" + descBcIcmsSt + "'");
            conBanco.rs.first();
            id_Bc_Icms_St = conBanco.rs.getInt("id_bc_icms_st");
            desc_Bc_Icms_St = conBanco.rs.getString("desc_bc_icms_st");
            status_Bc_Icms_St = conBanco.rs.getString("status_bc_icms_st");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar consultar BC ICMS ST!!\n Erro: " + ex);
        }
        conBanco.desconecta();
    }
}
