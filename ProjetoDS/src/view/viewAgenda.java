package view;

import com.placeholder.PlaceHolder;
import dao.AgendaDao;
import dao.ClienteDao;
import dao.ServicoDao;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mapeamento.Agenda;
import mapeamento.Cliente;
import mapeamento.Servico;

/**
 *
 * @author Sara
 */
public class viewAgenda extends javax.swing.JDialog {
    
    PlaceHolder holder;
    
    public viewAgenda(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        preencherTabela();
        preencherCbCli();
        preencherCbServ();
        
        cbCliente.setSelectedIndex(-1);
        cbServico.setSelectedIndex(-1);
        
        holder = new PlaceHolder(edPesquisa, "Nome do Cliente");
    }
    
    public void preencherTabela() {
        AgendaDao adao = new AgendaDao();
        List<Agenda> listaAgenda = adao.listAll();
        DefaultTableModel tabela = (DefaultTableModel) tbAgenda.getModel();
        tabela.setRowCount(0);
        for (Agenda a : listaAgenda) {
            tabela.addRow(new Object[]{a.getId_agenda(), a.getCliente().getName(), a.getServico().getName(), a.getDate(), a.getTimetable(), a.getCliente().getAdress()});
        }
    }
    
    public void preencherTabela(String NomePesquisa) {
        AgendaDao adao = new AgendaDao();
        List<Agenda> listaAgenda = adao.listAll();
        DefaultTableModel tabela = (DefaultTableModel) tbAgenda.getModel();
        tabela.setRowCount(0);
        for (Agenda a : listaAgenda) {
            tabela.addRow(new Object[]{a.getId_agenda(), a.getCliente().getName(), a.getServico().getName(), a.getDate(), a.getTimetable(), a.getCliente().getAdress()});
        }
    }
    
    public void preencherCbCli() {
        ClienteDao cdao = new ClienteDao();
        List<Cliente> cList = cdao.listAll();
        for (Cliente cli : cList) {
            cbCliente.addItem(cli);
        }
    }
    
    public void preencherCbServ() {
        ServicoDao sdao = new ServicoDao();
        List<Servico> sList = sdao.listAll();
        for (Servico s : sList) {
            cbServico.addItem(s);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbAgenda = new javax.swing.JTable();
        btNovo = new javax.swing.JButton();
        btDeletar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        edPesquisa = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        edID = new javax.swing.JTextField();
        btAgendar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cbServico = new javax.swing.JComboBox();
        cbCliente = new javax.swing.JComboBox();
        edData = new javax.swing.JFormattedTextField();
        edHora = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agenda");

        jTabbedPane1.setBackground(new java.awt.Color(102, 102, 102));
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tbAgenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Cliente", "Serviço", "Data", "Hora"
            }
        ));
        jScrollPane1.setViewportView(tbAgenda);
        if (tbAgenda.getColumnModel().getColumnCount() > 0) {
            tbAgenda.getColumnModel().getColumn(0).setPreferredWidth(25);
        }

        btNovo.setBackground(new java.awt.Color(0, 204, 102));
        btNovo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/novo.png"))); // NOI18N
        btNovo.setText("NOVO");
        btNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });

        btDeletar.setBackground(new java.awt.Color(255, 0, 0));
        btDeletar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btDeletar.setText("DELETAR");
        btDeletar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeletarActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pesquisar.png"))); // NOI18N

        edPesquisa.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        edPesquisa.setBorder(null);
        edPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edPesquisaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(edPesquisa)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btNovo)
                        .addGap(24, 24, 24)
                        .addComponent(btDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Agenda", jPanel1);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Serviço");

        jLabel14.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Código");

        edID.setEditable(false);

        btAgendar.setBackground(new java.awt.Color(0, 204, 102));
        btAgendar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btAgendar.setText("AGENDAR");
        btAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAgendarActionPerformed(evt);
            }
        });

        btCancelar.setBackground(new java.awt.Color(255, 0, 0));
        btCancelar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btCancelar.setText("CANCELAR");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Horário");

        jLabel16.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Data");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Cliente");

        try {
            edData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            edHora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(edID, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(487, 487, 487))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btAgendar)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel8)
                                .addComponent(jLabel11)
                                .addComponent(cbServico, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel16)
                                .addComponent(jLabel15)
                                .addComponent(edData)
                                .addComponent(edHora, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btCancelar))
                        .addGap(79, 79, 79))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(jLabel11))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(102, 102, 102))
        );

        jTabbedPane1.addTab("Agendar", jPanel2);

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

    private void btDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeletarActionPerformed
        int indice = tbAgenda.getSelectedRow();
        if (indice >= 0) {
            Agenda a = new Agenda();
            a.setId_agenda(Integer.parseInt(tbAgenda.getValueAt(indice, 0).toString()));
            a.setDate(tbAgenda.getValueAt(indice, 3).toString());
            a.setTimetable(tbAgenda.getValueAt(indice, 4).toString());
            
            AgendaDao adao = new AgendaDao();
            adao.delete(a);
            preencherTabela();
        } else {
            JOptionPane.showMessageDialog(null, "SELECIONE UMA LINHA DA TABELA");
        }
    }//GEN-LAST:event_btDeletarActionPerformed

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        jTabbedPane1.setSelectedIndex(1);
        edData.setText(null);
        edHora.setText(null);
        edID.setText(null);
        cbCliente.setSelectedIndex(-1);
        cbServico.setSelectedIndex(-1);
    }//GEN-LAST:event_btNovoActionPerformed

    private void btAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgendarActionPerformed
        int ind1 = cbServico.getSelectedIndex();
        int ind2 = cbCliente.getSelectedIndex();
        
        if (ind1 == -1 || edData.getText().isEmpty() || ind2 == -1 || edHora.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os Campos!");
            
        } else {
            Agenda a = new Agenda();
            a.setDate(edData.getText());
            a.setTimetable(edHora.getText());
            
            Cliente c = new Cliente();
            c = (Cliente) cbCliente.getSelectedItem();
            a.setCliente(c);
            
            Servico s = new Servico();
            s = (Servico) cbServico.getSelectedItem();
            a.setServico(s);
            
            AgendaDao adao = new AgendaDao();
            adao.insert(a);
            preencherTabela();
            
            btCancelarActionPerformed(evt);
            jTabbedPane1.setSelectedIndex(0);
        }
    }//GEN-LAST:event_btAgendarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        edData.setText(null);
        edHora.setText(null);
        cbCliente.setSelectedIndex(-1);
        cbServico.setSelectedIndex(-1);
    }//GEN-LAST:event_btCancelarActionPerformed

    private void edPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edPesquisaKeyPressed
        preencherTabela(edPesquisa.getText());
    }//GEN-LAST:event_edPesquisaKeyPressed
    
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
                viewAgenda dialog = new viewAgenda(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btAgendar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btDeletar;
    private javax.swing.JButton btNovo;
    private javax.swing.JComboBox cbCliente;
    private javax.swing.JComboBox cbServico;
    private javax.swing.JFormattedTextField edData;
    private javax.swing.JFormattedTextField edHora;
    private javax.swing.JTextField edID;
    private javax.swing.JTextField edPesquisa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tbAgenda;
    // End of variables declaration//GEN-END:variables

}
