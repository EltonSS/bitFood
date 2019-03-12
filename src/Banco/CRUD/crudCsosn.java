package Banco.CRUD;

import Banco.Conexao.ConectaBanco;
import java.sql.*;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class crudCsosn {

    private int id_Csosn;
    private String desc_Csosn, status_Csosn;

    public int getId_Csosn() {
        return id_Csosn;
    }

    public String getDesc_Csosn() {
        return desc_Csosn;
    }

    public String getStatus_Csosn() {
        return status_Csosn;
    }

    ConectaBanco conBanco = new ConectaBanco();

    public void InserirCsosn(String descCsosn, String statusCsosn) {

        conBanco.conexao();
        try {
            PreparedStatement pstCsosn = (PreparedStatement) conBanco.conn.prepareStatement("insert into tab_csosn (desc_csosn, status_csosn) values(?,?)");
            pstCsosn.setString(1, descCsosn);
            pstCsosn.setString(2, statusCsosn);
            pstCsosn.execute();
            JOptionPane.showMessageDialog(null, "O CSOSN " + descCsosn + " foi registrado com sucesso!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar inserir o CSOSN!!\n Erro: " + ex);
        }
        conBanco.desconecta();
    }

    public void DesativarCsosn(String descCsosn, String statusCsosn) {

        ConsultarCsosn(descCsosn);
        conBanco.conexao();
        try {
            PreparedStatement pstCsosn = (PreparedStatement) conBanco.conn.prepareStatement("update tab_csosn set status_csosn =? where id_csosn =?");
            pstCsosn.setString(1, statusCsosn);
            pstCsosn.setInt(2, id_Csosn);
            pstCsosn.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar desativar o CSOSN!!\n Erro: " + ex);
        }
        conBanco.desconecta();
    }

    public void AlterarCsosn(int idCsosn, String descCsosn, String statusCsosn) {

        conBanco.conexao();
        try {
            PreparedStatement pstCsosn = (PreparedStatement) conBanco.conn.prepareStatement("update tab_csosn set desc_csosn =?, status_csosn =? where id_csosn =?");
            pstCsosn.setString(1, descCsosn);
            pstCsosn.setString(2, statusCsosn);
            pstCsosn.setInt(3, idCsosn);
            pstCsosn.execute();
            JOptionPane.showMessageDialog(null, "CSOSN: " + descCsosn + " alterada com sucesso!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar alterar o CSOSN!!\n Erro: " + ex);
        }
        conBanco.desconecta();
    }

    public void ConsultarCsosn(String descCsosn) {

        conBanco.conexao();
        try {
            conBanco.executaSQL("select * from tab_csosn where desc_csosn ='" + descCsosn + "'");
            conBanco.rs.first();
            id_Csosn = conBanco.rs.getInt("id_csosn");
            desc_Csosn = conBanco.rs.getString("desc_csosn");
            status_Csosn = conBanco.rs.getString("status_csosn");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar consultar o CSOSN!!\n Erro: " + ex);
        }
        conBanco.desconecta();
    }
}
