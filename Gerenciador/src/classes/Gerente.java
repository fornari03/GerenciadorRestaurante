package classes;

import java.time.LocalDate;

/**
 * Classe para objetos do tipo Gerente,onde serão contidos seus atributos e métodos
 */
public class Gerente extends Funcionario {
    // atributos
    
    /** Atributo para a senha do gerente */
    private int senha;
    
    // metodos
    
    /**
     * Método construtor da classe
     * @param nome Nome do gerente
     * @param CPF CPF do gerente
     * @param salario Salário do gerente
     * @param diaContratado Dia em que o gerente foi contratado
     * @param senha Senha do gerente
     */
    public Gerente(String nome, String CPF, double salario, LocalDate diaContratado, int senha) {
        super(nome, CPF, salario, diaContratado);
        this.senha = senha;
    }

    // metodos getters e setters
    
    /**
     * Método getter para a senha
     * @return Retorna a senha do gerente
     */
    public int getSenha() {
        return senha;
    }

    /**
     * Método setter para a senha
     * @param senha Novo valor para a senha do gerente
     */
    public void setSenha(int senha) {
        this.senha = senha;
    }

}
