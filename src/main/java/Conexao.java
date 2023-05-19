/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
/**
 *
 * @author SamuelSantos
 */
public class Conexao {
    private String url;
    private String user;
    private String pw;
    public Connection conn;
    
    public List<Carro> conexao(){
        url = "jdbc:postgresql://banco-oficina.cepytx6pbbp6.sa-east-1.rds.amazonaws.com:5432/postgres?user=postgres&password=oficina2";
        
        try {
            conn = DriverManager.getConnection(url);
            String query = "select * from postgres.carros;";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            Carro cr;
            while(rs.next()){
                cr = new Carro(rs.getInt("ano"), rs.getString("modelo"), rs.getString("marca"), rs.getString("placa"));
                bdCar.add(cr);
            }
        } catch (Exception e) {
            System.out.println("Caiu no exception");
        }
        return bdCar;
    }
    private List<Carro> bdCar = conexao();
}
