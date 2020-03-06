/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author david
 */
public class DibujarFiguras extends JPanel {
   private int   x1 ,x2, x3, y1, y2, y3, tipo;
   private double lado1,lado2;
    public DibujarFiguras(double lado1, double lado2,  int tipo){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.tipo = tipo;
        setBackground(Color.GRAY);
    }
    public DibujarFiguras(int x1, int x2, int x3, int y1, int y2, int y3, int tipo){
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
        this.tipo = tipo;
        
    }
    
    public void paintComponent(Graphics g){
        super.paintComponents(g);
        switch (tipo){
            case 1:
                 g.translate(this.getWidth()/2, this.getHeight()/2);
                 g.setColor(Color.RED);
                 g.drawRect(0, 0, (int)lado1*10, (int)lado2*10);
                 
                break;
            case 2:
                g.translate(this.getWidth()/2, this.getHeight()/2);
                g.setColor(Color.GREEN);
                int x[] = {x1*10, x2*10, x3*10};
                int y[] = {y1*10, y2*10, y3*10};
                g.drawPolygon(x, y, 3);
                
                break;
            }
        
        
    }
    
}
