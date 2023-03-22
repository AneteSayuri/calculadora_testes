package model;

import java.util.Objects;

public class Quadrado {
    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Quadrado)) return false;
        Quadrado quadrado = (Quadrado) o;
        return Double.compare(quadrado.lado, lado) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lado);
    }
}
