package classes;

/**
 * Classe para objetos do tipo Produto, onde serão contidos seus atributos e métodos
 */
public class Produto {
    // atributos
    
    /** Atributo com valor de código único de objeto para objeto */
    private int codigo;
    
    /** Atributo para o nome do Produto */
    private String nome;
    
    /** Atributo para o valor (preço) do Produto em questão */
    private double valor;
    
    /** Atributo para armazenar quantas vezes o produto já foi pedido no dia */
    private int quantPedido;

    // metodos
    
    /**
     * Método construtor da classe
     * @param codigo Código único para identificação do Produto
     * @param nome Nome do Produto
     * @param valor Valor (preço) do Produto
     */
    public Produto(int codigo, String nome, double valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
        this.quantPedido = 0;
    }
    
    /**
     * Método para procurar o prato mais vendido entre todos no dia
     * @return Retorna o Produto mais vendido no dia (apenas um)
     */
    public static Produto procuraPratoMaisVendido() {
        Produto maisVendido = new Produto(-1, "Nenhum", -1); 
        // criado apenas para a primeira iteração do loop e para o caso de não haver prato mais vendido
        maisVendido.setQuantPedido(-1); 
        // seta a quantidade como -1 para ser menor que a quantidade de qualquer outro produto
        
        for (Produto produto : Controle.cardapio) {
            if (produto.getQuantPedido() > maisVendido.getQuantPedido())
                maisVendido = produto;
        }
        if (maisVendido.getQuantPedido() == 0)
            return new Produto(-1, "Nenhum", -1);
        
        return maisVendido;
    }

    /**
     * Método para adicionar a quantidade de pedidos de um Produto
     * @param quant Quantidade que vai acrescentar na quantidade de pedidos
     */
    public void addQuantPedido(int quant) {
        quantPedido += quant;
    }
    
    // metodos getters e setters
    
    /**
     * Método getter para o código
     * @return Retorna o código
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Método setter para o código
     * @param codigo Novo valor para o atributo código
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Método getter para o nome
     * @return Retorna o nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método setter para o nome
     * @param nome Novo valor para o atributo nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Método getter para o valor
     * @return Retorna o valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * Método setter para o valor
     * @param valor Novo valor para o atributo valor
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * Método getter para o quantPedido
     * @return Retorna a quantidade de pedidos
     */
    public int getQuantPedido() {
        return quantPedido;
    }

    /**
     * Método setter para o quantPedido
     * @param quantPedido Novo valor para o atributo quantPedido
     */
    public void setQuantPedido(int quantPedido) {
        this.quantPedido = quantPedido;
    }
    
}
