/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

import java.util.Scanner;
import javax.swing.JFrame;
/**
 *
 * @author david
 * clase inicio donde se recibe el tipo de figura y sus coordenadas
 */
public class Inicio  {
    
    public void inicio(){
        int x1,x2,x3,x4,y1,y2,y3,y4;
        byte tipo;
        Scanner entrada = new Scanner(System.in);
        FigurasGeometricas[] fig = new FigurasGeometricas[2];
        for(int i=0; i<=1;i++){
        System.out.println("que figura desea ingresar ?");
        System.out.println("1. cuadrado  2.triangulo");
        
        byte figura = entrada.nextByte();
        if(figura==1){
            tipo = 1;
            System.out.println("ha elegido un cuadrado");
            System.out.println("digite coordenada x1");
            x1 = entrada.nextInt();
            System.out.println("digite coordenada y1");
            y1 = entrada.nextInt();
            System.out.println("digite coordenada x2");
            x2 = entrada.nextInt();
            System.out.println("digite coordenada y2");
            y2 = entrada.nextInt();
            System.out.println("digite coordenada x3");
            x3 = entrada.nextInt();
            System.out.println("digite coordenada y3");
            y3 = entrada.nextInt();
            System.out.println("digite coordenada x4");
            x4 = entrada.nextInt();
            System.out.println("digite coordenada y4");
            y4 = entrada.nextInt();
            FigurasGeometricas cuadrado1 = new Cuadrado(x1, x2, x3, x4, y1, y2, y3, y4);
            fig[i] = cuadrado1;
            cuadrado1.validarFigura();
            //cuadrado1.hallarArea();
            //cuadrado1.hallarPerimetro();
            DibujarFiguras dibujar = new DibujarFiguras(cuadrado1.getLado1(),cuadrado1.getLado2(),tipo);
            JFrame ventana = new JFrame();
            ventana.add(dibujar);
            ventana.setSize(400,400);
            ventana.setVisible(true);
            
        }else{
            tipo = 2;
            if(figura==2){
            System.out.println("ha elegido un triangulo");
            System.out.println("digite coordenada x1");
            x1 = entrada.nextInt();
            System.out.println("digite coordenada y1");
            y1 = entrada.nextInt();
            System.out.println("digite coordenada x2");
            x2 = entrada.nextInt();
            System.out.println("digite coordenada y2");
            y2 = entrada.nextInt();
            System.out.println("digite coordenada x3");
            x3 = entrada.nextInt();
            System.out.println("digite coordenada y3");
            y3 = entrada.nextInt();
            FigurasGeometricas triangulo1 = new Triangulo(x1,x2,x3,y1,y2,y3);
            fig[i] = triangulo1;  
           // triangulo1.validarFigura();
           // triangulo1.hallarPerimetro();
           // triangulo1.hallarArea();
            DibujarFiguras dibujar = new DibujarFiguras(x1,x2,x3,y1,y2,y3,tipo);
            JFrame ventana = new JFrame();
            ventana.add(dibujar);
            ventana.setSize(400,400);
            ventana.setVisible(true);
            
            }
        }
        }
        for(int j = 0; j<fig.length; j++){
            if(fig[j] instanceof Cuadrado) {
                ((Cuadrado) fig[j]).validarFigura();
                ((Cuadrado) fig[j]).hallarPerimetro();
                ((Cuadrado) fig[j]).hallarArea();
                
            } else if(fig[j]  instanceof Triangulo) {
                ((Triangulo) fig[j]).validarFigura();
                ((Triangulo) fig[j]).hallarArea();
                ((Triangulo) fig[j]).hallarPerimetro();
            }
        }
        
           
        
    }
}

    
    

