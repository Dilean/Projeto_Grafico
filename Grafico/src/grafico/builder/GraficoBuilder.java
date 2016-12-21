package grafico.builder;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import grafico.decorator.Grafico;
import java.util.ArrayList;
import model.Dados;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import view.PrincipalView;

/**
 *
 * @author Dilean
 */
public abstract class GraficoBuilder {

    protected Grafico grafico;
    private PrincipalView view;
    private ChartPanel myChartPanel;

    public GraficoBuilder(PrincipalView view) {
        this.view = view;
        this.grafico = new Grafico();
    }

    public void lerDadosGrafico() {
        grafico.setDataset(new DefaultCategoryDataset());
        ArrayList<String> dados = Dados.getInstancia().getDados();

        for (String s : dados) {
            String[] dado = s.split(",");
            Integer qtd = Integer.parseInt(dado[0]);
            String marca = dado[1];
            String modelo = dado[2];
            grafico.getDataset().addValue(qtd, marca, modelo);
        }
    }

    public abstract void configurarTipoGrafico();

    public void configurarEstruturaGrafico() {
        JFreeChart chart = this.grafico.getGraf();
        myChartPanel = new ChartPanel(chart, true);
        myChartPanel.setSize(view.getJpnlGrafico().getWidth(), view.getJpnlGrafico().getHeight());
        myChartPanel.setVisible(true);

        this.grafico.setPanel(myChartPanel);
        this.grafico.getPanel().setChart(this.grafico.getGraf());
    }

    public void alterarTipoGrafico(Grafico g) {
        this.grafico = g;
    }

    public Grafico criarGrafico() {
        return this.grafico;
    }
}
