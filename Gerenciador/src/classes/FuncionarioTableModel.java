package classes;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 * Classe para objetos do tipo FuncionariosTableModel,onde serão contidos seus atributos e métodos
 */
public class FuncionarioTableModel extends AbstractTableModel {
    /** Atributo com os valores dos títulos das colunas */
    private String[] colunas = new String[]{"Nome", "CPF", "CNH", "Tempo de serviço", "Atendimentos", "Salário", "Função"};
    
    /** Atributo para armazenar as linhas da tabela */
    private List<Funcionario> linhas;
    
    /**
     * Método construtor da classe normal
     */
    public FuncionarioTableModel() {
        linhas = Controle.funcionarios;
    }
   
    /**
     * Método construtor da classe para modo de pesquisa
     */
    public FuncionarioTableModel(List<Funcionario> lista) {
       linhas = lista;
    }
    
    
    /**
     * Método getter para o tamanho da tabela em linhas
     * @return Retorna a quantidade de linhas
     */
    @Override
    public int getRowCount() {
        return linhas.size();
    }

    /**
     * Método getter para o tamanho da tabela em colunas
     * @return Retorna a quantidade de colunas
     */
    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    /**
     * Método para receber o valor indicado na tabela
     * @param rowIndex Índice para a linha
     * @param columnIndex Índice para a coluna
     * @return Retorna o valor de acordo na tabela com os índices indicados
     */
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Funcionario funcionario = linhas.get(rowIndex);
        switch (columnIndex) {
            case 0: // retorna o nome
                return funcionario.getNome();
                
            case 1: // retorna o CPF
                return funcionario.getCPF();
                
            case 2: // retorna a CNH, caso tenha
                if (funcionario instanceof Entregador)
                    return ((Entregador)funcionario).getCNH();
                else
                    return "N/A";
                
            case 3: // retorna o tempo em dias de serviço do funcionário
                return funcionario.getDiaContratado().until(LocalDate.now(), ChronoUnit.DAYS) + " dias";
                
            case 4: // retorna a quantidade de atendimentos para garçons e de entregas para entregadores
                if (funcionario instanceof Garcom)
                    return String.valueOf(((Garcom) funcionario).getQuantidadeAtendimentos());
                else if (funcionario instanceof Entregador)
                    return String.valueOf(((Entregador) funcionario).getQuantidadeEntregas());
                else
                    return "N/A";
                
            case 5: // retorna o salário
                return "R$ " + String.format("%.2f", funcionario.getSalario());
                
            case 6: // retorna a função
                if (funcionario instanceof Gerente)
                    return "Gerente";
                else if (funcionario instanceof Garcom)
                    return "Garçom";
                else
                    return "Entregador";
                
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }
    
    /**
     * Método para receber o nome da coluna indicada
     * @param indiceColuna Índice para a coluna
     * @return Retorna o nome da coluna de acordo com o índice dado
     */
    @Override
    public String getColumnName(int indiceColuna) {
        return colunas[indiceColuna];
    }
    
    /**
     * Método para receber a classe da coluna indicada
     * @param indiceColuna Índice para a coluna
     * @return Retorna a classe da coluna de acordo com o índice dado
     */
    @Override
    public Class<?> getColumnClass(int indiceColuna) {
        switch (indiceColuna) {
            case 4:
                return Integer.class;
            case 6:
                return Class.class;
            default:
                return String.class;
        }
    }
    
