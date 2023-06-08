package classes;

import java.time.LocalDate;

public abstract class Funcionario extends Pessoa {
    // atributos
    protected double salario;
    protected LocalDate diaContratado;

    // metodos
    public Funcionario(String nome, String CPF, double salario, LocalDate diaContratado) {
        super(nome, CPF);
        this.salario = salario;
        this.diaContratado = diaContratado;
    }

    
    // metodos getters e setters
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public LocalDate getDiaContratado() {
        return diaContratado;
    }

    public void setDiaContratado(LocalDate diaContratado) {
        this.diaContratado = diaContratado;
    }
    
}
