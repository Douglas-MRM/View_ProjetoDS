package listas;

import com.placeholder.PlaceHolder;
import conexao.ConexaoMySql;
import dao.ProdutoDao;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mapeamento.Produto;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Jerônimo
 */
public class ListarProdutos extends javax.swing.JFrame {

    PlaceHolder holder;

    public ListarProdutos() {
        initComponents();
        preencherTabela();
        TB_Produto.requestFocus();

        holder = new PlaceHolder(edPesquisa, "Digite o nome do Produto");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        edPesquisa = new javax.swing.JTextField();
        btImprimir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollProduto = new javax.swing.JScrollPane();
        TB_Produto = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relatório dos Produtos");
        setBackground(new java.awt.Color(153, 153, 153));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        edPesquisa.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        edPesquisa.setBorder(null);
        edPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edPesquisaKeyPressed(evt);
            }
        });

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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pesquisar.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        TB_Produto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Marca", "Categoria", "Preço", "Descrição", "Fornecedor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollProduto.setViewportView(TB_Produto);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(edPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollProduto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(edPesquisa)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btImprimir))
                .addGap(18, 18, 18)
                .addComponent(jScrollProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void preencherTabela() {
        ProdutoDao pdao = new ProdutoDao();
        List<Produto> prodList = pdao.listAll();
        DefaultTableModel modelo = (DefaultTableModel) TB_Produto.getModel();
        modelo.setRowCount(0);
        for (Produto prod : prodList) {
            modelo.addRow(new Object[]{prod.getId_produto(), prod.getName(), prod.getBrand(), prod.getCategorie(),
                prod.getSaleprice(), prod.getDescription(), prod.getForn().getCompanyname()});
        }
    }

    public void preencherTabela(String NomePesquisa) {
        ProdutoDao pdao = new ProdutoDao();
        List<Produto> produList = pdao.listAll(NomePesquisa);
        DefaultTableModel modelo = (DefaultTableModel) TB_Produto.getModel();
        modelo.setRowCount(0);
        for (Produto prod : produList) {
            modelo.addRow(new Object[]{prod.getId_produto(), prod.getName(), prod.getBrand(), prod.getCategorie(),
                prod.getSaleprice(), prod.getDescription(), prod.getForn().getCompanyname()});
        }

    }

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
                + "     fornecedor.`id_forn` AS fornecedor_id_forn,\n"
                + "     fornecedor.`nomeFantasia_forn` AS fornecedor_nomeFantasia_forn,\n"
                + "     fornecedor.`razaoSocial_forn` AS fornecedor_razaoSocial_forn,\n"
                + "     fornecedor.`cnpj_forn` AS fornecedor_cnpj_forn,\n"
                + "     fornecedor.`cep_forn` AS fornecedor_cep_forn,\n"
                + "     fornecedor.`pais_forn` AS fornecedor_pais_forn,\n"
                + "     fornecedor.`estado_forn` AS fornecedor_estado_forn,\n"
                + "     fornecedor.`cidade_forn` AS fornecedor_cidade_forn,\n"
                + "     fornecedor.`telefone_forn` AS fornecedor_telefone_forn,\n"
                + "     fornecedor.`endereco_forn` AS fornecedor_endereco_forn,\n"
                + "     fornecedor.`descricao_forn` AS fornecedor_descricao_forn\n"
                + "FROM\n"
                + "     `fornecedor` fornecedor INNER JOIN `produto` produto ON fornecedor.`id_forn` = produto.`fk_id_forn`";
        try {
            Map map = new HashMap();
            Connection con = ConexaoMySql.getConexao();
            PreparedStatement prepare = con.prepareStatement(sql);
            ResultSet res = prepare.executeQuery();

            JRResultSetDataSource relatResult = new JRResultSetDataSource(res);
            JasperPrint jpPrint = JasperFillManager.fillReport("src/utilitarios/relatorio_produto.jasper", map, relatResult);
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

    public static void main(String args[]) {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TB_Produto;
    private javax.swing.JButton btImprimir;
    private javax.swing.JTextField edPesquisa;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollProduto;
    // End of variables declaration//GEN-END:variables
}
