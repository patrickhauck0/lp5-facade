package org.example.facade;

public class Nome extends Validador {

    private static Nome nome = new Nome();

    private Nome() {};

    public static Nome getInstancia() {
        return nome;
    }
}
