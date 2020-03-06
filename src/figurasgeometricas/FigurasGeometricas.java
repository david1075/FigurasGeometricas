/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

/**
 *
 * @author david
 * clase padre donde se encuentran las variables para calcular area y perimetro de las figuras
 */
public abstract class FigurasGeometricas implements IOperaciones {
    
   private int x1,x2,x3,y1,y2,y3,tipo;
   private double lado1,lado2,lado3;
   double area,perimetro;
   String color, validar;
    
  /**
   * constructor de la clase figuras geometricas que recibe 6 coordenadas
   * @param x1
   * @param x2
   * @param x3
   * @param y1
   * @param y2
   * @param y3 
   */
   public FigurasGeometricas(int x1, int x2, int x3, int y1, int y2, int y3){
       this.x1 = x1;
       this.x2 = x2;
       this.x3 = x3;
       this.y1 = y1;
       this.y2 = y2;
       this.y3 = y3;
    }
    
  

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getX3() {
        return x3;
    }

    public void setX3(int x3) {
        this.x3 = x3;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public int getY3() {
        return y3;
    }

    public void setY3(int y3) {
        this.y3 = y3;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }
    
    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    
    
   
    
}
