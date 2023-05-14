package classes;

public class Gerente extends Pessoa {
    // atributos
    private int senha;
    
    // metodos
    public Gerente(String nome, String CPF, int senha) {
        this.nome = nome;
        this.CPF = CPF;
        this.senha = senha;
    }

    // metodos getters e setters
    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

}
