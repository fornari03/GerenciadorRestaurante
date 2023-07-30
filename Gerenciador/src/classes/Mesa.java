package classes;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

/**
 * Classe para objetos do tipo Mesa,onde serão contidos seus atributos e métodos
 */
public class Mesa {
    // atributos
    
    /** Atributo para o número da mesa */
    private int numeroMesa;
    
    /** Atributo para mostrar se a mesa está disponível */
    private boolean disponivel;
    
    /** Atributo para a capacidade de pessoas da mesa */
    private int capacidade;
    
    /** Atributo para armazenar a comanda atual da mesa */
    private Comanda comanda;
    
    /** Atributo para o JButton da TelaMesas relacionado à mesa */
    private JButton botao;

    // metodos
    
    /**
     * Método construtor da classe
     * @param numeroMesa Número da mesa
     * @param capacidade Capacidade da mesa
     */
    public Mesa(int numeroMesa, int capacidade) {
        // a ser desenvolvido
        this.numeroMesa = numeroMesa;
        this.capacidade = capacidade;
        this.disponivel = true;
    }

    /**
     * Método para tornar a mesa disponível, para quando não houver cliente nela
     */
    public void liberarMesa() {
        if (!disponivel) {
            this.disponivel = true;
            comanda = null;
        }
    }
    
    /**
     * Método para colorir o botão da mesa da TelaMesas de acordo com o estado da mesa, se está disponível ou não
     */
    public void colorirBotao() {
        if (!this.disponivel) {
            // se a mesa não estiver disponivel, é pintada de vermelho
            this.botao.setBackground(new java.awt.Color(255, 153, 153));
            this.botao.setBorder(new LineBorder(new java.awt.Color(255, 51, 51), 2, true));
        } else {
            // se estiver disponível, volta para o default cinza
            this.botao.setBackground(new java.awt.Color(242, 242, 242));
            this.botao.setBorder(new LineBorder(Color.BLACK, 0, true));
        }
    }
    
    // metodos getters e setters
    
    /**
     * Método getter para o número da mesa
     * @return Retorna o número da mesa
     */
    public int getNumeroMesa() {
        return numeroMesa;
    }

    /**
     * Método setter para o número da mesa
     * @param numeroMesa Novo valor para o atributo número da mesa
     */
    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    /**
     * Método para verificar se a mesa está disponível
     * @return Retorna se a mesa está disponível ou não
     */
    public boolean isDisponivel() {
        return disponivel;
    }

    /**
     * Método setter para o atributo disponível
     * @param disponivel Novo valor para o atributo disponível
     */
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    /**
     * Método getter para a capacidade
     * @return Retorna a capacidade da mesa
     */
    public int getCapacidade() {
        return capacidade;
    }

    /**
     * Método setter para a capacidade
     * @param capacidade Novo valor para o atributo capacidade
     */
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    /**
     * Método getter para a comanda
     * @return Retorna a comanda
     */
    public Comanda getComanda() {
        return comanda;
    }

    /**
     * Método setter para a comanda
     * @param comanda Novo valor para o atributo comanda
     */
    public void setComanda(Comanda comanda) {
        this.comanda = comanda;
    }

    /**
     * Método getter para o botão
     * @return Retorna o botão
     */
    public JButton getBotao() {
        return botao;
    }

    /**
     * Método setter para o botão
     * @param botao Novo valor do atributo botao
     */
    public void setBotao(JButton botao) {
        this.botao = botao;
    }
    
}
