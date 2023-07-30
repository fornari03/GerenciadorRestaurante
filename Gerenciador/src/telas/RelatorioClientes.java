package telas;

import classes.Cliente;
import classes.ClienteTableModel;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Classe para a tela de relatório de clientes
 */
public class RelatorioClientes extends javax.swing.JFrame {

    /** Atributo para armazenar um ClienteTableModel */
    private ClienteTableModel modelo;
    
    /** Atributo para armazenar um ClienteTableModel para o modo de pesquisa */
    private ClienteTableModel modeloPesquisa;
    
    /**
     * Creates new form RelatorioClientes
     */
    
    /**
     * Método construtor da classe
     */
    public RelatorioClientes() {
        initComponents();
        modelo = new ClienteTableModel();
        this.tblClientes.setModel(modelo);
    }
    
    /**
     * Método getter para o modelo
     * @return Retorna o modelo
     */
    public ClienteTableModel getModelo() {
        return modelo;
    }
    
    /**
     * Método setter para o modelo
     * @param modelo Novo valor para o atributo modelo
     */
    public void setModelo(ClienteTableModel modelo) {
        this.modelo = modelo;
    }

    /**
     * Método getter para o modeloPesquisa
     * @return Retorna o modeloPesquisa
     */
    public ClienteTableModel getModelo_pesquisa() {
        return modeloPesquisa;
    }

