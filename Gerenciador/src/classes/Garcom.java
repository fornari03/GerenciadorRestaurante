package classes;

public class Garcom extends Pessoa {
    // atributos
    private int quantidadeAtendimentos;
    private Comanda comanda;

    // metodos
    public Garcom(String nome, String CPF) {
        this.nome = nome;
        this.CPF = CPF;
    }

    public void atenderMesa(Mesa mesa) {
        this.comanda = mesa.getComanda();
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
