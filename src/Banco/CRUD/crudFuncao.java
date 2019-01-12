package Banco.CRUD;

import Banco.Conexao.ConectaBanco;
import java.sql.*;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class crudFuncao {

    private int idFunc;
    private String descFunc;
    private String statusFunc;

    public int getIdFunc() {
        return idFunc;
    }

    public void setIdFunc(int idFunc) {
        this.idFunc = idFunc;
    }

    public String getDescFunc() {
        return descFunc;
    }

    public void setDescFunc(String descFunc) {
        this.descFunc = descFunc;
    }

    public String getStatusFunc() {
        return statusFunc;
    }

    public void setStatusFunc(String statusFunc) {
        this.statusFunc = statusFunc;
    }

    ConectaBanco conBanco = new ConectaBanco();

    public void InserirFuncao() {

        conBanco.conexao();
        try {
            PreparedStatement pstfuncao = (PreparedStatement) conBanco.conn.prepareStatement("insert into tab_funcao (desc_func , status_func) values(?,?)");
            pstfuncao.setString(1, descFunc);
            pstfuncao.setString(2, statusFunc);
            pstfuncao.execute();
            JOptionPane.showMessageDialog(null, "Função: " + descFunc + " registrado com sucesso!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar inserir a função!!\n Erro: " + ex);
        }
        conBanco.desconecta();
    }

    public void DesativarFuncao(int id_Func, String status_Func) {

        ConsultarFuncao();
        conBanco.conexao();
        try {
            PreparedStatement pstfuncao = (PreparedStatement) conBanco.conn.prepareStatement("update tab_funcao set status_func =? where id_Func =?");
            pstfuncao.setString(1, status_Func);
            pstfuncao.setInt(2, id_Func);
            pstfuncao.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar desativar a função!!\n Erro: " + ex);
        }
        conBanco.desconecta();
    }

    public void AlterarFuncao(int id_Func, String desc_Func, String status_Func) {

        conBanco.conexao();
        try {
            PreparedStatement pstfuncao = (PreparedStatement) conBanco.conn.prepareStatement("update tab_funcao set desc_func =? , status_func =? where id_func =?");
            pstfuncao.setString(1, desc_Func);
            pstfuncao.setString(2, status_Func);
            pstfuncao.setInt(3, id_Func);
            pstfuncao.execute();
            JOptionPane.showMessageDialog(null, "Função: " + desc_Func + " alterada com sucesso!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar alterar a função!!\n Erro: " + ex);
        }
        conBanco.desconecta();
    }

    public void ConsultarFuncao() {

        conBanco.conexao();
        try {
            conBanco.executaSQL("select * from tab_funcao where desc_func ='" + descFunc + "'");
            conBanco.rs.first();
            idFunc = conBanco.rs.getInt("id_func");
            descFunc = conBanco.rs.getString("desc_func");
            statusFunc = conBanco.rs.getString("status_func");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar consultar a função!!\n Erro: " + ex);
        }
        conBanco.desconecta();
    }
}
