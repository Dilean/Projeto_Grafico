/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Dilean
 */
public class Dados {

    private ArrayList<String> dados;
    private static Dados instancia = null;

    // linha
    final String carro1 = "Honda civic";
    final String carro2 = "Fiat uno";
    final String carro3 = "Ford focus";
    final String carro4 = "Citrön c4";

    // coluna
    final String cor1 = "Preto";
    final String cor2 = "Verde";
    final String cor3 = "Amarelo";
    final String cor4 = "Vermelho";
    final String cor5 = "Azul";

    private Dados() {
        dados = new ArrayList<>();
        CarregarDados();
    }

    public static Dados getInstancia() {
        if (instancia == null) {
            instancia = new Dados();
        }
        return instancia;
    }

    private void CarregarDados() {

        dados.add("5" + "," + carro1 + "," + cor1);
        dados.add("2" + "," + carro1 + "," + cor4);
        dados.add("1" + "," + carro1 + "," + cor3);

        dados.add("10" + "," + carro2 + "," + cor1);
        dados.add("7" + "," + carro2 + "," + cor5);
        dados.add("2" + "," + carro2 + "," + cor3);

        dados.add("3" + "," + carro3 + "," + cor1);
        dados.add("6" + "," + carro3 + "," + cor4);
        dados.add("2" + "," + carro3 + "," + cor3);

        dados.add("8" + "," + carro4 + "," + cor1);
        dados.add("7" + "," + carro4 + "," + cor2);
        dados.add("7" + "," + carro4 + "," + cor5);

    }

    public ArrayList getDados() {
        return this.dados;
    }
}
