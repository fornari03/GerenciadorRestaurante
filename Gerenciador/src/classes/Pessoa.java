package classes;

/**
 * Classe para objetos do tipo Pessoa,onde serão contidos seus atributos e métodos
 */
public abstract class Pessoa {
    // atributos
    
    /** Atributo para o nome da Pessoa */
    protected String nome;
    
    /** Atributo para o CPF da Pessoa */
    protected String CPF;

    // metodos
    
    /**
     * Método construtor da classe
     * @param nome Nome da Pessoa
     * @param CPF CPF da Pessoa
     */
    public Pessoa(String nome, String CPF) {
        this.nome = nome;
        this.CPF = CPF;
    }

    // metodos getters e setters
    
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
     * Método getter para o CPF
     * @return Retorna o CPF
     */
    public String getCPF() {
        return CPF;
    }

    /**
     * Método setter para o CPF
     * @param CPF Novo valor para o atributo CPF
     */
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
}
