package Banco.CRUD;

import Banco.Conexao.ConectaBanco;
import java.sql.*;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class crudOrigemMercadoria {

    private int id_Org_Merc;
    private String desc_Org_Merc, status_Org_Merc;

    public int getId_Org_Merc() {
        return id_Org_Merc;
    }

    public String getDesc_Org_Merc() {
        return desc_Org_Merc;
    }

    public String getStatus_Org_Merc() {
        return status_Org_Merc;
    }

    ConectaBanco conBanco = new ConectaBanco();

    public void InserirOrigemMercadoria(String descOrgMerc, String statusOrgMerc) {

        conBanco.conexao();
        try {
            PreparedStatement pstOrgMerc = (PreparedStatement) conBanco.conn.prepareStatement("insert into tab_origem_mercadoria (desc_org_merc, status_org_merc) values(?,?)");
            pstOrgMerc.setString(1, descOrgMerc);
            pstOrgMerc.setString(2, statusOrgMerc);
            pstOrgMerc.execute();
            JOptionPane.showMessageDialog(null, "A Origem da Mercadoria " + descOrgMerc + " foi registrado com sucesso!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar inserir a origem da mercadoria!!\n Erro: " + ex);
        }
        conBanco.desconecta();
    }

    public void DesativarOrigemMercadoria(String descOrgMerc, String statusOrgMerc) {

        ConsultarOrigemMercadoria(descOrgMerc);
        conBanco.conexao();
        try {
            PreparedStatement pstOrgMerc = (PreparedStatement) conBanco.conn.prepareStatement("update tab_origem_mercadoria set status_org_merc =? where id_org_merc =?");
            pstOrgMerc.setString(1, statusOrgMerc);
            pstOrgMerc.setInt(2, id_Org_Merc);
            pstOrgMerc.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar desativar a origem da mercadoria!!\n Erro: " + ex);
        }
        conBanco.desconecta();
    }

    public void AlterarOrigemMercadoria(int idOrgMerc, String descOrgMerc, String statusOrgMerc) {

        conBanco.conexao();
        try {
            PreparedStatement pstOrgMerc = (PreparedStatement) conBanco.conn.prepareStatement("update tab_origem_mercadoria set desc_org_merc =?, status_org_merc =? where id_org_merc =?");
            pstOrgMerc.setString(1, descOrgMerc);
            pstOrgMerc.setString(2, statusOrgMerc);
            pstOrgMerc.setInt(3, idOrgMerc);
            pstOrgMerc.execute();
            JOptionPane.showMessageDialog(null, "Origem da mercadoria: " + descOrgMerc + " alterada com sucesso!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar alterar a origem da mercadoria!!\n Erro: " + ex);
        }
        conBanco.desconecta();
    }

    public void ConsultarOrigemMercadoria(String descOrgMerc) {

        conBanco.conexao();
        try {
            conBanco.executaSQL("select * from tab_origem_mercadoria where desc_org_merc ='" + descOrgMerc + "'");
            conBanco.rs.first();
            id_Org_Merc = conBanco.rs.getInt("id_org_merc");
            desc_Org_Merc = conBanco.rs.getString("desc_org_merc");
            status_Org_Merc = conBanco.rs.getString("status_org_merc");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar consultar a origem da mercadoria!!\n Erro: " + ex);
        }
        conBanco.desconecta();
    }
}
