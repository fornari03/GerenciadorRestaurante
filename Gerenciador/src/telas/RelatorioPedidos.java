package telas;

public class RelatorioPedidos extends javax.swing.JFrame {

    public RelatorioPedidos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVoltar = new javax.swing.JButton();
        lblPesquisar = new javax.swing.JLabel();
        txtPesquisar = new javax.swing.JTextField();
        btnImagemPesquisar = new javax.swing.JButton();
        pnlRelatorioPedidos = new javax.swing.JPanel();
        scrRelatorioPedidos = new javax.swing.JScrollPane();
        tblRelatorioPedidos = new javax.swing.JTable();
        btnFecharPedido = new javax.swing.JButton();
        btnCancelarPedido = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relatório Pedidos");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/relatorio1.png")).getImage());
        setPreferredSize(new java.awt.Dimension(996, 572));

        btnVoltar.setBackground(new java.awt.Color(242, 242, 242));
        btnVoltar.setForeground(new java.awt.Color(242, 242, 242));
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/3643764-back-backward-left-reply-turn_113415 (1).png"))); // NOI18N
        btnVoltar.setBorder(null);
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        lblPesquisar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPesquisar.setText("Pesquisar:");

        txtPesquisar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnImagemPesquisar.setBackground(new java.awt.Color(242, 242, 242));
        btnImagemPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/magnifier-1_icon-icons.com_56924 (1).png"))); // NOI18N
        btnImagemPesquisar.setBorder(null);
        btnImagemPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImagemPesquisarActionPerformed(evt);
            }
        });

        scrRelatorioPedidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Pedidos"));

        tblRelatorioPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo: Delivery ou salão", "Hora pedido", "Valor total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrRelatorioPedidos.setViewportView(tblRelatorioPedidos);

        btnFecharPedido.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnFecharPedido.setText("Fechar pedido");
        btnFecharPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharPedidoActionPerformed(evt);
            }
        });

        btnCancelarPedido.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnCancelarPedido.setText("Cancelar pedido");

        javax.swing.GroupLayout pnlRelatorioPedidosLayout = new javax.swing.GroupLayout(pnlRelatorioPedidos);
        pnlRelatorioPedidos.setLayout(pnlRelatorioPedidosLayout);
        pnlRelatorioPedidosLayout.setHorizontalGroup(
            pnlRelatorioPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRelatorioPedidosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrRelatorioPedidos, javax.swing.GroupLayout.DEFAULT_SIZE, 972, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRelatorioPedidosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelarPedido)
                .addGap(120, 120, 120)
                .addComponent(btnFecharPedido)
                .addGap(311, 311, 311))
        );
        pnlRelatorioPedidosLayout.setVerticalGroup(
            pnlRelatorioPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRelatorioPedidosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrRelatorioPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlRelatorioPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFecharPedido)
                    .addComponent(btnCancelarPedido))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnVoltar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(lblPesquisar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(btnImagemPesquisar)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlRelatorioPedidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVoltar)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPesquisar)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImagemPesquisar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(29, 29, 29)
                .addComponent(pnlRelatorioPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // fecha a tela de relatório
        this.setVisible(false);
    }

    private void btnFecharPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharPedidoActionPerformed

        this.setVisible(false);
    }

    private void btnImagemPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImagemPesquisarActionPerformed
        // TODO add your handling code here:
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RelatorioPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RelatorioPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RelatorioPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RelatorioPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RelatorioPedidos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarPedido;
    private javax.swing.JButton btnFecharPedido;
    private javax.swing.JButton btnImagemPesquisar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel lblPesquisar;
    private javax.swing.JPanel pnlRelatorioPedidos;
    private javax.swing.JScrollPane scrRelatorioPedidos;
    private javax.swing.JTable tblRelatorioPedidos;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables
}
