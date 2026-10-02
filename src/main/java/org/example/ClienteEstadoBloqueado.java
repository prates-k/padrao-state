package org.example;

public class ClienteEstadoBloqueado extends ClienteEstado {

    private ClienteEstadoBloqueado() {};
    private static ClienteEstadoBloqueado instance = new ClienteEstadoBloqueado();
    public static ClienteEstadoBloqueado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Bloqueado";
    }
}
