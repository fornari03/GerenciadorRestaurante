package classes;

public abstract class Pessoa {
    // atributos
    protected String nome;
    protected String CPF;

    // metodos
    public Pessoa(String nome, String CPF) {
        this.nome = nome;
        this.CPF = CPF;
    }

    // metodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
}
