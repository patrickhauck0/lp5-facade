package org.example.facade;

public class UsuarioFacade {
    public static boolean verificarParametrosLogin(Usuario usuario) {
        if (Nome.getInstancia().verificarLoginInvalido(usuario)) {
            return false;
        }
        if (Email.getInstancia().verificarLoginInvalido(usuario)) {
            return false;
        }
        if (Senha.getInstancia().verificarLoginInvalido(usuario)) {
            return false;
        }
        return true;
    }
}
