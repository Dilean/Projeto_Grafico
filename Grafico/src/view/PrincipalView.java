/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JPanel;

/**
 *
 * @author Dilean
 */
public class PrincipalView extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalView
     */
    public PrincipalView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnlGrafico = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jcbOpcaoGrafico = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jcbTitulo = new javax.swing.JCheckBox();
        jcbLegenda = new javax.swing.JCheckBox();
        jcbEixoX = new javax.swing.JCheckBox();
        jcbEixoY = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        btnDesfazer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));
        setResizable(false);

        jpnlGrafico.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jpnlGraficoLayout = new javax.swing.GroupLayout(jpnlGrafico);
        jpnlGrafico.setLayout(jpnlGraficoLayout);
        jpnlGraficoLayout.setHorizontalGroup(
            jpnlGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 562, Short.MAX_VALUE)
        );
        jpnlGraficoLayout.setVerticalGroup(
            jpnlGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 413, Short.MAX_VALUE)
        );

        jLabel1.setText("Opções:");

        jcbOpcaoGrafico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Barra\t", "Linha" }));

        jLabel2.setText("Elementos Configuraveis");

        jcbTitulo.setText("Titulo");

        jcbLegenda.setText("Legenda");

        jcbEixoX.setText("Eixo X");

        jcbEixoY.setText("Eixo Y");

        btnDesfazer.setText("Desfazer");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jpnlGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcbLegenda)
                                    .addComponent(jcbTitulo)
                                    .addComponent(jcbEixoX)
                                    .addComponent(jcbEixoY)
                                    .addComponent(btnDesfazer)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jSeparator1)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jcbOpcaoGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbOpcaoGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpnlGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(jcbTitulo)
                        .addGap(30, 30, 30)
                        .addComponent(jcbLegenda)
                        .addGap(35, 35, 35)
                        .addComponent(jcbEixoX)
                        .addGap(38, 38, 38)
                        .addComponent(jcbEixoY)
                        .addGap(37, 37, 37)
                        .addComponent(btnDesfazer)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public JCheckBox getJcbEixoX() {
        return jcbEixoX;
    }

    public JCheckBox getJcbEixoY() {
        return jcbEixoY;
    }

    public JCheckBox getJcbLegenda() {
        return jcbLegenda;
    }

    public JComboBox<String> getJcbOpcaoGrafico() {
        return jcbOpcaoGrafico;
    }

    public JCheckBox getJcbTitulo() {
        return jcbTitulo;
    }

    public JButton getBtnDesfazer() {
        return btnDesfazer;
    }

    /**
     * @return
     */
    public JPanel getJpnlGrafico() {
        return jpnlGrafico;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDesfazer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JCheckBox jcbEixoX;
    private javax.swing.JCheckBox jcbEixoY;
    private javax.swing.JCheckBox jcbLegenda;
    private javax.swing.JComboBox<String> jcbOpcaoGrafico;
    private javax.swing.JCheckBox jcbTitulo;
    private javax.swing.JPanel jpnlGrafico;
    // End of variables declaration//GEN-END:variables
}