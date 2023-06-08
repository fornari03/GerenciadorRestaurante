package classes;

import java.time.LocalDate;

public class Garcom extends Funcionario {
    // atributos
    private int quantidadeAtendimentos;
    private Comanda comanda;

    // metodos
    public Garcom(String nome, String CPF, double salario, LocalDate diaContratado, int quantidadeAtendimentos) {
        super(nome, CPF, salario, diaContratado);
        this.quantidadeAtendimentos = quantidadeAtendimentos;
    }

    public void atenderMesa(Mesa mesa) {
        this.comanda = mesa.getComanda();
        this.quantidadeAtendimentos++;
    }

    // metodos getters e setters
    public int getQuantidadeAtendimentos() {
        return quantidadeAtendimentos;
    }

    public void setQuantidadeAtendimentos(int quantidadeAtendimentos) {
        this.quantidadeAtendimentos = quantidadeAtendimentos;
    }

    public Comanda getComanda() {
        return comanda;
    }

    public void setComanda(Comanda comanda) {
        this.comanda = comanda;
    }

}
