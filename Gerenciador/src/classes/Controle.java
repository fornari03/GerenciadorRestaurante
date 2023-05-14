package classes;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Controle {
    // atributos
    private int quantidadePedidosDia;
    private double receitaDia;
    private LocalDateTime diaAtual;
    private ArrayList<Mesa> mesas;
    private ArrayList<Cliente> clientes;
    private ArrayList<Gerente> gerentes;
    private ArrayList<Garcom> garcons;
    private ArrayList<Entregador> entregadores;


    // métodos
    public void fecharSistema() {
        // a ser desenvolvido
    }

    public void registrarGerente(Gerente gerente, int senha) {
        // a ser desenvolvido
    }

    public void retirarGerente(Gerente gerente, int senha) {
        // a ser desenvolvido
    }

    public void registrarGarcom(Garcom garcom, int senha) {
        // a ser desenvolvido
    }

    public void retirarGarcom(Garcom garcom, int senha) {
        // a ser desenvolvido
    }

    public void cadastrarCliente(Cliente cliente) {
        // a ser desenvolvido
    }

    public void addQuantidadePedidosDia() {
        this.quantidadePedidosDia++ ;
    }

    public void addReceitaDia() {
        // a ser desenvolvido
    }

    // metodos getters e setters
    
    public int getQuantidadePedidosDia() {
        return quantidadePedidosDia;
    }

    public double getReceitaDia() {
        return receitaDia;
    }

    public LocalDateTime getDiaAtual() {
        return diaAtual;
    }

    public void setDiaAtual(LocalDateTime diaAtual) {
        this.diaAtual = diaAtual;
    }

}
