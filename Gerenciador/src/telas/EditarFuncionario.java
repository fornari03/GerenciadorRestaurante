package telas;

public class EditarFuncionario extends javax.swing.JFrame {

    RelatorioFuncionarios relatorio;
    
    public EditarFuncionario(RelatorioFuncionarios relatorio) {
        initComponents();
        this.relatorio = relatorio;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrupo = new javax.swing.ButtonGroup();
        lblConfirmarSenhaGerente = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNomeFuncionario = new javax.swing.JTextField();
        lblNomeFuncionario = new javax.swing.JLabel();
        ftxtCpfFuncionario = new javax.swing.JFormattedTextField();
        lblCpfFuncionario = new javax.swing.JLabel();
        lblCnhEntregador = new javax.swing.JLabel();
        lblFuncaoFuncionario = new javax.swing.JLabel();
        txtCnhEntregador = new javax.swing.JTextField();
        rdbGerente = new javax.swing.JRadioButton();
        lblSalarioInicial = new javax.swing.JLabel();
        rdbGarcom = new javax.swing.JRadioButton();
        txtSalarioInicial = new javax.swing.JTextField();
        rdbEntregador = new javax.swing.JRadioButton();
        lblSenhaGerente = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        ptxtSenhaGerente = new javax.swing.JPasswordField();
        ptxtConfirmarSenhaGerente = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alterar informações do funcionário");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/funcionario.png")).getImage());

        lblConfirmarSenhaGerente.setText("Confirmar senha:");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/businessapplication_edit_male_user_thepencil_theclient_negocio_2321.png"))); // NOI18N

        lblNomeFuncionario.setText("Nome:");

        lblCpfFuncionario.setText("CPF:");

        lblCnhEntregador.setText("CNH:");

        lblFuncaoFuncionario.setText("Função:");

        rdbGerente.setText("Gerente");

        lblSalarioInicial.setText("Salário:");

        rdbGarcom.setText("Garçom");

        rdbEntregador.setText("Entregador");

        lblSenhaGerente.setText("Senha:");

        btnVoltar.setBackground(new java.awt.Color(242, 242, 242));
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/3643764-back-backward-left-reply-turn_113415 (1).png"))); // NOI18N
        btnVoltar.setBorder(null);
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("Salvar alterações");

        jButton2.setBackground(new java.awt.Color(204, 51, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Excluir funcionário");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblFuncaoFuncionario)
                            .addComponent(lblCpfFuncionario)
                            .addComponent(lblSenhaGerente)
                            .addComponent(lblNomeFuncionario)
                            .addComponent(lblCnhEntregador)
                            .addComponent(lblSalarioInicial))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtNomeFuncionario, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rdbGerente)
                                            .addComponent(ptxtSenhaGerente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(33, 33, 33)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rdbGarcom)
                                            .addComponent(lblConfirmarSenhaGerente))))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(rdbEntregador)
                                    .addComponent(ptxtConfirmarSenhaGerente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(ftxtCpfFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtCnhEntregador, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtSalarioInicial, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVoltar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jButton1)
                        .addGap(75, 75, 75)
                        .addComponent(jButton2)))
                .addContainerGap(163, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVoltar)
                .addGap(2, 2, 2)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeFuncionario)
                    .addComponent(txtNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCpfFuncionario)
                    .addComponent(ftxtCpfFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFuncaoFuncionario)
                    .addComponent(rdbGerente)
                    .addComponent(rdbGarcom)
                    .addComponent(rdbEntregador))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSenhaGerente)
                    .addComponent(ptxtSenhaGerente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ptxtConfirmarSenhaGerente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblConfirmarSenhaGerente))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCnhEntregador)
                    .addComponent(txtCnhEntregador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSalarioInicial)
                    .addComponent(txtSalarioInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // fecha a tela de editar e reabre a tela de relatorio
        this.setVisible(false);
        this.relatorio.setVisible(true);
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
            java.util.logging.Logger.getLogger(EditarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new EditarFuncionario().setVisible(true); NÃO É UTILIZADO
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGrupo;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JFormattedTextField ftxtCpfFuncionario;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCnhEntregador;
    private javax.swing.JLabel lblConfirmarSenhaGerente;
    private javax.swing.JLabel lblCpfFuncionario;
    private javax.swing.JLabel lblFuncaoFuncionario;
    private javax.swing.JLabel lblNomeFuncionario;
    private javax.swing.JLabel lblSalarioInicial;
    private javax.swing.JLabel lblSenhaGerente;
    private javax.swing.JPasswordField ptxtConfirmarSenhaGerente;
    private javax.swing.JPasswordField ptxtSenhaGerente;
    private javax.swing.JRadioButton rdbEntregador;
    private javax.swing.JRadioButton rdbGarcom;
    private javax.swing.JRadioButton rdbGerente;
    private javax.swing.JTextField txtCnhEntregador;
    private javax.swing.JTextField txtNomeFuncionario;
    private javax.swing.JTextField txtSalarioInicial;
    // End of variables declaration//GEN-END:variables
}
