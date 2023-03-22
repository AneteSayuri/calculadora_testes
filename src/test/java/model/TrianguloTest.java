package model;

import org.junit.Assert;
import org.junit.Test;

public class TrianguloTest {
    @Test
    public void deveCriarTriangulo(){
        //Given: Um novo Triangulo
        Triangulo triangulo = new Triangulo();

        //Then: Deve criar um objeto não vazio
        Assert.assertNotNull(triangulo);
    }
}
