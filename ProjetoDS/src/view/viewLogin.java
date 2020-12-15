package view;

import dao.UsuarioDao;
import java.awt.Color;
import java.awt.Point;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.Border;
import mapeamento.Usuario;

/**
 *
 * @author Joao
 */
public class viewLogin extends javax.swing.JFrame {

    private Point point = new Point();

    public viewLogin() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LB_RecoverPassword = new javax.swing.JLabel();
        BT_Logar = new javax.swing.JButton();
        BT_Sair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        edCPF = new javax.swing.JFormattedTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        edSenha = new javax.swing.JPasswordField();

        jLabel5.setBackground(new java.awt.Color(102, 102, 102));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/6486.jpg"))); // NOI18N

        jButton3.setText("jButton3");

        jPanel5.setBackground(new java.awt.Color(0, 51, 153));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CPF:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Senha:");

        LB_RecoverPassword.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        LB_RecoverPassword.setText("Esqueceu a senha?");
        LB_RecoverPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        BT_Logar.setBackground(new java.awt.Color(138, 43, 226));
        BT_Logar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BT_Logar.setForeground(new java.awt.Color(255, 255, 255));
        BT_Logar.setText("LOGAR");
        BT_Logar.setBorder(null);
        BT_Logar.setBorderPainted(false);
        BT_Logar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_Logar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BT_LogarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BT_LogarMouseExited(evt);
            }
        });
        BT_Logar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_LogarActionPerformed(evt);
            }
        });

        BT_Sair.setBackground(new java.awt.Color(178, 34, 34));
        BT_Sair.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BT_Sair.setForeground(new java.awt.Color(255, 255, 255));
        BT_Sair.setText("SAIR");
        BT_Sair.setBorder(null);
        BT_Sair.setBorderPainted(false);
        BT_Sair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_Sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BT_SairMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BT_SairMouseExited(evt);
            }
        });
        BT_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_SairActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("DeVinne Txt BT", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sign in to SisBike");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user-login.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user_login.png"))); // NOI18N

        edCPF.setBorder(null);
        try {
            edCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(edCPF))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(edCPF)
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/padlock.png"))); // NOI18N

        edSenha.setBorder(null);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(edSenha))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(edSenha)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(LB_RecoverPassword)
                    .addComponent(BT_Sair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BT_Logar, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(BT_Logar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BT_Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(LB_RecoverPassword)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void acaoLogin() {
        UsuarioDao userdao = new UsuarioDao();
        Usuario user = userdao.login(edCPF.getText(), edSenha.getText());

        if (user.getId_user() > 0) {
            viewMenu menu = new viewMenu();
            menu.setVisible(true);
            this.dispose();
            menu.setLocationRelativeTo(menu);

        } else {
            JOptionPane.showMessageDialog(null, "Usuario ou senha incorreto!");
        }
    }

    private void BT_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_SairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BT_SairActionPerformed

    private void BT_LogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_LogarActionPerformed
        acaoLogin();

        /* Efeito para fazer o Jframe tremer'...
        Point p = new Point();        
        viewLogin login = this;
        new Thread() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 4; i++) {

                        login.setLocation(p.x - 10, p.y);
                        sleep(20);
                        login.setLocation(p.x + 10, p.y);
                        sleep(20);
                    }
                    //login.setLocation(p.x, p.y);

                } catch (InterruptedException ex) {
                    Logger.getLogger(viewLogin.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }.start();*/
    }//GEN-LAST:event_BT_LogarActionPerformed

    private void BT_LogarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_LogarMouseEntered
        BT_Logar.setBackground(new Color(235, 235, 235));
        BT_Logar.setForeground(new Color(138, 43, 226));
    }//GEN-LAST:event_BT_LogarMouseEntered

    private void BT_SairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_SairMouseEntered
        BT_Sair.setBackground(new Color(235, 235, 235));
        BT_Sair.setForeground(new Color(178, 34, 34));
    }//GEN-LAST:event_BT_SairMouseEntered

    private void BT_LogarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_LogarMouseExited
        BT_Logar.setBackground(new Color(138, 43, 226));
        BT_Logar.setForeground(Color.WHITE);
        //58, 65, 84
    }//GEN-LAST:event_BT_LogarMouseExited

    private void BT_SairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_SairMouseExited
        BT_Sair.setBackground(new Color(178, 34, 34));
        BT_Sair.setForeground(Color.WHITE);
    }//GEN-LAST:event_BT_SairMouseExited

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked

    }//GEN-LAST:event_formMouseClicked

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        point.x = evt.getX();
        point.y = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        Point p = this.getLocation();
        this.setLocation(p.x + evt.getX() - point.x, p.y + evt.getY() - point.y);
    }//GEN-LAST:event_formMouseDragged

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
            java.util.logging.Logger.getLogger(viewVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_Logar;
    private javax.swing.JButton BT_Sair;
    private javax.swing.JLabel LB_RecoverPassword;
    private javax.swing.JFormattedTextField edCPF;
    private javax.swing.JPasswordField edSenha;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables
}
