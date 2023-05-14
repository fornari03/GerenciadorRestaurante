package classes;

public class Entregador extends Pessoa {
    // atributos
    private String CNH;
    private int quantidadeEntregas;

    // metodos
    public Entregador(String nome, String CPF, String CNH) {
        this.nome = nome;
        this.CPF = CPF;
        this.CNH = CNH;
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
