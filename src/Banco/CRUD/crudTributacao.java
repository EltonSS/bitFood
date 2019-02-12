package Banco.CRUD;

import Banco.Conexao.ConectaBanco;
import java.sql.*;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class crudTributacao {

//    private int id_Fab_Prod;
//    private String desc_Fab_Prod, status_Fab_Prod;
//
//    public int getId_Fab_Prod() {
//        return id_Fab_Prod;
//    }
//
//    public String getDesc_Fab_Prod() {
//        return desc_Fab_Prod;
//    }
//
//    public String getStatus_Fab_Prod() {
//        return status_Fab_Prod;
//    }
    ConectaBanco conBanco = new ConectaBanco();

//------------------------------------------------ CST ORIGEM -------------------------------------------------------------------------
    private int id_Cst_Org;
    private String desc_Cst_Org, status_Cst_Org;

    public int getId_Cst_Org() {
        return id_Cst_Org;
    }

    public String getDesc_Cst_Org() {
        return desc_Cst_Org;
    }

    public String getStatus_Cst_Org() {
        return status_Cst_Org;
    }

    public void InserirCstOrigem(String descCstOrg, String statusCstOrg) {

        conBanco.conexao();
        try {
            PreparedStatement pstCstOrg = (PreparedStatement) conBanco.conn.prepareStatement("insert into tab_cst_origem (desc_cst_org, status_cst_org) values(?,?)");
            pstCstOrg.setString(1, descCstOrg);
            pstCstOrg.setString(2, statusCstOrg);
            pstCstOrg.execute();
            JOptionPane.showMessageDialog(null, "O CST origem " + descCstOrg + " foi registrado com sucesso!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar inserir o CST origem!!\n Erro: " + ex);
        }
        conBanco.desconecta();
    }

    public void DesativarCstOrigem(String descCstOrg, String statusCstOrg) {

        ConsultarCstOrigem(descCstOrg);
        conBanco.conexao();
        try {
            PreparedStatement pstCstOrg = (PreparedStatement) conBanco.conn.prepareStatement("update tab_cst_origem set status_fab_prod =? where id_fab_prod =?");
            pstCstOrg.setString(1, statusCstOrg);
            pstCstOrg.setInt(2, id_Cst_Org);
            pstCstOrg.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar desativar o fabricante de produto!!\n Erro: " + ex);
        }
        conBanco.desconecta();
    }

    public void AlterarCstOrigem(int idCstOrg, String descCstOrg, String statusCstOrg) {

        conBanco.conexao();
        try {
            PreparedStatement pstCstOrg = (PreparedStatement) conBanco.conn.prepareStatement("update tab_cst_origem set desc_cst_org =?, status_cst_org =? where id_cst_org =?");
            pstCstOrg.setString(1, descCstOrg);
            pstCstOrg.setString(2, statusCstOrg);
            pstCstOrg.setInt(3, idCstOrg);
            pstCstOrg.execute();
            JOptionPane.showMessageDialog(null, "CST Origem: " + descCstOrg + " alterada com sucesso!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar alterar o cst de origem!!\n Erro: " + ex);
        }
        conBanco.desconecta();
    }

    public void ConsultarCstOrigem(String descCstOrg) {

        conBanco.conexao();
        try {
            conBanco.executaSQL("select * from tab_cst_origem where desc_cst_org ='" + descCstOrg + "'");
            conBanco.rs.first();
            id_Cst_Org = conBanco.rs.getInt("id_cst_org");
            desc_Cst_Org = conBanco.rs.getString("desc_cst_org");
            status_Cst_Org = conBanco.rs.getString("status_cst_org");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar consultar o cst de origem!!\n Erro: " + ex);
        }
        conBanco.desconecta();
    }

//------------------------------------------------ CST Tributacao ICMS -------------------------------------------------------------------------
    //    private int id_Fab_Prod;
//    private String desc_Fab_Prod, status_Fab_Prod;
//
//    public int getId_Fab_Prod() {
//        return id_Fab_Prod;
//    }
//
//    public String getDesc_Fab_Prod() {
//        return desc_Fab_Prod;
//    }
//
//    public String getStatus_Fab_Prod() {
//        return status_Fab_Prod;
//    }
    
    public void InserirCstTributacaoIcms(String descCstTribIcms, String statusCstTribIcms) {

        conBanco.conexao();
        try {
            PreparedStatement pstCstOrg = (PreparedStatement) conBanco.conn.prepareStatement("insert into tab_cst_tributacao_icms (desc_cst_trib_icms, status_cst_trib_icms) values(?,?)");
            pstCstOrg.setString(1, descCstTribIcms);
            pstCstOrg.setString(2, statusCstTribIcms);
            pstCstOrg.execute();
            JOptionPane.showMessageDialog(null, "O CST Tributado pelo Icms " + descCstTribIcms + " foi registrado com sucesso!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar inserir o CST Tributado pelo Icms!!\n Erro: " + ex);
        }
        conBanco.desconecta();
    }

//    public void DesativarFabricanteProduto(String descCstOrg, String statusCstOrg) {
//
//        ConsultarCstOrg(descCstOrg);
//        conBanco.conexao();
//        try {
//            PreparedStatement pstCstOrg = (PreparedStatement) conBanco.conn.prepareStatement("update tab_fabricante_produto set status_fab_prod =? where id_fab_prod =?");
//            pstCstOrg.setString(1, statusCstOrg);
//            pstCstOrg.setInt(2, id_Fab_Prod);
//            pstCstOrg.execute();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Erro ao tentar desativar o fabricante de produto!!\n Erro: " + ex);
//        }
//        conBanco.desconecta();
//    }
//
//    public void AlterarFabricanteProduto(int idFabProd, String descFabProd, String statusFabProd) {
//
//        conBanco.conexao();
//        try {
//            PreparedStatement pstCstOrg = (PreparedStatement) conBanco.conn.prepareStatement("update tab_fabricante_produto set desc_fab_prod =?, status_fab_prod =? where id_fab_prod =?");
//            pstCstOrg.setString(1, descFabProd);
//            pstCstOrg.setString(2, statusFabProd);
//            pstCstOrg.setInt(3, idFabProd);
//            pstCstOrg.execute();
//            JOptionPane.showMessageDialog(null, "CST Origem: " + descFabProd + " alterada com sucesso!!");
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Erro ao tentar alterar o fabricante de produto!!\n Erro: " + ex);
//        }
//        conBanco.desconecta();
//    }
//     public void ConsultarFabricanteProduto(String descCstOrg) {
//
//        conBanco.conexao();
//        try {
//            conBanco.executaSQL("select * from tab_cst_origem where desc_cst_org ='" + descCstOrg + "'");
//            conBanco.rs.first();
//            id_Fab_Prod = conBanco.rs.getInt("id_fab_prod");
//            desc_Fab_Prod = conBanco.rs.getString("desc_fab_prod");
//            status_Fab_Prod = conBanco.rs.getString("status_fab_prod");
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Erro ao tentar consultar o fabricante de produto!!\n Erro: " + ex);
//        }
//        conBanco.desconecta();
//    }
//------------------------------------------------ CST Tributacao Simples Nacional -------------------------------------------------------------------------
    
    //    private int id_Fab_Prod;
//    private String desc_Fab_Prod, status_Fab_Prod;
//
//    public int getId_Fab_Prod() {
//        return id_Fab_Prod;
//    }
//
//    public String getDesc_Fab_Prod() {
//        return desc_Fab_Prod;
//    }
//
//    public String getStatus_Fab_Prod() {
//        return status_Fab_Prod;
//    }
    public void InserirCstTributacaoSimplesNacional(String descCstTribSplNac, String statusCstTribSplNac) {

        conBanco.conexao();
        try {
            PreparedStatement pstCstOrg = (PreparedStatement) conBanco.conn.prepareStatement("insert into tab_cst_trib_spl_nac (desc_cst_org, status_cst_trib_spl_nac) values(?,?)");
            pstCstOrg.setString(1, descCstTribSplNac);
            pstCstOrg.setString(2, statusCstTribSplNac);
            pstCstOrg.execute();
            JOptionPane.showMessageDialog(null, "O CST Tributado pelo simples nacional " + descCstTribSplNac + " foi registrado com sucesso!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar inserir o CST Tributado pelo simples nacional!!\n Erro: " + ex);
        }
        conBanco.desconecta();
    }

//     public void DesativarFabricanteProduto(String descCstOrg, String statusCstOrg) {
//
//        ConsultarCstOrg(descCstOrg);
//        conBanco.conexao();
//        try {
//            PreparedStatement pstCstOrg = (PreparedStatement) conBanco.conn.prepareStatement("update tab_fabricante_produto set status_fab_prod =? where id_fab_prod =?");
//            pstCstOrg.setString(1, statusCstOrg);
//            pstCstOrg.setInt(2, id_Fab_Prod);
//            pstCstOrg.execute();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Erro ao tentar desativar o fabricante de produto!!\n Erro: " + ex);
//        }
//        conBanco.desconecta();
//    }
//
//    public void AlterarFabricanteProduto(int idFabProd, String descFabProd, String statusFabProd) {
//
//        conBanco.conexao();
//        try {
//            PreparedStatement pstCstOrg = (PreparedStatement) conBanco.conn.prepareStatement("update tab_fabricante_produto set desc_fab_prod =?, status_fab_prod =? where id_fab_prod =?");
//            pstCstOrg.setString(1, descFabProd);
//            pstCstOrg.setString(2, statusFabProd);
//            pstCstOrg.setInt(3, idFabProd);
//            pstCstOrg.execute();
//            JOptionPane.showMessageDialog(null, "CST Origem: " + descFabProd + " alterada com sucesso!!");
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Erro ao tentar alterar o fabricante de produto!!\n Erro: " + ex);
//        }
//        conBanco.desconecta();
//    }
    //     public void ConsultarFabricanteProduto(String descCstOrg) {
//
//        conBanco.conexao();
//        try {
//            conBanco.executaSQL("select * from tab_cst_origem where desc_cst_org ='" + descCstOrg + "'");
//            conBanco.rs.first();
//            id_Fab_Prod = conBanco.rs.getInt("id_fab_prod");
//            desc_Fab_Prod = conBanco.rs.getString("desc_fab_prod");
//            status_Fab_Prod = conBanco.rs.getString("status_fab_prod");
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Erro ao tentar consultar o fabricante de produto!!\n Erro: " + ex);
//        }
//        conBanco.desconecta();
//    }
}
