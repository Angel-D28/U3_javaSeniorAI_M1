package com.devsenior;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.logging.Logger;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    private static final Logger LOG = Logger.getLogger(CalculadoraTest.class.getName());

    @BeforeEach
    public void setUp(){
        //arrange: preparar el escenario de prueba
    }
    @Test
    void testDividir() {
        LOG.info("Inicio de Test metodo dividir");
        Calculadora calc = new Calculadora();
        int resultado = calc.dividir(5, 5);
        assertEquals(1, resultado, "el resultado esperado es: "+resultado);
        LOG.info("Fin de test del metodo dividir");

    }

    @Test
    void testDividirpor0(){
        LOG.info("Inicio de Test metodo division por cero");
        Calculadora calc = new Calculadora();

        Exception excepcion = assertThrows(IllegalArgumentException.class, () -> calc.dividir(10, 0));
        assertEquals("Math Error", excepcion.getMessage());
        LOG.info("Fin de Test metodo division por cero");

    }

    @Test
    void testSumar(){
        Calculadora calculadora = new Calculadora();
        //act: ejecutar la accion a probar
        int resultado = calculadora.sumar(20, 30);
        //assert: verificar el resultado esperado
        assertEquals(50, resultado);
    }
}
