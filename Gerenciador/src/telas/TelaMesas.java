package telas;

import classes.Controle;
import classes.Sistema;
import javax.swing.JOptionPane;

public class TelaMesas extends javax.swing.JFrame {

            
    public TelaMesas() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        Controle.sistema = new Sistema();
        Controle.sistema.abrirSistema();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMesa1 = new javax.swing.JButton();
        btnMesa2 = new javax.swing.JButton();
        btnMesa3 = new javax.swing.JButton();
        btnMesa4 = new javax.swing.JButton();
        btnMesa5 = new javax.swing.JButton();
        btnMesa6 = new javax.swing.JButton();
        btnMesa7 = new javax.swing.JButton();
        btnMesa8 = new javax.swing.JButton();
        btnMesa9 = new javax.swing.JButton();
        btnMesa10 = new javax.swing.JButton();
        btnMesa11 = new javax.swing.JButton();
        btnMesa12 = new javax.swing.JButton();
        btnMesa13 = new javax.swing.JButton();
        btnMesa14 = new javax.swing.JButton();
        btnMesa15 = new javax.swing.JButton();
        btnMesa16 = new javax.swing.JButton();
        pnlMesaSelecionada = new javax.swing.JPanel();
        lblMesa = new javax.swing.JLabel();
        lblNumMesa = new javax.swing.JLabel();
        lblOcupada = new javax.swing.JLabel();
        lblCapacidade = new javax.swing.JLabel();
        lblDetalhesComanda = new javax.swing.JLabel();
        lblNumMesaDescricao = new javax.swing.JLabel();
        lblOcupadaDescricao = new javax.swing.JLabel();
        lblCapacidadeDescricao = new javax.swing.JLabel();
        pnlComandaMesa = new javax.swing.JPanel();
        lblIdComanda = new javax.swing.JLabel();
        lblClienteComanda = new javax.swing.JLabel();
        lblHoraPedidoComanda = new javax.swing.JLabel();
        lblValorParcialComanda = new javax.swing.JLabel();
        lblItensPedidosComanda = new javax.swing.JLabel();
        txtIdComanda = new javax.swing.JTextField();
        cmbClienteComanda = new javax.swing.JComboBox<>();
        txtHoraPedidoComanda = new javax.swing.JTextField();
        txtValorParcialComanda = new javax.swing.JTextField();
        lblGarcomComanda = new javax.swing.JLabel();
        cmbGarcomComanda = new javax.swing.JComboBox<>();
        scrItensPedidosComanda = new javax.swing.JScrollPane();
        tblItensPedidosComanda = new javax.swing.JTable();
        btnFecharComanda = new javax.swing.JButton();
        lblVisualizacaoMesas = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        mnCadastro = new javax.swing.JMenu();
        mniCadastrarCliente = new javax.swing.JMenuItem();
        mniCadastrarFuncionario = new javax.swing.JMenuItem();
        mnPedidos = new javax.swing.JMenu();
        mniPedidosSalao = new javax.swing.JMenuItem();
        mniPedidosDelivery = new javax.swing.JMenuItem();
        mnRelatórios = new javax.swing.JMenu();
        mniRelatorioClientes = new javax.swing.JMenuItem();
        mniRelatorioFuncionarios = new javax.swing.JMenuItem();
        mniRelatorioFinanceiro = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        mnSistema = new javax.swing.JMenu();
        mniSalvar = new javax.swing.JMenuItem();
        mniFecharSistema = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Carvalho's Grill");
        setAutoRequestFocus(false);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/CarvalhoGrill.png")).getImage());

