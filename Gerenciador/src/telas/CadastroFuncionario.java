package telas;

public class CadastroFuncionario extends javax.swing.JFrame {

    public CadastroFuncionario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrupo = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        lblNomeFuncionario = new javax.swing.JLabel();
        lblCpfFuncionario = new javax.swing.JLabel();
        lblFuncaoFuncionario = new javax.swing.JLabel();
        rdbGerente = new javax.swing.JRadioButton();
        rdbGarcom = new javax.swing.JRadioButton();
        rdbEntregador = new javax.swing.JRadioButton();
        lblSenhaGerente = new javax.swing.JLabel();
        ptxtSenhaGerente = new javax.swing.JPasswordField();
        ptxtConfirmarSenhaGerente = new javax.swing.JPasswordField();
        lblConfirmarSenhaGerente = new javax.swing.JLabel();
        txtNomeFuncionario = new javax.swing.JTextField();
        ftxtCpfFuncionario = new javax.swing.JFormattedTextField();
        lblCnhEntregador = new javax.swing.JLabel();
        txtCnhEntregador = new javax.swing.JTextField();
        lblSalarioInicial = new javax.swing.JLabel();
        txtSalarioInicial = new javax.swing.JTextField();
        btnRegistrarFuncionario = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Funcionário");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/funcionario.png")).getImage());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/business_application_addmale_useradd_insert_add_user_client_2312 (1).png"))); // NOI18N

        lblNomeFuncionario.setText("Nome:");

        lblCpfFuncionario.setText("CPF:");

        lblFuncaoFuncionario.setText("Função:");

        rdbGerente.setText("Gerente");

        rdbGarcom.setText("Garçom");

        rdbEntregador.setText("Entregador");

        lblSenhaGerente.setText("Senha:");

        lblConfirmarSenhaGerente.setText("Confirmar senha:");

        lblCnhEntregador.setText("CNH:");

        lblSalarioInicial.setText("Salário inicial:");

        btnRegistrarFuncionario.setBackground(new java.awt.Color(102, 102, 255));
        btnRegistrarFuncionario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRegistrarFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarFuncionario.setText("Registrar");
        btnRegistrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarFuncionarioActionPerformed(evt);
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
                        .addGap(267, 267, 267)
                        .addComponent(btnRegistrarFuncionario))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVoltar)))
                .addContainerGap(145, Short.MAX_VALUE))
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
                .addGap(45, 45, 45)
                .addComponent(btnRegistrarFuncionario)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarFuncionarioActionPerformed
        // TODO add your handling code here:
    }

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // quando clica na seta, fecha a tela de cadastro
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
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGrupo;
    private javax.swing.JButton btnRegistrarFuncionario;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JFormattedTextField ftxtCpfFuncionario;
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
