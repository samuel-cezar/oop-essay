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
                Carro cli = new Carro();
                cli.setModelo(registro.nextToken());
                cli.setPlaca(registro.nextToken());
                cli.setAno(registro.nextToken());
                getCarros().add(cli);
            }
            return true;
        } else {
            return false;
        }
    }

    public boolean escreverCarro(boolean append) {
        boolean aux = false;
        for (int i = 0; i < carros.size(); i++) {
            Carro cliente = carros.get(i);
            String texto = cliente.getModelo() + ";" + cliente.getPlaca() + ";" + cliente.getAno() + "--";
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
