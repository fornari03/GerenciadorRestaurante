package classes;

public class ItemPedido {
    // atributos
    private int quantidade;
    private double valorConjunto;
    private Produto produto;

    // metodos
    public ItemPedido(Produto produto, int quantidade) {
        this.quantidade = quantidade;
        this.produto = produto;
        this.valorConjunto = quantidade*produto.getValor();
    }

    // metodos getters e setters
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorConjunto() {
        return valorConjunto;
    }

    public void setValorConjunto(double valorConjunto) {
        this.valorConjunto = valorConjunto;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    
}
