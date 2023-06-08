package classes;

import java.nio.file.*;
import java.util.List;

public class Sistema implements Dados {

    @Override
    public void apagarDados() {
        // apaga os dados de todos os arquivos
        
    }

    @Override
    public void escreverDados() {
        // escreve os novos dados nos arquivos
        
    }

    @Override
    public void importarDados() {
        // importa todos os dados dos arquivos para o sistema
        Path caminhoClientes = Paths.get("arquivos/clientes.txt");
        try {
            List<String> linhasArquivo = Files.readAllLines(caminhoClientes);
            for (String linha : linhasArquivo) {
                System.out.println( linha ); 
            }
        } catch (Exception e) {
            System.out.println("Nao encontrado");
        }
      
    }

    @Override
    public void abrirSistema() {
        // faz as operações necessárias para abrir o sistema com as informações dos arquivos
        this.importarDados();
    }

    @Override
    public void fecharSistema() {
        // faz as operações necessárias para fechar o sistema, levando as informações aos arquivos
        this.apagarDados();
        this.escreverDados();
    }
    
}
