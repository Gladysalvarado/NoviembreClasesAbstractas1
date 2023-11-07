package com.corenetworks.modelo;

public class Cuadrado extends Figura {
    private int lado1;


    @Override
    public double calcularArea() {
        return lado1 * lado1;}

    @Override
    public String toString() {
        return "Cuadrado{" +
                "lado1=" + lado1 +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    public Cuadrado() {
    }

    public Cuadrado(int x, int y, int lado1) {
        super(x, y);
        this.lado1 = lado1;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }
}

