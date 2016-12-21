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
public class Grafico {

    protected DefaultCategoryDataset dataset;
    protected JFreeChart graf;
    protected ChartPanel panel;
    protected String titulo = "";
    protected String eixoX = "";
    protected String eixoY = "";
    protected boolean legenda = false;
    protected boolean tooltips = false;
    protected boolean urls = false;
    public DefaultCategoryDataset getDataset() {
        return dataset;
    }

    public void setDataset(DefaultCategoryDataset dataset) {
        this.dataset = dataset;
    }

    public JFreeChart getGraf() {
        return graf;
    }

    public void setGraf(JFreeChart graf) {
        this.graf = graf;
    }

    public ChartPanel getPanel() {
        return panel;
    }

    public void setPanel(ChartPanel panel) {
        this.panel = panel;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEixoX() {
        return eixoX;
    }

    public void setEixoX(String eixoX) {
        this.eixoX = eixoX;
    }

    public String getEixoY() {
        return eixoY;
    }

    public void setEixoY(String eixoY) {
        this.eixoY = eixoY;
    }

    public boolean isLegenda() {
        return legenda;
    }

    public void setLegenda(boolean legenda) {
        this.legenda = legenda;
    }

    public boolean isTooltips() {
        return tooltips;
    }

    public void setTooltips(boolean tooltips) {
        this.tooltips = tooltips;
    }

    public boolean isUrls() {
        return urls;
    }

    public void setUrls(boolean urls) {
        this.urls = urls;
    }
}
