package org.example;

public abstract class ClienteEstado {

    public abstract String getEstado();

    public boolean ativar(Cliente cliente) {
        return false;
    }

    public boolean concluir(Cliente cliente) {
        return false;
    }

    public boolean suspender(Cliente cliente) {
        return false;
    }

    public boolean bloquear(Cliente cliente) {
        return false;
    }

    public boolean tornarInadimplente(Cliente cliente) {
        return false;
    }

    public boolean transferir(Cliente cliente) {
        return false;
    }

}