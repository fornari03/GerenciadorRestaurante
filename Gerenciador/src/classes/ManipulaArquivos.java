package classes;

//Dar esses imports nas telas
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public abstract class ManipulaArquivos {
    
    /**
     * Método para importar todos os dados do arquivo de funcionários
     */
    public static void importandoDadosFuncionario() {
        
        try (BufferedReader buffRead = new BufferedReader(new FileReader("Funcionarios.txt"))) {
            String linha;
            while ((linha = buffRead.readLine()) != null) {
                // enquanto a linha não for vazia, continua lendo
                String[] informacoes = linha.split(", ");
                if (informacoes[0].equals("Gerente")){
                   Gerente gerente = new Gerente(informacoes[1],informacoes[2],Double.parseDouble(informacoes[3]),LocalDate.parse(informacoes[4], DateTimeFormatter.ofPattern("dd/MM/yyyy")),Integer.parseInt(informacoes[5]));
                   Controle.funcionarios.add(gerente);
                }     
                else if (informacoes[0].equals("Entregador")){
                    Entregador entregador = new Entregador(informacoes[1],informacoes[2],Double.parseDouble(informacoes[3]),LocalDate.parse(informacoes[4], DateTimeFormatter.ofPattern("dd/MM/yyyy")),informacoes[5],Integer.parseInt(informacoes[6]));
                    Controle.funcionarios.add(entregador);
                }
                else if (informacoes[0].equals("Garcom")){
                    Garcom garcom = new Garcom(informacoes[1],informacoes[2],Double.parseDouble(informacoes[3]),LocalDate.parse(informacoes[4], DateTimeFormatter.ofPattern("dd/MM/yyyy")),Integer.parseInt(informacoes[5]));
                    Controle.funcionarios.add(garcom);
                }
            }
            
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * Método para importar todos os dados do arquivo de clientes
     */
    public static void importandoDadosCliente() {
        
        try (BufferedReader buffRead = new BufferedReader(new FileReader("Clientes.txt"))) {
            String linha;
            while ((linha = buffRead.readLine()) != null) {
                // enquanto a linha não for vazia, continua lendo
                String[] informacoes = linha.split(", ");
                Cliente cliente = new Cliente(informacoes[0], informacoes[1], informacoes[2], informacoes[3], informacoes[4], LocalDate.parse(informacoes[5], DateTimeFormatter.ofPattern("dd/MM/yyyy")), Integer.parseInt(informacoes[6]));
                Controle.clientes.add(cliente);
            }
        } catch (IOException e) {
            e.printStackTrace();
            
        }
 
    }
    
    /**
     * Método para importar todos os dados do arquivo de cardápio
     */
    public static void importandoDadosCardapio() {

        try (BufferedReader buffRead = new BufferedReader(new FileReader("Cardapio.txt"))) {
            String linha;
            while ((linha = buffRead.readLine()) != null) {
                // enquanto a linha não for vazia, continua lendo
                String[] informacoes = linha.split(", ");
                Produto produto = new Produto(Integer.parseInt(informacoes[0]), informacoes[1], Double.parseDouble(informacoes[2]));
                Controle.cardapio.add(produto);
            }
        } catch (IOException e) {
            e.printStackTrace();
            
        }
 
    }
    
    /**
     * Método para importar todos os dados do arquivo de informações gerais
     * @return Retorna um array com os dados fornecidos pelo arquivo
     */
    public static Object[] importandoDadosGerais() {

        try (BufferedReader buffReadGerais = new BufferedReader(new FileReader("Gerais.txt"))) {
            String linha;
            double receita = 0;
            int quantPedidos = 0;
            
            
            while ((linha = buffReadGerais.readLine()) != null) {
                    String[] informacoes = linha.split(", ");
                    receita = Double.parseDouble(informacoes[0]);
                    quantPedidos = Integer.parseInt(informacoes[1]);
            }
            

            Object[] informacoes_gerais = {receita, quantPedidos};
            return informacoes_gerais;
        } catch (IOException e) {
            e.printStackTrace();
            
        }
        return null; // caso dê erro, retorna null
    }
    
    /**
     * Método para escrever uma linha em um arquivo selecionado
     * @param nomeArquivoTXT Nome do arquivo em que se deseja escrever
     * @param textoPraEscrever Texto que se deseja ser escrito
     */
    public static void escreverTxt(String nomeArquivoTXT, String textoPraEscrever){
        
        try(
            FileWriter criadorArquivo = new FileWriter(nomeArquivoTXT,true);
            BufferedWriter buffer = new BufferedWriter(criadorArquivo);
            PrintWriter escritorArquivo = new PrintWriter(buffer);
            )
            
        {
            escritorArquivo.append(textoPraEscrever);
        } catch(IOException e){
            e.printStackTrace();
        }
    }
    
    /**
     * Método para apagar todas as linhas de um arquivo selecionado
     * @param nomeArquivoTXT Nome do arquivo que se deseja apagar todas as linhas
     */
    public static void apagarTxt(String nomeArquivoTXT) {
        try(
            FileWriter criadorArquivo = new FileWriter(nomeArquivoTXT,false);
            BufferedReader buffRead = new BufferedReader(new FileReader( nomeArquivoTXT));    
                )
        {

            while ((buffRead.readLine()) != null) {
                criadorArquivo.write("");

            }
        } catch (IOException e) {
            e.printStackTrace();
            
        }
    }
    
}
