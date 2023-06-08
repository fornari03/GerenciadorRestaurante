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
    public Cliente(String nome, String CPF,String email, String endereço, LocalDate aniversario, int quantidadePedidos) {
        super(nome, CPF);
        this.email = email;
        this.endereço = endereço;
        this.aniversario = aniversario;
        this.quantidadePedidos = quantidadePedidos;
    }

    public void realizarPedido() {
        quantidadePedidos++;
    }

    public boolean ganharBrinde() {
        LocalDate dataDia = LocalDate.now();
        // se for o mesmo mês e dia do aniversario do cliente, ganharBrinde() é true
        return (aniversario.getMonth().equals(dataDia.getMonth()) && aniversario.getDayOfMonth() == dataDia.getDayOfMonth());
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
    
    public void setQuantidadePedidos(int quantidadePedidos) {
        this.quantidadePedidos = quantidadePedidos;
    }

}
