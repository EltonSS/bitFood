package Banco.CRUD;

import Banco.Conexao.ConectaBanco;
import java.sql.*;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Funcoes.Criptografar;

public class crudUsuario {

    private int id_Usu;
    private int id_Func;
    private int id_Prm;
    private String nome_Usu, login_Usu, desc_Func, desc_Prm, senha_Usu, status_Usu;

    public int getId_Usu() {
        return id_Usu;
    }

    public String getNome_Usu() {
        return nome_Usu;
    }

    public String getLogin_Usu() {
        return login_Usu;
    }

    public String getDesc_Func() {
        return desc_Func;
    }

    public String getDesc_Prm() {
        return desc_Prm;
    }

    public String getSenha_Usu() {
        return senha_Usu;
    }

    public String getStatus_Usu() {
        return status_Usu;
    }

    ConectaBanco conBanco = new ConectaBanco();

    public void InserirUsuario(String nomeUsu, String loginUsu, String senhaUsu, String descPrm, String descFunc, String status_usu) {

        buscaFuncao(descFunc);
        buscaPermissao(descPrm);
        conBanco.conexao();
        try {
            PreparedStatement pstUsuario = (PreparedStatement) conBanco.conn.prepareStatement("insert into tab_usuario (nome_usu, login_usu, senha_usu, id_prm, id_func, status_usu) values(?,?,?,?,?,?)");
            pstUsuario.setString(1, nomeUsu);
            pstUsuario.setString(2, loginUsu);
            pstUsuario.setString(3, Criptografar.encriptografar(senhaUsu));
            pstUsuario.setInt(4, id_Prm);
            pstUsuario.setInt(5, id_Func);
            pstUsuario.setString(6, status_usu);
            pstUsuario.execute();
            JOptionPane.showMessageDialog(null, "O usuário " + nomeUsu + " foi registrado com sucesso!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar inserir o usuário!!\n Erro: " + ex);
        }
        conBanco.desconecta();
    }

    public void buscaFuncao(String descFunc) {

        conBanco.conexao();
        conBanco.executaSQL("select * from tab_funcao where desc_func = '" + descFunc + "' and status_func = 'ativo'");
        try {
            conBanco.rs.first();
            id_Func = conBanco.rs.getInt("id_func");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar buscar o id da função: " + e);
        }
        conBanco.desconecta();
    }

    public void buscaPermissao(String descPrm) {

        conBanco.conexao();
        conBanco.executaSQL("select * from tab_permissao where desc_prm = '" + descPrm + "' and status_prm = 'ativo'");
        try {
            conBanco.rs.first();
            id_Prm = conBanco.rs.getInt("id_prm");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar buscar o id da permissão: " + e);
        }
        conBanco.desconecta();
    }

    public void DesativarUsuario(String nomeUsu, String statusUsu) {

        ConsultarUsuario(nomeUsu);
        conBanco.conexao();
        try {
            PreparedStatement pstUsuario = (PreparedStatement) conBanco.conn.prepareStatement("update tab_usuario set status_usu =? where id_usu =?");
            pstUsuario.setString(1, statusUsu);
            pstUsuario.setInt(2, id_Usu);
            pstUsuario.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar desativar o usuário!!\n Erro: " + ex);
        }
        conBanco.desconecta();
    }

    public void AlterarUsuario(int idUsu, String nomeUsu, String loginUsu, String SenhaUsu, String descFunc, String descPrm, String statusUsu) {

        buscaFuncao(descFunc);
        buscaPermissao(descPrm);
        conBanco.conexao();
        try {
            PreparedStatement pstUsuario = (PreparedStatement) conBanco.conn.prepareStatement("update tab_usuario set nome_usu =?, login_usu =?, senha_usu =?, id_prm =?, id_func =?, status_usu =? where id_usu =?");
            pstUsuario.setString(1, nomeUsu);
            pstUsuario.setString(2, loginUsu);
            pstUsuario.setString(3, Criptografar.encriptografar(SenhaUsu));
            pstUsuario.setInt(4, id_Prm);
            pstUsuario.setInt(5, id_Func);
            pstUsuario.setString(6, statusUsu);
            pstUsuario.setInt(7, idUsu);
            pstUsuario.execute();
            JOptionPane.showMessageDialog(null, "Usuário: " + nomeUsu + " alterado com sucesso!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar alterar o usuário!!\n Erro: " + ex);
        }
        conBanco.desconecta();
    }

    public void ConsultarUsuario(String nomeUsu) {

        conBanco.conexao();
        try {
            conBanco.executaSQL("select * from vw_usuario where nome_usu ='" + nomeUsu + "'");
            conBanco.rs.first();
            id_Usu = conBanco.rs.getInt("id_usu");
            nome_Usu = conBanco.rs.getString("nome_usu");
            login_Usu = conBanco.rs.getString("login_usu");
            desc_Func = conBanco.rs.getString("desc_func");
            desc_Prm = conBanco.rs.getString("desc_prm");
            senha_Usu = conBanco.rs.getString("senha_usu");
            status_Usu = conBanco.rs.getString("status_usu");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar consultar o usuário!!\n Erro: " + ex);
        }
        conBanco.desconecta();
    }
}
