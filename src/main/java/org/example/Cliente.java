package org.example;

public class Cliente {

    private String nome;
    private ClienteEstado estado;

    public Cliente() {
        this.estado = ClienteEstadoAtivo.getInstance();
    }

    public void setEstado(ClienteEstado estado) {
        this.estado = estado;
    }

    public boolean ativar() {
        return estado.ativar(this);
    }

    public boolean concluir() {
        return estado.concluir(this);
    }

    public boolean suspender() {
        return estado.suspender(this);
    }

    public boolean bloquear() {
        return estado.bloquear(this);
    }

    public boolean tornarInadimplente() {
        return estado.tornarInadimplente(this);
    }

    public boolean transferir() {
        return estado.transferir(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ClienteEstado getEstado() {
        return estado;
    }
}
