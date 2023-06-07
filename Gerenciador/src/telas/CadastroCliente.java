package telas;

public class CadastroCliente extends javax.swing.JFrame {

    public CadastroCliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        lblImagemCliente = new javax.swing.JLabel();
        lblNomeCliente = new javax.swing.JLabel();
        lblCpfCliente = new javax.swing.JLabel();
        lblEmailCliente = new javax.swing.JLabel();
        lblTelefoneCliente = new javax.swing.JLabel();
        lblEnderecoCliente = new javax.swing.JLabel();
        lblDataNascimentoCliente = new javax.swing.JLabel();
        btnCadastrarCliente = new javax.swing.JButton();
        txtNomeCliente = new javax.swing.JTextField();
        ftxtCpfCliente = new javax.swing.JFormattedTextField();
        txtEmailCliente = new javax.swing.JTextField();
        ftxtTelefoneCliente = new javax.swing.JFormattedTextField();
        txtEnderecoCliente = new javax.swing.JTextField();
        ftxtDataNascimentoCliente = new javax.swing.JFormattedTextField();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Cliente");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/pessoa.png")).getImage());

        lblImagemCliente.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblImagemCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/business_application_addmale_useradd_insert_add_user_client_2312 (1).png"))); // NOI18N

        lblNomeCliente.setText("Nome:");

        lblCpfCliente.setText("CPF:");

        lblEmailCliente.setText("E-mail:");

        lblTelefoneCliente.setText("Telefone:");

        lblEnderecoCliente.setText("Endereço:");

        lblDataNascimentoCliente.setText("Data de Nascimento:");

        btnCadastrarCliente.setBackground(new java.awt.Color(102, 102, 255));
        btnCadastrarCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCadastrarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrarCliente.setText("Cadastrar");
        btnCadastrarCliente.setToolTipText("Cadastre o cliente no sistema");

        txtNomeCliente.setToolTipText("Insira o nome do cliente");

        ftxtCpfCliente.setToolTipText("Insira o CPF do cliente");

        txtEmailCliente.setToolTipText("Insira o email do cliente");

        ftxtTelefoneCliente.setToolTipText("Insira o telefone do cliente");

        txtEnderecoCliente.setToolTipText("Insira o endereço do cliente");
        txtEnderecoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnderecoClienteActionPerformed(evt);
            }
        });

        ftxtDataNascimentoCliente.setToolTipText("Insira a data de nascimento do cliente");

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
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblEmailCliente)
                                    .addGap(28, 28, 28))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lblEnderecoCliente)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCpfCliente)
                                .addGap(41, 41, 41)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ftxtCpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTelefoneCliente)
                                    .addComponent(lblDataNascimentoCliente)))
                            .addComponent(txtEnderecoCliente)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNomeCliente)
                        .addGap(29, 29, 29)
                        .addComponent(txtNomeCliente)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ftxtDataNascimentoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(ftxtTelefoneCliente))
                .addGap(62, 62, 62))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(btnCadastrarCliente))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVoltar)
                        .addGap(202, 202, 202)
                        .addComponent(lblImagemCliente)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(lblImagemCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVoltar)))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeCliente)
                    .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEnderecoCliente)
                    .addComponent(txtEnderecoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmailCliente)
                    .addComponent(txtEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefoneCliente)
                    .addComponent(ftxtTelefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCpfCliente)
                    .addComponent(ftxtCpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDataNascimentoCliente)
                    .addComponent(ftxtDataNascimentoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addComponent(btnCadastrarCliente)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                       

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // quando clica na seta, fecha a tela de cadastro
        this.setVisible(false);
    }                                         

    private void txtEnderecoClienteActionPerformed(java.awt.event.ActionEvent evt) {                                                   
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
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnCadastrarCliente;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JFormattedTextField ftxtCpfCliente;
    private javax.swing.JFormattedTextField ftxtDataNascimentoCliente;
    private javax.swing.JFormattedTextField ftxtTelefoneCliente;
    private javax.swing.JLabel lblCpfCliente;
    private javax.swing.JLabel lblDataNascimentoCliente;
    private javax.swing.JLabel lblEmailCliente;
    private javax.swing.JLabel lblEnderecoCliente;
    private javax.swing.JLabel lblImagemCliente;
    private javax.swing.JLabel lblNomeCliente;
    private javax.swing.JLabel lblTelefoneCliente;
    private javax.swing.JTextField txtEmailCliente;
    private javax.swing.JTextField txtEnderecoCliente;
    private javax.swing.JTextField txtNomeCliente;
    // End of variables declaration                   
}
