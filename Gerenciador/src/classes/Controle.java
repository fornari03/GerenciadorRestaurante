package classes;

import java.time.LocalDateTime;
import java.util.ArrayList;

public abstract class Controle {
    // atributos
    private static int quantidadePedidosDia;
    private static double receitaDia;
    private static LocalDateTime diaAtual;
    public static ArrayList<Mesa> mesas;
    public static ArrayList<Funcionario> funcionarios;
    public static ArrayList<Cliente> clientes;
    public static ArrayList<Comanda> comandas;
    public static ArrayList<Produto> cardapio;
    public static Sistema sistema;


    // métodos
    public static void addQuantidadePedidosDia() {
        Controle.quantidadePedidosDia++ ;
    }

    public static void addReceitaDia(double valor) {
        Controle.receitaDia += valor;
    }
    
    
    // metodos getters e setters
    public static int getQuantidadePedidosDia() {
        return quantidadePedidosDia;
    }

    public static void setQuantidadePedidosDia(int quantidadePedidosDia) {
        Controle.quantidadePedidosDia = quantidadePedidosDia;
    }
    
    public static double getReceitaDia() {
        return receitaDia;
    }

    public static void setReceitaDia(double receitaDia) {
        Controle.receitaDia = receitaDia;
    }

    public static LocalDateTime getDiaAtual() {
        return diaAtual;
    }

    public static void setDiaAtual(LocalDateTime diaAtual) {
        Controle.diaAtual = diaAtual;
    }

    public static ArrayList<Mesa> getMesas() {
        return mesas;
    }

    public static void setMesas(ArrayList<Mesa> mesas) {
        Controle.mesas = mesas;
    }

    public static ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public static void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        Controle.funcionarios = funcionarios;
    }

    public static ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public static void setClientes(ArrayList<Cliente> clientes) {
        Controle.clientes = clientes;
    }

    public static ArrayList<Comanda> getComandas() {
        return comandas;
    }

    public static void setComandas(ArrayList<Comanda> comandas) {
        Controle.comandas = comandas;
    }

    public static ArrayList<Produto> getCardapio() {
        return cardapio;
    }

    public static void setCardapio(ArrayList<Produto> cardapio) {
        Controle.cardapio = cardapio;
    }

    public static Sistema getSistema() {
        return sistema;
    }

    public static void setSistema(Sistema sistema) {
        Controle.sistema = sistema;
    }
    
}
