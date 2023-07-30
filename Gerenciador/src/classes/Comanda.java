package classes;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Random;

/**
 * Classe para objetos do tipo Comanda, onde serão contidos seus atributos e métodos
 */
public class Comanda {
    // atributos
    
    /** Atributo para o ID único da comanda */
    private int idComanda;
    
    /** Atributo para o valor total da comanda no estado atual */
    private double valorTotal = 0;
    
    /** Atributo para a hora do pedido */
    private LocalDateTime horaPedido;
    
    /** Atributo para mostrar se é delivery ou no salão */
    private boolean delivery;
    
    /** Atributo para mostrar se a comanda foi finalizada ou não */
    private boolean finalizada;
    
    /** Atributo para o cliente, caso exista, da comada */
    private Cliente cliente;
    
    /** Atributo para o garcom, caso exista, da comada */
    private Garcom garcom;
    
    /** Atributo para a mesa, caso exista, da comada */
    private Mesa mesa;
    
    /** Atributo para o entregador, caso exista, da comada */
    private Entregador entregador;
    
    /** Atributo para armazenar uma lista de itens pedidos da comada */
    private ArrayList<ItemPedido> itens = new ArrayList();

    // metodos
    
    /**
     * Método construtor da classe para quando o pedido for no salão
     * @param mesa Mesa em que o pedido foi feito
     */
    public Comanda(Mesa mesa) {
        // se tiver mesa, não é delivery
        this.mesa = mesa;
        this.delivery = false;
        this.mesa.setDisponivel(false);
        this.finalizada = false;
        this.horaPedido = LocalDateTime.now();
        geraIdComanda();
        
    }

    /**
     * Método construtor da classe para quando o pedido for delivery
     */
    public Comanda() {
        // se não tiver uma mesa, é delivery
        delivery = true;
        this.finalizada = false;
        this.horaPedido = LocalDateTime.now();
        geraIdComanda();
        
    }
    
    /**
     * Método para gerar automaticamente uma comanda única e aleatória
     */
    public void geraIdComanda() {
        // gera um id automático aleatório
        Random random = new Random();
        boolean presente;
        int id;
        
        while (true) {
            presente = false;
            id = random.nextInt(9999);
            for (Comanda c : Controle.comandas) {
                if (c.getIdComanda() == id) {
                    presente = true;
                    break;
                }
            }
            if (!presente)
                break;
        }
        this.idComanda = id;
    }

    
    /**
     * Método para realizar todas as operações necessárias para se fechar a comanda. 
     * Incrementa a quantidade de pedidos do dia, acresce a receita total, libera a mesa (se tiver), incrementa a quantidade de pedidos do cliente (se tiver),
     * incrementa a quantidade de atendimentos do garçom ou do entregador e incrementa a qunatidade pedida dos Produtos.
     */
    public void fecharComanda() {
        finalizada = true; // finaliza a comanda
        Controle.addReceitaDia(valorTotal);
        Controle.addQuantidadePedidosDia();
        if (this.mesa != null) {
            mesa.liberarMesa();
            mesa.colorirBotao();
        }
        if (cliente != null)
            cliente.realizarPedido();
        
        if (garcom != null)
            garcom.atenderMesa(mesa);
        else
            entregador.addQuantidadeEntregas();
        
        for (ItemPedido item : this.itens) {
            item.getProduto().addQuantPedido(item.getQuantidade());
        }
        // PODE SER QUE FAÇA MUITO MAIS COISA (Garçom++, Produto++...)
    }

    /**
     * Método para se aplicar o desconto de 50%, caso o cliente esteja num pedido múltiplo de 5
     * @return Retorna o valor do desconto
     */
    public double aplicarDesconto() {
        // de 5 em 5 pedidos do cliente, ele recebe um desconto de 50% no valor do atual pedido
        if ((cliente.getQuantidadePedidos()+1)%5 == 0) {
            return valorTotal*0.5;
        }
        return 0;
    }

    /**
     * Método para adicionar o brinde (brownie gratuito), caso seja aniversário do cliente
     * @return Retorna o item pedido com 1 brownie gratuito
     */
    public ItemPedido addBrinde() {
        // se for aniversario do cliente, adiciona-se um brownie gratuito na comanda
        ItemPedido brinde;
        if (cliente.ganharBrinde()) {
            Produto produto = new Produto(0, "FREEBrownie", 0);
            brinde = new ItemPedido(produto, 1);
            return brinde;
        }
        return null;
    }

