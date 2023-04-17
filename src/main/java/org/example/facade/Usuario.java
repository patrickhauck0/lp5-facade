package org.example.facade;

import java.text.Normalizer;
public class Usuario {
    public boolean validar() {
        return UsuarioFacade.verificarParametrosLogin(this);
    }
}
