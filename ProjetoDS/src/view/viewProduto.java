package view;

import com.placeholder.PlaceHolder;
import dao.FornecedorDao;
import dao.ProdutoDao;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mapeamento.Fornecedor;
import mapeamento.Produto;

/**
 *
 * @author Sara
 */
public class viewProduto extends javax.swing.JDialog {

    PlaceHolder holder;

    float qntdEstoque = (float) 0.0;

    public viewProduto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        preencherTabela();
        preencherCbForn();

        cbFornecedor.setSelectedIndex(-1);
        btAtualizarProd.setVisible(false);

        holder = new PlaceHolder(edPesquisa, Color.GRAY, new Color(24, 14, 14), "Digite o nome do Produto...", isUndecorated(), "Segoe UI", 14);

    }

    public void preencherTabela() {
        ProdutoDao pdao = new ProdutoDao();
        List<Produto> prodList = pdao.listAll();
        DefaultTableModel modelo = (DefaultTableModel) tbProduto.getModel();
        modelo.setRowCount(0);
        for (Produto prod : prodList) {
            modelo.addRow(new Object[]{prod.getId_produto(), prod.getName(), prod.getBrand(), prod.getCategorie(),
                prod.getSaleprice(), prod.getDescription(), prod.getForn().getCompanyname()});
        }
    }

    public void preencherTabela(String NomePesquisa) {
        ProdutoDao pdao = new ProdutoDao();
        List<Produto> produList = pdao.listAll(NomePesquisa);
        DefaultTableModel modelo = (DefaultTableModel) tbProduto.getModel();
        modelo.setRowCount(0);
        for (Produto prod : produList) {
            modelo.addRow(new Object[]{prod.getId_produto(), prod.getName(), prod.getBrand(), prod.getCategorie(),
                prod.getSaleprice(), prod.getDescription(), prod.getForn().getCompanyname()});
        }

    }

    public void preencherCbForn() {
        FornecedorDao fdao = new FornecedorDao();
        List<Fornecedor> fList = fdao.listAll();
        for (Fornecedor f : fList) {
            cbFornecedor.addItem(f);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelCentral = new javax.swing.JTabbedPane();
        PainelProdutos = new javax.swing.JPanel();
        btNew = new javax.swing.JButton();
        btDelete = new javax.swing.JButton();
        jScrollProduto = new javax.swing.JScrollPane();
        tbProduto = new javax.swing.JTable();
        btEditar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        edPesquisa = new javax.swing.JTextField();
        PainelCadastroProduto = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btSalvarProd = new javax.swing.JButton();
        btCancelarProd = new javax.swing.JButton();
        edCodProd = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        edMarca = new javax.swing.JTextField();
        cbFornecedor = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        edNomeProd = new javax.swing.JFormattedTextField();
        edDescricao = new javax.swing.JTextField();
        cbCategoria = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        edPrecoVenda = new javax.swing.JTextField();
        btAtualizarProd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Produto");

        PainelCentral.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        PainelProdutos.setBackground(new java.awt.Color(102, 102, 102));
        PainelProdutos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PainelProdutos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PainelProdutos.setPreferredSize(new java.awt.Dimension(586, 516));

        btNew.setBackground(new java.awt.Color(255, 255, 255));
        btNew.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btNew.setText("NOVO");
        btNew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btNewMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btNewMouseExited(evt);
            }
        });
        btNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNewActionPerformed(evt);
            }
        });

        btDelete.setBackground(new java.awt.Color(255, 255, 255));
        btDelete.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btDelete.setText("DELETAR");
        btDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btDeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btDeleteMouseExited(evt);
            }
        });
        btDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteActionPerformed(evt);
            }
        });

        tbProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Marca", "Categoria", "Preço de Venda", "Descrição", "Fornecedor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollProduto.setViewportView(tbProduto);
        if (tbProduto.getColumnModel().getColumnCount() > 0) {
            tbProduto.getColumnModel().getColumn(0).setPreferredWidth(20);
        }

        btEditar.setBackground(new java.awt.Color(255, 255, 255));
        btEditar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btEditar.setText("EDITAR");
        btEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btEditarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btEditarMouseExited(evt);
            }
        });
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pesquisar.png"))); // NOI18N

        edPesquisa.setBorder(null);
        edPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edPesquisaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(edPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
            .addComponent(edPesquisa)
        );

        javax.swing.GroupLayout PainelProdutosLayout = new javax.swing.GroupLayout(PainelProdutos);
        PainelProdutos.setLayout(PainelProdutosLayout);
        PainelProdutosLayout.setHorizontalGroup(
            PainelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelProdutosLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(PainelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelProdutosLayout.createSequentialGroup()
                        .addComponent(btNew, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );
        PainelProdutosLayout.setVerticalGroup(
            PainelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelProdutosLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(PainelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btNew, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jScrollProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PainelCentral.addTab("Produtos", PainelProdutos);

        PainelCadastroProduto.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Código");

        btSalvarProd.setBackground(new java.awt.Color(255, 255, 255));
        btSalvarProd.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btSalvarProd.setText("SALVAR");
        btSalvarProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btSalvarProdMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btSalvarProdMouseExited(evt);
            }
        });
        btSalvarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarProdActionPerformed(evt);
            }
        });

        btCancelarProd.setBackground(new java.awt.Color(255, 255, 255));
        btCancelarProd.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btCancelarProd.setText("CANCELAR");
        btCancelarProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btCancelarProdMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btCancelarProdMouseExited(evt);
            }
        });
        btCancelarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarProdActionPerformed(evt);
            }
        });

        edCodProd.setEditable(false);
        edCodProd.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Fornecedor");

        cbFornecedor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Categoria");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Marca");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Descrição");

        cbCategoria.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acessórios Pesonalizados", "Acessórios Comuns", "Outros" }));
        cbCategoria.setSelectedIndex(-1);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Preço de Venda");

        btAtualizarProd.setBackground(new java.awt.Color(255, 255, 255));
        btAtualizarProd.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btAtualizarProd.setText("ATUALIZAR");
        btAtualizarProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btAtualizarProdMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btAtualizarProdMouseExited(evt);
            }
        });
        btAtualizarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarProdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelCadastroProdutoLayout = new javax.swing.GroupLayout(PainelCadastroProduto);
        PainelCadastroProduto.setLayout(PainelCadastroProdutoLayout);
        PainelCadastroProdutoLayout.setHorizontalGroup(
            PainelCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCadastroProdutoLayout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(btSalvarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btAtualizarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(btCancelarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelCadastroProdutoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PainelCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8)
                    .addComponent(edPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PainelCadastroProdutoLayout.createSequentialGroup()
                        .addGroup(PainelCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(edCodProd, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(edNomeProd, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(116, 116, 116)
                        .addGroup(PainelCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(edMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(cbFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(edDescricao))
                .addGap(40, 40, 40))
        );
        PainelCadastroProdutoLayout.setVerticalGroup(
            PainelCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCadastroProdutoLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addComponent(edCodProd, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PainelCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addGap(6, 6, 6)
                .addGroup(PainelCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edNomeProd, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PainelCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(6, 6, 6)
                .addGroup(PainelCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(6, 6, 6)
                .addComponent(edPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(6, 6, 6)
                .addComponent(edDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addGroup(PainelCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAtualizarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCancelarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        PainelCentral.addTab("Cadastro de Produto", PainelCadastroProduto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelCentral)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelCentral)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarProdActionPerformed
        int ind1 = cbCategoria.getSelectedIndex();
        int ind2 = cbFornecedor.getSelectedIndex();

        if (edNomeProd.getText().isEmpty() || edMarca.getText().isEmpty() || ind1 == -1 || ind2 == -1 || edPrecoVenda.getText().isEmpty() || edDescricao.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os Campos!");

        } else {
            Produto p = new Produto();
            p.setName(edNomeProd.getText());
            p.setCategorie(cbCategoria.getSelectedItem().toString());
            p.setBrand(edMarca.getText());
            //p.setPrice(Float.valueOf(edPrecoCusto.getText()));
            p.setSaleprice(Float.valueOf(edPrecoVenda.getText()));
            p.setDescription(edDescricao.getText());
            p.setQntdEstoque(qntdEstoque);

            Fornecedor f = (Fornecedor) cbFornecedor.getSelectedItem();
            p.setForn(f);

            ProdutoDao pdao = new ProdutoDao();
            pdao.insert(p);
            preencherTabela();

            btCancelarProdActionPerformed(evt);
            PainelCentral.setSelectedIndex(0);
        }
    }//GEN-LAST:event_btSalvarProdActionPerformed

    private void btCancelarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarProdActionPerformed
        edCodProd.setText(null);
        edDescricao.setText(null);
        edMarca.setText(null);
        edNomeProd.setText(null);
        //edPrecoCusto.setText(null);
        edPrecoVenda.setText(null);
        cbCategoria.setSelectedIndex(-1);
        cbFornecedor.setSelectedIndex(-1);

        btSalvarProd.setVisible(true);
        btAtualizarProd.setVisible(false);
        PainelCentral.setSelectedIndex(0);
    }//GEN-LAST:event_btCancelarProdActionPerformed

    private void btAtualizarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarProdActionPerformed
        int ind1 = cbCategoria.getSelectedIndex();
        int ind2 = cbFornecedor.getSelectedIndex();

        if (edNomeProd.getText().isEmpty() || edMarca.getText().isEmpty() || ind1 == -1 || ind2 == -1 || edPrecoVenda.getText().isEmpty() || edDescricao.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os Campos!");

        } else {
            Produto p = new Produto();
            p.setId_produto(Integer.parseInt(edCodProd.getText()));
            p.setBrand(edMarca.getText());
            p.setName(edNomeProd.getText());
            p.setDescription(edDescricao.getText());
            //p.setPrice(Float.parseFloat(edPrecoCusto.getText()));
            p.setSaleprice(Float.parseFloat(edPrecoVenda.getText()));
            p.setForn((Fornecedor) cbFornecedor.getSelectedItem());
            p.setCategorie(cbCategoria.getSelectedItem().toString());

            Fornecedor f = new Fornecedor();
            f = (Fornecedor) cbFornecedor.getSelectedItem();
            p.setForn(f);

            ProdutoDao pdao = new ProdutoDao();
            pdao.update(p);
            preencherTabela();

            btCancelarProdActionPerformed(evt);
            PainelCentral.setSelectedIndex(0);
        }
    }//GEN-LAST:event_btAtualizarProdActionPerformed

    private void btSalvarProdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSalvarProdMouseEntered
        btSalvarProd.setBackground(new Color(30, 144, 255));
        btSalvarProd.setForeground(Color.WHITE);
    }//GEN-LAST:event_btSalvarProdMouseEntered

    private void btSalvarProdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSalvarProdMouseExited
        btSalvarProd.setBackground(new Color(235, 235, 235));
        btSalvarProd.setForeground(Color.BLACK);
    }//GEN-LAST:event_btSalvarProdMouseExited

    private void btAtualizarProdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAtualizarProdMouseEntered
        btAtualizarProd.setBackground(Color.GREEN);
        btAtualizarProd.setForeground(Color.WHITE);
    }//GEN-LAST:event_btAtualizarProdMouseEntered

    private void btAtualizarProdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAtualizarProdMouseExited
        btAtualizarProd.setBackground(Color.WHITE);
        btAtualizarProd.setForeground(Color.BLACK);
    }//GEN-LAST:event_btAtualizarProdMouseExited

    private void btCancelarProdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCancelarProdMouseEntered
        btCancelarProd.setBackground(Color.RED);
        btCancelarProd.setForeground(Color.WHITE);
    }//GEN-LAST:event_btCancelarProdMouseEntered

    private void btCancelarProdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCancelarProdMouseExited
        btCancelarProd.setBackground(Color.WHITE);
        btCancelarProd.setForeground(Color.BLACK);
    }//GEN-LAST:event_btCancelarProdMouseExited

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        int indice = tbProduto.getSelectedRow();

        if (indice >= 0) {
            edCodProd.setText(tbProduto.getValueAt(indice, 0).toString());
            edNomeProd.setText(tbProduto.getValueAt(indice, 1).toString());
            edMarca.setText(tbProduto.getValueAt(indice, 2).toString());
            cbCategoria.setSelectedItem(tbProduto.getValueAt(indice, 3).toString());
            edPrecoVenda.setText(tbProduto.getValueAt(indice, 4).toString());
            edDescricao.setText(tbProduto.getValueAt(indice, 5).toString());
            cbFornecedor.setSelectedItem(tbProduto.getValueAt(indice, 6).toString());

            btSalvarProd.setVisible(false);
            btAtualizarProd.setVisible(true);
            PainelCentral.setSelectedIndex(1);

        } else {
            JOptionPane.showMessageDialog(null, "SELECIONE UMA LINHA DA TABLEA");
        }
    }//GEN-LAST:event_btEditarActionPerformed

    private void btEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btEditarMouseExited
        btEditar.setBackground(Color.WHITE);
        btEditar.setForeground(Color.BLACK);
    }//GEN-LAST:event_btEditarMouseExited

    private void btEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btEditarMouseEntered
        btEditar.setBackground(Color.GREEN);
        btEditar.setForeground(Color.WHITE);
    }//GEN-LAST:event_btEditarMouseEntered

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
        int indice = tbProduto.getSelectedRow();
        if (indice >= 0) {
            Produto prod = new Produto();
            prod.setId_produto(Integer.parseInt(tbProduto.getValueAt(indice, 0).toString()));
            prod.setName(tbProduto.getValueAt(indice, 1).toString());
            prod.setBrand(tbProduto.getValueAt(indice, 2).toString());
            prod.setCategorie(tbProduto.getValueAt(indice, 3).toString());
            prod.setSaleprice(Float.parseFloat(tbProduto.getValueAt(indice, 4).toString()));
            prod.setDescription(tbProduto.getValueAt(indice, 5).toString());

            ProdutoDao pdao = new ProdutoDao();
            pdao.delete(prod);
            preencherTabela();
        } else {
            JOptionPane.showMessageDialog(null, "SELECIONE UMA LINHA DA TABELA");
        }
    }//GEN-LAST:event_btDeleteActionPerformed

    private void btDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btDeleteMouseExited
        btDelete.setBackground(Color.WHITE);
        btDelete.setForeground(Color.BLACK);
    }//GEN-LAST:event_btDeleteMouseExited

    private void btDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btDeleteMouseEntered
        btDelete.setBackground(Color.RED);
        btDelete.setForeground(Color.WHITE);
    }//GEN-LAST:event_btDeleteMouseEntered

    private void btNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNewActionPerformed
        PainelCentral.setSelectedIndex(1);
        edCodProd.setText(null);
        edDescricao.setText(null);
        edMarca.setText(null);
        edNomeProd.setText(null);
        edPrecoVenda.setText(null);
        btAtualizarProd.setVisible(false);
        btSalvarProd.setVisible(true);
        cbCategoria.setSelectedIndex(-1);
        cbFornecedor.setSelectedIndex(-1);
    }//GEN-LAST:event_btNewActionPerformed

    private void btNewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btNewMouseExited
        btNew.setBackground(new Color(235, 235, 235));
        btNew.setForeground(Color.BLACK);
    }//GEN-LAST:event_btNewMouseExited

    private void btNewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btNewMouseEntered
        btNew.setBackground(new Color(30, 144, 255));
        btNew.setForeground(Color.WHITE);
    }//GEN-LAST:event_btNewMouseEntered

    private void edPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edPesquisaKeyPressed
        preencherTabela(edPesquisa.getText());
    }//GEN-LAST:event_edPesquisaKeyPressed

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
            java.util.logging.Logger.getLogger(viewProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                viewProduto dialog = new viewProduto(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelCadastroProduto;
    private javax.swing.JTabbedPane PainelCentral;
    private javax.swing.JPanel PainelProdutos;
    private javax.swing.JButton btAtualizarProd;
    private javax.swing.JButton btCancelarProd;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btNew;
    private javax.swing.JButton btSalvarProd;
    private javax.swing.JComboBox<String> cbCategoria;
    private javax.swing.JComboBox cbFornecedor;
    private javax.swing.JTextField edCodProd;
    private javax.swing.JTextField edDescricao;
    private javax.swing.JTextField edMarca;
    private javax.swing.JFormattedTextField edNomeProd;
    private javax.swing.JTextField edPesquisa;
    private javax.swing.JTextField edPrecoVenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollProduto;
    private javax.swing.JTable tbProduto;
    // End of variables declaration//GEN-END:variables
}
