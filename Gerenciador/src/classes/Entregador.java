package classes;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Classe para objetos do tipo Entregador, onde serão contidos seus atributos e métodos
 */
public class Entregador extends Funcionario {
    // atributos
    
    /** Atributo para a CNH do entregador */
    private String CNH;
    
    /** Atributo para a quantidade total de entregas do entregador */
    private int quantidadeEntregas;
    
    
    /** Atributo para a comanda ligada ao Garcom */
    private ArrayList<Comanda> comandas = new ArrayList();

    // metodos
    
    /**
     * Método construtor da classe
     * @param nome Nome do entregador
     * @param CPF CPF do entregador
     * @param salario Salário do entregador
     * @param diaContratado Dia em que o entregador foi contratado
     * @param CNH CNH do entregador
     * @param quantidadeEntregas Quantidade total de entregas do entregador
     */
    public Entregador(String nome, String CPF, double salario, LocalDate diaContratado, String CNH, int quantidadeEntregas) {
        super(nome, CPF, salario, diaContratado);
        this.CNH = CNH;
        this.quantidadeEntregas = quantidadeEntregas;
    }

    // metodos
    
    /**
     * Método para incrementar a quantidade de entregas do entregador
     */
    public void addQuantidadeEntregas() {
        this.quantidadeEntregas++;
    }

    // metodos getters e setters
    
    /**
     * Método getter para a CNH
     * @return Retorna a CNH do entregador
     */
    public String getCNH() {
        return CNH;
    }

    /**
     * Método setter para a CNH
     * @param CNH Novo valor para o atributo CNH do entregador
     */
    public void setCNH(String CNH) {
        this.CNH = CNH;
    }

    /**
     * Método getter para a quantidade de entregas
     * @return Retorna a quantidade de entregas do entregador
     */
    public int getQuantidadeEntregas() {
        return quantidadeEntregas;
    }

    /**
     * Método setter para a quantidade de entregas
     * @param quantidadeEntregas Novo valor para o atributo quantidadeEntregas do entregador
     */
    public void setQuantidadeEntregas(int quantidadeEntregas) {
        this.quantidadeEntregas = quantidadeEntregas;
    }

    /**
     * Método getter para a lista de comandas
     * @return Retorna a lista de comandas
     */
    public ArrayList<Comanda> getComandas() {
        return comandas;
    }

    /**
     * Método setter para a lista de comandas
     * @param comandas Novo valor para o atributo da lista de comandas
     */
    public void setComandas(ArrayList<Comanda> comandas) {
        this.comandas = comandas;
    }
    
    
    
}
