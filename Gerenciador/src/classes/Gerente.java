package classes;

import java.time.LocalDate;

public class Gerente extends Funcionario {
    // atributos
    private int senha;
    
    // metodos
    public Gerente(String nome, String CPF, double salario, LocalDate diaContratado, int senha) {
        super(nome, CPF, salario, diaContratado);
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

