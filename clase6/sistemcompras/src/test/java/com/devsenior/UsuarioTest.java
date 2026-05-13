package com.devsenior;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class UsuarioTest {
    private static final Logger LOG = Logger.getLogger(UsuarioTest.class.getName());

    @Test
    void testLogin() {
        LOG.info("Iniciando prueba de login con credenciales correctas");
        Usuario usuario1 = new Usuario("DanielaG@gmail.com", "12345");

        boolean loginExitoso = usuario1.login("12345");
        assertTrue(loginExitoso);
        assertTrue(usuario1.isAuthenticated());
        LOG.info("Finalizando prueba de login con credenciales correctas");
    }

    @Test
    void testLoginFallido() {
        LOG.info("Iniciando prueba de login con credenciales incorrectas");
        Usuario usuario1 = new Usuario("DanielaG@gmail.com", "12345");

        boolean estadoLogin = usuario1.login("1234");
        assertFalse(estadoLogin);
        assertFalse(usuario1.isAuthenticated());
        LOG.info("Finalizando prueba de login con credenciales incorrectas");
    }
}
