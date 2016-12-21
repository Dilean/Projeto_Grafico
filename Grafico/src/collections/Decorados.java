/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import grafico.decorator.Grafico;
import java.util.ArrayList;

/**
 *
 * @author Dilean
 */
public class Decorados {

    private ArrayList<Grafico> decoradores;
    private ArrayList<String> ordem;
    private static Decorados instancia = null;

    private Decorados() {
        decoradores = new ArrayList<>();
        ordem = new ArrayList<>();
    }

    public static Decorados getInstancia() {
        if (instancia == null) {
            instancia = new Decorados();
        }
        return instancia;
    }

    public void addElemento(Grafico graf, String nome) {
        decoradores.add(graf);
        ordem.add(nome);
    }

    public Grafico ultimoDecorado() {
        if (!decoradores.isEmpty()) {
            Grafico ultimo = decoradores.get(decoradores.size() - 1);
            decoradores.remove(ultimo);
            return ultimo;
        }
        return null;
    }

    public String ordem() {
        if (!ordem.isEmpty()) {
            String ultimo = ordem.get(ordem.size() - 1);
            ordem.remove(ultimo);
            return ultimo;
        }
        return null;
    }
}
