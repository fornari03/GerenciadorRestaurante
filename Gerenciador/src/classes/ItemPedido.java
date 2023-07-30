package classes;

/**
 * Classe para objetos do tipo ItemPedido,onde serão contidos seus atributos e métodos
 */
public class ItemPedido {
    // atributos
    
    /** Atributo para a quantidade de um certo Produto no ItemPedido */
    private int quantidade;
    
    /** Atributo para o valor (preço) conjunto do ItemPedido, a partir da quantidade do Produto e do valor individual deste */
    private double valorConjunto;
    
    /** Atributo para o produto do ItemPedido */
    private Produto produto;

    // metodos
    
    /**
     * Método construtor da classe
     * @param produto
     * @param quantidade 
     */
    public ItemPedido(Produto produto, int quantidade) {
        this.quantidade = quantidade;
        this.produto = produto;
        this.valorConjunto = quantidade*produto.getValor();
    }

    // metodos getters e setters
    
    /**
     * Método getter para a quantidade pedida do produto
     * @return Retorna a quantidade do produto
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * Método setter para a quantidade pedida do produto
     * @param quantidade Novo valor do atributo de quantidade
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * Método getter para o valor conjunto
     * @return Retorna o valor conjunto dos produtos
     */
    public double getValorConjunto() {
        return valorConjunto;
    }

    /**
     * Método setter para o valor conjunto
     * @param valorConjunto Novo valor para o atributo valorConjunto
     */
    public void setValorConjunto(double valorConjunto) {
        this.valorConjunto = valorConjunto;
    }

    /**
     * Método getter para o produto
     * @return Retorna o produto
     */
    public Produto getProduto() {
        return produto;
    }

    /**
     * Método setter para o produto
     * @param produto Novo valor para o atributo produto
     */
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    
}
