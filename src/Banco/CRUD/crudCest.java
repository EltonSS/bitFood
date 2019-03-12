package Banco.CRUD;

import Banco.Conexao.ConectaBanco;
import java.sql.*;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class crudCest {

    private int id_Cest;
    private String desc_Cest, status_Cest;

    public int getId_Cest() {
        return id_Cest;
    }

    public String getNum_Cest() {
        return desc_Cest;
    }

    public String getStatus_Cest() {
        return status_Cest;
    }

    ConectaBanco conBanco = new ConectaBanco();

    public void InserirCest(String numCest, String statusCest) {

        conBanco.conexao();
        try {
            PreparedStatement pstCest = (PreparedStatement) conBanco.conn.prepareStatement("insert into tab_cest (num_cest, status_cest) values(?,?)");
            pstCest.setString(1, numCest);
            pstCest.setString(2, statusCest);
            pstCest.execute();
            JOptionPane.showMessageDialog(null, "O CEST " + numCest + " foi registrado com sucesso!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar inserir o CEST!!\n Erro: " + ex);
        }
        conBanco.desconecta();
    }

    public void DesativarCest(String numCest, String statusCest) {

        ConsultarCest(numCest);
        conBanco.conexao();
        try {
            PreparedStatement pstCest = (PreparedStatement) conBanco.conn.prepareStatement("update tab_cest set status_cest =? where id_cest =?");
            pstCest.setString(1, statusCest);
            pstCest.setInt(2, id_Cest);
            pstCest.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar desativar o CEST!!\n Erro: " + ex);
        }
        conBanco.desconecta();
    }

    public void AlterarCest(int idCest, String numCest, String statusCest) {

        conBanco.conexao();
        try {
            PreparedStatement pstCest = (PreparedStatement) conBanco.conn.prepareStatement("update tab_cest set num_cest =?, status_cest =? where id_cest =?");
            pstCest.setString(1, numCest);
            pstCest.setString(2, statusCest);
            pstCest.setInt(3, idCest);
            pstCest.execute();
            JOptionPane.showMessageDialog(null, "CEST: " + numCest + " alterado com sucesso!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar alterar o CEST!!\n Erro: " + ex);
        }
        conBanco.desconecta();
    }

    public void ConsultarCest(String numCest) {

        conBanco.conexao();
        try {
            conBanco.executaSQL("select * from tab_cest where num_cest ='" + numCest + "'");
            conBanco.rs.first();
            id_Cest = conBanco.rs.getInt("id_cest");
            desc_Cest = conBanco.rs.getString("num_cest");
            status_Cest = conBanco.rs.getString("status_cest");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar consultar o CEST!!\n Erro: " + ex);
        }
        conBanco.desconecta();
    }
}
