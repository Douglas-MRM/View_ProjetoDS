package view;

import com.placeholder.PlaceHolder;
import dao.ServicoDao;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mapeamento.Servico;

/**
 *
 * @author Sara
 */
public class viewServico extends javax.swing.JDialog {
    PlaceHolder holder;

    public viewServico(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        preencherTabela();
        btAtualizarServ.setVisible(false);
        
        holder = new PlaceHolder(edPesquisa, Color.GRAY, new Color(24,14,14), "Digite o Nome do Serviço", isUndecorated(), "Segoe UI", 14);
    }

    public void preencherTabela() {
        ServicoDao sdao = new ServicoDao();
        List<Servico> servList = sdao.listAll();
        DefaultTableModel modelo = (DefaultTableModel) tbServico.getModel();
        modelo.setRowCount(0);
        for (Servico serv : servList) {
            modelo.addRow(new Object[]{serv.getId_servico(), serv.getName(), serv.getType(), serv.getTime(), serv.getServiceprice(),
                serv.getTotalprice(), serv.getDescripcion()});
        }
    }

    public void preencherTabela(String PesquisarNome) {
        ServicoDao sdao = new ServicoDao();
        List<Servico> servList = sdao.listAll(PesquisarNome);
        DefaultTableModel modelo = (DefaultTableModel) tbServico.getModel();
        modelo.setRowCount(0);
        for (Servico serv : servList) {
            modelo.addRow(new Object[]{serv.getId_servico(), serv.getName(), serv.getType(), serv.getTime(), serv.getServiceprice(),
                serv.getTotalprice(), serv.getDescripcion()});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btNew = new javax.swing.JButton();
        btDelete = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        jScrollServico = new javax.swing.JScrollPane();
        tbServico = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        edPesquisa = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        lbCodigo = new javax.swing.JLabel();
        btSalvarServ = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        edCodigo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        edPrecoMaoObra = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        edNomeServico = new javax.swing.JFormattedTextField();
        jLabel14 = new javax.swing.JLabel();
        edDescricaoServ = new javax.swing.JTextField();
        edPrecoTotal = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        btAtualizarServ = new javax.swing.JButton();
        edTempo = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        cbTipo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Serviço");

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(586, 516));

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

        tbServico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Tipo", "Tempo", "Valor Mão de Obra", "Preço Total", "Descrição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollServico.setViewportView(tbServico);
        if (tbServico.getColumnModel().getColumnCount() > 0) {
            tbServico.getColumnModel().getColumn(0).setPreferredWidth(25);
        }

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pesquisar.png"))); // NOI18N

        edPesquisa.setBorder(null);
        edPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edPesquisaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(edPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(edPesquisa)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollServico, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btNew, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(23, 23, 23))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btNew, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jScrollServico, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Serviços", jPanel1);

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));

        lbCodigo.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbCodigo.setForeground(new java.awt.Color(255, 255, 255));
        lbCodigo.setText("Código:");

        btSalvarServ.setBackground(new java.awt.Color(255, 255, 255));
        btSalvarServ.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btSalvarServ.setText("SALVAR");
        btSalvarServ.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSalvarServ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btSalvarServMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btSalvarServMouseExited(evt);
            }
        });
        btSalvarServ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarServActionPerformed(evt);
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

        edCodigo.setEditable(false);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Nome:");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Preço da Mão de Obra:");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Tempo Gasto:");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Tipo:");

        jLabel14.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Descrição:");

        jLabel16.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Preço Total:");

        btAtualizarServ.setBackground(new java.awt.Color(255, 255, 255));
        btAtualizarServ.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btAtualizarServ.setText("ATUALIZAR");
        btAtualizarServ.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btAtualizarServ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btAtualizarServMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btAtualizarServMouseExited(evt);
            }
        });
        btAtualizarServ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarServActionPerformed(evt);
            }
        });

        try {
            edTempo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manutenção", "Revisão" }));
        cbTipo.setSelectedIndex(-1);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbCodigo)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(edCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(136, 136, 136)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cbTipo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(edNomeServico, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(164, 164, 164)))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11)
                            .addComponent(jLabel16)
                            .addComponent(edPrecoTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                            .addComponent(jLabel10)
                            .addComponent(edPrecoMaoObra, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                            .addComponent(edTempo, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edDescricaoServ, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(40, 40, 40))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(btSalvarServ, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btAtualizarServ, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbCodigo)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(edCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel16))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(edNomeServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(edPrecoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(edTempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(edPrecoMaoObra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edDescricaoServ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAtualizarServ, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSalvarServ, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(118, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cadastro de Serviço", jPanel5);

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
        edCodigo.setText(null);
        edDescricaoServ.setText(null);
        edPrecoMaoObra.setText(null);
        edPrecoTotal.setText(null);
        edTempo.setText(null);
        edNomeServico.setText(null);
    }//GEN-LAST:event_btNewActionPerformed

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
        int indice = tbServico.getSelectedRow();

        if (indice >= 0) {
            Servico s = new Servico();
            s.setId_servico(Integer.parseInt(tbServico.getValueAt(indice, 0).toString()));
            s.setName(tbServico.getValueAt(indice, 1).toString());
            s.setTime(tbServico.getValueAt(indice, 2).toString());
            s.setType(tbServico.getValueAt(indice, 3).toString());
            s.setServiceprice(Float.parseFloat(tbServico.getValueAt(indice, 4).toString()));
            s.setTotalprice(Float.parseFloat(tbServico.getValueAt(indice, 5).toString()));

            ServicoDao sdao = new ServicoDao();
            sdao.delete(s);
            preencherTabela();

        } else {
            JOptionPane.showMessageDialog(null, "SELECIONE UMA LINHA DA TABELA!");
        }
    }//GEN-LAST:event_btDeleteActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        int indice = tbServico.getSelectedRow();

        if (indice >= 0) {
            edCodigo.setText(tbServico.getValueAt(indice, 0).toString());
            edNomeServico.setText(tbServico.getValueAt(indice, 1).toString());
            cbTipo.setSelectedItem(tbServico.getValueAt(indice, 2).toString());            
            edTempo.setText(tbServico.getValueAt(indice, 3).toString());
            edPrecoMaoObra.setText(tbServico.getValueAt(indice, 4).toString());
            edPrecoTotal.setText(tbServico.getValueAt(indice, 5).toString());
            edDescricaoServ.setText(tbServico.getValueAt(indice, 6).toString());

            btSalvarServ.setVisible(false);
            btAtualizarServ.setVisible(true);
            jTabbedPane1.setSelectedIndex(1);

        } else {
            JOptionPane.showMessageDialog(null, "SELECIONE UMA LINHA DA TABELA!");
        }
    }//GEN-LAST:event_btEditarActionPerformed

    private void btAtualizarServActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarServActionPerformed
        int ind = cbTipo.getSelectedIndex();
        
        if (edNomeServico.getText().isEmpty() || edTempo.getText().isEmpty() || edPrecoMaoObra.getText().isEmpty() || ind == -1 || edPrecoTotal.getText().isEmpty() || edDescricaoServ.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os Campos!");

        } else {
            Servico s = new Servico();
            s.setId_servico(Integer.parseInt(edCodigo.getText()));
            s.setName(edNomeServico.getText());
            s.setDescripcion(edDescricaoServ.getText());
            s.setServiceprice(Float.parseFloat(edPrecoMaoObra.getText()));
            s.setTime(edTempo.getText());
            s.setTotalprice(Float.parseFloat(edPrecoTotal.getText()));
            s.setType(cbTipo.getSelectedItem().toString());            

            ServicoDao sdao = new ServicoDao();
            sdao.update(s);
            preencherTabela();

            btSalvarServ.setVisible(true);
            btAtualizarServ.setVisible(false);

            jTabbedPane1.setSelectedIndex(0);
        }
    }//GEN-LAST:event_btAtualizarServActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        edCodigo.setText(null);
        edDescricaoServ.setText(null);
        edNomeServico.setText(null);
        edPrecoMaoObra.setText(null);
        edPrecoTotal.setText(null);
        edTempo.setText(null);
        cbTipo.setSelectedIndex(-1);

        btAtualizarServ.setVisible(false);
        btSalvarServ.setVisible(true);
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btSalvarServActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarServActionPerformed
        int ind = cbTipo.getSelectedIndex();
        
        if (edNomeServico.getText().isEmpty() || edTempo.getText().isEmpty() || edPrecoMaoObra.getText().isEmpty() || ind == -1 || edPrecoTotal.getText().isEmpty() || edDescricaoServ.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os Campos!");

        } else {
            Servico s = new Servico();
            s.setName(edNomeServico.getText());
            s.setDescripcion(edDescricaoServ.getText());
            s.setServiceprice(Float.valueOf(edPrecoMaoObra.getText()));
            s.setTime(edTempo.getText());
            s.setTotalprice(Float.valueOf(edPrecoTotal.getText()));
            s.setType(cbTipo.getSelectedItem().toString());

            ServicoDao sdao = new ServicoDao();
            sdao.insert(s);
            preencherTabela();

            btCancelarActionPerformed(evt);
            jTabbedPane1.setSelectedIndex(0);
        }
    }//GEN-LAST:event_btSalvarServActionPerformed

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

    private void btSalvarServMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSalvarServMouseEntered
        btSalvarServ.setBackground(new Color(30, 144, 255));
        btSalvarServ.setForeground(Color.WHITE);
    }//GEN-LAST:event_btSalvarServMouseEntered

    private void btSalvarServMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSalvarServMouseExited
        btSalvarServ.setBackground(new Color(235, 235, 235));
        btSalvarServ.setForeground(Color.BLACK);
    }//GEN-LAST:event_btSalvarServMouseExited

    private void btAtualizarServMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAtualizarServMouseEntered
        btAtualizarServ.setBackground(Color.GREEN);
        btAtualizarServ.setForeground(Color.WHITE);
    }//GEN-LAST:event_btAtualizarServMouseEntered

    private void btAtualizarServMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAtualizarServMouseExited
        btAtualizarServ.setBackground(Color.WHITE);
        btAtualizarServ.setForeground(Color.BLACK);
    }//GEN-LAST:event_btAtualizarServMouseExited

    private void btCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCancelarMouseEntered
        btCancelar.setBackground(Color.RED);
        btCancelar.setForeground(Color.WHITE);
    }//GEN-LAST:event_btCancelarMouseEntered

    private void btCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCancelarMouseExited
        btCancelar.setBackground(Color.WHITE);
        btCancelar.setForeground(Color.BLACK);
    }//GEN-LAST:event_btCancelarMouseExited

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
            java.util.logging.Logger.getLogger(viewServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                viewServico dialog = new viewServico(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btAtualizarServ;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btNew;
    private javax.swing.JButton btSalvarServ;
    private javax.swing.JComboBox<String> cbTipo;
    private javax.swing.JTextField edCodigo;
    private javax.swing.JTextField edDescricaoServ;
    private javax.swing.JFormattedTextField edNomeServico;
    private javax.swing.JTextField edPesquisa;
    private javax.swing.JTextField edPrecoMaoObra;
    private javax.swing.JTextField edPrecoTotal;
    private javax.swing.JFormattedTextField edTempo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollServico;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JTable tbServico;
    // End of variables declaration//GEN-END:variables
}
