package br.puc.ads;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

    @Test
    void multiplicarPositivos() {
        assertEquals(12.0, calc.multiplicar(3, 4));
    }

    @Test
    void multiplicarNegativos() {
        assertEquals(12.0, calc.multiplicar(-3, -4));
        assertEquals(-12.0, calc.multiplicar(-3, 4));
    }

    @Test
    void multiplicarPorZero() {
        assertEquals(0.0, calc.multiplicar(5, 0));
    }

    @Test
    void dividirPositivos() {
        assertEquals(2.5, calc.dividir(5, 2));
    }

    @Test
    void dividirNegativos() {
        assertEquals(2.0, calc.dividir(-6, -3));
        assertEquals(-2.0, calc.dividir(6, -3));
    }

    @Test
    void dividirZeroPorNumero() {
        assertEquals(0.0, calc.dividir(0, 5));
    }

    @Test
    void dividirPorZeroLancaExcecao() {
        ArithmeticException e = assertThrows(ArithmeticException.class, () -> calc.dividir(10, 0));
        assertEquals("Divisao por zero nao e permitida", e.getMessage());
    }
}
