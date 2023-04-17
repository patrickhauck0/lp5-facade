package org.example.facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {
    @Test
    void deveRetornarEmailInvalido() {
        Usuario usuario = new Usuario();
        Email.getInstancia().addLoginInvalido(usuario);

        assertEquals(false, usuario.validar());
    }

    @Test
    void deveRetornarNomeInvalido() {
        Usuario usuario = new Usuario();
        Nome.getInstancia().addLoginInvalido(usuario);

        assertEquals(false, usuario.validar());
    }

    @Test
    void deveRetornarSenhaInvalido() {
        Usuario usuario = new Usuario();
        Senha.getInstancia().addLoginInvalido(usuario);

        assertEquals(false, usuario.validar());
    }

    @Test
    void deveRetornarUsuarioValido() {
        Usuario usuario = new Usuario();

        assertEquals(true, usuario.validar());
    }
}