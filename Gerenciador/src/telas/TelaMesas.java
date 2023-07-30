package telas;

import classes.Comanda;
import classes.ComandaTableModel;
import classes.Controle;
import classes.Mesa;
import java.time.format.DateTimeFormatter;

/**
 * Classe para a tela das mesas (tela principal)
 */
public class TelaMesas extends javax.swing.JFrame {

    /**
     * Método construtor da classe
     */        
    public TelaMesas() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        this.btnMesa1.requestFocus();

        // instancia todas as mesas e atribui os respectivos botões a elas
        Mesa mesa1 = new Mesa(1, 10);
        Mesa mesa2 = new Mesa(2, 4);
        Mesa mesa3 = new Mesa(3, 5);
        Mesa mesa4 = new Mesa(4, 8);
        Mesa mesa5 = new Mesa(5, 10);
        Mesa mesa6 = new Mesa(6, 4);
        Mesa mesa7 = new Mesa(7, 10);
        Mesa mesa8 = new Mesa(8, 6);
        Mesa mesa9 = new Mesa(9, 9);
        Mesa mesa10 = new Mesa(10, 8);
        Mesa mesa11 = new Mesa(11, 6);
        Mesa mesa12 = new Mesa(12, 4);
        Mesa mesa13 = new Mesa(13, 6);
        Mesa mesa14 = new Mesa(14, 4);
        Mesa mesa15 = new Mesa(15, 4);
        Mesa mesa16 = new Mesa(16, 4);
        mesa1.setBotao(btnMesa1);
        mesa2.setBotao(btnMesa2);
        mesa3.setBotao(btnMesa3);
        mesa4.setBotao(btnMesa4);
        mesa5.setBotao(btnMesa5);
        mesa6.setBotao(btnMesa6);
        mesa7.setBotao(btnMesa7);
        mesa8.setBotao(btnMesa8);
        mesa9.setBotao(btnMesa9);
        mesa10.setBotao(btnMesa10);
        mesa11.setBotao(btnMesa11);
        mesa12.setBotao(btnMesa12);
        mesa13.setBotao(btnMesa13);
        mesa14.setBotao(btnMesa14);
        mesa15.setBotao(btnMesa15);
        mesa16.setBotao(btnMesa16);
        Controle.mesas.add(mesa1);
        Controle.mesas.add(mesa2);
        Controle.mesas.add(mesa3);
        Controle.mesas.add(mesa4);
        Controle.mesas.add(mesa5);
        Controle.mesas.add(mesa6);
        Controle.mesas.add(mesa7);
        Controle.mesas.add(mesa8);
        Controle.mesas.add(mesa9);
        Controle.mesas.add(mesa10);
        Controle.mesas.add(mesa11);
        Controle.mesas.add(mesa12);
        Controle.mesas.add(mesa13);
        Controle.mesas.add(mesa14);
        Controle.mesas.add(mesa15);
        Controle.mesas.add(mesa16);
    }

    /**
     * Método para mostrar as informações da mesa selecionada na tela
     * @param mesa Mesa seleiconada para serem mostradas suas informações
     */
    private void mostraInfos(Mesa mesa) {
        // coloca as informações da mesa nos respectivos campos
        // método chamado por todos os botões das mesas
        this.lblMesa.setText("Mesa " + mostraNumMesa(mesa));
        this.lblNumMesaDescricao.setText(mostraNumMesa(mesa));
        if (mesa.isDisponivel())
            this.lblOcupadaDescricao.setText("Não");
        else
            this.lblOcupadaDescricao.setText("Sim");
        this.lblCapacidadeDescricao.setText(String.valueOf(mesa.getCapacidade()) + " pessoas");
        
        // a partir desses, verifica se na mesa há uma comanda antes de preencher os campos
        try {
            this.lblIdComandaDescricao.setText(String.valueOf(mesa.getComanda().getIdComanda()));
        } catch (Exception e) {
            this.lblIdComandaDescricao.setText("N/A");
        }
        try {
            this.lblHoraPedidoComandaDescricao.setText(mesa.getComanda().getHoraPedido().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        } catch (Exception e) {
            this.lblHoraPedidoComandaDescricao.setText("N/A");
        }
        try {
            mesa.getComanda();
            if (mesa.getComanda().getCliente() != null)
                this.lblClienteComandaDescricao.setText(String.valueOf(mesa.getComanda().getCliente().getNome()));
            else
                this.lblClienteComandaDescricao.setText("N/A");
        } catch (Exception e) {
            this.lblClienteComandaDescricao.setText("N/A");
        }
        try {
            this.lblGarcomComandaDescricao.setText(String.valueOf(mesa.getComanda().getGarcom().getNome()));
        } catch(Exception e) {
            this.lblGarcomComandaDescricao.setText("N/A");
        }
        try {
            mesa.getComanda().calculaValorParcial();
            this.lblValorParcialComandaDescricao.setText(String.format("%.2f", mesa.getComanda().getValorTotal()) + " reais");
        } catch(Exception e) {
            this.lblValorParcialComandaDescricao.setText("N/A");
        }
        try {
            if (mesa.getComanda() != null) {
                ComandaTableModel modelo = new ComandaTableModel();
                modelo.addLista(mesa.getComanda().getItens());
                this.tblItensPedidosComanda.setModel(modelo);
            } else {
                ComandaTableModel modelo = new ComandaTableModel();
                this.tblItensPedidosComanda.setModel(modelo);
            }
        } catch (Exception e) {
            ComandaTableModel modelo = new ComandaTableModel();
            this.tblItensPedidosComanda.setModel(modelo);
        }
    }
    
    /**
     * Método para mostrar o número da mesa de maneira formatada
     * @param mesa Mesa seleiconada para serem mostradas suas informações
     * @return Retorna uma String que é o texto formatado para aparecer na tela
     */
    private String mostraNumMesa(Mesa mesa) {
        // apenas mostra o número da mesa de maneira mais elegante
        if (mesa.getNumeroMesa() >= 10)
            return String.valueOf(mesa.getNumeroMesa());
        else
            return "0" + String.valueOf(mesa.getNumeroMesa());
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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
        lblGarcomComanda = new javax.swing.JLabel();
        scrItensPedidosComanda = new javax.swing.JScrollPane();
        tblItensPedidosComanda = new javax.swing.JTable();
        btnComandaEspecial = new javax.swing.JButton();
        lblIdComandaDescricao = new javax.swing.JLabel();
        lblClienteComandaDescricao = new javax.swing.JLabel();
        lblGarcomComandaDescricao = new javax.swing.JLabel();
        lblHoraPedidoComandaDescricao = new javax.swing.JLabel();
        lblValorParcialComandaDescricao = new javax.swing.JLabel();
        lblVisualizacaoMesas = new javax.swing.JLabel();
        jmbPrincipal = new javax.swing.JMenuBar();
        mnCadastro = new javax.swing.JMenu();
        mniCadastrarCliente = new javax.swing.JMenuItem();
        mniCadastrarFuncionario = new javax.swing.JMenuItem();
        mnPedidos = new javax.swing.JMenu();
        mniNovoPedidoSalao = new javax.swing.JMenuItem();
        mniNovoPedidoDelivery = new javax.swing.JMenuItem();
        mnRelatórios = new javax.swing.JMenu();
        mniRelatorioPedidos = new javax.swing.JMenuItem();
        mniRelatorioFuncionarios = new javax.swing.JMenuItem();
        mniRelatorioClientes = new javax.swing.JMenuItem();
        mniRelatorioGeral = new javax.swing.JMenuItem();
        mnCardapio = new javax.swing.JMenu();
        mniEditarCardapio = new javax.swing.JMenuItem();
        mnSistema = new javax.swing.JMenu();
        mniFecharSistema = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Carvalho's Grill");
        setAutoRequestFocus(false);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/CarvalhoGrill.png")).getImage());

        btnMesa1.setBackground(new java.awt.Color(242, 242, 242));
        btnMesa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/teste mesa 3.png"))); // NOI18N
        btnMesa1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        btnMesa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa1ActionPerformed(evt);
            }
        });

        btnMesa2.setBackground(new java.awt.Color(242, 242, 242));
        btnMesa2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/teste mesa 3.png"))); // NOI18N
        btnMesa2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        btnMesa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa2ActionPerformed(evt);
            }
        });

        btnMesa3.setBackground(new java.awt.Color(242, 242, 242));
        btnMesa3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/teste mesa 3.png"))); // NOI18N
        btnMesa3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        btnMesa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa3ActionPerformed(evt);
            }
        });

        btnMesa4.setBackground(new java.awt.Color(242, 242, 242));
        btnMesa4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/teste mesa 3.png"))); // NOI18N
        btnMesa4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        btnMesa4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa4ActionPerformed(evt);
            }
        });

        btnMesa5.setBackground(new java.awt.Color(242, 242, 242));
        btnMesa5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/teste mesa 3.png"))); // NOI18N
        btnMesa5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        btnMesa5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa5ActionPerformed(evt);
            }
        });

        btnMesa6.setBackground(new java.awt.Color(242, 242, 242));
        btnMesa6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/teste mesa 3.png"))); // NOI18N
        btnMesa6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        btnMesa6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa6ActionPerformed(evt);
            }
        });

        btnMesa7.setBackground(new java.awt.Color(242, 242, 242));
        btnMesa7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/teste mesa 3.png"))); // NOI18N
        btnMesa7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        btnMesa7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa7ActionPerformed(evt);
            }
        });

        btnMesa8.setBackground(new java.awt.Color(242, 242, 242));
        btnMesa8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/teste mesa 3.png"))); // NOI18N
        btnMesa8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        btnMesa8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa8ActionPerformed(evt);
            }
        });

        btnMesa9.setBackground(new java.awt.Color(242, 242, 242));
        btnMesa9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/teste mesa 3.png"))); // NOI18N
        btnMesa9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        btnMesa9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa9ActionPerformed(evt);
            }
        });

        btnMesa10.setBackground(new java.awt.Color(242, 242, 242));
        btnMesa10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/teste mesa 3.png"))); // NOI18N
        btnMesa10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        btnMesa10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa10ActionPerformed(evt);
            }
        });

        btnMesa11.setBackground(new java.awt.Color(242, 242, 242));
        btnMesa11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/teste mesa 3.png"))); // NOI18N
        btnMesa11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        btnMesa11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa11ActionPerformed(evt);
            }
        });

        btnMesa12.setBackground(new java.awt.Color(242, 242, 242));
        btnMesa12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/teste mesa 3.png"))); // NOI18N
        btnMesa12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        btnMesa12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa12ActionPerformed(evt);
            }
        });

        btnMesa13.setBackground(new java.awt.Color(242, 242, 242));
        btnMesa13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/teste mesa 3.png"))); // NOI18N
        btnMesa13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        btnMesa13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa13ActionPerformed(evt);
            }
        });

        btnMesa14.setBackground(new java.awt.Color(242, 242, 242));
        btnMesa14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/teste mesa 3.png"))); // NOI18N
        btnMesa14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        btnMesa14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa14ActionPerformed(evt);
            }
        });

        btnMesa15.setBackground(new java.awt.Color(242, 242, 242));
        btnMesa15.setForeground(new java.awt.Color(242, 242, 242));
        btnMesa15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/teste mesa 3.png"))); // NOI18N
        btnMesa15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        btnMesa15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa15ActionPerformed(evt);
            }
        });

        btnMesa16.setBackground(new java.awt.Color(242, 242, 242));
        btnMesa16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/teste mesa 3.png"))); // NOI18N
        btnMesa16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        btnMesa16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa16ActionPerformed(evt);
            }
        });

        pnlMesaSelecionada.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblMesa.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblMesa.setText("Mesa 01");

        lblNumMesa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNumMesa.setText("Nº da mesa:");

        lblOcupada.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblOcupada.setText("Ocupada:");

        lblCapacidade.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCapacidade.setText("Capacidade:");

        lblDetalhesComanda.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblDetalhesComanda.setText("Detalhes da comanda:");

        lblNumMesaDescricao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNumMesaDescricao.setText("1");

        lblOcupadaDescricao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblOcupadaDescricao.setText("Não");

        lblCapacidadeDescricao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCapacidadeDescricao.setText("5 pessoas");

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

        lblGarcomComanda.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblGarcomComanda.setText("Garçom:");

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
        tblItensPedidosComanda.getTableHeader().setReorderingAllowed(false);
        scrItensPedidosComanda.setViewportView(tblItensPedidosComanda);
        if (tblItensPedidosComanda.getColumnModel().getColumnCount() > 0) {
            tblItensPedidosComanda.getColumnModel().getColumn(0).setResizable(false);
            tblItensPedidosComanda.getColumnModel().getColumn(1).setResizable(false);
            tblItensPedidosComanda.getColumnModel().getColumn(2).setResizable(false);
        }

        btnComandaEspecial.setText("Comanda");
        btnComandaEspecial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComandaEspecialActionPerformed(evt);
            }
        });

        lblIdComandaDescricao.setText("N/A");

        lblClienteComandaDescricao.setText("N/A");

        lblGarcomComandaDescricao.setText("N/A");

        lblHoraPedidoComandaDescricao.setText("N/A");

        lblValorParcialComandaDescricao.setText("N/A");

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
                        .addGap(61, 61, 61)
                        .addComponent(btnComandaEspecial)))
                .addGap(18, 18, 18)
                .addGroup(pnlComandaMesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlComandaMesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(scrItensPedidosComanda, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlComandaMesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblValorParcialComandaDescricao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                            .addComponent(lblHoraPedidoComandaDescricao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblClienteComandaDescricao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblGarcomComandaDescricao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(lblIdComandaDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        pnlComandaMesaLayout.setVerticalGroup(
            pnlComandaMesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlComandaMesaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnlComandaMesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdComanda)
                    .addComponent(lblIdComandaDescricao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlComandaMesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblClienteComanda)
                    .addComponent(lblClienteComandaDescricao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlComandaMesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGarcomComanda)
                    .addComponent(lblGarcomComandaDescricao))
                .addGap(18, 18, 18)
                .addGroup(pnlComandaMesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHoraPedidoComanda)
                    .addComponent(lblHoraPedidoComandaDescricao))
                .addGap(18, 18, 18)
                .addGroup(pnlComandaMesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValorParcialComanda)
                    .addComponent(lblValorParcialComandaDescricao))
                .addGap(14, 14, 14)
                .addGroup(pnlComandaMesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlComandaMesaLayout.createSequentialGroup()
                        .addComponent(lblItensPedidosComanda)
                        .addGap(111, 111, 111)
                        .addComponent(btnComandaEspecial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        mniCadastrarCliente.setToolTipText("");
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

        jmbPrincipal.add(mnCadastro);

        mnPedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Comanda.png"))); // NOI18N
        mnPedidos.setText("Pedidos");

        mniNovoPedidoSalao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/comidaPresencial.png"))); // NOI18N
        mniNovoPedidoSalao.setText("Novo Pedido salão");
        mniNovoPedidoSalao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniNovoPedidoSalaoActionPerformed(evt);
            }
        });
        mnPedidos.add(mniNovoPedidoSalao);

        mniNovoPedidoDelivery.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Delivery.png"))); // NOI18N
        mniNovoPedidoDelivery.setText("Novo Pedido delivery");
        mniNovoPedidoDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniNovoPedidoDeliveryActionPerformed(evt);
            }
        });
        mnPedidos.add(mniNovoPedidoDelivery);

        jmbPrincipal.add(mnPedidos);

        mnRelatórios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/book_learning_notebook_reading_study_icon_127253.png"))); // NOI18N
        mnRelatórios.setText("Relatórios");

        mniRelatorioPedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/garfo com comida.png"))); // NOI18N
        mniRelatorioPedidos.setText("Pedidos");
        mniRelatorioPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniRelatorioPedidosActionPerformed(evt);
            }
        });
        mnRelatórios.add(mniRelatorioPedidos);

        mniRelatorioFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/funcionario relatorio.png"))); // NOI18N
        mniRelatorioFuncionarios.setText("Funcionários");
        mniRelatorioFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniRelatorioFuncionariosActionPerformed(evt);
            }
        });
        mnRelatórios.add(mniRelatorioFuncionarios);

        mniRelatorioClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pessoas relatorio.png"))); // NOI18N
        mniRelatorioClientes.setText("Clientes");
        mniRelatorioClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniRelatorioClientesActionPerformed(evt);
            }
        });
        mnRelatórios.add(mniRelatorioClientes);

        mniRelatorioGeral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Geral relatorio.png"))); // NOI18N
        mniRelatorioGeral.setText("Geral");
        mniRelatorioGeral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniRelatorioGeralActionPerformed(evt);
            }
        });
        mnRelatórios.add(mniRelatorioGeral);

        jmbPrincipal.add(mnRelatórios);

        mnCardapio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menu_restaurant_coffee_icon_210178.png"))); // NOI18N
        mnCardapio.setText("Cardápio");

        mniEditarCardapio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cardapio.png"))); // NOI18N
        mniEditarCardapio.setText("Editar Cardápio");
        mniEditarCardapio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniEditarCardapioActionPerformed(evt);
            }
        });
        mnCardapio.add(mniEditarCardapio);

        jmbPrincipal.add(mnCardapio);

        mnSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/systemfilemanager_94456.png"))); // NOI18N
        mnSistema.setText("Sistema");

        mniFecharSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Exit-Page_icon-icons.com_53732.png"))); // NOI18N
        mniFecharSistema.setText("Fechar Sistema");
        mniFecharSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniFecharSistemaActionPerformed(evt);
            }
        });
        mnSistema.add(mniFecharSistema);

        jmbPrincipal.add(mnSistema);

        setJMenuBar(jmbPrincipal);

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
                .addContainerGap(128, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniNovoPedidoDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniNovoPedidoDeliveryActionPerformed
        new NovoDelivery().setVisible(true);
    }//GEN-LAST:event_mniNovoPedidoDeliveryActionPerformed

    private void btnMesa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa1ActionPerformed
        mostraInfos(Controle.mesas.get(0));
    }//GEN-LAST:event_btnMesa1ActionPerformed

    private void btnMesa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa2ActionPerformed
        mostraInfos(Controle.mesas.get(1));
    }//GEN-LAST:event_btnMesa2ActionPerformed

    private void btnMesa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa3ActionPerformed
        mostraInfos(Controle.mesas.get(2));
    }//GEN-LAST:event_btnMesa3ActionPerformed

    private void btnMesa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa4ActionPerformed
        mostraInfos(Controle.mesas.get(3));
    }//GEN-LAST:event_btnMesa4ActionPerformed

    private void btnMesa5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa5ActionPerformed
        mostraInfos(Controle.mesas.get(4));
    }//GEN-LAST:event_btnMesa5ActionPerformed

    private void btnMesa6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa6ActionPerformed
        mostraInfos(Controle.mesas.get(5));
    }//GEN-LAST:event_btnMesa6ActionPerformed

    private void btnMesa7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa7ActionPerformed
        mostraInfos(Controle.mesas.get(6));
    }//GEN-LAST:event_btnMesa7ActionPerformed

    private void btnMesa8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa8ActionPerformed
        mostraInfos(Controle.mesas.get(7));
    }//GEN-LAST:event_btnMesa8ActionPerformed

    private void btnMesa9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa9ActionPerformed
        mostraInfos(Controle.mesas.get(8));
    }//GEN-LAST:event_btnMesa9ActionPerformed

    private void btnMesa10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa10ActionPerformed
        mostraInfos(Controle.mesas.get(9));
    }//GEN-LAST:event_btnMesa10ActionPerformed

    private void btnMesa11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa11ActionPerformed
        mostraInfos(Controle.mesas.get(10));
    }//GEN-LAST:event_btnMesa11ActionPerformed

    private void btnMesa12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa12ActionPerformed
        mostraInfos(Controle.mesas.get(11));
    }//GEN-LAST:event_btnMesa12ActionPerformed

    private void btnMesa13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa13ActionPerformed
        mostraInfos(Controle.mesas.get(12));
    }//GEN-LAST:event_btnMesa13ActionPerformed

    private void btnMesa14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa14ActionPerformed
        mostraInfos(Controle.mesas.get(13));
    }//GEN-LAST:event_btnMesa14ActionPerformed

    private void btnMesa15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa15ActionPerformed
        mostraInfos(Controle.mesas.get(14));
    }//GEN-LAST:event_btnMesa15ActionPerformed

    private void btnMesa16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa16ActionPerformed
        mostraInfos(Controle.mesas.get(15));
    }//GEN-LAST:event_btnMesa16ActionPerformed

    private void mniCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCadastrarClienteActionPerformed
        // abre a tela de cadastro de clientes
        new CadastroCliente().setVisible(true);
    }//GEN-LAST:event_mniCadastrarClienteActionPerformed

    private void mniCadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCadastrarFuncionarioActionPerformed
        // abre a tela de cadastro de funcionarios
        new AutorizacaoGerente(2).setVisible(true);
    }//GEN-LAST:event_mniCadastrarFuncionarioActionPerformed

    private void mniRelatorioClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniRelatorioClientesActionPerformed
        // abre a tela de relatorio dos clientes
        new RelatorioClientes().setVisible(true);
    }//GEN-LAST:event_mniRelatorioClientesActionPerformed

    private void mniRelatorioFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniRelatorioFuncionariosActionPerformed
        // abre a tela de relatorio dos funcionarios
        new AutorizacaoGerente(3).setVisible(true);
    }//GEN-LAST:event_mniRelatorioFuncionariosActionPerformed

    private void mniRelatorioGeralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniRelatorioGeralActionPerformed
        // abre a tela de relatorio financeiro
        new RelatorioGeral().setVisible(true);
    }//GEN-LAST:event_mniRelatorioGeralActionPerformed

    private void mniNovoPedidoSalaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniNovoPedidoSalaoActionPerformed
        new NovoPedido().setVisible(true);
    }//GEN-LAST:event_mniNovoPedidoSalaoActionPerformed

    private void mniRelatorioPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniRelatorioPedidosActionPerformed
        new RelatorioPedidos().setVisible(true);
    }//GEN-LAST:event_mniRelatorioPedidosActionPerformed

    private void mniFecharSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniFecharSistemaActionPerformed
        // abre a tela de autenticação do gerente e, caso autenticado, posteriormente fecha-se o programa
        new AutorizacaoGerente(0).setVisible(true);
    }//GEN-LAST:event_mniFecharSistemaActionPerformed

    private void btnComandaEspecialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComandaEspecialActionPerformed
        // pode abrir ou a tela de relatório dos pedidos ou a tela de novo pedido
        if (Controle.mesas.get(Integer.parseInt(this.lblNumMesaDescricao.getText())-1).isDisponivel()) {
            // se a mesa estiver disponível, é porque não tem comanda, então abre a tela de novo pedido
            new NovoPedido((Integer.parseInt(this.lblNumMesaDescricao.getText()))).setVisible(true);
        } else {
            // se não, abre a tela de edição de pedido
            for (Comanda comanda : Controle.comandas) {
                if (comanda.getIdComanda() == Integer.parseInt(this.lblIdComandaDescricao.getText()))
                    new EditarPedido(comanda).setVisible(true);
            }
        }
        
    }//GEN-LAST:event_btnComandaEspecialActionPerformed

    private void mniEditarCardapioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniEditarCardapioActionPerformed
        // abre a tela de autenticação do gerente e, caso autenticado, posteriormente abre a tela do cardapio
        new AutorizacaoGerente(1).setVisible(true);
    }//GEN-LAST:event_mniEditarCardapioActionPerformed

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
            java.util.logging.Logger.getLogger(TelaMesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMesas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComandaEspecial;
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
    private javax.swing.JMenuBar jmbPrincipal;
    private javax.swing.JLabel lblCapacidade;
    private javax.swing.JLabel lblCapacidadeDescricao;
    private javax.swing.JLabel lblClienteComanda;
    private javax.swing.JLabel lblClienteComandaDescricao;
    private javax.swing.JLabel lblDetalhesComanda;
    private javax.swing.JLabel lblGarcomComanda;
    private javax.swing.JLabel lblGarcomComandaDescricao;
    private javax.swing.JLabel lblHoraPedidoComanda;
    private javax.swing.JLabel lblHoraPedidoComandaDescricao;
    private javax.swing.JLabel lblIdComanda;
    private javax.swing.JLabel lblIdComandaDescricao;
    private javax.swing.JLabel lblItensPedidosComanda;
    private javax.swing.JLabel lblMesa;
    private javax.swing.JLabel lblNumMesa;
    private javax.swing.JLabel lblNumMesaDescricao;
    private javax.swing.JLabel lblOcupada;
    private javax.swing.JLabel lblOcupadaDescricao;
    private javax.swing.JLabel lblValorParcialComanda;
    private javax.swing.JLabel lblValorParcialComandaDescricao;
    private javax.swing.JLabel lblVisualizacaoMesas;
    private javax.swing.JMenu mnCadastro;
    private javax.swing.JMenu mnCardapio;
    private javax.swing.JMenu mnPedidos;
    private javax.swing.JMenu mnRelatórios;
    private javax.swing.JMenu mnSistema;
    private javax.swing.JMenuItem mniCadastrarCliente;
    private javax.swing.JMenuItem mniCadastrarFuncionario;
    private javax.swing.JMenuItem mniEditarCardapio;
    private javax.swing.JMenuItem mniFecharSistema;
    private javax.swing.JMenuItem mniNovoPedidoDelivery;
    private javax.swing.JMenuItem mniNovoPedidoSalao;
    private javax.swing.JMenuItem mniRelatorioClientes;
    private javax.swing.JMenuItem mniRelatorioFuncionarios;
    private javax.swing.JMenuItem mniRelatorioGeral;
    private javax.swing.JMenuItem mniRelatorioPedidos;
    private javax.swing.JPanel pnlComandaMesa;
    private javax.swing.JPanel pnlMesaSelecionada;
    private javax.swing.JScrollPane scrItensPedidosComanda;
    private javax.swing.JTable tblItensPedidosComanda;
    // End of variables declaration//GEN-END:variables
}
