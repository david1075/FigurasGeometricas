/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Inicio {
    
    public void inicio(){
        int x1,x2,x3,x4,y1,y2,y3,y4;
        Scanner entrada = new Scanner(System.in);
        System.out.println("que figura desea ingresar ?");
        System.out.println("1. cuadrado  2.triangulo");
        System.out.println("digite el numero por favor ...");
        byte figura = entrada.nextByte();
        if(figura==1){
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
            Cuadrado cuadrado1 = new Cuadrado(x1, x2, x3, x4, y1, y2, y3, y4);
            cuadrado1.validarFigura();
            cuadrado1.hallarArea();
            cuadrado1.hallarPerimetro();
            
            
            
        }else{
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
            Triangulo triangulo1 = new Triangulo(x1,x2,x3,y1,y2,y3);
            triangulo1.validarFigura();
            triangulo1.hallarPerimetro();
            triangulo1.hallarArea();
            }
        }
           
        
    }
}

    
    

