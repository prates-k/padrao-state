package org.exemple;

import org.example.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {

    Cliente cliente;

    @BeforeEach
    public void setUp() {
        cliente = new Cliente();
    }

    // Cliente ativo

    @Test
    public void naoDeveAtivarClienteAtivo() {
        cliente.setEstado(ClienteEstadoAtivo.getInstance());
        assertFalse(cliente.ativar());
    }

    @Test
    public void deveConcluirClienteAtivo() {
        cliente.setEstado(ClienteEstadoAtivo.getInstance());
        assertTrue(cliente.concluir());
        Assertions.assertEquals(ClienteEstadoConcluido.getInstance(), cliente.getEstado());
    }

    @Test
    public void deveSuspenderClienteAtivo() {
        cliente.setEstado(ClienteEstadoAtivo.getInstance());
        assertTrue(cliente.suspender());
        Assertions.assertEquals(ClienteEstadoSuspenso.getInstance(), cliente.getEstado());
    }

    @Test
    public void deveBloquearClienteAtivo() {
        cliente.setEstado(ClienteEstadoAtivo.getInstance());
        assertTrue(cliente.bloquear());
        Assertions.assertEquals(ClienteEstadoBloqueado.getInstance(), cliente.getEstado());
    }

    @Test
    public void deveTornarInadimplenteClienteAtivo() {
        cliente.setEstado(ClienteEstadoAtivo.getInstance());
        assertTrue(cliente.tornarInadimplente());
        assertEquals(ClienteEstadoInadimplente.getInstance(), cliente.getEstado());
    }

    @Test
    public void deveTransferirClienteAtivo() {
        cliente.setEstado(ClienteEstadoAtivo.getInstance());
        assertTrue(cliente.transferir());
        assertEquals(ClienteEstadoTransferido.getInstance(), cliente.getEstado());
    }

    // Cliente suspenso

    @Test
    public void deveAtivarClienteSuspenso() {
        cliente.setEstado(ClienteEstadoSuspenso.getInstance());
        assertTrue(cliente.ativar());
        assertEquals(ClienteEstadoAtivo.getInstance(), cliente.getEstado());
    }

    @Test
    public void naoDeveConcluirClienteSuspenso() {
        cliente.setEstado(ClienteEstadoSuspenso.getInstance());
        assertFalse(cliente.concluir());
    }

    @Test
    public void naoDeveSuspenderClienteSuspenso() {
        cliente.setEstado(ClienteEstadoSuspenso.getInstance());
        assertFalse(cliente.suspender());
    }

    @Test
    public void deveBloquearClienteSuspenso() {
        cliente.setEstado(ClienteEstadoSuspenso.getInstance());
        assertTrue(cliente.bloquear());
        assertEquals(ClienteEstadoBloqueado.getInstance(), cliente.getEstado());
    }

    @Test
    public void deveTornarInadimplenteClienteSuspenso() {
        cliente.setEstado(ClienteEstadoSuspenso.getInstance());
        assertTrue(cliente.tornarInadimplente());
        assertEquals(ClienteEstadoInadimplente.getInstance(), cliente.getEstado());
    }

    @Test
    public void naoDeveTransferirClienteSuspenso() {
        cliente.setEstado(ClienteEstadoSuspenso.getInstance());
        assertFalse(cliente.transferir());
    }

    // Cliente concluido

    @Test
    public void naoDeveAtivarClienteConcluido() {
        cliente.setEstado(ClienteEstadoConcluido.getInstance());
        assertFalse(cliente.ativar());
    }

    @Test
    public void naoDeveConcluirClienteConcluido() {
        cliente.setEstado(ClienteEstadoConcluido.getInstance());
        assertFalse(cliente.concluir());
    }

    @Test
    public void naoDeveSuspenderClienteConcluido() {
        cliente.setEstado(ClienteEstadoConcluido.getInstance());
        assertFalse(cliente.suspender());
    }

    @Test
    public void naoDeveBloquearClienteConcluido() {
        cliente.setEstado(ClienteEstadoConcluido.getInstance());
        assertFalse(cliente.bloquear());
    }

    @Test
    public void naoDeveTornarInadimplenteClienteConcluido() {
        cliente.setEstado(ClienteEstadoConcluido.getInstance());
        assertFalse(cliente.tornarInadimplente());
    }

    @Test
    public void naoDeveTransferirClienteConcluido() {
        cliente.setEstado(ClienteEstadoConcluido.getInstance());
        assertFalse(cliente.transferir());
    }

    // Cliente bloqueado

    @Test
    public void naoDeveAtivarClienteBloqueado() {
        cliente.setEstado(ClienteEstadoBloqueado.getInstance());
        assertFalse(cliente.ativar());
    }

    @Test
    public void naoDeveConcluirClienteBloqueado() {
        cliente.setEstado(ClienteEstadoBloqueado.getInstance());
        assertFalse(cliente.concluir());
    }

    @Test
    public void naoDeveSuspenderClienteBloqueado() {
        cliente.setEstado(ClienteEstadoBloqueado.getInstance());
        assertFalse(cliente.suspender());
    }

    @Test
    public void naoDeveBloquearClienteBloqueado() {
        cliente.setEstado(ClienteEstadoBloqueado.getInstance());
        assertFalse(cliente.bloquear());
    }

    @Test
    public void naoDeveTornarInadimplenteClienteBloqueado() {
        cliente.setEstado(ClienteEstadoBloqueado.getInstance());
        assertFalse(cliente.tornarInadimplente());
    }

    @Test
    public void naoDeveTransferirClienteBloqueado() {
        cliente.setEstado(ClienteEstadoBloqueado.getInstance());
        assertFalse(cliente.transferir());
    }

    // Cliente inadimplente

    @Test
    public void naoDeveAtivarClienteInadimplente() {
        cliente.setEstado(ClienteEstadoInadimplente.getInstance());
        assertFalse(cliente.ativar());
    }

    @Test
    public void naoDeveConcluirClienteInadimplente() {
        cliente.setEstado(ClienteEstadoInadimplente.getInstance());
        assertFalse(cliente.concluir());
    }

    @Test
    public void naoDeveSuspenderClienteInadimplente() {
        cliente.setEstado(ClienteEstadoInadimplente.getInstance());
        assertFalse(cliente.suspender());
    }

    @Test
    public void deveBloquearClienteInadimplente() {
        cliente.setEstado(ClienteEstadoInadimplente.getInstance());
        assertTrue(cliente.bloquear());
        assertEquals(ClienteEstadoBloqueado.getInstance(), cliente.getEstado());
    }

    @Test
    public void naoDeveTornarInadimplenteClienteInadimplente() {
        cliente.setEstado(ClienteEstadoInadimplente.getInstance());
        assertFalse(cliente.tornarInadimplente());
    }

    @Test
    public void naoDeveTransferirClienteInadimplente() {
        cliente.setEstado(ClienteEstadoInadimplente.getInstance());
        assertFalse(cliente.transferir());
    }

    // Cliente transferido

    @Test
    public void naoDeveAtivarClienteTransferido() {
        cliente.setEstado(ClienteEstadoTransferido.getInstance());
        assertFalse(cliente.ativar());
    }

    @Test
    public void naoDeveConcluirClienteTransferido() {
        cliente.setEstado(ClienteEstadoTransferido.getInstance());
        assertFalse(cliente.concluir());
    }

    @Test
    public void naoDeveSuspenderClienteTransferido() {
        cliente.setEstado(ClienteEstadoTransferido.getInstance());
        assertFalse(cliente.suspender());
    }

    @Test
    public void naoDeveBloquearClienteTransferido() {
        cliente.setEstado(ClienteEstadoTransferido.getInstance());
        assertFalse(cliente.bloquear());
    }

    @Test
    public void naoDeveTornarInadimplenteClienteTransferido() {
        cliente.setEstado(ClienteEstadoTransferido.getInstance());
        assertFalse(cliente.tornarInadimplente());
    }

    @Test
    public void naoDeveTransferirClienteTransferido() {
        cliente.setEstado(ClienteEstadoTransferido.getInstance());
        assertFalse(cliente.transferir());
    }
}