    /**
     * Método setter para o modeloPesquisa
     * @param modelo_pesquisa Retorna o atributo modeloPesquisa
     */
    public void setModelo_pesquisa(ClienteTableModel modelo_pesquisa) {
        this.modeloPesquisa = modelo_pesquisa;
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlClientes = new javax.swing.JPanel();
        scrMostraClientes = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        lblPesquisar = new javax.swing.JLabel();
        txtPesquisar = new javax.swing.JTextField();
        btnVoltar = new javax.swing.JButton();
        btnProsseguir = new javax.swing.JButton();
        btnImagemPesquisar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relatório Clientes");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/relatorio1.png")).getImage());

        pnlClientes.setBorder(javax.swing.BorderFactory.createTitledBorder("Clientes"));

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "E-mail", "Telefone", "CPF", "Data de nascimento", "Endereço", "Pedidos"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblClientes.getTableHeader().setReorderingAllowed(false);
        scrMostraClientes.setViewportView(tblClientes);
        if (tblClientes.getColumnModel().getColumnCount() > 0) {
            tblClientes.getColumnModel().getColumn(0).setResizable(false);
            tblClientes.getColumnModel().getColumn(1).setResizable(false);
            tblClientes.getColumnModel().getColumn(2).setResizable(false);
            tblClientes.getColumnModel().getColumn(3).setResizable(false);
            tblClientes.getColumnModel().getColumn(4).setResizable(false);
            tblClientes.getColumnModel().getColumn(5).setResizable(false);
            tblClientes.getColumnModel().getColumn(6).setResizable(false);
        }

        javax.swing.GroupLayout pnlClientesLayout = new javax.swing.GroupLayout(pnlClientes);
        pnlClientes.setLayout(pnlClientesLayout);
        pnlClientesLayout.setHorizontalGroup(
            pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlClientesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(scrMostraClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 998, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlClientesLayout.setVerticalGroup(
            pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlClientesLayout.createSequentialGroup()
                .addComponent(scrMostraClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblPesquisar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPesquisar.setText("Pesquisar:");

        txtPesquisar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPesquisar.setToolTipText("Pesquise pelo nome ou CPF do cliente");
        txtPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisarActionPerformed(evt);
            }
        });
        txtPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPesquisarKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPesquisarKeyTyped(evt);
            }
        });

        btnVoltar.setBackground(new java.awt.Color(242, 242, 242));
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/3643764-back-backward-left-reply-turn_113415 (1).png"))); // NOI18N
        btnVoltar.setBorder(null);
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnProsseguir.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnProsseguir.setText("Prosseguir");
        btnProsseguir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProsseguirActionPerformed(evt);
            }
        });

        btnImagemPesquisar.setBackground(new java.awt.Color(242, 242, 242));
        btnImagemPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/magnifier-1_icon-icons.com_56924 (1).png"))); // NOI18N
        btnImagemPesquisar.setToolTipText("Pesquisar");
        btnImagemPesquisar.setBorder(null);
        btnImagemPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImagemPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnProsseguir)
                .addGap(443, 443, 443))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(lblPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnImagemPesquisar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVoltar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(pnlClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnImagemPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPesquisar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnProsseguir)
                .addGap(33, 33, 33))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnProsseguirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProsseguirActionPerformed
        // quando clica em prosseguir, muda para a tela de edição do cliente selecionado
        try { // verifica se algum cliente foi selecionado na tabela
            new EditarCliente(this, modeloPesquisa.getCliente(this.tblClientes.getSelectedRow()), this.tblClientes.getSelectedRow() , true).setVisible(true);
            this.setVisible(false);
        } catch (Exception e) {
            try {
                new EditarCliente(this, modelo.getCliente(this.tblClientes.getSelectedRow()), this.tblClientes.getSelectedRow(), false).setVisible(true);
                this.setVisible(false);
            } catch (Exception e1) {
                JOptionPane.showMessageDialog(null, "Selecione um cliente para prosseguir.", "Atenção", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnProsseguirActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // fecha a tela de relatório
        this.setVisible(false);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void txtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisarActionPerformed

    private void btnImagemPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImagemPesquisarActionPerformed
        // quando clicado, faz a pesquisa do CPF selecionado
        boolean achou = false;
        ArrayList<Cliente> clientesPesquisa = new ArrayList();
        this.modeloPesquisa = new ClienteTableModel(clientesPesquisa);
        
        Character letra = '0';
        try {   
        letra = this.txtPesquisar.getText().charAt(0);
        } catch (Exception e) {}
        if (Character.isDigit(letra)) {
            // pesquisa por CPF
            for(int i=0; i<modelo.getRowCount(); i++) {
                String sub = this.modelo.getValueAt(i, 3).substring(0, this.txtPesquisar.getText().trim().length());
                if (this.txtPesquisar.getText().trim().equals(sub)) {
                    achou = true;
                    clientesPesquisa.add(modelo.getCliente(i));
                }
            }
            if (!achou)
                JOptionPane.showMessageDialog(null, "Nenhum CPF encontrado.", "Não encontrado", JOptionPane.INFORMATION_MESSAGE);
            else
                this.tblClientes.setModel(modeloPesquisa);
            
        } else {
            // pesquisa por nome
            for(int i=0; i<modelo.getRowCount(); i++) {
                String sub = this.modelo.getValueAt(i, 0);
                try {
                    sub = this.modelo.getValueAt(i, 0).substring(0, this.txtPesquisar.getText().trim().length());
                } catch (Exception e) {}
                
                if (this.txtPesquisar.getText().trim().toLowerCase().equals(sub.toLowerCase())) {
                    achou = true;
                    clientesPesquisa.add(modelo.getCliente(i));
                }
            }
            if (!achou)
                JOptionPane.showMessageDialog(null, "Nenhum nome encontrado.", "Não encontrado", JOptionPane.INFORMATION_MESSAGE);
            else
                this.tblClientes.setModel(modeloPesquisa);
        }
    }//GEN-LAST:event_btnImagemPesquisarActionPerformed

    private void txtPesquisarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarKeyTyped
        // impede o usuário de colocar mais do que 14 dígitos (número do CPF com '.' e '-') e auxilia na escrita
        try {
            Character letra = this.txtPesquisar.getText().charAt(0);
            if (Character.isDigit(letra)) {
            switch (this.txtPesquisar.getText().length()) {
                case 3:
                    this.txtPesquisar.setText(this.txtPesquisar.getText() + ".");
                    break;
                case 7:
                    this.txtPesquisar.setText(this.txtPesquisar.getText() + ".");
                    break;
                case 11:
                    this.txtPesquisar.setText(this.txtPesquisar.getText() + "-");
                    break;
                default:
                    break;
            }

            if (this.txtPesquisar.getText().length() >= 13)
                this.txtPesquisar.setText(this.txtPesquisar.getText().substring(0, 13));
            }
        } catch (Exception e) {}
    }//GEN-LAST:event_txtPesquisarKeyTyped

    private void txtPesquisarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarKeyPressed
        // pesquisar pela tecla Enter
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            // quando clica na tecla Enter, faz a pesquisa do CPF selecionado
            boolean achou = false;
            ArrayList<Cliente> clientesPesquisa = new ArrayList();
            this.modeloPesquisa = new ClienteTableModel(clientesPesquisa);

            Character letra = '0';
            try {   
            letra = this.txtPesquisar.getText().charAt(0);
            } catch (Exception e) {}
            if (Character.isDigit(letra)) {
                // pesquisa por CPF
                for(int i=0; i<modelo.getRowCount(); i++) {
                    String sub = this.modelo.getValueAt(i, 3).substring(0, this.txtPesquisar.getText().trim().length());
                    if (this.txtPesquisar.getText().trim().equals(sub)) {
                        achou = true;
                        clientesPesquisa.add(modelo.getCliente(i));
                    }
                }
                if (!achou)
                    JOptionPane.showMessageDialog(null, "Nenhum CPF encontrado.", "Não encontrado", JOptionPane.INFORMATION_MESSAGE);
                else
                    this.tblClientes.setModel(modeloPesquisa);
            } else {
                
                // pesquisa por nome
                for(int i=0; i<modelo.getRowCount(); i++) {
                    String sub = this.modelo.getValueAt(i, 0);
                    try {
                        sub = this.modelo.getValueAt(i, 0).substring(0, this.txtPesquisar.getText().trim().length());
                    } catch (Exception e) {}

                    if (this.txtPesquisar.getText().trim().toLowerCase().equals(sub.toLowerCase())) {
                        achou = true;
                        clientesPesquisa.add(modelo.getCliente(i));
                    }
                }
                if (!achou)
                    JOptionPane.showMessageDialog(null, "Nenhum nome encontrado.", "Não encontrado", JOptionPane.INFORMATION_MESSAGE);
                else
                    this.tblClientes.setModel(modeloPesquisa);
            }
        }
    }//GEN-LAST:event_txtPesquisarKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(RelatorioClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RelatorioClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RelatorioClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RelatorioClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RelatorioClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImagemPesquisar;
    private javax.swing.JButton btnProsseguir;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel lblPesquisar;
    private javax.swing.JPanel pnlClientes;
    private javax.swing.JScrollPane scrMostraClientes;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables
}
