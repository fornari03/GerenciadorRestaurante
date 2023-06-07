package telas;

public class RelatorioFinanceiro extends javax.swing.JFrame {

    public RelatorioFinanceiro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlDiaAtual = new javax.swing.JPanel();
        lblReceitaDia = new javax.swing.JLabel();
        lblQuantidadePedidosDia = new javax.swing.JLabel();
        lblDataDia = new javax.swing.JLabel();
        lblPratoMaisVendidoDia = new javax.swing.JLabel();
        txtDataDia = new javax.swing.JTextField();
        txtReceitaDia = new javax.swing.JTextField();
        txtQuantidadePedidosDia = new javax.swing.JTextField();
        txtPratoMaisVendidoDia = new javax.swing.JTextField();
        btnVoltar = new javax.swing.JButton();
        pnlGeral = new javax.swing.JPanel();
        lblReceitaTotal = new javax.swing.JLabel();
        lblDespesaSalario = new javax.swing.JLabel();
        lblQuantidadeFuncionarios = new javax.swing.JLabel();
        lblQuantidadeClientes = new javax.swing.JLabel();
        lblQuantidadePedidosTotal = new javax.swing.JLabel();
        lblPratoMaisVendidoTotal = new javax.swing.JLabel();
        txtReceitaTotal = new javax.swing.JTextField();
        txtDespesaSalario = new javax.swing.JTextField();
        txtQuantidadeFuncionarios = new javax.swing.JTextField();
        txtQuantidadeClientes = new javax.swing.JTextField();
        txtQuantidadePedidosTotal = new javax.swing.JTextField();
        txtPratoMaisVendidoTotal = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relatório Financeiro");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/relatorio1.png")).getImage());

        pnlDiaAtual.setBorder(javax.swing.BorderFactory.createTitledBorder("Dia atual"));

        lblReceitaDia.setText("Receita: ");

        lblQuantidadePedidosDia.setText("Quantidade de pedidos:");

        lblDataDia.setText("Data:");

        lblPratoMaisVendidoDia.setText("Prato mais vendido do dia:");

        txtDataDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataDiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDiaAtualLayout = new javax.swing.GroupLayout(pnlDiaAtual);
        pnlDiaAtual.setLayout(pnlDiaAtualLayout);
        pnlDiaAtualLayout.setHorizontalGroup(
            pnlDiaAtualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDiaAtualLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnlDiaAtualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDiaAtualLayout.createSequentialGroup()
                        .addComponent(lblDataDia)
                        .addGap(177, 177, 177)
                        .addComponent(txtDataDia))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDiaAtualLayout.createSequentialGroup()
                        .addComponent(lblReceitaDia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtReceitaDia, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDiaAtualLayout.createSequentialGroup()
                        .addComponent(lblQuantidadePedidosDia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtQuantidadePedidosDia, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlDiaAtualLayout.createSequentialGroup()
                        .addComponent(lblPratoMaisVendidoDia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addComponent(txtPratoMaisVendidoDia, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(237, 237, 237))
        );
        pnlDiaAtualLayout.setVerticalGroup(
            pnlDiaAtualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDiaAtualLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnlDiaAtualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDataDia)
                    .addComponent(txtDataDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDiaAtualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblReceitaDia)
                    .addComponent(txtReceitaDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDiaAtualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuantidadePedidosDia)
                    .addComponent(txtQuantidadePedidosDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDiaAtualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPratoMaisVendidoDia)
                    .addComponent(txtPratoMaisVendidoDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        btnVoltar.setBackground(new java.awt.Color(242, 242, 242));
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/3643764-back-backward-left-reply-turn_113415 (1).png"))); // NOI18N
        btnVoltar.setBorder(null);
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        pnlGeral.setBorder(javax.swing.BorderFactory.createTitledBorder("GERAL"));

        lblReceitaTotal.setText("Receita total:");

        lblDespesaSalario.setText("Despesa mensal de salário:");

        lblQuantidadeFuncionarios.setText("Quantidade de funcionários:");

        lblQuantidadeClientes.setText("Quantidade de clientes cadastrados:");

        lblQuantidadePedidosTotal.setText("Quantidade de pedidos:");

        lblPratoMaisVendidoTotal.setText("Prato mais vendido:");

        javax.swing.GroupLayout pnlGeralLayout = new javax.swing.GroupLayout(pnlGeral);
        pnlGeral.setLayout(pnlGeralLayout);
        pnlGeralLayout.setHorizontalGroup(
            pnlGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGeralLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(pnlGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblReceitaTotal)
                    .addComponent(lblDespesaSalario)
                    .addComponent(lblQuantidadeFuncionarios)
                    .addComponent(lblQuantidadeClientes)
                    .addComponent(lblQuantidadePedidosTotal)
                    .addComponent(lblPratoMaisVendidoTotal))
                .addGap(43, 43, 43)
                .addGroup(pnlGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtQuantidadeClientes)
                    .addComponent(txtQuantidadePedidosTotal)
                    .addComponent(txtPratoMaisVendidoTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(txtDespesaSalario)
                    .addComponent(txtQuantidadeFuncionarios)
                    .addComponent(txtReceitaTotal))
                .addGap(214, 214, 214))
        );
        pnlGeralLayout.setVerticalGroup(
            pnlGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGeralLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pnlGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblReceitaTotal)
                    .addComponent(txtReceitaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDespesaSalario)
                    .addComponent(txtDespesaSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuantidadeFuncionarios)
                    .addComponent(txtQuantidadeFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuantidadeClientes)
                    .addComponent(txtQuantidadeClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuantidadePedidosTotal)
                    .addComponent(txtQuantidadePedidosTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPratoMaisVendidoTotal)
                    .addComponent(txtPratoMaisVendidoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Relatório Financeiro");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVoltar)
                .addGap(171, 171, 171)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlGeral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlDiaAtual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnVoltar)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlDiaAtual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlGeral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtDataDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataDiaActionPerformed
        // TODO add your handling code here:
    }

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // fecha a tela de relatório
        this.setVisible(false);
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
            java.util.logging.Logger.getLogger(RelatorioFinanceiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RelatorioFinanceiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RelatorioFinanceiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RelatorioFinanceiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RelatorioFinanceiro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblDataDia;
    private javax.swing.JLabel lblDespesaSalario;
    private javax.swing.JLabel lblPratoMaisVendidoDia;
    private javax.swing.JLabel lblPratoMaisVendidoTotal;
    private javax.swing.JLabel lblQuantidadeClientes;
    private javax.swing.JLabel lblQuantidadeFuncionarios;
    private javax.swing.JLabel lblQuantidadePedidosDia;
    private javax.swing.JLabel lblQuantidadePedidosTotal;
    private javax.swing.JLabel lblReceitaDia;
    private javax.swing.JLabel lblReceitaTotal;
    private javax.swing.JPanel pnlDiaAtual;
    private javax.swing.JPanel pnlGeral;
    private javax.swing.JTextField txtDataDia;
    private javax.swing.JTextField txtDespesaSalario;
    private javax.swing.JTextField txtPratoMaisVendidoDia;
    private javax.swing.JTextField txtPratoMaisVendidoTotal;
    private javax.swing.JTextField txtQuantidadeClientes;
    private javax.swing.JTextField txtQuantidadeFuncionarios;
    private javax.swing.JTextField txtQuantidadePedidosDia;
    private javax.swing.JTextField txtQuantidadePedidosTotal;
    private javax.swing.JTextField txtReceitaDia;
    private javax.swing.JTextField txtReceitaTotal;
    // End of variables declaration//GEN-END:variables
}
