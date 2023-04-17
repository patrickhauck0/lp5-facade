package org.example.facade;

import java.util.ArrayList;
import java.util.List;

public abstract class Validador {
    private List<Usuario> loginInvalido = new ArrayList<Usuario>();

    public void addLoginInvalido(Usuario usuario) {
        this.loginInvalido.add(usuario);
    }

    public boolean verificarLoginInvalido(Usuario usuario) {
        return this.loginInvalido.contains(usuario);
    }
}
