package service;

import model.Quadrado;
import model.Triangulo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraServiceTest {
    CalculadoraService calculadoraService;

    @Before
    public void before() {
        calculadoraService = new CalculadoraService();
    }

    @Test
    public void doisQuadradosComMesmoTamanhoSaoIguaisMasComDiferentesEnderecosDeMemoria() {
        // Given: Dois Quadrados
        Quadrado quadrado1 = new Quadrado();
        Quadrado quadrado2 = new Quadrado();

        // When: Possuem mesmo tamanho
        quadrado1.setLado(5);
        quadrado2.setLado(5);

        // Then:
        // São Quadrados Iguais
        Assert.assertEquals(quadrado1, quadrado2);
        // Mas com Diferentes endereços de memória
        Assert.assertNotSame(quadrado1, quadrado2);

    }

    @Test
    public void umQuadradoIgualOutroSaoIguais() {
        // Given: Um Quadrado
        Quadrado quadrado1 = new Quadrado();
        quadrado1.setLado(5);

        // When: Novo Quadrado Igual Quadrado Anterior
        Quadrado quadrado2 = quadrado1;

        // Then: São iguais pelo endereço de memória
        Assert.assertSame(quadrado1, quadrado2);
    }

    @Test
    public void triangulosComAlturasDiferentesPossuemAreasDiferentes() {
        // Given: Dois Triangulos
        Triangulo triangulo1 = new Triangulo();
        Triangulo triangulo2 = new Triangulo();

        // When: Possuem Alturas Diferentes
        triangulo1.setBase(5);
        triangulo2.setBase(5);
        triangulo1.setAltura(10);
        triangulo2.setAltura(20);

        // Then: Possuem Áreas Diferentes
        double area1 = calculadoraService.areaTriangulo(triangulo1.getBase(), triangulo1.getAltura());
        double area2 = calculadoraService.areaTriangulo(triangulo2.getBase(), triangulo2.getAltura());
        Assert.assertNotEquals(area1, area2);
    }

    @Test
    public void triangulosComMesmaAreaRetornaNull() {
        // Given: Dois Triangulos
        Triangulo triangulo1 = new Triangulo();
        Triangulo triangulo2;

        // When: Triangulos com mesma Área
        triangulo1.setBase(5);
        triangulo1.setAltura(10);
        triangulo2 = triangulo1;

        // Then: Função Menor Area retorna Null
        Triangulo triangulo = calculadoraService.trianguloDeMenorArea(triangulo1, triangulo2);
        Assert.assertNull(triangulo);
    }

    @Test
    public void quadradosComAreasDiferentesRetornaUmQuadradoNaoVazio() {
        // Given: Dois Quadrados
        Quadrado quadrado1 = new Quadrado();
        Quadrado quadrado2 = new Quadrado();

        // When: Quadrados com Áreas Diferentes
        quadrado1.setLado(5);
        quadrado2.setLado(10);

        // Then: Função Menor Area retorna Objeto Não Vazio
        Quadrado quadrado = calculadoraService.quadradoDeMenorArea(quadrado1, quadrado2);
        Assert.assertNotNull(quadrado);
    }

    @Test
    public void dividirPorDoisEIgualMultiplicarPorMeio() {
        // Given:
        // Um numero dividido por 2
        double numero1 = calculadoraService.dividir(1, 2);
        // Um numero mulptiplicado por Meio
        double numero2 = calculadoraService.multiplicar(1, 0.5);

        // When:

        // Then: Os resultados são iguais
        Assert.assertTrue(numero1 == numero2);
    }

    @Test
    public void somarEReduzirOMesmoNumeroNaoMudaOValorInicial() {
        // Given:
        // Um numero inicial
        double numeroInicial = 10;
        // Um Numero que será Somado e Subtraído
        double variacao = 5;

        // When:
        // Somar e Subtrair o mesmo numero do valor inicial
        double numeroFinal = calculadoraService.somar(numeroInicial, variacao);
        numeroFinal = calculadoraService.subtrair(numeroFinal, variacao);

        // Then: O Valor Inicial é Igual ao valor Final
        Assert.assertFalse(numeroInicial != numeroFinal);
    }

}
