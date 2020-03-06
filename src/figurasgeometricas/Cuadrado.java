/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;
import java.awt.Graphics;

/**
 *
 * @author david
 * clase cuadrado que calcula area, perimetro y longitud de sus lados para las figuras cuadrado y rectangulo
 */
public class Cuadrado extends FigurasGeometricas{
    private int x4,y4;
    public double lado4;
    
    
    
    public Cuadrado(int x1, int x2, int x3, int x4,int y1, int y2, int y3,int y4){
       super(x1, x2, x3, y1, y2, y3);
       this.x4 = x4;
       this.y4 = y4;
    }
    /**
     * metodo que valida si es una figura valida, obtiene la longitud de sus lados y obtiene el tipo de cuadrado
     */
    @Override
    public void validarFigura(){
        
        if ((getX1() == getX2() && getY1() == getY2()) || (getX3() == x4 && getY3() == y4)||(getX1() == getX3() && getY1() == getY3())) {
            validar = "no es una figura valida";
            imprimirResultado();
        } else {
            double auxiliar = Math.pow((getX2()-getX1()), 2);
            double auxiliar2= Math.pow((getY2()-getY1()),2);
            setLado1(Math.sqrt(auxiliar+auxiliar2));
            auxiliar = Math.pow((getX3()-getX2()), 2);
            auxiliar2= Math.pow((getY3()-getY2()),2);
            setLado2(Math.sqrt(auxiliar+auxiliar2));
            auxiliar = Math.pow((x4-getX3()), 2);
            auxiliar2= Math.pow((y4-getY3()),2);
            setLado3(Math.sqrt(auxiliar+auxiliar2));
            auxiliar = Math.pow((getX1()-x4), 2);
            auxiliar2= Math.pow((getY1()-y4),2);
            lado4 = Math.sqrt(auxiliar+auxiliar2);
            System.out.println("lado 1: " +getLado1());
            System.out.println("lado 2: " +getLado2());
            System.out.println("lado 3: " +getLado3());
            System.out.println("lado 4: " +lado4);
            if((getLado1()==getLado2())&&(getLado1()==getLado3())&&(getLado1()==lado4)){
                validar = "es un cuadrado";
                setTipo(1);
                imprimirResultado();
            }else{
                if((getLado1()==getLado3())&&(getLado2()==lado4)){
                    validar="es un rectangulo";
                    setTipo(2);
                    imprimirResultado();
                }
            }
        }
    }
    /**
     * metodo que halla el area segun el tipo de cuadrado
     */
    @Override
    public void hallarArea() {
        if(getTipo()==1){
            area = getLado1()*getLado2();
            System.out.println("el area del cuadrado es: " +area);
            
        }else
            if(getTipo()==2){
              area= getLado1()*getLado2();
                System.out.println("el area del rectangulo es: " +area);
            }
    }
    /**
     * metodo que halla el perimetro segun el tipo de cuadrado
     */
    @Override
    public void hallarPerimetro() {
        if(getTipo()==1){
            perimetro = getLado1()*4;
            System.out.println("el perimetro del cuadrado es: " +perimetro);
            
        }else
            if(getTipo()==2){
              perimetro= ((getLado1()*2)+(getLado2()*2));
                System.out.println("el perimetro del rectangulo es: " +perimetro);
            }
    }
    /**
     * metodo que imprime el resultado de la validacion del tipo de figura 
     */
    @Override
     public void imprimirResultado() {
         System.out.println(validar);
    }
    

                                                                    
        
}
    
   
    
    