        btnMesa1.setBackground(new java.awt.Color(242, 242, 242));
        btnMesa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/teste mesa 3.png"))); // NOI18N
        btnMesa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa1ActionPerformed(evt);
            }
        });

        btnMesa2.setBackground(new java.awt.Color(242, 242, 242));
        btnMesa2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/teste mesa 3.png"))); // NOI18N
        btnMesa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa2ActionPerformed(evt);
            }
        });

        btnMesa3.setBackground(new java.awt.Color(242, 242, 242));
        btnMesa3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/teste mesa 3.png"))); // NOI18N
        btnMesa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa3ActionPerformed(evt);
            }
        });

        btnMesa4.setBackground(new java.awt.Color(242, 242, 242));
        btnMesa4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/teste mesa 3.png"))); // NOI18N
        btnMesa4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa4ActionPerformed(evt);
            }
        });

        btnMesa5.setBackground(new java.awt.Color(242, 242, 242));
        btnMesa5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/teste mesa 3.png"))); // NOI18N
        btnMesa5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa5ActionPerformed(evt);
            }
        });

        btnMesa6.setBackground(new java.awt.Color(242, 242, 242));
        btnMesa6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/teste mesa 3.png"))); // NOI18N
        btnMesa6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51), 3));
        btnMesa6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa6ActionPerformed(evt);
            }
        });

        btnMesa7.setBackground(new java.awt.Color(242, 242, 242));
        btnMesa7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/teste mesa 3.png"))); // NOI18N
        btnMesa7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa7ActionPerformed(evt);
            }
        });

        btnMesa8.setBackground(new java.awt.Color(242, 242, 242));
        btnMesa8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/teste mesa 3.png"))); // NOI18N
        btnMesa8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa8ActionPerformed(evt);
            }
        });

        btnMesa9.setBackground(new java.awt.Color(242, 242, 242));
        btnMesa9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/teste mesa 3.png"))); // NOI18N
        btnMesa9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa9ActionPerformed(evt);
            }
        });

        btnMesa10.setBackground(new java.awt.Color(242, 242, 242));
        btnMesa10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/teste mesa 3.png"))); // NOI18N
        btnMesa10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa10ActionPerformed(evt);
            }
        });

        btnMesa11.setBackground(new java.awt.Color(242, 242, 242));
        btnMesa11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/teste mesa 3.png"))); // NOI18N
        btnMesa11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa11ActionPerformed(evt);
            }
        });

        btnMesa12.setBackground(new java.awt.Color(242, 242, 242));
        btnMesa12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/teste mesa 3.png"))); // NOI18N
        btnMesa12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa12ActionPerformed(evt);
            }
        });

        btnMesa13.setBackground(new java.awt.Color(242, 242, 242));
        btnMesa13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/teste mesa 3.png"))); // NOI18N
        btnMesa13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa13ActionPerformed(evt);
            }
        });

        btnMesa14.setBackground(new java.awt.Color(242, 242, 242));
        btnMesa14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/teste mesa 3.png"))); // NOI18N
        btnMesa14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa14ActionPerformed(evt);
            }
        });

        btnMesa15.setBackground(new java.awt.Color(242, 242, 242));
        btnMesa15.setForeground(new java.awt.Color(242, 242, 242));
        btnMesa15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/teste mesa 3.png"))); // NOI18N
        btnMesa15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa15ActionPerformed(evt);
            }
        });

        btnMesa16.setBackground(new java.awt.Color(242, 242, 242));
        btnMesa16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/teste mesa 3.png"))); // NOI18N
        btnMesa16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa16ActionPerformed(evt);
            }
        });

        pnlMesaSelecionada.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblMesa.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblMesa.setText("Mesa XX");

        lblNumMesa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNumMesa.setText("Nº da mesa:");

        lblOcupada.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblOcupada.setText("Ocupada:");

        lblCapacidade.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCapacidade.setText("Capacidade:");

        lblDetalhesComanda.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblDetalhesComanda.setText("Detalhes da comanda:");

        lblNumMesaDescricao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNumMesaDescricao.setText("XX");

        lblOcupadaDescricao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblOcupadaDescricao.setText("Não");

        lblCapacidadeDescricao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCapacidadeDescricao.setText("X pessoas");

        lblIdComanda.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblIdComanda.setText("ID:");

        lblClienteComanda.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblClienteComanda.setText("Cliente:");

        lblHoraPedidoComanda.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblHoraPedidoComanda.setText("Hora do pedido:");

        lblValorParcialComanda.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblValorParcialComanda.setText("Valor parcial:");

        lblItensPedidosComanda.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblItensPedidosComanda.setText("Itens pedidos:");

        cmbClienteComanda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente", " " }));
        cmbClienteComanda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbClienteComandaActionPerformed(evt);
            }
        });

        txtValorParcialComanda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorParcialComandaActionPerformed(evt);
            }
        });

        lblGarcomComanda.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblGarcomComanda.setText("Garçom:");

        cmbGarcomComanda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Garçom" }));

        tblItensPedidosComanda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Produto", "Quant"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Integer.class
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
        scrItensPedidosComanda.setViewportView(tblItensPedidosComanda);
        if (tblItensPedidosComanda.getColumnModel().getColumnCount() > 0) {
            tblItensPedidosComanda.getColumnModel().getColumn(0).setMaxWidth(80);
            tblItensPedidosComanda.getColumnModel().getColumn(2).setMaxWidth(55);
        }

        btnFecharComanda.setText("Fechar comanda");

        javax.swing.GroupLayout pnlComandaMesaLayout = new javax.swing.GroupLayout(pnlComandaMesa);
        pnlComandaMesa.setLayout(pnlComandaMesaLayout);
        pnlComandaMesaLayout.setHorizontalGroup(
            pnlComandaMesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlComandaMesaLayout.createSequentialGroup()
                .addGroup(pnlComandaMesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlComandaMesaLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblIdComanda))
                    .addGroup(pnlComandaMesaLayout.createSequentialGroup()
                        .addGap(0, 127, Short.MAX_VALUE)
                        .addGroup(pnlComandaMesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblValorParcialComanda)
                            .addComponent(lblHoraPedidoComanda)
                            .addComponent(lblClienteComanda)
                            .addComponent(lblGarcomComanda)
                            .addComponent(lblItensPedidosComanda)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlComandaMesaLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(btnFecharComanda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(pnlComandaMesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlComandaMesaLayout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(txtIdComanda, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))
                    .addGroup(pnlComandaMesaLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(pnlComandaMesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(scrItensPedidosComanda, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlComandaMesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cmbClienteComanda, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbGarcomComanda, 0, 170, Short.MAX_VALUE))
                            .addComponent(txtHoraPedidoComanda, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtValorParcialComanda, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))))
        );
        pnlComandaMesaLayout.setVerticalGroup(
            pnlComandaMesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlComandaMesaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnlComandaMesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdComanda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIdComanda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlComandaMesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbClienteComanda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblClienteComanda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlComandaMesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlComandaMesaLayout.createSequentialGroup()
                        .addComponent(lblGarcomComanda)
                        .addGap(18, 18, 18)
                        .addGroup(pnlComandaMesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHoraPedidoComanda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHoraPedidoComanda))
                        .addGap(18, 18, 18)
                        .addGroup(pnlComandaMesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblValorParcialComanda)
                            .addComponent(txtValorParcialComanda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(cmbGarcomComanda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnlComandaMesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlComandaMesaLayout.createSequentialGroup()
                        .addComponent(lblItensPedidosComanda)
                        .addGap(111, 111, 111)
                        .addComponent(btnFecharComanda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(scrItensPedidosComanda, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlMesaSelecionadaLayout = new javax.swing.GroupLayout(pnlMesaSelecionada);
        pnlMesaSelecionada.setLayout(pnlMesaSelecionadaLayout);
        pnlMesaSelecionadaLayout.setHorizontalGroup(
            pnlMesaSelecionadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMesaSelecionadaLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(pnlMesaSelecionadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMesaSelecionadaLayout.createSequentialGroup()
                        .addGroup(pnlMesaSelecionadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNumMesa, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCapacidade, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblOcupada, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(242, 242, 242)
                        .addGroup(pnlMesaSelecionadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNumMesaDescricao)
                            .addComponent(lblOcupadaDescricao)
                            .addComponent(lblCapacidadeDescricao))
                        .addGap(153, 153, 153))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMesaSelecionadaLayout.createSequentialGroup()
                        .addComponent(pnlComandaMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))))
            .addGroup(pnlMesaSelecionadaLayout.createSequentialGroup()
                .addGroup(pnlMesaSelecionadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMesaSelecionadaLayout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addComponent(lblMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlMesaSelecionadaLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(lblDetalhesComanda)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlMesaSelecionadaLayout.setVerticalGroup(
            pnlMesaSelecionadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMesaSelecionadaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblMesa)
                .addGap(76, 76, 76)
                .addGroup(pnlMesaSelecionadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumMesa)
                    .addComponent(lblNumMesaDescricao))
                .addGap(33, 33, 33)
                .addGroup(pnlMesaSelecionadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOcupada)
                    .addComponent(lblOcupadaDescricao))
                .addGap(35, 35, 35)
                .addGroup(pnlMesaSelecionadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCapacidade)
                    .addComponent(lblCapacidadeDescricao))
                .addGap(45, 45, 45)
                .addComponent(lblDetalhesComanda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlComandaMesa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblVisualizacaoMesas.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblVisualizacaoMesas.setText("Visualização das mesas");

        mnCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add_user.jpg"))); // NOI18N
        mnCadastro.setText("Cadastros");

        mniCadastrarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pessoa.png"))); // NOI18N
        mniCadastrarCliente.setText("Cadastrar Cliente");
        mniCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCadastrarClienteActionPerformed(evt);
            }
        });
        mnCadastro.add(mniCadastrarCliente);

        mniCadastrarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/funcionario.png"))); // NOI18N
        mniCadastrarFuncionario.setText("Cadastrar Funcionário");
        mniCadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCadastrarFuncionarioActionPerformed(evt);
            }
        });
        mnCadastro.add(mniCadastrarFuncionario);

        jMenuBar2.add(mnCadastro);

        mnPedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Comanda.png"))); // NOI18N
        mnPedidos.setText("Pedidos");

        mniPedidosSalao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/comidaPresencial.png"))); // NOI18N
        mniPedidosSalao.setText("Pedidos do salão");
        mniPedidosSalao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniPedidosSalaoActionPerformed(evt);
            }
        });
        mnPedidos.add(mniPedidosSalao);

        mniPedidosDelivery.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/comida delivery.png"))); // NOI18N
        mniPedidosDelivery.setText("Pedidos delivery");
        mniPedidosDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniPedidosDeliveryActionPerformed(evt);
            }
        });
        mnPedidos.add(mniPedidosDelivery);

        jMenuBar2.add(mnPedidos);

        mnRelatórios.setText("Relatórios");

        mniRelatorioClientes.setText("Clientes");
        mniRelatorioClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniRelatorioClientesActionPerformed(evt);
            }
        });
        mnRelatórios.add(mniRelatorioClientes);

        mniRelatorioFuncionarios.setText("Funcionários");
        mniRelatorioFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniRelatorioFuncionariosActionPerformed(evt);
            }
        });
        mnRelatórios.add(mniRelatorioFuncionarios);

        mniRelatorioFinanceiro.setText("Financeiro");
        mniRelatorioFinanceiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniRelatorioFinanceiroActionPerformed(evt);
            }
        });
        mnRelatórios.add(mniRelatorioFinanceiro);

        jMenuItem1.setText("Pedidos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnRelatórios.add(jMenuItem1);

        jMenuBar2.add(mnRelatórios);

        mnSistema.setText("Sistema");

        mniSalvar.setText("Salvar");
        mniSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSalvarActionPerformed(evt);
            }
        });
        mnSistema.add(mniSalvar);

        mniFecharSistema.setText("Fechar Sistema");
        mniFecharSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniFecharSistemaActionPerformed(evt);
            }
        });
        mnSistema.add(mniFecharSistema);

        jMenuBar2.add(mnSistema);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnMesa4, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnMesa8, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnMesa3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnMesa7, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnMesa2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(btnMesa6, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnMesa1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(btnMesa5, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnMesa9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnMesa10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnMesa11, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMesa12, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMesa16, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMesa14, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMesa13, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMesa15, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(lblVisualizacaoMesas)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 261, Short.MAX_VALUE)
                .addComponent(pnlMesaSelecionada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(257, 257, 257))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(lblVisualizacaoMesas)
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnMesa9, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnMesa13, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnMesa1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnMesa5, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMesa6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMesa2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMesa10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMesa14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMesa7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMesa11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMesa15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMesa3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMesa8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnMesa16, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnMesa12, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnMesa4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(pnlMesaSelecionada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(122, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniPedidosDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniPedidosDeliveryActionPerformed
        new NovoDelivery().setVisible(true);
    }

    private void btnMesa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa1ActionPerformed
        // habilita o painel de mesa selecionada e coloca as informações da mesa nos respectivos campos
        this.pnlMesaSelecionada.setEnabled(false);
        this.lblNumMesa.setText(String.valueOf(Controle.mesas.get(0).getNumeroMesa()));
        if (Controle.mesas.get(0).isDisponivel())
            this.lblOcupada.setText("Não");
        else
            this.lblOcupada.setText("Sim");
        this.lblCapacidade.setText(String.valueOf(Controle.mesas.get(0).getCapacidade()));
        this.txtIdComanda.setText(String.valueOf(Controle.mesas.get(0).getComanda().getIdComanda()));
        // combobox do cliente
        this.txtHoraPedidoComanda.setText(String.valueOf(Controle.mesas.get(0).getComanda().getHoraPedido()));
        // valor parcial
        // itens pedidos text area
        
    }

    private void btnMesa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa2ActionPerformed
        // TODO add your handling code here:
    }

    private void btnMesa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa3ActionPerformed
        // TODO add your handling code here:
    }

    private void btnMesa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa4ActionPerformed
        // TODO add your handling code here:
    }

    private void btnMesa5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa5ActionPerformed
        // TODO add your handling code here:
    }

    private void btnMesa6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa6ActionPerformed
        // TODO add your handling code here:
    }

    private void btnMesa7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa7ActionPerformed
        // TODO add your handling code here:
    }

    private void btnMesa8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa8ActionPerformed
        // TODO add your handling code here:
    }

    private void btnMesa9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa9ActionPerformed
        // TODO add your handling code here:
    }

    private void btnMesa10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa10ActionPerformed
        // TODO add your handling code here:
    }

    private void btnMesa11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa11ActionPerformed
        // TODO add your handling code here:
    }

    private void btnMesa12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa12ActionPerformed
        // TODO add your handling code here:
    }

    private void btnMesa13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa13ActionPerformed
        // TODO add your handling code here:
    }

    private void btnMesa14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa14ActionPerformed
        // TODO add your handling code here:
    }

    private void btnMesa15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa15ActionPerformed
        // TODO add your handling code here:
    }

    private void btnMesa16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa16ActionPerformed
        // TODO add your handling code here:
    }

    private void mniCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCadastrarClienteActionPerformed
        // abre a tela de cadastro de clientes
        new CadastroCliente().setVisible(true);
    }

    private void mniCadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCadastrarFuncionarioActionPerformed
        // abre a tela de cadastro de funcionarios
        new CadastroFuncionario().setVisible(true);
    }

    private void mniRelatorioClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniRelatorioClientesActionPerformed
        // abre a tela de relatorio dos clientes
        new RelatorioClientes().setVisible(true);
    }

    private void mniRelatorioFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniRelatorioFuncionariosActionPerformed
        // abre a tela de relatorio dos funcionarios
        new RelatorioFuncionarios().setVisible(true);
    }

    private void mniRelatorioFinanceiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniRelatorioFinanceiroActionPerformed
        // abre a tela de relatorio financeiro
        new RelatorioFinanceiro().setVisible(true);
    }

    private void txtValorParcialComandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorParcialComandaActionPerformed
        // TODO add your handling code here:
    }

    private void mniPedidosSalaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniPedidosSalaoActionPerformed
        new NovoPedido().setVisible(true);
    }

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new RelatorioPedidos().setVisible(true);
    }

    private void mniFecharSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniFecharSistemaActionPerformed
        new AutorizacaoGerente().setVisible(true);
        // TODO add your handling code here:
    }

    private void mniSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSalvarActionPerformed
        JOptionPane.showMessageDialog(null, "As informações foram salvas com sucesso.", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
    }

    private void cmbClienteComandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbClienteComandaActionPerformed
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
            java.util.logging.Logger.getLogger(TelaMesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMesas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFecharComanda;
    private javax.swing.JButton btnMesa1;
    private javax.swing.JButton btnMesa10;
    private javax.swing.JButton btnMesa11;
    private javax.swing.JButton btnMesa12;
    private javax.swing.JButton btnMesa13;
    private javax.swing.JButton btnMesa14;
    private javax.swing.JButton btnMesa15;
    private javax.swing.JButton btnMesa16;
    private javax.swing.JButton btnMesa2;
    private javax.swing.JButton btnMesa3;
    private javax.swing.JButton btnMesa4;
    private javax.swing.JButton btnMesa5;
    private javax.swing.JButton btnMesa6;
    private javax.swing.JButton btnMesa7;
    private javax.swing.JButton btnMesa8;
    private javax.swing.JButton btnMesa9;
    private javax.swing.JComboBox<String> cmbClienteComanda;
    private javax.swing.JComboBox<String> cmbGarcomComanda;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel lblCapacidade;
    private javax.swing.JLabel lblCapacidadeDescricao;
    private javax.swing.JLabel lblClienteComanda;
    private javax.swing.JLabel lblDetalhesComanda;
    private javax.swing.JLabel lblGarcomComanda;
    private javax.swing.JLabel lblHoraPedidoComanda;
    private javax.swing.JLabel lblIdComanda;
    private javax.swing.JLabel lblItensPedidosComanda;
    private javax.swing.JLabel lblMesa;
    private javax.swing.JLabel lblNumMesa;
    private javax.swing.JLabel lblNumMesaDescricao;
    private javax.swing.JLabel lblOcupada;
    private javax.swing.JLabel lblOcupadaDescricao;
    private javax.swing.JLabel lblValorParcialComanda;
    private javax.swing.JLabel lblVisualizacaoMesas;
    private javax.swing.JMenu mnCadastro;
    private javax.swing.JMenu mnPedidos;
    private javax.swing.JMenu mnRelatórios;
    private javax.swing.JMenu mnSistema;
    private javax.swing.JMenuItem mniCadastrarCliente;
    private javax.swing.JMenuItem mniCadastrarFuncionario;
    private javax.swing.JMenuItem mniFecharSistema;
    private javax.swing.JMenuItem mniPedidosDelivery;
    private javax.swing.JMenuItem mniPedidosSalao;
    private javax.swing.JMenuItem mniRelatorioClientes;
    private javax.swing.JMenuItem mniRelatorioFinanceiro;
    private javax.swing.JMenuItem mniRelatorioFuncionarios;
    private javax.swing.JMenuItem mniSalvar;
    private javax.swing.JPanel pnlComandaMesa;
    private javax.swing.JPanel pnlMesaSelecionada;
    private javax.swing.JScrollPane scrItensPedidosComanda;
    private javax.swing.JTable tblItensPedidosComanda;
    private javax.swing.JTextField txtHoraPedidoComanda;
    private javax.swing.JTextField txtIdComanda;
    private javax.swing.JTextField txtValorParcialComanda;
    // End of variables declaration//GEN-END:variables
}
