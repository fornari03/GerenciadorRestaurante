package classes;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Comanda {
    // atributos
    private int idComanda;
    private double valorTotal;
    private LocalDateTime horaPedido;
    private boolean delivery;
    private boolean finalizada;
    private Cliente cliente;
    private Mesa mesa;
    private ArrayList<ItemPedido> itens;

    // metodos
    public Comanda(Mesa mesa) {
        this.mesa = mesa;
    }

    public Comanda() {
        // se não tiver uma mesa, é delivery
        delivery = true;
    }

    public void addItemPedido(ItemPedido item) {
        itens.add(item);
    }

    public void fecharComanda() {
        calculaValorTotal(); // calcula o valor da comanda
        aplicarDesconto(); // chama o aplicar desconto para ver se o cliente tem direito a desconto
        finalizada = true; // finaliza a comanda
        Controle.addReceitaDia(valorTotal);
        Controle.addQuantidadePedidosDia();

    }

    public double aplicarDesconto() {
        // de 5 em 5 pedidos do cliente, ele recebe um desconto de 50% no valor do atual pedido
        if (cliente.getQuantidadePedidos()%5 == 0) {
            valorTotal *= 0.5;
            return valorTotal;
        }
        return 0;
    }

    public void addBrinde() {
        // se for aniversario do cliente, adiciona-se um brownie gratuito na comanda
        if (cliente.ganharBrinde()) {
            //ItemPedido brinde = new ItemPedido(brownieFREE, 1);
            //itens.add(brinde);
        }
    }

    public void calculaValorTotal() {
        // quando o pedido for finalizado, chama-se este método para calcular o valor total da comanda
        for (ItemPedido item : itens) {
            valorTotal += item.getValorConjunto();
        }
    }

    // metodos getters e setters

    public int getIdComanda() {
        return idComanda;
    }

    public void setIdComanda(int idComanda) {
        if (!finalizada) // só é permitido alterar algo da comanda se ela ainda estiver aberta
            this.idComanda = idComanda;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        if (!finalizada) // só é permitido alterar algo da comanda se ela ainda estiver aberta
            this.valorTotal = valorTotal;
    }

    public LocalDateTime getHoraPedido() {
        return horaPedido;
    }

    public void setHoraPedido(LocalDateTime horaPedido) {
        if (!finalizada) // só é permitido alterar algo da comanda se ela ainda estiver aberta
            this.horaPedido = horaPedido;
    }

    public boolean isDelivery() {
        return delivery;
    }

    public void setDelivery(boolean delivery) {
        if (!finalizada) // só é permitido alterar algo da comanda se ela ainda estiver aberta
            this.delivery = delivery;
    }

    public boolean isFinalizada() {
        return finalizada;
    }
    
    public void setFinalizada(boolean finalizada) {
        this.finalizada = finalizada;
    }
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        if (!finalizada) // só é permitido alterar algo da comanda se ela ainda estiver aberta
            this.cliente = cliente;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        if (!finalizada) {// só é permitido alterar algo da comanda se ela ainda estiver aberta
            this.mesa = mesa;
            delivery = false; // se tiver uma mesa, não é delivery
        }
    }

    public ArrayList<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(ArrayList<ItemPedido> itens) {
        if (!finalizada) // só é permitido alterar algo da comanda se ela ainda estiver aberta
            this.itens = itens;
    }

}
