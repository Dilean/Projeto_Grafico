/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafico.builder;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import view.PrincipalView;

/**
 *
 * @author Dilean
 */
public class GraficoAreaBuilder extends GraficoBuilder {

    public GraficoAreaBuilder(PrincipalView view) {
        super(view);
    }

    @Override
    public void configurarTipoGrafico() {

        JFreeChart graf = ChartFactory.createAreaChart(
                grafico.getTitulo(),
                grafico.getEixoX(),
                grafico.getEixoY(),
                grafico.getDataset(),
                PlotOrientation.VERTICAL,
                grafico.isLegenda(),
                grafico.isTooltips(),
                grafico.isUrls()
        );
        grafico.setGraf(graf);
    }

}
