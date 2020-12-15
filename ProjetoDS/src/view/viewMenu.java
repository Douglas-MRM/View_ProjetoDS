package view;

import java.awt.Color;
import java.awt.Toolkit;
import listas.ListaCliente;
import listas.ListarCompra;
import listas.ListarFornecedores;
import listas.ListarFuncionarios;
import listas.ListarProdutos;
import listas.ListarVendas;

/**
 *
 * @author Joao
 */
public class viewMenu extends javax.swing.JFrame {

    public viewMenu() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        setIconImage();        
        jPanel1.requestFocus();        
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        BT_Fornecedor = new javax.swing.JButton();
        BT_Venda = new javax.swing.JButton();
        BT_Servico = new javax.swing.JButton();
        BT_Produto = new javax.swing.JButton();
        BT_Funcionario = new javax.swing.JButton();
        BT_Compra = new javax.swing.JButton();
        BT_Usuario = new javax.swing.JButton();
        BT_Cliente = new javax.swing.JButton();
        BT_Agenda = new javax.swing.JButton();
        BT_Estoque = new javax.swing.JButton();
        edUsuario = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        MI_Cadastros = new javax.swing.JMenu();
        MI_CadastrarCliente = new javax.swing.JMenuItem();
        MI_CadastrarUsuario = new javax.swing.JMenuItem();
        MI_CadastrarFornecedor = new javax.swing.JMenuItem();
        MI_CadastrarProduto = new javax.swing.JMenuItem();
        MI_CadastrarFuncionario = new javax.swing.JMenuItem();
        Relatorios = new javax.swing.JMenu();
        MI_Compras = new javax.swing.JMenuItem();
        MI_Vendas = new javax.swing.JMenuItem();
        MI_Pagamentos = new javax.swing.JMenuItem();
        MI_Recebimentos = new javax.swing.JMenuItem();
        MI_Clientes = new javax.swing.JMenuItem();
        MI_Produtos = new javax.swing.JMenuItem();
        MI_Fornecedores = new javax.swing.JMenuItem();
        MI_Funcionarios = new javax.swing.JMenuItem();
        Suporte = new javax.swing.JMenu();
        Configuracao = new javax.swing.JMenu();
        MI_Sair = new javax.swing.JMenuItem();

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/6486.jpg"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(700, 700));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu SisBike");
        setMinimumSize(new java.awt.Dimension(695, 587));
        setSize(new java.awt.Dimension(700, 700));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo2.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        BT_Fornecedor.setBackground(new java.awt.Color(255, 255, 255));
        BT_Fornecedor.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        BT_Fornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bike-shop.png"))); // NOI18N
        BT_Fornecedor.setText("Fornecedor");
        BT_Fornecedor.setBorder(null);
        BT_Fornecedor.setBorderPainted(false);
        BT_Fornecedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_Fornecedor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BT_Fornecedor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BT_Fornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BT_FornecedorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BT_FornecedorMouseExited(evt);
            }
        });
        BT_Fornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_FornecedorActionPerformed(evt);
            }
        });

        BT_Venda.setBackground(new java.awt.Color(255, 255, 255));
        BT_Venda.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        BT_Venda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/inspection.png"))); // NOI18N
        BT_Venda.setText("Venda");
        BT_Venda.setBorder(null);
        BT_Venda.setBorderPainted(false);
        BT_Venda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_Venda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BT_Venda.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BT_Venda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BT_VendaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BT_VendaMouseExited(evt);
            }
        });
        BT_Venda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_VendaActionPerformed(evt);
            }
        });

        BT_Servico.setBackground(new java.awt.Color(255, 255, 255));
        BT_Servico.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        BT_Servico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/wrench.png"))); // NOI18N
        BT_Servico.setText("Serviço");
        BT_Servico.setBorder(null);
        BT_Servico.setBorderPainted(false);
        BT_Servico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_Servico.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BT_Servico.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BT_Servico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BT_ServicoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BT_ServicoMouseExited(evt);
            }
        });
        BT_Servico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_ServicoActionPerformed(evt);
            }
        });

        BT_Produto.setBackground(new java.awt.Color(255, 255, 255));
        BT_Produto.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        BT_Produto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bicycle.png"))); // NOI18N
        BT_Produto.setText("Produto");
        BT_Produto.setBorder(null);
        BT_Produto.setBorderPainted(false);
        BT_Produto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_Produto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BT_Produto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BT_Produto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BT_ProdutoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BT_ProdutoMouseExited(evt);
            }
        });
        BT_Produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_ProdutoActionPerformed(evt);
            }
        });

        BT_Funcionario.setBackground(new java.awt.Color(255, 255, 255));
        BT_Funcionario.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        BT_Funcionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/call-center.png"))); // NOI18N
        BT_Funcionario.setText("Funcionário");
        BT_Funcionario.setBorder(null);
        BT_Funcionario.setBorderPainted(false);
        BT_Funcionario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_Funcionario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BT_Funcionario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BT_Funcionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BT_FuncionarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BT_FuncionarioMouseExited(evt);
            }
        });
        BT_Funcionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_FuncionarioActionPerformed(evt);
            }
        });

        BT_Compra.setBackground(new java.awt.Color(255, 255, 255));
        BT_Compra.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        BT_Compra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/wage.png"))); // NOI18N
        BT_Compra.setText("Compra");
        BT_Compra.setBorder(null);
        BT_Compra.setBorderPainted(false);
        BT_Compra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_Compra.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BT_Compra.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BT_Compra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BT_CompraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BT_CompraMouseExited(evt);
            }
        });
        BT_Compra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_CompraActionPerformed(evt);
            }
        });

        BT_Usuario.setBackground(new java.awt.Color(255, 255, 255));
        BT_Usuario.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        BT_Usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N
        BT_Usuario.setText("Usuário");
        BT_Usuario.setBorder(null);
        BT_Usuario.setBorderPainted(false);
        BT_Usuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_Usuario.setHideActionText(true);
        BT_Usuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BT_Usuario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BT_Usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BT_UsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BT_UsuarioMouseExited(evt);
            }
        });
        BT_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_UsuarioActionPerformed(evt);
            }
        });

        BT_Cliente.setBackground(new java.awt.Color(255, 255, 255));
        BT_Cliente.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        BT_Cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/biker.png"))); // NOI18N
        BT_Cliente.setText("Cliente");
        BT_Cliente.setBorder(null);
        BT_Cliente.setBorderPainted(false);
        BT_Cliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_Cliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BT_Cliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BT_Cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BT_ClienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BT_ClienteMouseExited(evt);
            }
        });
        BT_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_ClienteActionPerformed(evt);
            }
        });

        BT_Agenda.setBackground(new java.awt.Color(255, 255, 255));
        BT_Agenda.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        BT_Agenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/calendar.png"))); // NOI18N
        BT_Agenda.setText("Agenda");
        BT_Agenda.setBorder(null);
        BT_Agenda.setBorderPainted(false);
        BT_Agenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_Agenda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BT_Agenda.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BT_Agenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BT_AgendaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BT_AgendaMouseExited(evt);
            }
        });
        BT_Agenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_AgendaActionPerformed(evt);
            }
        });

        BT_Estoque.setBackground(new java.awt.Color(255, 255, 255));
        BT_Estoque.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        BT_Estoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/stock.png"))); // NOI18N
        BT_Estoque.setText("Estoque");
        BT_Estoque.setBorder(null);
        BT_Estoque.setBorderPainted(false);
        BT_Estoque.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_Estoque.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BT_Estoque.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BT_Estoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BT_EstoqueMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BT_EstoqueMouseExited(evt);
            }
        });
        BT_Estoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_EstoqueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BT_Fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_Agenda, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BT_Cliente, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(BT_Venda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BT_Servico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(BT_Produto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(BT_Compra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BT_Estoque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BT_Usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(BT_Funcionario, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(edUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(BT_Compra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BT_Cliente, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(BT_Agenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BT_Usuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BT_Fornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(BT_Venda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BT_Produto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BT_Funcionario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BT_Servico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(BT_Estoque, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(edUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 204));
        jMenuBar1.setForeground(new java.awt.Color(51, 51, 51));

        MI_Cadastros.setBackground(new java.awt.Color(0, 51, 204));
        MI_Cadastros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cadastros_menu.png"))); // NOI18N
        MI_Cadastros.setText("Cadastros");

        MI_CadastrarCliente.setText("Cliente");
        MI_CadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_CadastrarClienteActionPerformed(evt);
            }
        });
        MI_Cadastros.add(MI_CadastrarCliente);

        MI_CadastrarUsuario.setText("Usuário");
        MI_CadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_CadastrarUsuarioActionPerformed(evt);
            }
        });
        MI_Cadastros.add(MI_CadastrarUsuario);

        MI_CadastrarFornecedor.setText("Fornecedor");
        MI_CadastrarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_CadastrarFornecedorActionPerformed(evt);
            }
        });
        MI_Cadastros.add(MI_CadastrarFornecedor);

        MI_CadastrarProduto.setText("Produto");
        MI_CadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_CadastrarProdutoActionPerformed(evt);
            }
        });
        MI_Cadastros.add(MI_CadastrarProduto);

        MI_CadastrarFuncionario.setText("Funcionario");
        MI_CadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_CadastrarFuncionarioActionPerformed(evt);
            }
        });
        MI_Cadastros.add(MI_CadastrarFuncionario);

        jMenuBar1.add(MI_Cadastros);

        Relatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reports_menu.png"))); // NOI18N
        Relatorios.setText("Relatórios");

        MI_Compras.setText("Compras");
        MI_Compras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_ComprasActionPerformed(evt);
            }
        });
        Relatorios.add(MI_Compras);

        MI_Vendas.setText("Vendas");
        MI_Vendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_VendasActionPerformed(evt);
            }
        });
        Relatorios.add(MI_Vendas);

        MI_Pagamentos.setText("Pagamentos");
        Relatorios.add(MI_Pagamentos);

        MI_Recebimentos.setText("Recebimentos");
        Relatorios.add(MI_Recebimentos);

        MI_Clientes.setText("Clientes");
        MI_Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_ClientesActionPerformed(evt);
            }
        });
        Relatorios.add(MI_Clientes);

        MI_Produtos.setText("Produtos");
        MI_Produtos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_ProdutosActionPerformed(evt);
            }
        });
        Relatorios.add(MI_Produtos);

        MI_Fornecedores.setText("Forcedores");
        MI_Fornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_FornecedoresActionPerformed(evt);
            }
        });
        Relatorios.add(MI_Fornecedores);

        MI_Funcionarios.setText("Funcionários");
        MI_Funcionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_FuncionariosActionPerformed(evt);
            }
        });
        Relatorios.add(MI_Funcionarios);

        jMenuBar1.add(Relatorios);

        Suporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/support_menu.png"))); // NOI18N
        Suporte.setText("Suporte");
        jMenuBar1.add(Suporte);

        Configuracao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/config_menu.png"))); // NOI18N
        Configuracao.setText("Configurações");

        MI_Sair.setText("Sair");
        MI_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_SairActionPerformed(evt);
            }
        });
        Configuracao.add(MI_Sair);

        jMenuBar1.add(Configuracao);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MI_CadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_CadastrarClienteActionPerformed
        viewCliente cliente = new viewCliente(this, rootPaneCheckingEnabled);
        cliente.setVisible(rootPaneCheckingEnabled);
        cliente.setLocationRelativeTo(cliente);
    }//GEN-LAST:event_MI_CadastrarClienteActionPerformed

    private void MI_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_SairActionPerformed
        viewLogin login = new viewLogin();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MI_SairActionPerformed

    private void MI_CadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_CadastrarUsuarioActionPerformed
        viewUsuario user = new viewUsuario(this, rootPaneCheckingEnabled);
        user.setVisible(rootPaneCheckingEnabled);
        user.setLocationRelativeTo(MI_Cadastros);
    }//GEN-LAST:event_MI_CadastrarUsuarioActionPerformed

    private void MI_CadastrarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_CadastrarFornecedorActionPerformed
        viewFornecedor forn = new viewFornecedor(this, rootPaneCheckingEnabled);
        forn.setVisible(rootPaneCheckingEnabled);
        forn.setLocationRelativeTo(forn);
    }//GEN-LAST:event_MI_CadastrarFornecedorActionPerformed

    private void MI_CadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_CadastrarProdutoActionPerformed
        viewProduto prod = new viewProduto(this, rootPaneCheckingEnabled);
        prod.setVisible(rootPaneCheckingEnabled);
        prod.setLocationRelativeTo(MI_Cadastros);
    }//GEN-LAST:event_MI_CadastrarProdutoActionPerformed

    private void MI_CadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_CadastrarFuncionarioActionPerformed
        viewFuncionario funcio = new viewFuncionario(this, rootPaneCheckingEnabled);
        funcio.setVisible(rootPaneCheckingEnabled);
        funcio.setLocationRelativeTo(MI_Cadastros);
    }//GEN-LAST:event_MI_CadastrarFuncionarioActionPerformed

    private void BT_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_ClienteActionPerformed
        viewCliente cliente = new viewCliente(this, rootPaneCheckingEnabled);
        cliente.setVisible(rootPaneCheckingEnabled);
        cliente.setLocationRelativeTo(cliente);
    }//GEN-LAST:event_BT_ClienteActionPerformed

    private void BT_CompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_CompraActionPerformed
        viewCompra com = new viewCompra(this, rootPaneCheckingEnabled);
        com.setVisible(rootPaneCheckingEnabled);
        com.setLocationRelativeTo(com);
    }//GEN-LAST:event_BT_CompraActionPerformed

    private void BT_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_UsuarioActionPerformed
        viewUsuario user = new viewUsuario(this, rootPaneCheckingEnabled);
        user.setVisible(rootPaneCheckingEnabled);
        user.setLocationRelativeTo(MI_Cadastros);
    }//GEN-LAST:event_BT_UsuarioActionPerformed

    private void BT_FuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_FuncionarioActionPerformed
        viewFuncionario funcio = new viewFuncionario(this, rootPaneCheckingEnabled);
        funcio.setVisible(rootPaneCheckingEnabled);
        funcio.setLocationRelativeTo(MI_Cadastros);
    }//GEN-LAST:event_BT_FuncionarioActionPerformed

    private void BT_ProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_ProdutoActionPerformed
        viewProduto prod = new viewProduto(this, rootPaneCheckingEnabled);
        prod.setVisible(rootPaneCheckingEnabled);
        prod.setLocationRelativeTo(MI_Cadastros);
    }//GEN-LAST:event_BT_ProdutoActionPerformed

    private void BT_ServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_ServicoActionPerformed
        viewServico serv = new viewServico(this, rootPaneCheckingEnabled);
        serv.setVisible(rootPaneCheckingEnabled);
        serv.setLocationRelativeTo(MI_Cadastros);
    }//GEN-LAST:event_BT_ServicoActionPerformed

    private void BT_VendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_VendaActionPerformed
        viewVenda ven = new viewVenda(this, rootPaneCheckingEnabled);
        ven.setVisible(rootPaneCheckingEnabled);
        ven.setLocationRelativeTo(ven);
    }//GEN-LAST:event_BT_VendaActionPerformed

    private void BT_FornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_FornecedorActionPerformed
        viewFornecedor forn = new viewFornecedor(this, rootPaneCheckingEnabled);
        forn.setVisible(rootPaneCheckingEnabled);
        forn.setLocationRelativeTo(forn);
    }//GEN-LAST:event_BT_FornecedorActionPerformed

    private void BT_ClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_ClienteMouseEntered
        BT_Cliente.setBackground(new Color(30, 144, 255));
        BT_Cliente.setForeground(Color.WHITE);
    }//GEN-LAST:event_BT_ClienteMouseEntered

    private void BT_ClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_ClienteMouseExited
        BT_Cliente.setBackground(new Color(235, 235, 235));
        BT_Cliente.setForeground(Color.BLACK);
    }//GEN-LAST:event_BT_ClienteMouseExited

    private void BT_CompraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_CompraMouseEntered
        BT_Compra.setBackground(new Color(30, 144, 255));
        BT_Compra.setForeground(Color.WHITE);
    }//GEN-LAST:event_BT_CompraMouseEntered

    private void BT_CompraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_CompraMouseExited
        BT_Compra.setBackground(new Color(235, 235, 235));
        BT_Compra.setForeground(Color.BLACK);
    }//GEN-LAST:event_BT_CompraMouseExited

    private void BT_FornecedorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_FornecedorMouseEntered
        BT_Fornecedor.setBackground(new Color(30, 144, 255));
        BT_Fornecedor.setForeground(Color.WHITE);
    }//GEN-LAST:event_BT_FornecedorMouseEntered

    private void BT_FornecedorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_FornecedorMouseExited
        BT_Fornecedor.setBackground(new Color(235, 235, 235));
        BT_Fornecedor.setForeground(Color.BLACK);
    }//GEN-LAST:event_BT_FornecedorMouseExited

    private void BT_VendaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_VendaMouseEntered
        BT_Venda.setBackground(new Color(30, 144, 255));
        BT_Venda.setForeground(Color.WHITE);
    }//GEN-LAST:event_BT_VendaMouseEntered

    private void BT_VendaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_VendaMouseExited
        BT_Venda.setBackground(new Color(235, 235, 235));
        BT_Venda.setForeground(Color.BLACK);
    }//GEN-LAST:event_BT_VendaMouseExited

    private void BT_ProdutoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_ProdutoMouseEntered
        BT_Produto.setBackground(new Color(30, 144, 255));
        BT_Produto.setForeground(Color.WHITE);
    }//GEN-LAST:event_BT_ProdutoMouseEntered

    private void BT_ProdutoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_ProdutoMouseExited
        BT_Produto.setBackground(new Color(235, 235, 235));
        BT_Produto.setForeground(Color.BLACK);
    }//GEN-LAST:event_BT_ProdutoMouseExited

    private void BT_ServicoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_ServicoMouseEntered
        BT_Servico.setBackground(new Color(30, 144, 255));
        BT_Servico.setForeground(Color.WHITE);
    }//GEN-LAST:event_BT_ServicoMouseEntered

    private void BT_ServicoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_ServicoMouseExited
        BT_Servico.setBackground(new Color(235, 235, 235));
        BT_Servico.setForeground(Color.BLACK);
    }//GEN-LAST:event_BT_ServicoMouseExited

    private void BT_FuncionarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_FuncionarioMouseEntered
        BT_Funcionario.setBackground(new Color(30, 144, 255));
        BT_Funcionario.setForeground(Color.WHITE);
    }//GEN-LAST:event_BT_FuncionarioMouseEntered

    private void BT_FuncionarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_FuncionarioMouseExited
        BT_Funcionario.setBackground(new Color(235, 235, 235));
        BT_Funcionario.setForeground(Color.BLACK);
    }//GEN-LAST:event_BT_FuncionarioMouseExited

    private void BT_UsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_UsuarioMouseEntered
        BT_Usuario.setBackground(new Color(30, 144, 255));
        BT_Usuario.setForeground(Color.WHITE);
    }//GEN-LAST:event_BT_UsuarioMouseEntered

    private void BT_UsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_UsuarioMouseExited
        BT_Usuario.setBackground(new Color(235, 235, 235));
        BT_Usuario.setForeground(Color.BLACK);
    }//GEN-LAST:event_BT_UsuarioMouseExited

    private void MI_ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_ClientesActionPerformed
        ListaCliente cliente = new ListaCliente();
        cliente.setVisible(true);
    }//GEN-LAST:event_MI_ClientesActionPerformed

    private void MI_ProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_ProdutosActionPerformed
        ListarProdutos produto = new ListarProdutos();
        produto.setVisible(true);
    }//GEN-LAST:event_MI_ProdutosActionPerformed

    private void MI_FornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_FornecedoresActionPerformed
        ListarFornecedores fornecedores = new ListarFornecedores();
        fornecedores.setVisible(true);
    }//GEN-LAST:event_MI_FornecedoresActionPerformed

    private void MI_FuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_FuncionariosActionPerformed
        ListarFuncionarios funcionarios = new ListarFuncionarios();
        funcionarios.setVisible(true);
    }//GEN-LAST:event_MI_FuncionariosActionPerformed

    private void BT_AgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_AgendaActionPerformed
        viewAgenda a = new viewAgenda(this, rootPaneCheckingEnabled);
        a.setVisible(rootPaneCheckingEnabled);
        a.setLocationRelativeTo(MI_Cadastros);
    }//GEN-LAST:event_BT_AgendaActionPerformed

    private void BT_AgendaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_AgendaMouseExited
        BT_Agenda.setBackground(new Color(235, 235, 235));
        BT_Agenda.setForeground(Color.BLACK);
    }//GEN-LAST:event_BT_AgendaMouseExited

    private void BT_AgendaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_AgendaMouseEntered
        BT_Agenda.setBackground(new Color(30, 144, 255));
        BT_Agenda.setForeground(Color.WHITE);
    }//GEN-LAST:event_BT_AgendaMouseEntered

    private void BT_EstoqueMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_EstoqueMouseEntered
        BT_Estoque.setBackground(new Color(30, 144, 255));
        BT_Estoque.setForeground(Color.WHITE);
    }//GEN-LAST:event_BT_EstoqueMouseEntered

    private void BT_EstoqueMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_EstoqueMouseExited
        BT_Estoque.setBackground(new Color(235, 235, 235));
        BT_Estoque.setForeground(Color.BLACK);
    }//GEN-LAST:event_BT_EstoqueMouseExited

    private void BT_EstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_EstoqueActionPerformed
        viewEstoque a = new viewEstoque(this, rootPaneCheckingEnabled);
        a.setVisible(rootPaneCheckingEnabled);
        a.setLocationRelativeTo(MI_Cadastros);
    }//GEN-LAST:event_BT_EstoqueActionPerformed

    private void MI_ComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_ComprasActionPerformed
        ListarCompra a = new ListarCompra();
        a.setVisible(true);
    }//GEN-LAST:event_MI_ComprasActionPerformed

    private void MI_VendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_VendasActionPerformed
        ListarVendas a = new ListarVendas();
        a.setVisible(true);
    }//GEN-LAST:event_MI_VendasActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(viewCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_Agenda;
    private javax.swing.JButton BT_Cliente;
    private javax.swing.JButton BT_Compra;
    private javax.swing.JButton BT_Estoque;
    private javax.swing.JButton BT_Fornecedor;
    private javax.swing.JButton BT_Funcionario;
    private javax.swing.JButton BT_Produto;
    private javax.swing.JButton BT_Servico;
    private javax.swing.JButton BT_Usuario;
    private javax.swing.JButton BT_Venda;
    private javax.swing.JMenu Configuracao;
    private javax.swing.JMenuItem MI_CadastrarCliente;
    private javax.swing.JMenuItem MI_CadastrarFornecedor;
    private javax.swing.JMenuItem MI_CadastrarFuncionario;
    private javax.swing.JMenuItem MI_CadastrarProduto;
    private javax.swing.JMenuItem MI_CadastrarUsuario;
    private javax.swing.JMenu MI_Cadastros;
    private javax.swing.JMenuItem MI_Clientes;
    private javax.swing.JMenuItem MI_Compras;
    private javax.swing.JMenuItem MI_Fornecedores;
    private javax.swing.JMenuItem MI_Funcionarios;
    private javax.swing.JMenuItem MI_Pagamentos;
    private javax.swing.JMenuItem MI_Produtos;
    private javax.swing.JMenuItem MI_Recebimentos;
    private javax.swing.JMenuItem MI_Sair;
    private javax.swing.JMenuItem MI_Vendas;
    private javax.swing.JMenu Relatorios;
    private javax.swing.JMenu Suporte;
    private javax.swing.JLabel edUsuario;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

    private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("python.png")));
    }
}
