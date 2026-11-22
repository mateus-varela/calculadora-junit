package br.puc.ads;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

    private Calculadora calc;

    @BeforeEach
    void setUp() {
        calc = new Calculadora();
    }

    @Test
    void somarPositivos() {
        assertEquals(5.0, calc.somar(2, 3));
    }

    @Test
    void somarNegativos() {
        assertEquals(-5.0, calc.somar(-2, -3));
    }

    @Test
    void somarComZero() {
        assertEquals(4.0, calc.somar(4, 0));
        assertEquals(0.0, calc.somar(0, 0));
    }

    @Test
    void subtrairPositivos() {
        assertEquals(1.0, calc.subtrair(4, 3));
    }

    @Test
    void subtrairNegativos() {
        assertEquals(1.0, calc.subtrair(-2, -3));
    }

    @Test
    void subtrairComZero() {
        assertEquals(7.0, calc.subtrair(7, 0));
        assertEquals(-7.0, calc.subtrair(0, 7));
    }
}
