package telas;

import classes.CardapioTableModel;
import classes.Cliente;
import classes.Comanda;
import classes.ComandaTableModel;
import classes.Controle;
import classes.Funcionario;
import classes.Garcom;
import classes.ItemPedido;
import classes.Mesa;
import classes.Produto;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 * Classe para a tela de novo pedido delivery
 */
public class NovoPedido extends javax.swing.JFrame {

    /** Atributo para armazenar um CardapioTableModel */
    private CardapioTableModel modeloCardapio;
    
    /** Atributo para armazenar um ComandaTableModel */
    private ComandaTableModel modeloComanda;
    
    /**
     * Creates new form NovoPedido
     */
    
    /**
     * Método construtor da classe, para quando se clica em novo pedido no menu da tela principal
     */
    public NovoPedido() {
        initComponents();
        this.modeloCardapio = new CardapioTableModel();
        this.modeloComanda = new ComandaTableModel();
        this.tblCardapioItems.setModel(modeloCardapio);
        this.tblComandaMesa.setModel(modeloComanda);
        carregarGarcons();
    }
    
    /**
     * Método construtor da classe, para quando se clica no botão Comanda da tela principal
     * @param indice Índice da mesa selecionada na tela principal
     */
    public NovoPedido(int indice) {
        initComponents();
        this.modeloCardapio = new CardapioTableModel();
        this.modeloComanda = new ComandaTableModel();
        this.tblCardapioItems.setModel(modeloCardapio);
        this.tblComandaMesa.setModel(modeloComanda);
        // deixa a mesa já selecionada e inalterável
        this.cmbMesa.setSelectedIndex(indice);
        this.cmbMesa.setEnabled(false);
        carregarGarcons();
    }

