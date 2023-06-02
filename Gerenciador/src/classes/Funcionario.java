package classes;

public abstract class Funcionario extends Pessoa {
    // atributos
    protected double salario;

    // metodos
    public Funcionario(String nome, String CPF, double salario) {
        super(nome, CPF);
        this.salario = salario;
        Controle.funcionarios.add(this);
    }

    // metodos getters e setters
    public double getSalario() {
        return salario;
    }

    public void setEmail(double salario) {
        this.salario = salario;
    }
}
