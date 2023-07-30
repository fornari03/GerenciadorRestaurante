package classes;

import java.time.LocalDate;

/**
 * Classe para objetos do tipo Funcionario, onde serão contidos seus atributos e métodos
 */
public abstract class Funcionario extends Pessoa {
    // atributos
    
    /** Atributo para o salario do funcionário */
    protected double salario;
    
    /** Atributo para o dia em que o funcionário foi contratado */
    protected LocalDate diaContratado;

    // metodos
    
    /**
     * Método construtor da classe
     * @param nome Nome do funcionário
     * @param CPF CPF do funcionário
     * @param salario Salário do funcionário
     * @param diaContratado Dia em que o funcionário foi contratado
     */
    public Funcionario(String nome, String CPF, double salario, LocalDate diaContratado) {
        super(nome, CPF);
        this.salario = salario;
        this.diaContratado = diaContratado;
    }

    
    // metodos getters e setters
    
    /**
     * Método getter para o salário
     * @return Retorna o salário do funcionário
     */
    public double getSalario() {
        return salario;
    }

    /**
     * Método setter do salário
     * @param salario Novo valor para o atributo salario
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * Método getter para o dia contratado
     * @return Retorna o dia em que o funcionário foi contratado
     */
    public LocalDate getDiaContratado() {
        return diaContratado;
    }
    
    /**
     * Método setter para o dia contratado
     * @param diaContratado Novo valor para o atributo diaContratado
     */
    public void setDiaContratado(LocalDate diaContratado) {
        this.diaContratado = diaContratado;
    }
    
}
