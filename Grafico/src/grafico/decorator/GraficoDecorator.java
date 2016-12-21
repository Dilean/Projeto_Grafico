/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafico.decorator;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Dilean
 */
public abstract class GraficoDecorator extends Grafico {

    protected final Grafico grafico;

    public GraficoDecorator(Grafico grafico) {
        this.grafico = grafico;
        this.dataset = grafico.getDataset();
        this.panel = grafico.getPanel();
        this.tooltips = grafico.isTooltips();
        this.urls = grafico.isUrls();
    }

    @Override
    public boolean isTooltips() {
        return tooltips;
    }

    @Override
    public boolean isUrls() {
        return urls;
    }

    @Override
    public DefaultCategoryDataset getDataset() {
        return dataset;
    }

    @Override
    public JFreeChart getGraf() {
        return graf;
    }

    @Override
    public ChartPanel getPanel() {
        return panel;
    }

    @Override
    public String getTitulo() {
        if (grafico.getTitulo().isEmpty()) {
            this.titulo = grafico.getTitulo() + titulo;
        } else {
            this.titulo = grafico.getTitulo();
        }
        return this.titulo;
    }

    @Override
    public String getEixoX() {
        if (grafico.getEixoX().isEmpty()) {
            this.eixoX = grafico.getEixoX() + eixoX;
        } else {
            this.eixoX = grafico.getEixoX();
        }
        return this.eixoX;
    }

    @Override
    public String getEixoY() {
        if (grafico.getEixoY().isEmpty()) {
            this.eixoY = grafico.getEixoY() + eixoY;
        } else {
            this.eixoY = grafico.getEixoY();
        }
        return this.eixoY;
    }

    @Override
    public boolean isLegenda() {
        if (grafico.isLegenda()) {
            legenda = grafico.isLegenda();
        }
        return legenda;
    }
}