    /**
     * Método para mudar o valor indicado na tabela
     * @param valor Novo valor que será inserido
     * @param indiceLinha Índice para a linha
     * @param indiceColuna Índice para a coluna
     */
    @Override
    public void setValueAt(Object valor, int indiceLinha, int indiceColuna) {
        Funcionario funcionario = linhas.get(indiceLinha);
        
        switch (indiceColuna) {
            case 0: // muda o nome para o valor
                funcionario.setNome(valor.toString());
                break;
            case 1: // muda o CPF para o valor
                funcionario.setCPF(valor.toString());
                break;
            case 2: // muda a CNH para o valor
                ((Entregador) funcionario).setCNH(valor.toString());
                break;
            case 3: // muda o dia em que foi contratado para o valor
                funcionario.setDiaContratado(LocalDate.parse(valor.toString()));
                break;
            case 4: // muda a quantidade de atendimentos para o valor
                if (funcionario instanceof Garcom)
                    ((Garcom) funcionario).setQuantidadeAtendimentos(Integer.parseInt(valor.toString()));
                else if (funcionario instanceof Entregador)
                    ((Entregador) funcionario).setQuantidadeEntregas(Integer.parseInt(valor.toString()));
                break;
            case 5: // muda o salário para o valor
                funcionario.setSalario(Double.parseDouble(valor.toString()));
                break;
            case 6: // não possiblita a alteração da função
                break;
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
        fireTableCellUpdated(indiceLinha, indiceColuna); // notifica que a célula foi alterada
    }
    
    /**
     * Método para mudar o valor de uma linha inteira indicada
     * @param novo Novo valor do tipo Funcionario que será inserido
     * @param indiceLinha Índice para a linha
     */
    public void setValueAt(Funcionario novo, int indiceLinha) {
        Funcionario funcionario = linhas.get(indiceLinha);
        
        funcionario.setNome(novo.getNome());
        funcionario.setCPF(novo.getCPF());
        funcionario.setSalario(novo.getSalario());
        funcionario.setDiaContratado(novo.getDiaContratado());
        
        if (funcionario instanceof Entregador && novo instanceof Entregador) { // se for entregador
            ((Entregador)funcionario).setCNH(((Entregador)novo).getCNH());
            ((Entregador) funcionario).setQuantidadeEntregas(((Entregador) novo).getQuantidadeEntregas());
        }
        else if (funcionario instanceof Garcom && novo instanceof Garcom) // se for garçom
            ((Garcom) funcionario).setQuantidadeAtendimentos(((Garcom) novo).getQuantidadeAtendimentos());
        else { // se for gerente
            ((Gerente) funcionario).setSenha(((Gerente) novo).getSenha());
        }
        
        fireTableCellUpdated(indiceLinha, 0);
        fireTableCellUpdated(indiceLinha, 1);
        fireTableCellUpdated(indiceLinha, 2);
        fireTableCellUpdated(indiceLinha, 3);
        fireTableCellUpdated(indiceLinha, 4);
        fireTableCellUpdated(indiceLinha, 5);
        fireTableCellUpdated(indiceLinha, 6);
    }
    
    /**
     * Método para verificar se a célula da tabela indicada é editável
     * @param indiceLinha Índice para a linha
     * @param indiceColuna Índice para a coluna
     * @return Retorna se é editável ou não
     */
    @Override
    public boolean isCellEditable(int indiceLinha, int indiceColuna) {
        return false;
    }
    
    /**
     * Método getter para o Funcionário na linha indicada
     * @param indiceLinha Índice para a linha
     * @return Retorna o Funcionário da linha indicada
     */
    public Funcionario getFuncionario(int indiceLinha) {
        return linhas.get(indiceLinha);
    }
    
    
    /**
     * Método para adicionar um Funcionário na última linha da tabela (uma nova linha)
     * @param funcionario Funcionário a ser adicionado na tabela
     */
    public void addFuncionario(Funcionario funcionario) {
        linhas.add(funcionario);
        int ultimoIndice = getRowCount()-1;
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
    }
    
    /**
     * Método para remover uma linha da tabela
     * @param indiceLinha Índice para a linha
     */
    public void remove(int indiceLinha) {
        linhas.remove(indiceLinha);
        fireTableRowsDeleted(indiceLinha, indiceLinha);
    }
    
    /**
     * Método para adicionar uma lista de Funcionarios no final da tabela (novas linhas)
     * @param funcionarios Lista de Funcionarios a ser adicionada na tabela
     */
    public void addLista(List<Funcionario> funcionarios) {
        int ultimoTamanho = getRowCount(); // tamanho antigo da tabela
        linhas.addAll(funcionarios); // adiciona os registros
        fireTableRowsInserted(ultimoTamanho, getRowCount()-1);
    }
    
    /**
     * Método para limpar as linhas da tabela
     */
    public void limpar() {
        linhas.clear();
        fireTableDataChanged();
    }
    
    /**
     * Método para verificar se a tabela está vazia
     * @return Retorna se a tabela está vazia ou não
     */
    public boolean isEmpty() {
        return linhas.isEmpty();
    }
}
