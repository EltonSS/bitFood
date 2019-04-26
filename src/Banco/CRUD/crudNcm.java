package Banco.CRUD;

import Banco.Conexao.ConectaBanco;
import java.sql.*;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class crudNcm {

    private int id_Ncm, id_Cest;
    private String num_Ncm, desc_Ncm, status_Ncm;

    public int getId_Ncm() {
        return id_Ncm;
    }

    public void setNum_Ncm(String num_Ncm) {
        this.num_Ncm = num_Ncm;
    }

    public String getDesc_Ncm() {
        return desc_Ncm;
    }

    public String getStatus_Ncm() {
        return status_Ncm;
    }

    public int getId_Cest() {
        return id_Cest;
    }

    ConectaBanco conBanco = new ConectaBanco();

    public void InserirNcm(String numNcm, String descNcm, int idCest, String statusNcm) {

        conBanco.conexao();
        try {
            PreparedStatement pstNcm = (PreparedStatement) conBanco.conn.prepareStatement("insert into tab_ncm (num_ncm, desc_ncm, id_cest, status_ncm) values(?,?,?,?)");
            pstNcm.setString(1, numNcm);
            pstNcm.setString(2, descNcm);
            pstNcm.setInt(3, idCest);
            pstNcm.setString(4, statusNcm);
            pstNcm.execute();
            JOptionPane.showMessageDialog(null, "O NCM " + numNcm + " foi registrado com sucesso!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar inserir o NCM!!\n Erro: " + ex);
        }
        conBanco.desconecta();
    }

    public void DesativarNcm(String numNcm, String statusNcm) {

        ConsultarNcm(numNcm);
        conBanco.conexao();
        try {
            PreparedStatement pstNcm = (PreparedStatement) conBanco.conn.prepareStatement("update tab_ncm set status_ncm =? where id_ncm =?");
            pstNcm.setString(1, statusNcm);
            pstNcm.setInt(2, id_Ncm);
            pstNcm.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar desativar o NCM!!\n Erro: " + ex);
        }
        conBanco.desconecta();
    }

    public void AlterarNcm(int idNcm, String numNcm, String descNcm, String statusNcm) {

        conBanco.conexao();
        try {
            PreparedStatement pstNcm = (PreparedStatement) conBanco.conn.prepareStatement("update tab_ncm set num_ncm =?, desc_ncm =?, status_ncm =? where id_ncm =?");
            pstNcm.setString(1, numNcm);
            pstNcm.setString(2, descNcm);
            pstNcm.setString(3, statusNcm);
            pstNcm.setInt(3, idNcm);
            pstNcm.execute();
            JOptionPane.showMessageDialog(null, "NCM: " + numNcm + " alterado com sucesso!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar alterar o NCM!!\n Erro: " + ex);
        }
        conBanco.desconecta();
    }

    public void ConsultarNcm(String numNcm) {

        conBanco.conexao();
        try {
            conBanco.executaSQL("select * from tab_ncm where num_ncm ='" + numNcm + "'");
            conBanco.rs.first();
            id_Ncm = conBanco.rs.getInt("id_ncm");
            setNum_Ncm(conBanco.rs.getString("num_ncm"));
            desc_Ncm = conBanco.rs.getString("desc_ncm");
            id_Cest = conBanco.rs.getInt("id_cest");
            status_Ncm = conBanco.rs.getString("status_ncm");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar consultar o NCM!!\n Erro: " + ex);
        }
        conBanco.desconecta();
    }
}
