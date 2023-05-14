package classes;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Comanda {
    // atributos
    private double valorTotal;
    private LocalDateTime horaPedido;
    private boolean delivery;
    private ArrayList<ItemPedido> itens;

    // metodos
    public Comanda(Mesa mesa) {
        // a ser desnvolvido
    }

    public void addItemPedido(ItemPedido item) {
        itens.add(item);
    }

    public void fecharComanda() {
        // a ser desenvolvido
    }

    public double aplicarDesconto() {
        // a ser desenvolvido
        return 0;
    }

    public void addBrinde() {
        // a ser desenvolvido
    }

    // metodos getters e setters

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public LocalDateTime getHoraPedido() {
        return horaPedido;
    }

    public void setHoraPedido(LocalDateTime horaPedido) {
        this.horaPedido = horaPedido;
    }

    public boolean isDelivery() {
        return delivery;
    }

    public void setDelivery(boolean delivery) {
        this.delivery = delivery;
    }

    public ArrayList<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(ArrayList<ItemPedido> itens) {
        this.itens = itens;
    }

}
