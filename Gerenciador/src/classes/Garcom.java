package classes;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Classe para objetos do tipo Garcom,onde serão contidos seus atributos e métodos
 */
public class Garcom extends Funcionario {
    // atributos
    
    /** Atributo para a quantidade de atendimentos do garçom */
    private int quantidadeAtendimentos;
    
    /** Atributo para a comanda ligada ao Garcom */
    private ArrayList<Comanda> comandas = new ArrayList();

    // metodos
    
    /**
     * Método construtor da classe
     * @param nome Nome do garçom
     * @param CPF CPF do garçom
     * @param salario Salário do garçom
     * @param diaContratado Dia em que o garçom foi contratado
     * @param quantidadeAtendimentos  Quantidade total de atendimentos do garçom
     */
    public Garcom(String nome, String CPF, double salario, LocalDate diaContratado, int quantidadeAtendimentos) {
        super(nome, CPF, salario, diaContratado);
        this.quantidadeAtendimentos = quantidadeAtendimentos;
    }

    /**
     * Método para o garçom atender uma mesa
     * @param mesa Mesa que o garçom estiver atendendo
     */
    public void atenderMesa(Mesa mesa) {
        this.comandas.add(mesa.getComanda());
        this.quantidadeAtendimentos++;
    }

    // metodos getters e setters
    
    /**
     * Método getter para a quantidade de atendimentos 
     * @return Retorna a quantidade total de atendimentos do garçom
     */
    public int getQuantidadeAtendimentos() {
        return quantidadeAtendimentos;
    }

    /**
     * Método setter para a quantidade de atendimentos
     * @param quantidadeAtendimentos Novo valor para o atributo de quantidade de atendimentos
     */
    public void setQuantidadeAtendimentos(int quantidadeAtendimentos) {
        this.quantidadeAtendimentos = quantidadeAtendimentos;
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
