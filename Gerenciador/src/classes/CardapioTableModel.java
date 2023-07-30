package classes;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 * Classe para objetos do tipo CardapioTableModel,onde serão contidos seus atributos e métodos
 */
public class CardapioTableModel extends AbstractTableModel {
    /** Atributo com os valores dos títulos das colunas */
    private String[] colunas = new String[]{"ID", "Prato", "Preço"};
    
    /** Atributo para armazenar as linhas da tabela */
    private List<Produto> linhas;
    
    /**
     * Método construtor da classe
     */
    public CardapioTableModel() {
        linhas = Controle.cardapio;
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
        Produto produto = linhas.get(rowIndex);
        switch (columnIndex) {
            case 0: // retorna o ID
                return produto.getCodigo();
                
            case 1: // retorna o nome do prato
                return produto.getNome();
                
            case 2: // retorna o valor
                return String.format("%.2f", produto.getValor());

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
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            default:
                return Object.class;
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
        Produto produto = linhas.get(indiceLinha);
        
        switch (indiceColuna) {
            case 0: // muda o ID para o valor
                produto.setCodigo(Integer.parseInt(valor.toString()));
                break;
            case 1: // muda o nome para o valor
                produto.setNome(valor.toString());
                break;
            case 2: // muda o valor(preço do produto) para o valor
                produto.setValor(Double.parseDouble(valor.toString()));
                break;

            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
        fireTableCellUpdated(indiceLinha, indiceColuna); // notifica que a célula foi alterada
    }
    
    /**
     * Método para mudar o valor de uma linha inteira indicada
     * @param novo Novo valor do tipo Produto que será inserido
     * @param indiceLinha Índice para a linha
     */
    public void setValueAt(Produto novo, int indiceLinha) {
        Produto produto = linhas.get(indiceLinha);
        
        produto.setCodigo(novo.getCodigo());
        produto.setNome(novo.getNome());
        produto.setValor(novo.getValor());
        
        fireTableCellUpdated(indiceLinha, 0);
        fireTableCellUpdated(indiceLinha, 1);
        fireTableCellUpdated(indiceLinha, 2);
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
     * Método getter para o Produto na linha indicada
     * @param indiceLinha Índice para a linha
     * @return Retorna o Produto da linha indicada
     */
    public Produto getProduto(int indiceLinha) {
        return linhas.get(indiceLinha);
    }
    
    /**
     * Método para adicionar um Produto na última linha da tabela (uma nova linha)
     * @param produto Produto a ser adicionado na tabela
     */
    public void addProduto(Produto produto) {
        linhas.add(produto);
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
     * Método para adicionar uma lista de Produto no final da tabela (novas linhas)
     * @param produtos Lista de Produto a ser adicionada na tabela
     */
    public void addLista(List<Produto> produtos) {
        int ultimoTamanho = getRowCount(); // tamanho antigo da tabela
        linhas.addAll(produtos); // adiciona os registros
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