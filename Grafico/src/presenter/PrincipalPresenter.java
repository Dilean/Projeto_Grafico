/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presenter;

import collections.Decorados;
import grafico.decorator.Grafico;
import grafico.builder.GeradorGrafico;
import grafico.builder.GraficoBarraBuilder;
import grafico.builder.GraficoBuilder;
import grafico.builder.GraficoAreaBuilder;
import grafico.decorator.EixoXDecorator;
import grafico.decorator.EixoYDecorator;
import grafico.decorator.LegendaDecorator;
import grafico.decorator.TituloDecorator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.PrincipalView;

/**
 *
 * @author Dilean
 */
public class PrincipalPresenter {

    private PrincipalView view;
    private Grafico grafico;
    private GraficoBuilder graficoBuilder;
    private GeradorGrafico geradorGrafico;

    public PrincipalPresenter() {
        this.view = new PrincipalView();
        this.view.setLocationRelativeTo(null);

        inicialGrafico();

        this.view.getJcbEixoX().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (view.getJcbEixoX().isSelected()) {
                    Decorados.getInstancia().addElemento(grafico, "eixoX");
                    String aux = JOptionPane.showInputDialog(view, "Legenda eixoX:");

                    if (aux != null) {
                        if (!aux.equals("")) {
                            grafico = new EixoXDecorator(grafico, aux);
                            view.getJcbEixoX().setEnabled(false);
                            addGrafico(grafico);
                        } else {
                            JOptionPane.showMessageDialog(view, "Campo em branco!", "Erro!", 0);
                            view.getJcbEixoX().setSelected(false);
                        }
                    } else {
                        view.getJcbEixoX().setSelected(false);
                    }
                }
            }
        });

        this.view.getJcbEixoY().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (view.getJcbEixoY().isSelected()) {
                    Decorados.getInstancia().addElemento(grafico, "eixoY");
                    String aux = JOptionPane.showInputDialog(view, "Legenda eixoY:");

                    if (aux != null) {
                        if (!aux.equals("")) {
                            grafico = new EixoYDecorator(grafico, aux);
                            view.getJcbEixoY().setEnabled(false);
                            addGrafico(grafico);
                        } else {
                            JOptionPane.showMessageDialog(view, "Campo em branco!", "Erro!", 0);
                            view.getJcbEixoY().setSelected(false);
                        }
                    } else {
                        view.getJcbEixoY().setSelected(false);
                    }
                }
            }
        });

        this.view.getJcbLegenda().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (view.getJcbLegenda().isSelected()) {
                    Decorados.getInstancia().addElemento(grafico, "legenda");
                    grafico = new LegendaDecorator(grafico);
                    view.getJcbLegenda().setEnabled(false);
                }
                addGrafico(grafico);
            }
        });

        this.view.getJcbTitulo().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (view.getJcbTitulo().isSelected()) {
                    Decorados.getInstancia().addElemento(grafico, "titulo");
                    String aux = JOptionPane.showInputDialog(view, "Titulo:");
                    if (aux != null) {
                        if (!aux.equals("")) {
                            grafico = new TituloDecorator(grafico, aux);
                            view.getJcbTitulo().setEnabled(false);
                            addGrafico(grafico);
                        } else {
                            JOptionPane.showMessageDialog(view, "Valor inválido!", "Erro!", 0);
                            view.getJcbTitulo().setSelected(false);
                        }
                    } else {
                        view.getJcbTitulo().setSelected(false);
                    }
                }
            }
        }
        );

        this.view.getJcbOpcaoGrafico()
                .addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e
                    ) {
                        switch (view.getJcbOpcaoGrafico().getSelectedIndex()) {
                            case 0:
                                graficoBuilder = new GraficoBarraBuilder(view);
                                break;
                            case 1:
                                graficoBuilder = new GraficoAreaBuilder(view);
                                break;
                        }
                        geradorGrafico = new GeradorGrafico(graficoBuilder);
                        grafico = geradorGrafico.alterarGrafico(grafico);
                        addGrafico(grafico);
                    }
                }
                );

        this.view.getBtnDesfazer()
                .addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e
                    ) {

                        Grafico aux = Decorados.getInstancia().ultimoDecorado();
                        String ordem = Decorados.getInstancia().ordem();

                        if (grafico != null && ordem != null) {
                            view.getBtnDesfazer().setEnabled(true);
                            grafico = aux;
                            removerUltimo(grafico, ordem);
                        }

                    }
                }
                );

        this.view.setVisible(
                true);
    }

    private void addGrafico(Grafico g) {
        grafico = geradorGrafico.alterarGrafico(g);
        view.getJpnlGrafico().removeAll();
        view.getJpnlGrafico().add(grafico.getPanel());
        view.getJpnlGrafico().revalidate();
        view.getJpnlGrafico().repaint();
    }

    private void inicialGrafico() {
        graficoBuilder = new GraficoBarraBuilder(view);
        geradorGrafico = new GeradorGrafico(graficoBuilder);
        grafico = geradorGrafico.gerarGrafico();

        view.getJpnlGrafico().removeAll();
        view.getJpnlGrafico().add(grafico.getPanel());
        view.getJpnlGrafico().revalidate();
        view.getJpnlGrafico().repaint();
    }

    private void removerUltimo(Grafico grafico, String ordem) {
        switch (ordem) {
            case "titulo":
                view.getJcbTitulo().setEnabled(true);
                view.getJcbTitulo().setSelected(false);
                break;
            case "legenda":
                view.getJcbLegenda().setEnabled(true);
                view.getJcbLegenda().setSelected(false);
                break;
            case "eixoX":
                view.getJcbEixoX().setEnabled(true);
                view.getJcbEixoX().setSelected(false);
                break;
            case "eixoY":
                view.getJcbEixoY().setEnabled(true);
                view.getJcbEixoY().setSelected(false);
                break;
        }
        addGrafico(grafico);
    }
}
