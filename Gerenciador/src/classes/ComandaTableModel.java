package classes;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 * Classe para objetos do tipo ComandaTableModel, onde serão contidos seus atributos e métodos
 */
public class ComandaTableModel extends AbstractTableModel {
    /** Atributo com os valores dos títulos das colunas */
    private String[] colunas = new String[]{"Prato", "Quantidade", "Preço"};
    
    /** Atributo para armazenar as linhas da tabela */
    private List<ItemPedido> linhas;
    
    /**
     * Método construtor da classe
     */
    public ComandaTableModel() {
        linhas = new ArrayList();
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
        ItemPedido item = linhas.get(rowIndex);
        switch (columnIndex) {
            case 0: // retorna o nome do produto
                return item.getProduto().getNome();
                
            case 1: // retorna a quantidade de produtos no item pedido
                return item.getQuantidade();
                
            case 2: // retorna o valor conjunto
                return String.format("%.2f", item.getValorConjunto());

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
                return String.class;
            case 1:
                return Integer.class;
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
        ItemPedido item = linhas.get(indiceLinha);
        
        switch (indiceColuna) {
            case 0: // muda o nome do produto para o valor
                item.getProduto().setNome(valor.toString());
                break;
            case 1: // muda a quantidade para o valor
                item.setQuantidade(Integer.parseInt(valor.toString()));
                break;
            case 2: // muda o valor(preço do produto) para o valor
                item.setValorConjunto(Double.parseDouble(valor.toString()));
                break;

            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
        fireTableCellUpdated(indiceLinha, indiceColuna); // notifica que a célula foi alterada
    }
    
    /**
     * Método para mudar o valor de uma linha inteira indicada
     * @param novo Novo valor do tipo ItemPedido que será inserido
     * @param indiceLinha Índice para a linha
     */
    public void setValueAt(ItemPedido novo, int indiceLinha) {
        ItemPedido item = linhas.get(indiceLinha);
        
        item.getProduto().setNome(novo.toString());
        item.setQuantidade(Integer.parseInt(novo.toString()));
        item.setValorConjunto(Double.parseDouble(novo.toString()));
        
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
     * Método getter para o ItemPedido na linha indicada
     * @param indiceLinha Índice para a linha
     * @return Retorna o ItemPedido da linha indicada
     */
    public ItemPedido getItemPedido(int indiceLinha) {
        return linhas.get(indiceLinha);
    }
    
    /**
     * Método para adicionar um ItemPedido na última linha da tabela (uma nova linha)
     * @param item ItemPedido a ser adicionado na tabela
     */
    public void addItemPedido(ItemPedido item) {
        linhas.add(item);
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
     * Método para adicionar uma lista de ItemPedidos no final da tabela (novas linhas)
     * @param itens Lista de ItemPedidos a ser adicionada na tabela
     */
    public void addLista(List<ItemPedido> itens) {
        int ultimoTamanho = getRowCount(); // tamanho antigo da tabela
        linhas.addAll(itens); // adiciona os registros
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