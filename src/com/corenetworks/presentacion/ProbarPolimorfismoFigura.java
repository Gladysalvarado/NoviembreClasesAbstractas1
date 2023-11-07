package com.corenetworks.presentacion;

import com.corenetworks.modelo.*;

public class ProbarPolimorfismoFigura {
    public static void main(String[] args) {
        /* No se puede instanciar la clase Figura porque es abstracta
        Figura f1 = new Figura() ;
         */

        Rectangulo r1 = new Rectangulo(0,0,4,2);
        System.out.println("Area rectangulo " + r1.calcularArea());
        System.out.println(r1.toString());

        Circulo c1 = new Circulo(4,4,2);
        System.out.println("Area del circulo " + c1.calcularArea());
        System.out.println(c1.toString());

        //*Cuadrado
       Cuadrado  cPeque = new Cuadrado();
       cPeque.setLado1(8);
        cPeque.setX(0);
        cPeque.setY(0);

        Figura cMediano = new Cuadrado(8,5,3) ;

        Triangulo tPeque = new Triangulo();
        tPeque.setX(8);
        tPeque.setY(3);
        tPeque.setaltura(5);
        tPeque.setbase(10);

        Figura tMediano = new Triangulo(2,2,7,6);

        Figura[] figuras = {cPeque, cMediano, tPeque, tMediano};

        for (Figura elemento:
                figuras) {
            if(elemento instanceof Cuadrado){
                System.out.println("lado"+ ((Cuadrado)elemento).getLado1());
            }
                if(elemento instanceof Triangulo){
                    System.out.println("lado"+ ((Triangulo)elemento).calcularArea());
                    System.out.println(elemento.toString());

            }
            System.out.println("Calcular el area -> " + elemento.calcularArea());
            System.out.println(elemento.toString());
        }
    }

}
