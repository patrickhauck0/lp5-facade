package org.example.facade;

public class Email extends Validador {
    private static Email email = new Email();

    private Email() {};

    public static Email getInstancia() {
        return email;
    }
}
