package listas;

import com.placeholder.PlaceHolder;
import conexao.ConexaoMySql;
import dao.VendaDao;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mapeamento.Venda;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Jerônimo
 */
public class ListarVendas extends javax.swing.JFrame {
    PlaceHolder holder;

    public ListarVendas() {
        initComponents();
        preencherTabela();
        
        holder = new PlaceHolder(edPesquisa, Color.GRAY, new Color(24,14,14), "Digite a data da Venda", isUndecorated(), "Segoe UI", 14);
    }

    public void preencherTabela() {
        VendaDao vdao = new VendaDao();
        List<Venda> vendList = vdao.listAll();
        DefaultTableModel modelo = (DefaultTableModel) TB_Venda.getModel();
        modelo.setRowCount(0);
        for (Venda vend : vendList) {
            modelo.addRow(new Object[]{vend.getId_venda(), vend.getHora(), vend.getData(), vend.getValor(), vend.getForma(), vend.getCliente().getName()});
        }

    }

    public void preencherTabela(String NomePesquisa) {
        VendaDao vdao = new VendaDao();
        List<Venda> vendList = vdao.listAll(NomePesquisa);
        DefaultTableModel modelo = (DefaultTableModel) TB_Venda.getModel();
        modelo.setRowCount(0);
        for (Venda vend : vendList) {
            modelo.addRow(new Object[]{vend.getId_venda(), vend.getHora(), vend.getData(), vend.getValor(), vend.getForma(), vend.getCliente().getName()});
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TB_Venda = new javax.swing.JTable();
        btImprimir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        edPesquisa = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relatório de Vendas");

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        TB_Venda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Hora", "Data", "Valor Total", "Forma de Pagamento", "Cliente"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TB_Venda);

        btImprimir.setBackground(new java.awt.Color(255, 255, 255));
        btImprimir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pdf_icone.gif"))); // NOI18N
        btImprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btImprimir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btImprimirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btImprimirMouseExited(evt);
            }
        });
        btImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btImprimirActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pesquisar.png"))); // NOI18N

        edPesquisa.setBorder(null);
        edPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edPesquisaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(edPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
            .addComponent(edPesquisa, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btImprimir)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btImprimirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btImprimirMouseEntered
        btImprimir.setBackground(new Color(30, 144, 255));
        btImprimir.setForeground(Color.WHITE);
    }//GEN-LAST:event_btImprimirMouseEntered

    private void btImprimirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btImprimirMouseExited
        btImprimir.setBackground(new Color(235, 235, 235));
        btImprimir.setForeground(Color.BLACK);
    }//GEN-LAST:event_btImprimirMouseExited

    private void btImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btImprimirActionPerformed
        String sql = "SELECT\n"
                + "     *,\n"
                + "     cliente.`id_cli` AS cliente_id_cli,\n"
                + "     cliente.`nome_cli` AS cliente_nome_cli,\n"
                + "     cliente.`data_nasc_cli` AS cliente_data_nasc_cli,\n"
                + "     cliente.`email_cli` AS cliente_email_cli,\n"
                + "     cliente.`cpf_cli` AS cliente_cpf_cli,\n"
                + "     cliente.`rg_cli` AS cliente_rg_cli,\n"
                + "     cliente.`endereco_cli` AS cliente_endereco_cli,\n"
                + "     cliente.`sexo_cli` AS cliente_sexo_cli\n"
                + "FROM\n"
                + "     `cliente` cliente INNER JOIN `venda` venda ON cliente.`id_cli` = venda.`fk_id_cli`";
        try {
            Map map = new HashMap();
            Connection con = ConexaoMySql.getConexao();
            PreparedStatement prepare = con.prepareStatement(sql);
            ResultSet res = prepare.executeQuery();

            JRResultSetDataSource relatResult = new JRResultSetDataSource(res);
            JasperPrint jpPrint = JasperFillManager.fillReport("src/utilitarios/relatorio_venda.jasper", map, relatResult);
            JasperViewer jv = new JasperViewer(jpPrint, false);
            jv.setVisible(true);
            jv.toFront();

            /*
            //CRIAR UM ARQUIVO PDF
            JasperExportManager.exportReportToPdfFile(jpPrint, "C:relatórioCliente.pdf");
            Runtime.getRuntime().exec("cmd / e start C:relatórioCliente.pdf");
            File file = new File("C:relatórioCliente.pdf");

            //ABRIR O PDF CRIADO
            Desktop desktop = Desktop.getDesktop();
            desktop.open(file);

            //DELETAR O PDF APÓS FECHA-LO
            file.deleteOnExit();
             */
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btImprimirActionPerformed

    private void edPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edPesquisaKeyPressed
        preencherTabela(edPesquisa.getText());
    }//GEN-LAST:event_edPesquisaKeyPressed

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
            java.util.logging.Logger.getLogger(ListarVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarVendas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TB_Venda;
    private javax.swing.JButton btImprimir;
    private javax.swing.JTextField edPesquisa;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
