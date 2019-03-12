package Banco.CRUD;

import Banco.Conexao.ConectaBanco;
import java.sql.*;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class crudFabricante {

    private int id_Fab_Prod;
    private String desc_Fab_Prod, status_Fab_Prod;

    public int getId_Fab_Prod() {
        return id_Fab_Prod;
    }

    public String getDesc_Fab_Prod() {
        return desc_Fab_Prod;
    }

    public String getStatus_Fab_Prod() {
        return status_Fab_Prod;
    }

    ConectaBanco conBanco = new ConectaBanco();

    public void InserirFabricanteProduto(String descFabProd, String statusFabProd) {

        conBanco.conexao();
        try {
            PreparedStatement pstFabProd = (PreparedStatement) conBanco.conn.prepareStatement("insert into tab_fabricante_produto (desc_fab_prod, status_fab_prod) values(?,?)");
            pstFabProd.setString(1, descFabProd);
            pstFabProd.setString(2, statusFabProd);
            pstFabProd.execute();
            JOptionPane.showMessageDialog(null, "O Fabricante de Produto " + descFabProd + " foi registrado com sucesso!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar inserir o fabricante!!\n Erro: " + ex);
        }
        conBanco.desconecta();
    }

    public void DesativarFabricanteProduto(String descFabProd, String statusFabProd) {

        ConsultarFabricanteProduto(descFabProd);
        conBanco.conexao();
        try {
            PreparedStatement pstFabProd = (PreparedStatement) conBanco.conn.prepareStatement("update tab_fabricante_produto set status_fab_prod =? where id_fab_prod =?");
            pstFabProd.setString(1, statusFabProd);
            pstFabProd.setInt(2, id_Fab_Prod);
            pstFabProd.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar desativar o fabricante de produto!!\n Erro: " + ex);
        }
        conBanco.desconecta();
    }

    public void AlterarFabricanteProduto(int idFabProd, String descFabProd, String statusFabProd) {

        conBanco.conexao();
        try {
            PreparedStatement pstFabProd = (PreparedStatement) conBanco.conn.prepareStatement("update tab_fabricante_produto set desc_fab_prod =?, status_fab_prod =? where id_fab_prod =?");
            pstFabProd.setString(1, descFabProd);
            pstFabProd.setString(2, statusFabProd);
            pstFabProd.setInt(3, idFabProd);
            pstFabProd.execute();
            JOptionPane.showMessageDialog(null, "Fabricante de produto: " + descFabProd + " alterada com sucesso!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar alterar o fabricante de produto!!\n Erro: " + ex);
        }
        conBanco.desconecta();
    }

    public void ConsultarFabricanteProduto(String descFabProd) {

        conBanco.conexao();
        try {
            conBanco.executaSQL("select * from tab_fabricante_produto where desc_fab_prod ='" + descFabProd + "'");
            conBanco.rs.first();
            id_Fab_Prod = conBanco.rs.getInt("id_fab_prod");
            desc_Fab_Prod = conBanco.rs.getString("desc_fab_prod");
            status_Fab_Prod = conBanco.rs.getString("status_fab_prod");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar consultar o fabricante de produto!!\n Erro: " + ex);
        }
        conBanco.desconecta();
    }
}
