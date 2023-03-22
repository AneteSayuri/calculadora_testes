package model;

import org.junit.Assert;
import org.junit.Test;

public class QuadradoTest {
    @Test
    public void deveCriarQuadrado(){
        //Given: Um novo Quadrado
        Quadrado quadrado = new Quadrado();

        //Then: Deve criar um objeto não vazio
        Assert.assertNotNull(quadrado);
    }
}
