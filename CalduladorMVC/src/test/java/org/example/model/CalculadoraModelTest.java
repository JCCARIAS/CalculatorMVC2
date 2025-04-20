package org.example.model;




import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraModelTest {
    private CalculadoraModel model = new CalculadoraModel();

    @Test
    public void testSumar() {
        assertEquals(5.0, model.sumar(2.0, 3.0), 0.001);
    }

    @Test
    public void testRestar() {
        assertEquals(1.0, model.restar(3.0, 2.0), 0.001);
    }

    @Test
    public void testMultiplicar() {
        assertEquals(6.0, model.multiplicar(2.0, 3.0), 0.001);
    }

    @Test
    public void testDividir() {
        assertEquals(2.0, model.dividir(6.0, 3.0), 0.001);
    }

    @Test
    public void testDividirPorCero() {
        assertThrows(ArithmeticException.class, () -> {
            model.dividir(5.0, 0.0);
        });
    }
}