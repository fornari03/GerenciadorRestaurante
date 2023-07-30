package classes;

import java.time.LocalDate;

/**
 * Classe para objetos do tipo Cliente, onde serão contidos seus atributos e métodos
 */
public class Cliente extends Pessoa {
    // atributos
    
    /** Atributo para o email do cliente */
    private String email;
    
    /** Atributo para o telefone do cliente */
    private String telefone;
    
    /** Atributo para o endereço do cliente */
    private String endereço;
    
    /** Atributo para o aniversario do cliente */
    private LocalDate aniversario;
    
    /** Atributo para a quantidade de pedidos do cliente */
    private int quantidadePedidos;
    
    // metodos
    
    /**
     * Método construtor da classe
     * @param nome Nome do cliente
     * @param CPF CPF do cliente
     * @param email Email do cliente
     * @param telefone Telefone do cliente
     * @param endereço Endereço do cliente
     * @param aniversario Aniversario do cliente
     * @param quantidadePedidos Quantidade de pedidos total do cliente
     */
    public Cliente(String nome, String CPF,String email, String telefone, String endereço, LocalDate aniversario, int quantidadePedidos) {
        super(nome, CPF);
        this.email = email;
        this.telefone = telefone;
        this.endereço = endereço;
        this.aniversario = aniversario;
        this.quantidadePedidos = quantidadePedidos;
    }

    /**
     * Método para incrementar a quantidade de pedidos do cliente
     */
    public void realizarPedido() {
        quantidadePedidos++;
    }

    /**
     * Método para verificar se o cliente tem direito ao brinde, vendo se é aniversário dele
     * @return Retorna se ganhará o brinde ou não
     */
    public boolean ganharBrinde() {
        LocalDate dataDia = LocalDate.now();
        // se for o mesmo mês e dia do aniversario do cliente, ganharBrinde() é true
        return (aniversario.getMonth().equals(dataDia.getMonth()) && aniversario.getDayOfMonth() == dataDia.getDayOfMonth());
    }

    // metodos getters e setters
    
    /**
     * Método getter para o email
     * @return Retorna o email do cliente
     */
    public String getEmail() {
        return email;
    }

    /**
     * Método setter para o email
     * @param email Novo valor para o atributo email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Método getter para o telefone
     * @return Retorna o telefone do cliente
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * Método setter para o telefone
     * @param telefone Novo valor para o atributo telefone
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * Método getter para o endereço
     * @return Retorna o endereço do cliente
     */
    public String getEndereço() {
        return endereço;
    }

    /**
     * Método setter para o endereço
     * @param endereço Novo valor para o atributo endereço
     */
    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    /**
     * Método getter para o aniversário
     * @return Retorna o aniversário do cliente
     */
    public LocalDate getAniversario() {
        return aniversario;
    }

    /**
     * Método setter para o aniversário
     * @param aniversario Novo valor para o atributo aniversário
     */
    public void setAniversario(LocalDate aniversario) {
        this.aniversario = aniversario;
    }

    /**
     * Metodo getter para a quantidade de pedidos
     * @return Retorna a quantidade de pedidos do cliente
     */
    public int getQuantidadePedidos() {
        return quantidadePedidos;
    }
    
    /**
     * Método setter para a quantidade de pedidos
     * @param quantidadePedidos Novo valor para o atributo quantidadePedidos
     */
    public void setQuantidadePedidos(int quantidadePedidos) {
        this.quantidadePedidos = quantidadePedidos;
    }

}
