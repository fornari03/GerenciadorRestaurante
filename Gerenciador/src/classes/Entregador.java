package classes;

import java.time.LocalDate;

public class Entregador extends Funcionario {
    // atributos
    private String CNH;
    private int quantidadeEntregas;

    // metodos
    public Entregador(String nome, String CPF, double salario, LocalDate diaContratado, String CNH, int quantidadeEntregas) {
        super(nome, CPF, salario, diaContratado);
        this.CNH = CNH;
        this.quantidadeEntregas = quantidadeEntregas;
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

    public void setQuantidadeEntregas(int quantidadeEntregas) {
        this.quantidadeEntregas = quantidadeEntregas;
    }
    
}
