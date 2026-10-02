package org.example;

public class ClienteEstadoConcluido extends ClienteEstado {

    private ClienteEstadoConcluido() {};
    private static ClienteEstadoConcluido instance = new ClienteEstadoConcluido();
    public static ClienteEstadoConcluido getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Concluido";
    }
}
