package service;

import model.Quadrado;
import model.Triangulo;

public class CalculadoraService {

    public double somar(double a, double b) {
        return a + b;
    }

    public double subtrair(double a, double b) {
        return a - b;
    }

    public double dividir(double a, double b) {
        return a / b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double areaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    public double areaQuadrado(double lado) {
        return lado * lado;
    }

    public Triangulo trianguloDeMenorArea(Triangulo triangulo1, Triangulo triangulo2) {
        double areaTriangulo1 = areaTriangulo(triangulo1.getBase(), triangulo1.getAltura());
        double areaTriangulo2 = areaTriangulo(triangulo2.getBase(), triangulo2.getAltura());
        if (areaTriangulo1 < areaTriangulo2) {
            return triangulo1;
        } else if (areaTriangulo2 < areaTriangulo1) {
            return triangulo2;
        } else {
            return null;
        }
    }

    public Quadrado quadradoDeMenorArea(Quadrado quadrado1, Quadrado quadrado2) {
        double areaQuadrado1 = areaQuadrado(quadrado1.getLado());
        double areaQuadrado2 = areaQuadrado(quadrado2.getLado());
        if (areaQuadrado1 < areaQuadrado2) {
            return quadrado1;
        } else if (areaQuadrado2 < areaQuadrado1) {
            return quadrado2;
        } else {
            return null;
        }
    }

}
