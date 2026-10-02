package org.example;

public class ClienteEstadoInadimplente extends ClienteEstado {

    private ClienteEstadoInadimplente() {};
    private static ClienteEstadoInadimplente instance = new ClienteEstadoInadimplente();
    public static ClienteEstadoInadimplente getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Inadimplente";
    }

    public boolean bloquear(Cliente cliente) {
        cliente.setEstado(ClienteEstadoBloqueado.getInstance());
        return true;
    }
}