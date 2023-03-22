package model;

import java.util.Objects;

public class Triangulo {
    private double base;
    private double altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangulo)) return false;
        Triangulo triangulo = (Triangulo) o;
        return Double.compare(triangulo.base, base) == 0 && Double.compare(triangulo.altura, altura) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(base, altura);
    }
}
