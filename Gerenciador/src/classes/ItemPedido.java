package classes;

public class ItemPedido {
    // atributos
    private String descricao;
    private double valor;

    // metodos
    public ItemPedido(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    // metodos getters e setters
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}
