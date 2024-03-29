package telas;

import classes.Controle;
import classes.Entregador;
import classes.Funcionario;
import classes.Garcom;
import classes.Gerente;
import classes.ManipulaArquivos;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 * Classe para a tela de cadastro de funcionários
 */
public class CadastroFuncionario extends javax.swing.JFrame {

    /**
     * Creates new form CadastroFuncionario
     */
    
    /**
     * Método construtor da classe
     */
    public CadastroFuncionario() {
        initComponents();
        this.ptxtSenhaGerente.setEnabled(false);
        this.ptxtConfirmarSenhaGerente.setEnabled(false);
        this.txtCnhEntregador.setEnabled(false);
        this.txtNomeFuncionario.requestFocus();
    }
    
    /**
     * Método para restaurar os campos para a maneira inicial da tela
     */
    private void restaurarFields() { 
        // limpa todos os campos da tela e desabilita os campos que precisa
        this.txtNomeFuncionario.setText("");
        this.ftxtCpfFuncionario.setText("");
        this.ptxtSenhaGerente.setText("");
        this.ptxtConfirmarSenhaGerente.setText("");
        this.txtCnhEntregador.setText("");
        this.txtSalarioInicial.setText("");
        this.btnGrupoFuncao.clearSelection();
        
        this.ptxtSenhaGerente.setEnabled(false);
        this.ptxtConfirmarSenhaGerente.setEnabled(false);
        this.txtCnhEntregador.setEnabled(false);
        this.txtSalarioInicial.setEnabled(false);
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrupoFuncao = new javax.swing.ButtonGroup();
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

        btnGrupoFuncao.add(rdbGerente);
        rdbGerente.setText("Gerente");
        rdbGerente.setToolTipText("");
        rdbGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbGerenteActionPerformed(evt);
            }
        });

        btnGrupoFuncao.add(rdbGarcom);
        rdbGarcom.setText("Garçom");
        rdbGarcom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbGarcomActionPerformed(evt);
            }
        });

        btnGrupoFuncao.add(rdbEntregador);
        rdbEntregador.setText("Entregador");
        rdbEntregador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbEntregadorActionPerformed(evt);
            }
        });

        lblSenhaGerente.setText("Senha:");

        ptxtSenhaGerente.setToolTipText("Insira a senha do gerente");

        ptxtConfirmarSenhaGerente.setToolTipText("Confirme a senha do gerente");

        lblConfirmarSenhaGerente.setText("Confirmar senha:");

        txtNomeFuncionario.setToolTipText("Insira o nome do funcionário");

        try {
            ftxtCpfFuncionario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxtCpfFuncionario.setToolTipText("Insira o CPF do funcionário");

        lblCnhEntregador.setText("CNH:");

        txtCnhEntregador.setToolTipText("Insira a CNH do entregador");

        lblSalarioInicial.setText("Salário inicial:");

        txtSalarioInicial.setToolTipText("Insira o salário inicial do funcionário");
        txtSalarioInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalarioInicialActionPerformed(evt);
            }
        });

        btnRegistrarFuncionario.setBackground(new java.awt.Color(102, 102, 255));
        btnRegistrarFuncionario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRegistrarFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarFuncionario.setText("Registrar");
        btnRegistrarFuncionario.setToolTipText("Registre o funcionário no sistema");
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
                            .addComponent(ftxtCpfFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtCnhEntregador, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtSalarioInicial, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtNomeFuncionario)
                                        .addGap(25, 25, 25))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rdbGerente)
                                            .addComponent(ptxtSenhaGerente, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(rdbGarcom)
                                                .addGap(26, 26, 26))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lblConfirmarSenhaGerente)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rdbEntregador)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(ptxtConfirmarSenhaGerente, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(btnRegistrarFuncionario))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVoltar)))
                .addContainerGap(130, Short.MAX_VALUE))
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
        // se um dos campos entre nome, cpf e função não estiver preenchido, gerará mensagem de alerta
        if (txtNomeFuncionario.getText().isBlank() || ftxtCpfFuncionario.getText().equals("   .   .   -  ") || (!rdbGerente.isSelected() && !rdbGarcom.isSelected() && !rdbEntregador.isSelected()))
            JOptionPane.showMessageDialog(null, "Todos os campos editáveis devem ser preenchidos!", "Atenção", JOptionPane.WARNING_MESSAGE);
        else {
            // caso nenhum campo esteja em branco ou só com espaços, verifica se já existe o CPF digitado
            boolean presente = false;
            for (Funcionario f : Controle.funcionarios) {
                if (f.getCPF().equals(ftxtCpfFuncionario.getText())) {
                    presente = true;
                    break;
                }
            }
            if (presente) {
                JOptionPane.showMessageDialog(null, "O CPF já está cadastrado no sistema.", "Atenção", JOptionPane.WARNING_MESSAGE);
            } else {    

                if (!(String.valueOf(ptxtSenhaGerente.getPassword()).equals(String.valueOf(ptxtConfirmarSenhaGerente.getPassword())))) {
                    // verifica se a senha está igual nos campos senha e confirmar senha, se não estiver, gera mensagem de alerta e ambos os campos serão limpos
                    JOptionPane.showMessageDialog(null, "A confirmação de senha está errada!", "Atenção", JOptionPane.WARNING_MESSAGE);
                    this.ptxtSenhaGerente.setText("");
                    this.ptxtConfirmarSenhaGerente.setText("");
                    this.ptxtSenhaGerente.requestFocus();
                } else {
                    // se estiver tudo certo, verifica se é possível instanciar o funcionário com as informações dos campos
                    try {
                        // verifica qual a função do funcionário e instancia de acordo com o selecionado nos radio buttons
                        LocalDate diaAtual = LocalDate.now(); // pega a data do dia atual
                        if (rdbGerente.isSelected()) {
                            // se a senha estiver igual nos campos senha e confirmar senha, então instancia o gerente
                            Gerente gerente = new Gerente(txtNomeFuncionario.getText().trim(), ftxtCpfFuncionario.getText().trim(), Double.parseDouble(txtSalarioInicial.getText().trim()), LocalDate.now(), Integer.parseInt(String.valueOf(ptxtSenhaGerente.getPassword())));
                            Controle.funcionarios.add(gerente);

                            // ADICIONANDO NO ARQUIVO DE FUNCIONARIOS
                            String dadosFuncionario;
                            dadosFuncionario = ("Gerente, " + txtNomeFuncionario.getText().trim()+", "+ ftxtCpfFuncionario.getText().trim()+", "+ txtSalarioInicial.getText().trim()+", "+ diaAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))+ ", "+String.valueOf(ptxtSenhaGerente.getPassword())+"\n");
                            ManipulaArquivos.escreverTxt("Funcionarios.txt", dadosFuncionario);


                        } else if (rdbGarcom.isSelected()) {
                            Garcom garcom = new Garcom(txtNomeFuncionario.getText().trim(), ftxtCpfFuncionario.getText().trim(), Double.parseDouble(txtSalarioInicial.getText().trim()), LocalDate.now(), 0);
                            Controle.funcionarios.add(garcom);

                            // ADICIONANDO NO ARQUIVO DE FUNCIONARIOS
                            String dadosFuncionario;
                            dadosFuncionario = ("Garcom, " + txtNomeFuncionario.getText().trim()+", "+ ftxtCpfFuncionario.getText().trim()+", "+ txtSalarioInicial.getText().trim()+", "+diaAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))+", 0\n");
                            ManipulaArquivos.escreverTxt("Funcionarios.txt", dadosFuncionario);

                        } else {
                            Entregador entregador = new Entregador(txtNomeFuncionario.getText().trim(), ftxtCpfFuncionario.getText().trim(), Double.parseDouble(txtSalarioInicial.getText().trim()), LocalDate.now(), txtCnhEntregador.getText().trim(), 0);
                            Controle.funcionarios.add(entregador);

                            // ADICIONANDO NO ARQUIVO DE FUNCIONARIOS
                            String dadosFuncionario;

                            dadosFuncionario = ("Entregador, " + txtNomeFuncionario.getText().trim()+", "+ ftxtCpfFuncionario.getText().trim()+", "+ txtSalarioInicial.getText().trim()+", "+diaAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))+", "+txtCnhEntregador.getText().trim()+", 0\n");
                            ManipulaArquivos.escreverTxt("Funcionarios.txt", dadosFuncionario);
                        }
                        restaurarFields();
                        JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso.", "Cadastrado", JOptionPane.INFORMATION_MESSAGE);

                    } catch (Exception e) {
                        // se algum campo estiver com um dado de tipo diferente:
                        JOptionPane.showMessageDialog(null, "Um ou mais campos estão com dados inválidos!", "Atenção", JOptionPane.WARNING_MESSAGE);
                    }
                }
            }
        }
    }//GEN-LAST:event_btnRegistrarFuncionarioActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // quando clica na seta, fecha a tela de cadastro
        this.setVisible(false);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void rdbGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbGerenteActionPerformed
        // gera automaticamente o salario do funcionario a partir da função selecionada
        this.txtSalarioInicial.setText("5500.00");
        // habilita os campos de senha e confirmar senha e limpa e desabilita o campo de CNH
        this.ptxtSenhaGerente.setEnabled(true);
        this.ptxtConfirmarSenhaGerente.setEnabled(true);
        this.txtCnhEntregador.setText("");
        this.txtCnhEntregador.setEnabled(false);
    }//GEN-LAST:event_rdbGerenteActionPerformed

    private void txtSalarioInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalarioInicialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalarioInicialActionPerformed

    private void rdbGarcomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbGarcomActionPerformed
        // gera automaticamente o salario do funcionario a partir da função selecionada
        this.txtSalarioInicial.setText("1200.00");
        // limpa e desabilita os campos de senha, confirmar senha e CNH
        this.ptxtConfirmarSenhaGerente.setText("");
        this.ptxtSenhaGerente.setText("");
        this.txtCnhEntregador.setText("");
        this.ptxtSenhaGerente.setEnabled(false);
        this.ptxtConfirmarSenhaGerente.setEnabled(false);
        this.txtCnhEntregador.setEnabled(false);
    }//GEN-LAST:event_rdbGarcomActionPerformed

    private void rdbEntregadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbEntregadorActionPerformed
        // gera automaticamente o salario do funcionario a partir da função selecionada
        this.txtSalarioInicial.setText("1100.00");
        // habilita o campo de CNH e limpa e desabilita os campos de senha e confirmar senha
        this.txtCnhEntregador.setEnabled(true);
        this.ptxtSenhaGerente.setText("");
        this.ptxtConfirmarSenhaGerente.setText("");
        this.ptxtSenhaGerente.setEnabled(false);
        this.ptxtConfirmarSenhaGerente.setEnabled(false);
    }//GEN-LAST:event_rdbEntregadorActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGrupoFuncao;
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
