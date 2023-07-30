package classes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 * Classe para objetos do tipo ClienteTableModel, onde serão contidos seus atributos e métodos
 */
public class ClienteTableModel extends AbstractTableModel {
    /** Atributo com os valores dos títulos das colunas */
    private String[] colunas = new String[]{"Nome", "E-mail", "Telefone", "CPF", "Data de nascimento", "Endereço", "Pedidos"};
    
    /** Atributo para armazenar as linhas da tabela */
    private List<Cliente> linhas;
    
    /**
     * Método construtor da classe normal
     */
    public ClienteTableModel() {
        linhas = Controle.clientes;
    }
   
    /**
     * Método construtor da classe para modo de pesquisa
     */
    public ClienteTableModel(List<Cliente> lista) {
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
    public String getValueAt(int rowIndex, int columnIndex) {
        Cliente cliente = linhas.get(rowIndex);
        switch (columnIndex) {
            case 0: // retorna o nome
                return cliente.getNome();
                
            case 1: // retorna o email
                return cliente.getEmail();
                
            case 2: // retorna o telefone
                return cliente.getTelefone();
                
            case 3: // retorna o CPF
                return cliente.getCPF();
                
            case 4: // retorna o aniversário
                return String.valueOf(cliente.getAniversario().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                
            case 5: // retorna o endereço
                return cliente.getEndereço();
                
            case 6: // retorna a quantidade de pedidos
                return String.valueOf(cliente.getQuantidadePedidos());
                
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
            case 6:
                return Produto.class;
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
        Cliente cliente = linhas.get(indiceLinha);
        
        switch (indiceColuna) {
            case 0:
                cliente.setNome(valor.toString());
                break;
            case 1:
                cliente.setEmail(valor.toString());
                break;
            case 2:
                cliente.setTelefone(valor.toString());
                break;
            case 3:
                cliente.setCPF(valor.toString());
                break;
            case 4:
                cliente.setAniversario(LocalDate.parse(valor.toString()));
                break;
            case 5:
                cliente.setEndereço(valor.toString());
                break;
            case 6:
                cliente.setQuantidadePedidos(Integer.parseInt(valor.toString()));
                break;
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
        fireTableCellUpdated(indiceLinha, indiceColuna); // notifica que a célula foi alterada
    }
    
    /**
     * Método para mudar o valor de uma linha inteira indicada
     * @param novo Novo valor do tipo Cliente que será inserido
     * @param indiceLinha Índice para a linha
     */
    public void setValueAt(Cliente novo, int indiceLinha) {
        Cliente cliente = linhas.get(indiceLinha);
        
        cliente.setNome(novo.getNome());
        cliente.setEmail(novo.getEmail());
        cliente.setTelefone(novo.getTelefone());
        cliente.setCPF(novo.getCPF());
        cliente.setAniversario(novo.getAniversario());
        cliente.setEndereço(novo.getEndereço());
        cliente.setQuantidadePedidos(novo.getQuantidadePedidos());
        
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
     * Método getter para o Cliente na linha indicada
     * @param indiceLinha Índice para a linha
     * @return Retorna o Cliente da linha indicada
     */
    public Cliente getCliente(int indiceLinha) {
        return linhas.get(indiceLinha);
    }
    
    /**
     * Método para adicionar um Cliente na última linha da tabela (uma nova linha)
     * @param cliente Cliente a ser adicionado na tabela
     */
    public void addCliente(Cliente cliente) {
        linhas.add(cliente);
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
     * Método para adicionar uma lista de Clientes no final da tabela (novas linhas)
     * @param clientes Lista de Clientes a ser adicionada na tabela
     */
    public void addLista(List<Cliente> clientes) {
        int ultimoTamanho = getRowCount(); // tamanho antigo da tabela
        linhas.addAll(clientes); // adiciona os registros
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
