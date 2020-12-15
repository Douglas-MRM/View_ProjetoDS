package view;

import com.placeholder.PlaceHolder;
import dao.FuncionarioDao;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mapeamento.Funcionario;

/**
 *
 * @author Sara
 */
public class viewFuncionario extends javax.swing.JDialog {
    PlaceHolder holder;

    public viewFuncionario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        preencherTabela();
        btAtualizar.setVisible(false);
        
        setTitle("Funcionário");
        holder = new PlaceHolder(edPesquisar, "Digite o Nome do Funcionário");
    }

    public void preencherTabela() {
        FuncionarioDao fdao = new FuncionarioDao();
        List<Funcionario> funList = fdao.listAll();
        DefaultTableModel modelo = (DefaultTableModel) tbFuncionario.getModel();
        modelo.setRowCount(0);
        for (Funcionario fun : funList) {
            modelo.addRow(new Object[]{fun.getId_funcionario(), fun.getName(), fun.getCpf(), fun.getRg(), fun.getAdress(),
                fun.getEmail(), fun.getPhonenumber(), fun.getRole(), fun.getDescription()});
        }
    }

    public void preencherTabela(String NomePesquisa) {
        FuncionarioDao fdao = new FuncionarioDao();
        List<Funcionario> funList = fdao.listAll(NomePesquisa);
        DefaultTableModel modelo = (DefaultTableModel) tbFuncionario.getModel();
        modelo.setRowCount(0);
        for (Funcionario fun : funList) {
            modelo.addRow(new Object[]{fun.getId_funcionario(), fun.getName(), fun.getCpf(), fun.getRg(), fun.getAdress(),
                fun.getEmail(), fun.getPhonenumber(), fun.getRole(), fun.getDescription()});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbFuncionario = new javax.swing.JTable();
        btNew = new javax.swing.JButton();
        btDelete = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        edPesquisar = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btSalvar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        edNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        edRg = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        edEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        edEndereco = new javax.swing.JTextField();
        btAtualizar = new javax.swing.JButton();
        edID = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        edDescricao = new javax.swing.JTextField();
        edFuncao = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        edCpf = new javax.swing.JFormattedTextField();
        edTelefone = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Funcionário");

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setPreferredSize(new java.awt.Dimension(586, 516));

        tbFuncionario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tbFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "CPF", "RG", "Endereço", "E-Mail", "Telefone", "Função", "Descrição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbFuncionario);
        if (tbFuncionario.getColumnModel().getColumnCount() > 0) {
            tbFuncionario.getColumnModel().getColumn(0).setPreferredWidth(30);
        }

        btNew.setBackground(new java.awt.Color(255, 255, 255));
        btNew.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btNew.setText("NOVO");
        btNew.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        btDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        btEditar.setBackground(new java.awt.Color(255, 255, 255));
        btEditar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btEditar.setText("EDITAR");
        btEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pesquisar.png"))); // NOI18N

        edPesquisar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        edPesquisar.setBorder(null);
        edPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edPesquisarKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(edPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
            .addComponent(edPesquisar)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btNew, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNew, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jTabbedPane1.addTab("Funcionário", jPanel2);

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome Completo");

        btSalvar.setBackground(new java.awt.Color(255, 255, 255));
        btSalvar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btSalvar.setText("SALVAR");
        btSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btSalvarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btSalvarMouseExited(evt);
            }
        });
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btCancelar.setBackground(new java.awt.Color(255, 255, 255));
        btCancelar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btCancelar.setText("CANCELAR");
        btCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btCancelarMouseExited(evt);
            }
        });
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CPF");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("RG");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("E-Mail");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Telefone");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Descrição");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Endereço");

        btAtualizar.setBackground(new java.awt.Color(255, 255, 255));
        btAtualizar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btAtualizar.setText("ATUALIZAR");
        btAtualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btAtualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btAtualizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btAtualizarMouseExited(evt);
            }
        });
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });

        edID.setEditable(false);
        edID.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Código");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Função");

        try {
            edCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            edTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(edNome, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel5)
                                                .addComponent(jLabel2))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(edCpf)
                                            .addGap(176, 176, 176)))
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(edRg, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3))))
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(edEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel9)
                                    .addComponent(edFuncao, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                                    .addComponent(edTelefone))
                                .addGap(176, 176, 176)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6)
                                    .addComponent(edEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                                    .addComponent(edDescricao)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(edRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        jTabbedPane1.addTab("Cadastro", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNewActionPerformed
        jTabbedPane1.setSelectedIndex(1);
        btCancelarActionPerformed(evt);
    }//GEN-LAST:event_btNewActionPerformed

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
        int indice = tbFuncionario.getSelectedRow();
        if (indice >= 0) {
            Funcionario f = new Funcionario();
            f.setId_funcionario(Integer.parseInt(tbFuncionario.getValueAt(indice, 0).toString()));
            f.setName(tbFuncionario.getValueAt(indice, 1).toString());
            f.setCpf(tbFuncionario.getValueAt(indice, 2).toString());
            f.setRg(tbFuncionario.getValueAt(indice, 3).toString());
            f.setPhonenumber(tbFuncionario.getValueAt(indice, 4).toString());
            f.setEmail(tbFuncionario.getValueAt(indice, 5).toString());
            f.setRole(tbFuncionario.getValueAt(indice, 6).toString());
            f.setAdress(tbFuncionario.getValueAt(indice, 7).toString());
            f.setDescription(tbFuncionario.getValueAt(indice, 8).toString());

            FuncionarioDao fdao = new FuncionarioDao();
            fdao.delete(f);
            preencherTabela();
        } else {
            JOptionPane.showMessageDialog(null, "SELECIONE UMA LINHA DA TABELA");
        }
    }//GEN-LAST:event_btDeleteActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        if (edNome.getText().isEmpty() || edCpf.getText().isEmpty() || edRg.getText().isEmpty() || edTelefone.getText().isEmpty() || edEmail.getText().isEmpty() || edFuncao.getText().isEmpty() || edDescricao.getText().isEmpty() || edEndereco.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os Campos!");

        } else {
            Funcionario f = new Funcionario();
            f.setAdress(edEndereco.getText());
            f.setCpf(edCpf.getText());
            f.setPhonenumber(edTelefone.getText());
            f.setEmail(edEmail.getText());
            f.setName(edNome.getText());
            f.setRg(edRg.getText());
            f.setRole(edFuncao.getText());
            f.setDescription(edDescricao.getText());

            FuncionarioDao fdao = new FuncionarioDao();
            fdao.insert(f);
            preencherTabela();

            btCancelarActionPerformed(evt);
            jTabbedPane1.setSelectedIndex(0);
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        if (edNome.getText().isEmpty() || edCpf.getText().isEmpty() || edRg.getText().isEmpty() || edTelefone.getText().isEmpty() || edEmail.getText().isEmpty() || edFuncao.getText().isEmpty() || edDescricao.getText().isEmpty() || edEndereco.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os Campos!");

        } else {
            Funcionario f = new Funcionario();
            f.setId_funcionario(Integer.parseInt(edID.getText()));
            f.setAdress(edEndereco.getText());
            f.setCpf(edCpf.getText());
            f.setPhonenumber(edTelefone.getText());
            f.setEmail(edEmail.getText());
            f.setName(edNome.getText());
            f.setRg(edRg.getText());
            f.setRole(edFuncao.getText());
            f.setDescription(edDescricao.getText());

            FuncionarioDao fdao = new FuncionarioDao();
            fdao.update(f);
            preencherTabela();

            btCancelarActionPerformed(evt);
            jTabbedPane1.setSelectedIndex(0);
        }
    }//GEN-LAST:event_btAtualizarActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        int indice = tbFuncionario.getSelectedRow();

        if (indice >= 0) {
            edID.setText(tbFuncionario.getValueAt(indice, 0).toString());
            edNome.setText(tbFuncionario.getValueAt(indice, 1).toString());
            edCpf.setText(tbFuncionario.getValueAt(indice, 2).toString());
            edRg.setText(tbFuncionario.getValueAt(indice, 3).toString());
            edEndereco.setText(tbFuncionario.getValueAt(indice, 4).toString());
            edEmail.setText(tbFuncionario.getValueAt(indice, 5).toString());
            edTelefone.setText(tbFuncionario.getValueAt(indice, 6).toString());
            edFuncao.setText(tbFuncionario.getValueAt(indice, 7).toString());
            edDescricao.setText(tbFuncionario.getValueAt(indice, 8).toString());

            btSalvar.setVisible(false);
            btAtualizar.setVisible(true);
            jTabbedPane1.setSelectedIndex(1);

        } else {
            JOptionPane.showMessageDialog(null, "SELECIONE UMA LINHA DA TABELA");
        }
    }//GEN-LAST:event_btEditarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        edCpf.setText(null);
        edDescricao.setText(null);
        edEmail.setText(null);
        edEndereco.setText(null);
        edFuncao.setText(null);
        edID.setText(null);
        edNome.setText(null);
        edRg.setText(null);
        edTelefone.setText(null);

        btSalvar.setVisible(true);
        btAtualizar.setVisible(false);
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btNewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btNewMouseEntered
        btNew.setBackground(new Color(30, 144, 255));
        btNew.setForeground(Color.WHITE);
    }//GEN-LAST:event_btNewMouseEntered

    private void btNewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btNewMouseExited
        btNew.setBackground(new Color(235, 235, 235));
        btNew.setForeground(Color.BLACK);
    }//GEN-LAST:event_btNewMouseExited

    private void btDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btDeleteMouseEntered
        btDelete.setBackground(Color.RED);
        btDelete.setForeground(Color.WHITE);
    }//GEN-LAST:event_btDeleteMouseEntered

    private void btDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btDeleteMouseExited
        btDelete.setBackground(Color.WHITE);
        btDelete.setForeground(Color.BLACK);
    }//GEN-LAST:event_btDeleteMouseExited

    private void btEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btEditarMouseEntered
        btEditar.setBackground(Color.GREEN);
        btEditar.setForeground(Color.WHITE);
    }//GEN-LAST:event_btEditarMouseEntered

    private void btEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btEditarMouseExited
        btEditar.setBackground(Color.WHITE);
        btEditar.setForeground(Color.BLACK);
    }//GEN-LAST:event_btEditarMouseExited

    private void btSalvarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSalvarMouseEntered
        btSalvar.setBackground(new Color(30, 144, 255));
        btSalvar.setForeground(Color.WHITE);
    }//GEN-LAST:event_btSalvarMouseEntered

    private void btSalvarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSalvarMouseExited
        btSalvar.setBackground(new Color(235, 235, 235));
        btSalvar.setForeground(Color.BLACK);
    }//GEN-LAST:event_btSalvarMouseExited

    private void btAtualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAtualizarMouseEntered
        btAtualizar.setBackground(Color.GREEN);
        btAtualizar.setForeground(Color.WHITE);
    }//GEN-LAST:event_btAtualizarMouseEntered

    private void btAtualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAtualizarMouseExited
        btAtualizar.setBackground(Color.WHITE);
        btAtualizar.setForeground(Color.BLACK);
    }//GEN-LAST:event_btAtualizarMouseExited

    private void btCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCancelarMouseEntered
        btCancelar.setBackground(Color.RED);
        btCancelar.setForeground(Color.WHITE);
    }//GEN-LAST:event_btCancelarMouseEntered

    private void btCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCancelarMouseExited
        btCancelar.setBackground(Color.WHITE);
        btCancelar.setForeground(Color.BLACK);
    }//GEN-LAST:event_btCancelarMouseExited

    private void edPesquisarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edPesquisarKeyPressed
        preencherTabela(edPesquisar.getText());
    }//GEN-LAST:event_edPesquisarKeyPressed

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
            java.util.logging.Logger.getLogger(viewFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                viewFuncionario dialog = new viewFuncionario(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btNew;
    private javax.swing.JButton btSalvar;
    private javax.swing.JFormattedTextField edCpf;
    private javax.swing.JTextField edDescricao;
    private javax.swing.JTextField edEmail;
    private javax.swing.JTextField edEndereco;
    private javax.swing.JTextField edFuncao;
    private javax.swing.JTextField edID;
    private javax.swing.JTextField edNome;
    private javax.swing.JTextField edPesquisar;
    private javax.swing.JTextField edRg;
    private javax.swing.JFormattedTextField edTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tbFuncionario;
    // End of variables declaration//GEN-END:variables
}
