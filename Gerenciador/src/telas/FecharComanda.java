package telas;

public class FecharComanda extends javax.swing.JFrame {

    public FecharComanda() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblFinalizando = new javax.swing.JLabel();
        pnlDadosPedido = new javax.swing.JPanel();
        lblValor = new javax.swing.JLabel();
        lblDesconto = new javax.swing.JLabel();
        lblValorFinal = new javax.swing.JLabel();
        lblValorDescricao = new javax.swing.JLabel();
        lblDescontoDescricao = new javax.swing.JLabel();
        lblValorFinalDescricao = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Finalização do pedido");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/Comanda.png")).getImage());

        lblFinalizando.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblFinalizando.setText("Finalizando Pedido");

        pnlDadosPedido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblValor.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblValor.setText("Valor:");

        lblDesconto.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblDesconto.setText("Desconto:");

        lblValorFinal.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblValorFinal.setText("Valor final:");

        lblValorDescricao.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblValorDescricao.setText("R$ XXX,XX");

        lblDescontoDescricao.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblDescontoDescricao.setText("- R$ XX,XX");

        lblValorFinalDescricao.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblValorFinalDescricao.setText("R$ XXX,XX");

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton1.setText("Finalizar pedido");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setText("-------------------------------------------------------------------------------------------------------------");

        javax.swing.GroupLayout pnlDadosPedidoLayout = new javax.swing.GroupLayout(pnlDadosPedido);
        pnlDadosPedido.setLayout(pnlDadosPedidoLayout);
        pnlDadosPedidoLayout.setHorizontalGroup(
            pnlDadosPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosPedidoLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(pnlDadosPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblValorFinal)
                    .addComponent(lblDesconto)
                    .addComponent(lblValor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlDadosPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblValorDescricao, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDescontoDescricao, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblValorFinalDescricao, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(138, 138, 138))
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlDadosPedidoLayout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlDadosPedidoLayout.setVerticalGroup(
            pnlDadosPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosPedidoLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(pnlDadosPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValor)
                    .addComponent(lblValorDescricao))
                .addGap(38, 38, 38)
                .addGroup(pnlDadosPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDesconto)
                    .addComponent(lblDescontoDescricao))
                .addGap(26, 26, 26)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(pnlDadosPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValorFinal)
                    .addComponent(lblValorFinalDescricao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(pnlDadosPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(lblFinalizando)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblFinalizando)
                .addGap(34, 34, 34)
                .addComponent(pnlDadosPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
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
            java.util.logging.Logger.getLogger(FecharComanda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FecharComanda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FecharComanda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FecharComanda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FecharComanda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblDesconto;
    private javax.swing.JLabel lblDescontoDescricao;
    private javax.swing.JLabel lblFinalizando;
    private javax.swing.JLabel lblValor;
    private javax.swing.JLabel lblValorDescricao;
    private javax.swing.JLabel lblValorFinal;
    private javax.swing.JLabel lblValorFinalDescricao;
    private javax.swing.JPanel pnlDadosPedido;
    // End of variables declaration//GEN-END:variables
}
