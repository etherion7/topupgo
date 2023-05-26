package Main;


import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ASUS
 */
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class ProjectIcon2 extends javax.swing.JFrame {

    /**
     * Creates new form ProjectIcon2
     */
        public Connection con;
    public Statement stm;
    public PreparedStatement pst;
    public ResultSet rs = null;
    private String kodeotp;
   
    public ProjectIcon2() {
        initComponents();
       
    }
    
       public boolean checkRegist(String username)
            {
                try {
                     String sqlcom = "select * from user";
                     rs = mainConnectionDB.con.createStatement().executeQuery(sqlcom);
                    while(rs.next()){
                        if(username.equals(rs.getString("Username"))){
                            return true;
                        }
                    }
                } catch (Exception e) {
                    System.out.println(e.toString());
                }
                return false;
            }
    

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        email = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        btnRegis = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        repassword = new javax.swing.JPasswordField();
        back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        email.setBackground(new java.awt.Color(248, 249, 251));
        email.setBorder(null);
        email.setOpaque(true);
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 260, 30));

        username.setBackground(new java.awt.Color(248, 249, 251));
        username.setBorder(null);
        username.setOpaque(true);
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 250, 30));

        btnRegis.setContentAreaFilled(false);
        btnRegis.setBackground(new java.awt.Color(85, 85, 85));
        btnRegis.setContentAreaFilled(false);
        btnRegis.setFont(new java.awt.Font("Wide Latin", 1, 14)); // NOI18N
        btnRegis.setContentAreaFilled(false);
        btnRegis.setForeground(new java.awt.Color(255, 255, 255));
        btnRegis.setContentAreaFilled(false);
        btnRegis.setText("REGISTER");
        btnRegis.setContentAreaFilled(false);
        btnRegis.setBorder(null);
        btnRegis.setContentAreaFilled(false);
        btnRegis.setOpaque(true);
        btnRegis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegis, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 610, 190, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 20, 20));

        password.setBackground(new java.awt.Color(249, 254, 251));
        password.setBorder(null);
        password.setOpaque(true);
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 260, 30));

        repassword.setBackground(new java.awt.Color(249, 254, 251));
        repassword.setBorder(null);
        repassword.setOpaque(true);
        repassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repasswordActionPerformed(evt);
            }
        });
        getContentPane().add(repassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 520, 260, 30));

        back.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        back.setText("Back");
        back.setContentAreaFilled(false);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 10, 110, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/project2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisActionPerformed
        // TODO add your handling code here:
       String salt = passEncrypt.getSaltvalue(6);
       kodeotp kode = new kodeotp();
       kode.setVisible(true);
        JOptionPane.showMessageDialog(null, "Berhasil");
         if(checkRegist(username.getText())){
           JOptionPane.showMessageDialog(null, "Username ini sudah digunakan", "Warning", JOptionPane.ERROR_MESSAGE);
        } else {
            String passwordRegist = repassword.getText();
            if(passwordRegist.length() < 8){
                JOptionPane.showMessageDialog(null, "Password Minimal Harus Memiliki 8 Karakter", "Message", JOptionPane.INFORMATION_MESSAGE);
            }else{
               String sql = "insert into user (username, email, password, salt, userActivation, registCode) values (?, ?, ?, ?, ?, ?)";
                    try{
                        pst = con.prepareStatement(sql);
                        pst.setString(1, username.getText());
                        pst.setString(2, email.getText());
                        pst.setString(3, passEncrypt.generateSecurePassword(repassword.getText(), salt));
                        pst.setString(4, salt);//salt
                        pst.setInt(5, 0);
                        pst.setString(6, kodeotp);
                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Register Behasil");
                    }catch(HeadlessException | SQLException ex){
                         JOptionPane.showMessageDialog(this, ex.getMessage());
                } 
            }
        }
    }//GEN-LAST:event_btnRegisActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void repasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_repasswordActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        projectIcon1 regist = new projectIcon1();
       regist.setVisible(true);
        back.setVisible(true);
        JOptionPane.showMessageDialog(null, "Back");
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(ProjectIcon2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProjectIcon2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProjectIcon2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProjectIcon2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProjectIcon2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton btnRegis;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField password;
    private javax.swing.JPasswordField repassword;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
