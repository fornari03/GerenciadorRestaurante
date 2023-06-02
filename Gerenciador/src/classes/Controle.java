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


    // métodos
    public static void fecharSistema() {
        // a ser desenvolvido
    }

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

    public static double getReceitaDia() {
        return receitaDia;
    }

    public static LocalDateTime getDiaAtual() {
        return diaAtual;
    }

    public static void setDiaAtual(LocalDateTime diaAtual) {
        Controle.diaAtual = diaAtual;
    }

}
