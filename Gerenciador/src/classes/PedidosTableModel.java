package classes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 * Classe para objetos do tipo PedidosTableModel, onde serão contidos seus atributos e métodos
 */
public class PedidosTableModel extends AbstractTableModel {
    /** Atributo com os valores dos títulos das colunas */
    private String[] colunas = new String[]{"ID", "Tipo", "Hora do pedido", "Valor total", "Status"};
    
    /** Atributo para armazenar as linhas da tabela */
    private List<Comanda> linhas;
    
    /**
     * Método construtor da classe
     */
    public PedidosTableModel() {
        linhas = Controle.comandas;
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
        Comanda comanda = linhas.get(rowIndex);
        switch (columnIndex) {
            case 0: // retorna o ID da comanda
                return comanda.getIdComanda();
                
            case 1: // retorna se se é delivery ou salão
                if (comanda.isDelivery())
                    return "Delivery";
                else
                    return "Salão";
                
            case 2: // retorna a data e hora de realização do pedido
                return comanda.getHoraPedido().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                
            case 3: // retorna o valor da comanda
                if (comanda.isFinalizada())
                    return "R$ "+ String.format("%.2f", comanda.getValorTotal());
                else {
                    comanda.calculaValorParcial();
                    return "R$ "+ String.format("%.2f", comanda.getValorTotal());
                }    
            
            case 4: // retorna se a comanda está finalizada ou aberta
                if (comanda.isFinalizada())
                    return "Finalizada";
                else
                    return "ABERTA";

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
            case 2:
                return LocalDateTime.class;
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
        Comanda comanda = linhas.get(indiceLinha);
        
        switch (indiceColuna) {
            case 0: // muda o ID do pedido para o valor
                comanda.setIdComanda(Integer.parseInt(valor.toString()));
                break;
            case 1: // muda para delivery ou salão
                comanda.setDelivery(Boolean.parseBoolean(valor.toString()));
                break;
            case 2: // muda a data e hora para o valor
                comanda.setHoraPedido(LocalDateTime.parse(valor.toString()));
                break;
            case 3: // muda o valor total para o valor
                comanda.setValorTotal(Double.parseDouble(valor.toString()));
                break;
            case 4: // muda para finalizada ou aberta
                comanda.setFinalizada(Boolean.parseBoolean(valor.toString()));
                break;

            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
        fireTableCellUpdated(indiceLinha, indiceColuna); // notifica que a célula foi alterada
    }
    
    /**
     * Método para mudar o valor de uma linha inteira indicada
     * @param novo Novo valor do tipo Comanda que será inserido
     * @param indiceLinha Índice para a linha
     */
    public void setValueAt(Comanda novo, int indiceLinha) {
        Comanda comanda = linhas.get(indiceLinha);
        
        comanda.setIdComanda(novo.getIdComanda());
        comanda.setDelivery(novo.isDelivery());
        comanda.setHoraPedido(novo.getHoraPedido());
        novo.calculaValorParcial();
        comanda.setValorTotal(novo.getValorTotal());
        comanda.setFinalizada(novo.isFinalizada());
        
        fireTableCellUpdated(indiceLinha, 0);
        fireTableCellUpdated(indiceLinha, 1);
        fireTableCellUpdated(indiceLinha, 2);
        fireTableCellUpdated(indiceLinha, 3);
        fireTableCellUpdated(indiceLinha, 4);
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
     * Método getter para a Comanda na linha indicada
     * @param indiceLinha Índice para a linha
     * @return Retorna a Comanda da linha indicada
     */
    public Comanda getComanda(int indiceLinha) {
        return linhas.get(indiceLinha);
    }
    
    
    /**
     * Método para adicionar uma Comanda na última linha da tabela (uma nova linha)
     * @param comanda Comanda a ser adicionada na tabela
     */
    public void addComanda(Comanda comanda) {
        linhas.add(comanda);
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
     * Método para adicionar uma lista de Comandas no final da tabela (novas linhas)
     * @param comandas Lista de Comandas a ser adicionada na tabela
     */
    public void addLista(List<Comanda> comandas) {
        int ultimoTamanho = getRowCount(); // tamanho antigo da tabela
        linhas.addAll(comandas); // adiciona os registros
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