    /**
     * Método para calcular o valor atual do pedido
     */
    public void calculaValorParcial() {
        // chama-se este método para calcular o valor parcial da comanda
        valorTotal = 0;
        for (ItemPedido item : itens) {
            valorTotal += item.getValorConjunto();
        }
    }

    // metodos getters e setters

    /**
     * Método getter para o id da comanda
     * @return Retorna o id da comanda
     */
    public int getIdComanda() {
        return idComanda;
    }

    /**
     * Método setter para o id da comanda
     * @param idComanda Novo valor para o atributo idComanda
     */
    public void setIdComanda(int idComanda) {
        if (!finalizada) // só é permitido alterar algo da comanda se ela ainda estiver aberta
            this.idComanda = idComanda;
    }

    /**
     * Método getter para o valor total
     * @return Retorna o valor total da comanda
     */
    public double getValorTotal() {
        return valorTotal;
    }

    /**
     * Método setter para o valor total
     * @param valorTotal Novo valor para o atributo valorTotal
     */
    public void setValorTotal(double valorTotal) {
        if (!finalizada) // só é permitido alterar algo da comanda se ela ainda estiver aberta
            this.valorTotal = valorTotal;
    }

    /**
     * Método getter para a hora do pedido
     * @return Retorna a hora do pedido
     */
    public LocalDateTime getHoraPedido() {
        return horaPedido;
    }

    /**
     * Método setter para a hora do pedido
     * @param horaPedido Novo valor para atributo horaPedido
     */
    public void setHoraPedido(LocalDateTime horaPedido) {
        if (!finalizada) // só é permitido alterar algo da comanda se ela ainda estiver aberta
            this.horaPedido = horaPedido;
    }

    /**
     * Método para mostrar se a Comanda é delivery
     * @return Retorna se é delivery ou não
     */
    public boolean isDelivery() {
        return delivery;
    }

    /**
     * Método setter para o atributo delivery
     * @param delivery Novo valor para o atributo delivery
     */
    public void setDelivery(boolean delivery) {
        if (!finalizada) // só é permitido alterar algo da comanda se ela ainda estiver aberta
            this.delivery = delivery;
    }

    /**
     * Método para mostrar se a Comanda foi finalizada
     * @return Retorna se foi finalizada ou não
     */
    public boolean isFinalizada() {
        return finalizada;
    }
    /**
     * Método setter para o atributo finalizada
     * @param finalizada Novo valor para o atributo finalizada
     */
    public void setFinalizada(boolean finalizada) {
        this.finalizada = finalizada;
    }
    
    /**
     * Método getter para o cliente
     * @return Retorna o cliente da Comanda
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Método setter para o cliente
     * @param cliente Novo valor para o atributo cliente
     */
    public void setCliente(Cliente cliente) {
        if (!finalizada) // só é permitido alterar algo da comanda se ela ainda estiver aberta
            this.cliente = cliente;
    }
    
    /**
     * Método getter para o garçom
     * @return Retorna o garçom da Comanda
     */
    public Garcom getGarcom() {
        return garcom;
    }
    
    /**
     * Método setter para o garçom
     * @param garcom Novo valor para o atributo garcom
     */
    public void setGarcom(Garcom garcom) {
        this.garcom = garcom;
    }
    
    /**
     * Método getter para a mesa
     * @return Retorna a mesa da comanda
     */
    public Mesa getMesa() {
        return mesa;
    }

    /**
     * Método setter para a mesa
     * @param mesa Novo valor para o atributo mesa
     */
    public void setMesa(Mesa mesa) {
        if (!finalizada) {// só é permitido alterar algo da comanda se ela ainda estiver aberta
            this.mesa = mesa;
            delivery = false; // se tiver uma mesa, não é delivery
        }
    }

    /**
     * Método getter para o entregador
     * @return Retorna o entregador da Comanda
     */
    public Entregador getEntregador() {
        return entregador;
    }

    /**
     * Método setter para o entregador
     * @param entregador Novo valor para o atributo entregador
     */
    public void setEntregador(Entregador entregador) {
        this.entregador = entregador;
    }

    /**
     * Método getter para a lista de itens pedidos
     * @return Retorna a lista de itens pedidos da comanda
     */
    public ArrayList<ItemPedido> getItens() {
        return itens;
    }

    /**
     * Método setter para a lista de itens pedidos
     * @param itens Novo valor para o atributo itens
     */
    public void setItens(ArrayList<ItemPedido> itens) {
        if (!finalizada) // só é permitido alterar algo da comanda se ela ainda estiver aberta
            this.itens = itens;
    }
    
}
