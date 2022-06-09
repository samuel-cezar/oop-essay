/**
Samuel C. dos Santos - 1996789
Prog. Orientada Objetos - Prof. José
*/
public class Carro {
    private String modelo;
    private String marca;
    private int ano;
    private String placa;
    
    public Carro(){
        modelo = "";
        marca = "";
        ano = 1970;
        placa = "AAA1234";
    }
    
    public Carro(int ano, String modelo, String marca, String placa){
        this.ano = ano;
        this.modelo = modelo;
        this.marca = marca;
        this.placa = placa;
    }
    
    public int getAno(){
        return ano;
    }
    
    public void setAno(int ano){
        this.ano = ano;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public String getPlaca(){
        return placa;
    }
    
    public void setPlaca(String placa){
        this.placa = placa;
    }
}
