package view;

import dao.ClienteDao;
import java.awt.Color;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mapeamento.Cliente;

/**
 *
 * @author Sara
 */
public class viewCliente extends javax.swing.JDialog {

    /**
     * Creates new form FormCliente
     */
    public viewCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        preencherTabela();
        btAtualizar.setVisible(false);
        btSalvar.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btNew = new javax.swing.JButton();
        btDelete = new javax.swing.JButton();
        edPesquisa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbListaCliente = new javax.swing.JTable();
        btEditar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btSalvar = new javax.swing.JButton();
        btAtualizar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btCancelar = new javax.swing.JButton();
        edNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        edRG = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        edEmail = new javax.swing.JTextField();
        cbSexo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        edCPF = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        edEndereco = new javax.swing.JTextField();
        LB_ID = new javax.swing.JLabel();
        edID = new javax.swing.JTextField();
        edDataNasc = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cliente");

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

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

        edPesquisa.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        edPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edPesquisaActionPerformed(evt);
            }
        });

        tbListaCliente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tbListaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "CPF", "RG", "Endereço", "E-Mail", "Data de Nascimento", "Sexo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbListaCliente);
        if (tbListaCliente.getColumnModel().getColumnCount() > 0) {
            tbListaCliente.getColumnModel().getColumn(0).setMaxWidth(30);
        }

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

        jLabel9.setText("Pesquisar por Nome:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btNew, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(edPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btNew, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                            .addComponent(btDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cliente", jPanel1);

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        btSalvar.setBackground(new java.awt.Color(255, 255, 255));
        btSalvar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btSalvar.setText("SALVAR");
        btSalvar.setBorder(null);
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

        btAtualizar.setBackground(new java.awt.Color(255, 255, 255));
        btAtualizar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btAtualizar.setText("ATUALIZAR");
        btAtualizar.setBorder(null);
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

        jLabel1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome Completo:");

        btCancelar.setBackground(new java.awt.Color(255, 255, 255));
        btCancelar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btCancelar.setText("CANCELAR");
        btCancelar.setBorder(null);
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
        jLabel2.setText("CPF:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("RG:");

        cbSexo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Feminino", "Masculino", "Prefiro não Informar" }));
        cbSexo.setSelectedIndex(-1);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("E-Mail:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Data de Nascimento:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Sexo:");

        try {
            edCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel7.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Endereço:");

        LB_ID.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        LB_ID.setForeground(new java.awt.Color(255, 255, 255));
        LB_ID.setText("ID");

        edID.setBackground(new java.awt.Color(204, 204, 204));
        edID.setForeground(new java.awt.Color(204, 204, 204));
        edID.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        try {
            edDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(229, 229, 229))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(edNome, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(62, 62, 62))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(edCPF, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                                                .addComponent(jLabel2)
                                                .addComponent(edDataNasc)))
                                        .addGap(163, 163, 163)))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(edRG, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(edEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(LB_ID)
                            .addComponent(edID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(LB_ID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(edID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
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

    public void preencherTabela() {
        ClienteDao cdao = new ClienteDao();
        List<Cliente> cliList = cdao.listAll();
        DefaultTableModel modelo = (DefaultTableModel) tbListaCliente.getModel();
        modelo.setRowCount(0);
        for (Cliente cli : cliList) {
            modelo.addRow(new Object[]{cli.getId_cliente(), cli.getName(), cli.getCpf(), cli.getRg(), cli.getAdress(),
                cli.getEmail(), cli.getDateofbirth(), cli.getSexo()});
        }
    }

    public void preencherTabela(String PesquisaNome) {
        ClienteDao cdao = new ClienteDao();
        List<Cliente> cliList = cdao.listAll(PesquisaNome);
        DefaultTableModel modelo = (DefaultTableModel) tbListaCliente.getModel();
        modelo.setRowCount(0);
        for (Cliente cli : cliList) {
            modelo.addRow(new Object[]{cli.getId_cliente(), cli.getName(), cli.getCpf(), cli.getRg(), cli.getAdress(),
                cli.getEmail(), cli.getDateofbirth(), cli.getSexo()});
        }
    }

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
        int indice = tbListaCliente.getSelectedRow();
        if (indice >= 0) {
            Cliente cli = new Cliente();
            cli.setId_cliente(Integer.parseInt(tbListaCliente.getValueAt(indice, 0).toString()));
            cli.setName(tbListaCliente.getValueAt(indice, 1).toString());
            cli.setCpf(tbListaCliente.getValueAt(indice, 2).toString());
            cli.setRg(tbListaCliente.getValueAt(indice, 3).toString());
            cli.setAdress(tbListaCliente.getValueAt(indice, 4).toString());
            cli.setEmail(tbListaCliente.getValueAt(indice, 5).toString());
            cli.setSexo(tbListaCliente.getValueAt(indice, 6).toString());

            ClienteDao cdao = new ClienteDao();
            cdao.delete(cli);
            preencherTabela();
        } else {
            JOptionPane.showMessageDialog(null, "SELECIONE UMA LINHA DA TABLEA");
        }
    }//GEN-LAST:event_btDeleteActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed

        int indice = tbListaCliente.getSelectedRow();
        if (indice >= 0) {
            edID.setText(tbListaCliente.getValueAt(indice, 0).toString());
            edNome.setText(tbListaCliente.getValueAt(indice, 1).toString());
            edCPF.setText(tbListaCliente.getValueAt(indice, 2).toString());
            edDataNasc.setText(tbListaCliente.getValueAt(indice, 6).toString());
            edEmail.setText(tbListaCliente.getValueAt(indice, 5).toString());
            edEndereco.setText(tbListaCliente.getValueAt(indice, 4).toString());
            edRG.setText(tbListaCliente.getValueAt(indice, 3).toString());
            cbSexo.setSelectedItem(tbListaCliente.getValueAt(indice, 7).toString());

            btSalvar.setVisible(false);
            btAtualizar.setVisible(true);
            jTabbedPane1.setSelectedIndex(1);
        } else {
        }
    }//GEN-LAST:event_btEditarActionPerformed

    private void btNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNewActionPerformed
        jTabbedPane1.setSelectedIndex(1);
        edCPF.setText(null);
        edDataNasc.setText(null);
        edEmail.setText(null);
        edEndereco.setText(null);
        edNome.setText(null);
        edRG.setText(null);
        cbSexo.setSelectedIndex(-1);
    }//GEN-LAST:event_btNewActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        edCPF.setText(null);
        edDataNasc.setText(null);
        edEmail.setText(null);
        edEndereco.setText(null);
        edNome.setText(null);
        edRG.setText(null);
        cbSexo.setSelectedIndex(-1);
        edID.setText(null);

        btSalvar.setVisible(true);
        btAtualizar.setVisible(false);
        edNome.setRequestFocusEnabled(true);
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        Cliente c = new Cliente();
        c.setId_cliente(Integer.parseInt(edID.getText()));
        c.setAdress(edEndereco.getText());
        c.setCpf(edCPF.getText());
        c.setDateofbirth(edDataNasc.getText());
        c.setEmail(edEmail.getText());
        c.setName(edNome.getText());
        c.setRg(edRG.getText());
        c.setSexo(cbSexo.getSelectedItem().toString());

        ClienteDao cdao = new ClienteDao();
        cdao.update(c);
        preencherTabela();

        btCancelarActionPerformed(evt);
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_btAtualizarActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        Cliente c = new Cliente();
        c.setAdress(edEndereco.getText());
        c.setCpf(edCPF.getText());
        c.setDateofbirth(edDataNasc.getText());
        c.setEmail(edEmail.getText());
        c.setName(edNome.getText());
        c.setRg(edRG.getText());
        c.setSexo(cbSexo.getSelectedItem().toString());

        ClienteDao cdao = new ClienteDao();
        cdao.insert(c);
        preencherTabela();

        btCancelarActionPerformed(evt);
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_btSalvarActionPerformed

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

    private void edPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edPesquisaActionPerformed
        preencherTabela(edPesquisa.getText());
    }//GEN-LAST:event_edPesquisaActionPerformed

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
                viewCliente dialog = new viewCliente(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel LB_ID;
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btNew;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox<String> cbSexo;
    private javax.swing.JFormattedTextField edCPF;
    private javax.swing.JFormattedTextField edDataNasc;
    private javax.swing.JTextField edEmail;
    private javax.swing.JTextField edEndereco;
    private javax.swing.JTextField edID;
    private javax.swing.JTextField edNome;
    private javax.swing.JTextField edPesquisa;
    private javax.swing.JTextField edRG;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tbListaCliente;
    // End of variables declaration//GEN-END:variables
}
