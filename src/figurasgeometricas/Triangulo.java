/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

/**
 *
 * @author david
 */
public class Triangulo extends FigurasGeometricas {
    
     public Triangulo(int x1, int x2, int x3, int y1, int y2, int y3){
       super(x1,x2,x3,y1,y2,y3);
    }
     
    @Override
    public void validarFigura() {
        if ((getX1() == getX2() && getY1() == getY2()) || (getX3() == getX2() && getY3() == getY2()) || (getX1() == getX3() && getY1() == getY3())) {
            validar = "no es una figura valida";
            imprimirResultado();
        } else {
            double auxiliar = Math.pow((getX2() - getX1()), 2);
            double auxiliar2 = Math.pow((getY2() - getY1()), 2);
            setLado1(Math.sqrt(auxiliar + auxiliar2));
            auxiliar = Math.pow((getX3() - getX2()), 2);
            auxiliar2 = Math.pow((getY3() - getY2()), 2);
            setLado2(Math.sqrt(auxiliar + auxiliar2));
            auxiliar = Math.pow((getX1() - getX3()), 2);
            auxiliar2 = Math.pow((getY1() - getY3()), 2);
            setLado3(Math.sqrt(auxiliar + auxiliar2));
            System.out.println("lado 1: " +getLado1());
            System.out.println("lado 2: " +getLado2());
            System.out.println("lado 3: " +getLado3());
            if(getLado1()==getLado2()&& getLado1()==getLado3()){
                setTipo(1);
                System.out.println("es un triangulo equilatero");
            }else{
                
            }if(getLado1()!=getLado2()&&getLado1()!=getLado3()&&getLado2()!=getLado3()){
                setTipo(2);
                System.out.println("es un triangulo escaleno");
                
            }else{
                
            }if(getLado1()==getLado2()||getLado1()==getLado3()||getLado2()==getLado3()){
                setTipo(3);
                System.out.println("es un triangulo isoceles");
            }
        }
    }
    @Override
    public void hallarPerimetro() {
        perimetro = getLado1()+getLado2()+getLado3();
        System.out.println("el perimetro del triangulo es: " +perimetro);
        
    }

    @Override
    public void hallarArea() {
        double semiperimetro = (getLado1() + getLado2() + getLado3()) / 2;
        area = Math.sqrt(semiperimetro * (semiperimetro - getLado1()) * (semiperimetro - getLado2()) * (semiperimetro - getLado3()));
        System.out.println("el area del triangulo es: "+area);
    }

    @Override
    public void imprimirResultado() {
       System.out.println(validar);
    }
    
}
