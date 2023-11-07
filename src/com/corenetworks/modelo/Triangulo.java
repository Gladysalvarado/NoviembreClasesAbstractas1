package com.corenetworks.modelo;

public class Triangulo extends Figura{

    private int altura;
    private int base;
    @Override
    public double calcularArea() {
        return (altura * base)/2;}

    @Override
    public String toString() {
        return "Triangulo{" +
                "altura=" + altura +
                ", base=" + base +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    public Triangulo() {
    }

    public Triangulo(int x, int y, int base1, int base2) {
        super(x, y);
        this.altura = base1;
        this.base = base2;
    }

    public int getaltura() {
        return altura;
    }

    public void setaltura(int base1) {
        this.altura = altura;
    }

    public int getbase() {
        return base;
    }

    public void setbase(int base) {
        this.base = base;
    }
}
