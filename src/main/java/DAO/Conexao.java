package DAO;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author SamuelSantos
 */
public class Conexao {
    private String url;
    private String user;
    private String pw;
    protected Connection conn = null;
    protected ResultSet conjuntos = null;
    protected PreparedStatement pComandos = null;
    private static Conexao conexaoClass;
    
    private Conexao() {
        conn = conexao();
        conjuntos = null;
        pComandos = null;
        conexaoClass = null;
    }
    
    public static Conexao getConexaoClass (){
        if (conexaoClass == null) {
            conexaoClass = new Conexao();
        }
        return conexaoClass;
    }

    public Connection getConn() {
        return conn;
    }

    public void setConjuntos(ResultSet conjuntos) {
        this.conjuntos = conjuntos;
    }

    public ResultSet getConjuntos() {
        return conjuntos;
    }
      
    public Connection conexao(){
        url = "jdbc:postgresql://bdoficina02.cxsemodhyjwz.us-east-1.rds.amazonaws.com:5432/oficina_integracao_02";
        user = "oficina02";
        pw = "oficina1234";
        
        try {
            conn = DriverManager.getConnection(url, user, pw);
            conn.setAutoCommit(false); return conn;
        } catch (SQLException esql) {
            System.out.println(esql);
            errosSQL("Erro ao conectar ao Banco de Dados", esql); 
            conn = null; return conn;
        }
    }
    
    public final boolean concretizaOperacao () throws SQLException {
        int res = pComandos.executeUpdate();
        pComandos.close();
        if (res == 1) {
            getConn().commit();
            return true;
        } else {
            getConn().rollback();
            return false;
        }
    }
    
    public final void errosSQL (String mensagem, Exception erro) {
         JOptionPane.showMessageDialog(null, mensagem+"\n"+erro.getMessage(), "Informativo", JOptionPane.ERROR_MESSAGE);
    }
    
    public final void informativo (String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem, "Informativo", JOptionPane.INFORMATION_MESSAGE);
    }
}