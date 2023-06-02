package classes;

public class Mesa {
    // atributos
    private int numeroMesa;
    private boolean disponivel;
    private int capacidade;
    private Comanda comanda;

    // metodos
    public Mesa(int numeroMesa, int capacidade) {
        // a ser desenvolvido
        this.numeroMesa = numeroMesa;
        this.capacidade = capacidade;
        this.disponivel = true;
        Controle.mesas.add(this);
    }

    public void liberarMesa() {
        if (!disponivel)
            this.disponivel = true;
            comanda = null;
    }

    // metodos getters e setters
    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public Comanda getComanda() {
        return comanda;
    }

    public void setComanda(Comanda comanda) {
        this.comanda = comanda;
    }
}
