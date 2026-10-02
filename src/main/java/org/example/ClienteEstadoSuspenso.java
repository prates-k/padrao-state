package org.example;

public class ClienteEstadoSuspenso extends ClienteEstado {

    private ClienteEstadoSuspenso() {};
    private static ClienteEstadoSuspenso instance = new ClienteEstadoSuspenso();
    public static ClienteEstadoSuspenso getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Suspenso";
    }

    public boolean ativar(Cliente cliente) {
        cliente.setEstado(ClienteEstadoAtivo.getInstance());
        return true;
    }

    public boolean bloquear(Cliente cliente) {
        cliente.setEstado(ClienteEstadoBloqueado.getInstance());
        return true;
    }

    public boolean tornarInadimplente(Cliente cliente) {
        cliente.setEstado(ClienteEstadoInadimplente.getInstance());
        return true;
    }
}