package org.example.facade;

public class Senha extends Validador {
    private static Senha senha = new Senha();

    private Senha() {};

    public static Senha getInstancia() {
        return senha;
    }
}
