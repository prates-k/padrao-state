package org.example;

public class ClienteEstadoAtivo extends ClienteEstado {

    private ClienteEstadoAtivo() {};
    private static ClienteEstadoAtivo instance = new ClienteEstadoAtivo();
    public static ClienteEstadoAtivo getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Ativo";
    }

    public boolean concluir(Cliente cliente) {
        cliente.setEstado(ClienteEstadoConcluido.getInstance());
        return true;
    }

    public boolean suspender(Cliente cliente) {
        cliente.setEstado(ClienteEstadoSuspenso.getInstance());
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

    public boolean transferir(Cliente cliente) {
        cliente.setEstado(ClienteEstadoTransferido.getInstance());
        return true;
    }
}