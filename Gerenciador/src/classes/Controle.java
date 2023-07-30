package classes;

import java.util.ArrayList;

/**
 * Classe abstrata para armazenar informações gerais do programa, onde serão contidos seus atributos e métodos
 */
public abstract class Controle {
    // atributos
    /** Atributo para a quantidade de pedidos do dia */
    private static int quantidadePedidosDia;
    
    /** Atributo para a receita do dia */
    private static double receitaDia;

    /** Atributo para armazenas uma lista das mesas */
    public static ArrayList<Mesa> mesas;
    
    /** Atributo para armazenas uma lista dos funcionários */
    public static ArrayList<Funcionario> funcionarios;
    
    /** Atributo para armazenar uma lista dos clientes */
    public static ArrayList<Cliente> clientes;
    
    /** Atributo para armazenar uma lista das comandas */
    public static ArrayList<Comanda> comandas;
    
    /** Atributo para armazenar uma lista dos produtos (cardápio) */
    public static ArrayList<Produto> cardapio;
    
    /** Atributo para armazenar o valor do atual número de id de produtos */
    private static int idNumCount;


    // métodos
    
    /**
     * Método para incrementar a quantidade de pedidos do dia
     */
    public static void addQuantidadePedidosDia() {
        Controle.quantidadePedidosDia++ ;
    }

    /**
     * Método para adicionar à receita do dia o valor indicado
     * @param valor Valor indicado para ser adicionado à receita do dia
     */
    public static void addReceitaDia(double valor) {
        Controle.receitaDia += valor;
    }
    
    /**
     * Método para incrementar o contador do id de produto e retorná-lo
     * @return Retorna o id de produto incrementado
     */
    public static int addIdNumCount() {
        return ++Controle.idNumCount;
    }
    
    
    // metodos getters e setters
    
    /**
     * Método getter para a quantidade de pedidos do dia
     * @return Retorna a quantidade de pedidos do dia
     */
    public static int getQuantidadePedidosDia() {
        return quantidadePedidosDia;
    }

    /**
     * Método setter para a quantidade de pedidos do dia
     * @param quantidadePedidosDia Novo valor para o atributo quantidadePedidosDia
     */
    public static void setQuantidadePedidosDia(int quantidadePedidosDia) {
        Controle.quantidadePedidosDia = quantidadePedidosDia;
    }
    
    /**
     * Método getter para a receita do dia
     * @return Retorna a receita do dia
     */
    public static double getReceitaDia() {
        return receitaDia;
    }

    /**
     * Método setter para a receita do dia
     * @param receitaDia Novo valor para o atributo receitaDia
     */
    public static void setReceitaDia(double receitaDia) {
        Controle.receitaDia = receitaDia;
    }

    /**
     * Método getter para o contador do id de produto
     * @return Retorna o maior id de produto atual
     */
    public static int getIdNumCount() {
        return idNumCount;
    }

    /**
     * Método setter para o contador do id de produto
     * @param idNumCount Novo valor para o atributo idNumCount
     */
    public static void setIdNumCount(int idNumCount) {
        Controle.idNumCount = idNumCount;
    }
    
    

}
