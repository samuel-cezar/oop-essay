/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.samuel.atividadepratica1;

import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author fabricio
 */
public class ControllerArquivoTextoCarro extends ControllerArquivoTexto {

    private ArrayList<Carro> carros = new ArrayList<>();

    public boolean lerCarro() {
        carros = new ArrayList<>();
        if (ler()) {
            String conteudo = getTexto();
            StringTokenizer linha = new StringTokenizer(conteudo, "--");
            while (linha.hasMoreTokens()) {
                StringTokenizer registro = new StringTokenizer(linha.nextToken(), ";");
                Carro car = new Carro();
                car.setModelo(registro.nextToken());
                car.setPlaca(registro.nextToken());
                car.setAno(registro.nextToken());
                car.setMarca(registro.nextToken());
                getCarros().add(car);
            }
            return true;
        } else {
            return false;
        }
    }

    public boolean escreverCarro(boolean append) {
        boolean aux = false;
        for (int i = 0; i < carros.size(); i++) {
            Carro carro = carros.get(i);
            String texto = carro.getModelo() + ";" + carro.getPlaca() + ";" + carro.getAno() +  ";" + carro.getMarca() + "--";
            setTexto(texto);
            if (i == 0) {
                aux = (escrever(false));
            } else {
                aux = (escrever(append));
            }
        }
        return aux;
    }

    public ArrayList<Carro> getCarros() {
        return carros;
    }


    public void setCarros(ArrayList<Carro> clientes) {
        this.carros = clientes;
    }

}