    /**
     * Método para carregar a combobox dos garçons
     */
    private void carregarGarcons() {
        cmbGarcom.removeAllItems();
        this.cmbGarcom.addItem("Selecione");
        for (Funcionario func : Controle.funcionarios) {
            if (func instanceof Garcom)
                this.cmbGarcom.addItem(func.getNome());
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVoltar = new javax.swing.JButton();
        pnlCardapio = new javax.swing.JPanel();
        scrSelecionarItemCardapio = new javax.swing.JScrollPane();
        tblCardapioItems = new javax.swing.JTable();
        btnAdicionar = new javax.swing.JButton();
        lblSelecioneItem = new javax.swing.JLabel();
        lblQuantidade = new javax.swing.JLabel();
        spnQuantidade = new javax.swing.JSpinner();
        pnlComanda = new javax.swing.JPanel();
        scrComandaMesa = new javax.swing.JScrollPane();
        tblComandaMesa = new javax.swing.JTable();
        btnLançar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        lblGarçom = new javax.swing.JLabel();
        cmbGarcom = new javax.swing.JComboBox<>();
        lblMesa = new javax.swing.JLabel();
        cmbMesa = new javax.swing.JComboBox<>();
        lblCpfCliente = new javax.swing.JLabel();
        ftxtCpfCliente = new javax.swing.JFormattedTextField();
        btnImagemPesquisar = new javax.swing.JButton();
        txtPesquisar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Comanda do salão");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/comidaPresencial.png")).getImage());

        btnVoltar.setBackground(new java.awt.Color(242, 242, 242));
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/3643764-back-backward-left-reply-turn_113415 (1).png"))); // NOI18N
        btnVoltar.setBorder(null);
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        pnlCardapio.setBorder(javax.swing.BorderFactory.createTitledBorder("Cardápio"));

        tblCardapioItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Prato", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class
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
        tblCardapioItems.getTableHeader().setReorderingAllowed(false);
        scrSelecionarItemCardapio.setViewportView(tblCardapioItems);
        if (tblCardapioItems.getColumnModel().getColumnCount() > 0) {
            tblCardapioItems.getColumnModel().getColumn(0).setMaxWidth(80);
            tblCardapioItems.getColumnModel().getColumn(2).setMinWidth(150);
            tblCardapioItems.getColumnModel().getColumn(2).setMaxWidth(200);
        }

        javax.swing.GroupLayout pnlCardapioLayout = new javax.swing.GroupLayout(pnlCardapio);
        pnlCardapio.setLayout(pnlCardapioLayout);
        pnlCardapioLayout.setHorizontalGroup(
            pnlCardapioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrSelecionarItemCardapio, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        pnlCardapioLayout.setVerticalGroup(
            pnlCardapioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrSelecionarItemCardapio, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
        );

        btnAdicionar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnAdicionar.setText("Adicionar");
        btnAdicionar.setToolTipText("Adicione o produto selecionado na comanda");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        lblSelecioneItem.setText("Selecione o item que deseja adicionar a comanda");

        lblQuantidade.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblQuantidade.setText("Quantidade: ");

        spnQuantidade.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        pnlComanda.setBorder(javax.swing.BorderFactory.createTitledBorder("Comanda"));

        tblComandaMesa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Prato", "Quantidade", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
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
        tblComandaMesa.getTableHeader().setReorderingAllowed(false);
        scrComandaMesa.setViewportView(tblComandaMesa);
        if (tblComandaMesa.getColumnModel().getColumnCount() > 0) {
            tblComandaMesa.getColumnModel().getColumn(0).setResizable(false);
            tblComandaMesa.getColumnModel().getColumn(0).setPreferredWidth(320);
            tblComandaMesa.getColumnModel().getColumn(1).setResizable(false);
            tblComandaMesa.getColumnModel().getColumn(1).setPreferredWidth(30);
            tblComandaMesa.getColumnModel().getColumn(2).setResizable(false);
        }

        btnLançar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnLançar.setText("Lançar");
        btnLançar.setToolTipText("Lance a comanda no sistema");
        btnLançar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLançarActionPerformed(evt);
            }
        });

        btnRemover.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnRemover.setText("Remover");
        btnRemover.setToolTipText("Remova da comanda o item selecionado");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        lblGarçom.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblGarçom.setText("Garçom:");

        cmbGarcom.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cmbGarcom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        cmbGarcom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbGarcomActionPerformed(evt);
            }
        });

        lblMesa.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblMesa.setText("Mesa:");

        cmbMesa.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cmbMesa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Mesa 1", "Mesa 2", "Mesa 3", "Mesa 4", "Mesa 5", "Mesa 6", "Mesa 7", "Mesa 8", "Mesa 9", "Mesa 10", "Mesa 11", "Mesa 12", "Mesa 13", "Mesa14", "Mesa 15", "Mesa 16" }));

        lblCpfCliente.setText("CPF do cliente:");

        try {
            ftxtCpfCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxtCpfCliente.setToolTipText("Insira o CPF do cliente");

        javax.swing.GroupLayout pnlComandaLayout = new javax.swing.GroupLayout(pnlComanda);
        pnlComanda.setLayout(pnlComandaLayout);
        pnlComandaLayout.setHorizontalGroup(
            pnlComandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlComandaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlComandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlComandaLayout.createSequentialGroup()
                        .addComponent(scrComandaMesa)
                        .addContainerGap())
                    .addGroup(pnlComandaLayout.createSequentialGroup()
                        .addGroup(pnlComandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlComandaLayout.createSequentialGroup()
                                .addComponent(btnRemover)
                                .addGap(18, 18, 18)
                                .addComponent(lblGarçom)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbGarcom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblMesa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlComandaLayout.createSequentialGroup()
                                .addGap(255, 255, 255)
                                .addComponent(btnLançar)))
                        .addGroup(pnlComandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlComandaLayout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(lblCpfCliente))
                            .addGroup(pnlComandaLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(ftxtCpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        pnlComandaLayout.setVerticalGroup(
            pnlComandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlComandaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrComandaMesa, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlComandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRemover, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(lblGarçom)
                    .addComponent(cmbGarcom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMesa)
                    .addComponent(cmbMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCpfCliente))
                .addGroup(pnlComandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlComandaLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btnLançar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlComandaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ftxtCpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        btnImagemPesquisar.setBackground(new java.awt.Color(242, 242, 242));
        btnImagemPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/magnifier-1_icon-icons.com_56924 (1).png"))); // NOI18N
        btnImagemPesquisar.setToolTipText("Pesquisar");
        btnImagemPesquisar.setBorder(null);
        btnImagemPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImagemPesquisarActionPerformed(evt);
            }
        });

        txtPesquisar.setToolTipText("Pesquise pelo ID único do produto");
        txtPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPesquisarKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCardapio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVoltar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(lblSelecioneItem, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPesquisar)
                .addGap(18, 18, 18)
                .addComponent(btnImagemPesquisar)
                .addGap(70, 70, 70))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlComanda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lblQuantidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spnQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                        .addComponent(btnAdicionar)
                        .addGap(353, 353, 353)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblSelecioneItem, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnImagemPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlCardapio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblQuantidade, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAdicionar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnQuantidade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlComanda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(9, 9, 9))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // fecha a tela do Novo Pedido 
        this.setVisible(false);

    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        // adiciona o prato selecionado, de acordo com a quantidade, na comanda
        try {
            Produto produto = this.modeloCardapio.getProduto(this.tblCardapioItems.getSelectedRow());
            ItemPedido item = new ItemPedido(produto, Integer.parseInt(this.spnQuantidade.getValue().toString()));
            this.modeloComanda.addItemPedido(item);
            this.spnQuantidade.setValue(1);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Selecione um prato para adicionar.", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        // remove o item selecionado da comanda
        try {
            this.modeloComanda.remove(this.tblComandaMesa.getSelectedRow());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Selecione um item para remover.", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnImagemPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImagemPesquisarActionPerformed
        // quando clicado, faz a pesquisa do ID digitado
        boolean achou = false;
        for (int i=0; i<modeloCardapio.getRowCount(); i++) {
            if (String.valueOf(this.modeloCardapio.getValueAt(i, 0)).equals(this.txtPesquisar.getText().trim())) {
                achou = true;
                this.tblCardapioItems.setRowSelectionInterval(i, i);
            }
        }
        if (!achou)
                JOptionPane.showMessageDialog(null, "Não foi encontrado um produto com o ID digitado.", "Atenção", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_btnImagemPesquisarActionPerformed

    private void btnLançarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLançarActionPerformed
        // cria uma nova comanda com as informações da tela
        if (this.modeloComanda.isEmpty())
            // se a comanda estiver vazia, não é instanciada
            JOptionPane.showMessageDialog(null, "A comanda está vazia!", "Atenção", JOptionPane.WARNING_MESSAGE);
        else {
            try {
                if (Controle.mesas.get(this.cmbMesa.getSelectedIndex()-1).isDisponivel()) {
                    // caso a mesa não esteja ocupada, permite prosseguir
                    if (this.cmbGarcom.getSelectedIndex() == 0) {
                        JOptionPane.showMessageDialog(null, "O garçom não foi selecionado!", "Atenção", JOptionPane.WARNING_MESSAGE);
                    } else {
                        boolean erro_cliente = false;
                        try {
                            Comanda comanda = new Comanda(Controle.mesas.get(this.cmbMesa.getSelectedIndex()-1));
                            if (!this.ftxtCpfCliente.getText().equals("   .   .   -  ")) {
                                for (Cliente c : Controle.clientes) {
                                    if (c.getCPF().equals(this.ftxtCpfCliente.getText())) {
                                        comanda.setCliente(c);
                                        break;
                                    }
                                }
                                if (comanda.getCliente() == null) {
                                    erro_cliente = true;
                                    comanda.getCliente().getNome(); // apenas para gerar erro
                                }
                                if (comanda.getCliente().ganharBrinde()) {
                                    this.modeloComanda.addItemPedido(comanda.addBrinde());
                                    JOptionPane.showMessageDialog(null, "Cliente aniversariante! Foi adicionado um brownie na comanda!", "Aniversariante", JOptionPane.PLAIN_MESSAGE);
                                }
                            }

                            for (int i=0; i<modeloComanda.getRowCount(); i++)
                                comanda.getItens().add(modeloComanda.getItemPedido(i));

                            for (Funcionario func : Controle.funcionarios) {
                                if (func instanceof Garcom && func.getNome().equals(this.cmbGarcom.getSelectedItem()))
                                    comanda.setGarcom((Garcom) func);
                            }
                            comanda.getMesa().setDisponivel(false);
                            comanda.getMesa().colorirBotao();
                            Mesa mesa = Controle.mesas.get(this.cmbMesa.getSelectedIndex()-1);
                            mesa.setComanda(comanda);
                            Controle.comandas.add(comanda);



                            JOptionPane.showMessageDialog(null, "Comanda lançada com sucesso.", "Lançada", JOptionPane.INFORMATION_MESSAGE);
                            this.setVisible(false);

                        } catch (Exception e) {
                            if (!erro_cliente)
                                JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos!", "Atenção", JOptionPane.WARNING_MESSAGE);
                            else
                                JOptionPane.showMessageDialog(null, "Não foi encontrado um cliente cadastrado com o CPF digitado.", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                        }

                    }
                } else // caso a mesa já esteja ocupada
                    JOptionPane.showMessageDialog(null, "A mesa selecionada já está ocupada!", "Atenção", JOptionPane.WARNING_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "A mesa não foi selecionada!", "Atenção", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnLançarActionPerformed

    private void cmbGarcomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbGarcomActionPerformed
        // combo box para adicionar o garçom na comanda
    }//GEN-LAST:event_cmbGarcomActionPerformed

    private void txtPesquisarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarKeyPressed
        // pesquisar pela tecla Enter
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            // quando clicado, faz a pesquisa do ID digitado
            boolean achou = false;
            for (int i=0; i<modeloCardapio.getRowCount(); i++) {
                if (String.valueOf(this.modeloCardapio.getValueAt(i, 0)).equals(this.txtPesquisar.getText().trim())) {
                    achou = true;
                    this.tblCardapioItems.setRowSelectionInterval(i, i);
                }
            }
            if (!achou)
                    JOptionPane.showMessageDialog(null, "Não foi encontrado um produto com o ID digitado.", "Atenção", JOptionPane.WARNING_MESSAGE);
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
            java.util.logging.Logger.getLogger(NovoPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NovoPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NovoPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NovoPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NovoPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnImagemPesquisar;
    private javax.swing.JButton btnLançar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cmbGarcom;
    private javax.swing.JComboBox<String> cmbMesa;
    private javax.swing.JFormattedTextField ftxtCpfCliente;
    private javax.swing.JLabel lblCpfCliente;
    private javax.swing.JLabel lblGarçom;
    private javax.swing.JLabel lblMesa;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JLabel lblSelecioneItem;
    private javax.swing.JPanel pnlCardapio;
    private javax.swing.JPanel pnlComanda;
    private javax.swing.JScrollPane scrComandaMesa;
    private javax.swing.JScrollPane scrSelecionarItemCardapio;
    private javax.swing.JSpinner spnQuantidade;
    private javax.swing.JTable tblCardapioItems;
    private javax.swing.JTable tblComandaMesa;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables
}
