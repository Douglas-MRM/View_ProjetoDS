package listas;

import com.placeholder.PlaceHolder;
import conexao.ConexaoMySql;
import dao.FornecedorDao;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mapeamento.Fornecedor;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Jerônimo
 */
public class ListarFornecedores extends javax.swing.JFrame {

    PlaceHolder holder;

    public ListarFornecedores() {
        initComponents();
        tbFornecedor.requestFocus();
        preencherTabela();
        holder = new PlaceHolder(edPesquisa, "Nome Fantasia do Fornecedor");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        edPesquisa = new javax.swing.JTextField();
        btImprimir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbFornecedor = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relatório de Fornecedores");

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pesquisar.png"))); // NOI18N

        edPesquisa.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        edPesquisa.setForeground(new java.awt.Color(153, 153, 153));
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
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(edPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
            .addComponent(edPesquisa)
        );

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

        tbFornecedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome Fantasia", "Razão Social", "CNPJ", "CEP", "ESTADO", "CIDADE", "TELEFONE", "Endereço", "Descrição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbFornecedor.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbFornecedor);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(363, 363, 363)
                        .addComponent(btImprimir))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 778, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btImprimir, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(60, 60, 60)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
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
        FornecedorDao fdao = new FornecedorDao();
        List<Fornecedor> fornList = fdao.listAll();
        DefaultTableModel modelo = (DefaultTableModel) tbFornecedor.getModel();
        modelo.setRowCount(0);
        for (Fornecedor forn : fornList) {
            modelo.addRow(new Object[]{forn.getId_fornecedor(), forn.getTradename(), forn.getCompanyname(), forn.getCnpj(),
                forn.getCep(), forn.getState(), forn.getCity(), forn.getPhonenumber(), forn.getAdress(), forn.getDescription()});
        }
    }

    public void preencherTabela(String PesquisaNome) {
        FornecedorDao fdao = new FornecedorDao();
        List<Fornecedor> fornList = fdao.listAll(PesquisaNome);
        DefaultTableModel modelo = (DefaultTableModel) tbFornecedor.getModel();
        modelo.setRowCount(0);
        for (Fornecedor forn : fornList) {
            modelo.addRow(new Object[]{forn.getId_fornecedor(), forn.getTradename(), forn.getCompanyname(), forn.getCnpj(),
                forn.getCep(), forn.getState(), forn.getCity(), forn.getPhonenumber(), forn.getAdress(), forn.getDescription()});
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
        String sql = "SELECT * FROM  fornecedor";
        try {
            Map map = new HashMap();
            Connection con = ConexaoMySql.getConexao();
            PreparedStatement prepare = con.prepareStatement(sql);
            ResultSet res = prepare.executeQuery();

            JRResultSetDataSource relatResult = new JRResultSetDataSource(res);
            JasperPrint jpPrint = JasperFillManager.fillReport("src/utilitarios/relatorio_fornecedor.jasper", map, relatResult);
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

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarFornecedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btImprimir;
    private javax.swing.JTextField edPesquisa;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbFornecedor;
    // End of variables declaration//GEN-END:variables
}
