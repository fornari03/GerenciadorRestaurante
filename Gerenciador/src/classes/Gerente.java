package classes;

public class Gerente extends Funcionario {
    // atributos
    private int senha;
    
    // metodos
    public Gerente(String nome, String CPF, double salario, int senha) {
        super(nome, CPF, salario);
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
