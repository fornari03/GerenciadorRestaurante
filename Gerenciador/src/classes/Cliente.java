package classes;

import java.time.LocalDate;

public class Cliente extends Pessoa {
    // atributos
    private String email;
    private String telefone;
    private String endereço;
    private LocalDate aniversario;
    private int quantidadePedidos;
    
    // metodos
    public Cliente(String nome, String CPF, String email, String endereço, LocalDate aniversario) {
        this.nome = nome;
        this.CPF = CPF;
        this.email = email;
        this.endereço = endereço;
        this.aniversario = aniversario;
    }

    public void realizarPedido() {
        // a ser desenvolvido
    }

    public boolean ganharBrinde() {
        // a ser desenvolvido
        return false;
    }

    public void addQuantidadePedidos() {
        this.quantidadePedidos++;
    }

    // metodos getters e setters
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public LocalDate getAniversario() {
        return aniversario;
    }

    public void setAniversario(LocalDate aniversario) {
        this.aniversario = aniversario;
    }

    public int getQuantidadePedidos() {
        return quantidadePedidos;
    }

}
