/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafico.decorator;

/**
 *
 * @author Dilean
 */
public class EixoXDecorator extends GraficoDecorator{
    
    public EixoXDecorator(Grafico grafico,String data) {
        super(grafico);
        this.eixoX = data;
    }
    
}
