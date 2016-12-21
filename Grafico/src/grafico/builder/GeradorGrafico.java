/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafico.builder;

import grafico.decorator.Grafico;

/**
 *
 * @author Dilean
 */
public class GeradorGrafico {

    private GraficoBuilder graficoBuilder;

    public GeradorGrafico(GraficoBuilder graficoBuilder) {
        this.graficoBuilder = graficoBuilder;
    }

    public Grafico gerarGrafico() {
        this.graficoBuilder.lerDadosGrafico();
        this.graficoBuilder.configurarTipoGrafico();
        this.graficoBuilder.configurarEstruturaGrafico();

        return this.graficoBuilder.criarGrafico();
    }

    public Grafico alterarGrafico(Grafico g) {
        this.graficoBuilder.alterarTipoGrafico(g);
        this.graficoBuilder.configurarTipoGrafico();
        this.graficoBuilder.configurarEstruturaGrafico();
        return this.graficoBuilder.criarGrafico();
    }
}