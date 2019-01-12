package Banco.CRUD;

import Banco.Conexao.ConectaBanco;
import java.sql.*;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class crudCategoriaProduto {

    private int id_Cat_Prod;
    private String desc_Cat_Prod, status_Cat_Prod;

    public int getId_Cat_Prod() {
        return id_Cat_Prod;
    }

    public String getDesc_Cat_Prod() {
        return desc_Cat_Prod;
    }

    public String getStatus_Cat_Prod() {
        return status_Cat_Prod;
    }

    ConectaBanco conBanco = new ConectaBanco();

    public void InserirCategoriaProduto(String descCatProd, String statusCatProd) {

        conBanco.conexao();
        try {
            PreparedStatement pstCatProd = (PreparedStatement) conBanco.conn.prepareStatement("insert into tab_categoria_produto (desc_cat_prod, status_cat_prod) values(?,?)");
            pstCatProd.setString(1, descCatProd);
            pstCatProd.setString(2, statusCatProd);
            pstCatProd.execute();
            JOptionPane.showMessageDialog(null, "A categoria " + descCatProd + " foi registrada com sucesso!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar inserir a categoria!!\n Erro: " + ex);
        }
        conBanco.desconecta();
    }

    public void DesativarCategoriaProduto(String descCatProd, String statusCatProd) {

        ConsultarCategoriaProduto(descCatProd);
        conBanco.conexao();
        try {
            PreparedStatement pstCatProd = (PreparedStatement) conBanco.conn.prepareStatement("update tab_categoria_produto set status_cat_prod =? where id_cat_prod =?");
            pstCatProd.setString(1, statusCatProd);
            pstCatProd.setInt(2, id_Cat_Prod);
            pstCatProd.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar desativar a categoria!!\n Erro: " + ex);
        }
        conBanco.desconecta();
    }

    public void AlterarCategoriaProduto(int idCatProd, String descCatProd, String statusCatProd) {

        conBanco.conexao();
        try {
            PreparedStatement pstCatProd = (PreparedStatement) conBanco.conn.prepareStatement("update tab_categoria_produto set desc_cat_prod =?, status_cat_prod =? where id_cat_prod =?");
            pstCatProd.setString(1, descCatProd);
            pstCatProd.setString(2, statusCatProd);
            pstCatProd.setInt(3, idCatProd);
            pstCatProd.execute();
            JOptionPane.showMessageDialog(null, "Categoria: " + descCatProd + " alterada com sucesso!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar alterar a categoria!!\n Erro: " + ex);
        }
        conBanco.desconecta();
    }

    public void ConsultarCategoriaProduto(String descCatProd) {

        conBanco.conexao();
        try {
            conBanco.executaSQL("select * from tab_categoria_produto where desc_cat_prod ='" + descCatProd + "'");
            conBanco.rs.first();
            id_Cat_Prod = conBanco.rs.getInt("id_cat_prod");
            desc_Cat_Prod = conBanco.rs.getString("desc_cat_prod");
            status_Cat_Prod = conBanco.rs.getString("status_cat_prod");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar consultar a categoria!!\n Erro: " + ex);
        }
        conBanco.desconecta();
    }
}
