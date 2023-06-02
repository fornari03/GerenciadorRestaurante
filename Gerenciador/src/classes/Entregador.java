package classes;

public class Entregador extends Funcionario {
    // atributos
    private String CNH;
    private int quantidadeEntregas;

    // metodos
    public Entregador(String nome, String CPF, double salario, String CNH) {
        super(nome, CPF, salario);
        this.CNH = CNH;
    }

    // metodos
    public void addQuantidadeEntregas(int quantidadeEntregas) {
        this.quantidadeEntregas++;
    }

    // metodos getters e setters
    public String getCNH() {
        return CNH;
    }

    public void setCNH(String CNH) {
        this.CNH = CNH;
    }

    public int getQuantidadeEntregas() {
        return quantidadeEntregas;
    }

}
