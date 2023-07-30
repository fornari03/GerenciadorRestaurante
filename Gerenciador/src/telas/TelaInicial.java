package telas;

import classes.Controle;
import classes.Funcionario;
import classes.Gerente;
import classes.ManipulaArquivos;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Classe para a tela inicial do programa
 */
public class TelaInicial extends javax.swing.JFrame {

    /**
     * Método construtor da classe
     */
    public TelaInicial() {
        initComponents();
        // inicializa todos as listas do Controle
        Controle.clientes = new ArrayList();
        Controle.funcionarios = new ArrayList();
        Controle.comandas = new ArrayList();
        Controle.cardapio = new ArrayList();
        Controle.mesas = new ArrayList();

        
        // IMPORTA TODOS OS DADOS DOS ARQUIVOS
        try{
            ManipulaArquivos.importandoDadosCliente();
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Um erro inesperado ocorreu.", "Atenção", JOptionPane.ERROR_MESSAGE);
        }
        
        try{
            ManipulaArquivos.importandoDadosFuncionario();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Um erro inesperado ocorreu.", "Atenção", JOptionPane.ERROR_MESSAGE);
        }
        
        try{
            ManipulaArquivos.importandoDadosCardapio();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Um erro inesperado ocorreu.", "Atenção", JOptionPane.ERROR_MESSAGE);
        }
        
        // inicializa o contador do id para os produtos no cardapio
        int idAtual = Controle.cardapio.get(Controle.cardapio.size()-1).getCodigo();
        Controle.setIdNumCount(idAtual);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ptxtSenha = new javax.swing.JPasswordField();
        lblUsuario = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        btnEntrar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        lblImagemEntrar = new javax.swing.JLabel();
        ftxtUsuario = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login do Gerente");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/login_icon.png")).getImage());

        ptxtSenha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ptxtSenha.setToolTipText("Insira a senha do gerente");
        ptxtSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ptxtSenhaKeyPressed(evt);
            }
        });

        lblUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblUsuario.setText("Usuário:");
        lblUsuario.setToolTipText("");

        lblSenha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblSenha.setText("Senha:");

        btnEntrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        btnSair.setBackground(new java.awt.Color(204, 51, 0));
        btnSair.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSair.setForeground(new java.awt.Color(255, 255, 255));
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        lblImagemEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/enter_icon-icons.com_71207 (1).png"))); // NOI18N

        try {
            ftxtUsuario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxtUsuario.setToolTipText("Insira o CPF do gerente");
        ftxtUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImagemEntrar)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblUsuario)
                            .addComponent(lblSenha))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ptxtSenha)
                            .addComponent(ftxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(btnEntrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(btnSair)))
                .addContainerGap(206, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblImagemEntrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario)
                    .addComponent(ftxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ptxtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSenha))
                .addGap(32, 32, 32)
                .addComponent(btnEntrar)
                .addGap(72, 72, 72)
                .addComponent(btnSair)
                .addGap(47, 47, 47))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        // se o usuario e senha forem corretos, abre o programa
        boolean achou = false;
        for (Funcionario func : Controle.funcionarios)
            if (func instanceof Gerente && this.ftxtUsuario.getText().equals(((Gerente) func).getCPF()) && Integer.parseInt(String.valueOf(this.ptxtSenha.getPassword())) == (((Gerente) func).getSenha())) {
                achou = true;
                this.setVisible(false);
                new TelaMesas().setVisible(true);
            }
        
        if (!achou) {
            JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos.", "Atenção", JOptionPane.INFORMATION_MESSAGE);
            this.ptxtSenha.setText("");
            this.ftxtUsuario.setText("");
            this.ftxtUsuario.requestFocus();
        }
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // fecha o programa
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void ptxtSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ptxtSenhaKeyPressed
        // entra pela tecla Enter
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            // se o usuario e senha forem corretos, abre o programa
            boolean achou = false;
            for (Funcionario func : Controle.funcionarios)
                if (func instanceof Gerente && this.ftxtUsuario.getText().equals(((Gerente) func).getCPF()) && Integer.parseInt(String.valueOf(this.ptxtSenha.getPassword())) == (((Gerente) func).getSenha())) {
                    achou = true;
                    this.setVisible(false);
                    new TelaMesas().setVisible(true);
                }

            if (!achou) {
                JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos.", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                this.ptxtSenha.setText("");
                this.ftxtUsuario.setText("");
                this.ftxtUsuario.requestFocus();
            }
        }
    }//GEN-LAST:event_ptxtSenhaKeyPressed

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnSair;
    private javax.swing.JFormattedTextField ftxtUsuario;
    private javax.swing.JLabel lblImagemEntrar;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField ptxtSenha;
    // End of variables declaration//GEN-END:variables
}
