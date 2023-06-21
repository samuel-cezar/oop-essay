/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Carro;

/**
 *
 * @author willi
 */
public class CarroDAO {
    
    private final int tipo = ResultSet.TYPE_SCROLL_SENSITIVE, concorrencia = ResultSet.CONCUR_UPDATABLE;
    private Conexao conexaoClass;
    private final String selecionaPlaca = "SELECT * FROM carro";
    
    private final String cadastrarInBD = "INSERT INTO carro VALUES (?, ?, ?, ?);";
    
    private final String alterarInBD = "UPDATE carro SET ca_modelo = ?, ca_marca = ?, ca_ano = ? WHERE ca_placa = ?;";
    
    private final String removerInBD = "DELETE FROM carro WHERE ca_placa = ?";

    private static CarroDAO bdCar = null;
    
    private CarroDAO() {
        conexaoClass = Conexao.getConexaoClass();
    }

    public static CarroDAO getBdCar() {
        if (bdCar == null) {
            bdCar = new CarroDAO();
        }
        return bdCar;
    }
    
    public boolean cadastrar (Carro carro) {
        try {
            conexaoClass.pComandos = conexaoClass.getConn().prepareStatement(cadastrarInBD, tipo, concorrencia);
            
            conexaoClass.pComandos.setString(1, carro.getModelo());
            conexaoClass.pComandos.setString(2, carro.getMarca());
            conexaoClass.pComandos.setString(3, carro.getPlaca());
            conexaoClass.pComandos.setInt(4, carro.getAno());
            
            return conexaoClass.concretizaOperacao();
        } catch (SQLException ex) {
            conexaoClass.errosSQL("Erro ao inserir veiculo no banco de dados", ex); return false;
        }
    }
    
    public boolean remover (Carro carro) {
        try {        
            conexaoClass.pComandos = conexaoClass.getConn().prepareStatement(removerInBD, tipo, concorrencia);
             
            conexaoClass.pComandos.setString(1, carro.getPlaca());
            return conexaoClass.concretizaOperacao();
        } catch (SQLException ex) {
            conexaoClass.errosSQL("Erro ao exluir veiculo no banco de dados", ex);  return false;
        }
    }
    
    public boolean alterar (Carro carro) {
        try {   
            carro.setModelo( JOptionPane.showInputDialog(null, "Informe o novo modelo", "Atualização",
                        JOptionPane.QUESTION_MESSAGE));
            carro.setMarca(JOptionPane.showInputDialog(null, "Informe a nova marca", "Atualização",
                        JOptionPane.QUESTION_MESSAGE));
            carro.setAno(Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o novo ano", "Atualização",
                        JOptionPane.QUESTION_MESSAGE)));
            
            conexaoClass.pComandos = conexaoClass.getConn().prepareStatement(alterarInBD, tipo, concorrencia);
            conexaoClass.pComandos.setString(1, carro.getModelo());
            conexaoClass.pComandos.setString(2, carro.getMarca());
            conexaoClass.pComandos.setInt(3, carro.getAno());
            conexaoClass.pComandos.setString(4, carro.getPlaca());
            return conexaoClass.concretizaOperacao();
        } catch (SQLException ex) {
            conexaoClass.errosSQL("Erro ao alterar veiculo no banco de dados", ex); return false;
        }
    }
    
    public boolean consultar (Carro carro) {
        try {
            conexaoClass.conjuntos = conexaoClass.getConn().createStatement(tipo, concorrencia).executeQuery(selecionaPlaca);
            
            while (conexaoClass.conjuntos.next()) {
                if (conexaoClass.conjuntos.getString("ca_placa").equals(carro.getPlaca())) {
                    carro.setModelo(conexaoClass.conjuntos.getString("ca_modelo"));
                    carro.setMarca(conexaoClass.conjuntos.getString("ca_marca"));
                    carro.setAno(conexaoClass.conjuntos.getInt("ca_ano"));
                    return true;
                }
            }
            conexaoClass.conjuntos.close();
            conexaoClass.informativo("Esta placa não existe no banco de dados!"); return false;
        } catch (SQLException ex) {
            conexaoClass.errosSQL("Não foi possivel percorrer a tabela carro!", ex); return false;
        }
    } 
}
