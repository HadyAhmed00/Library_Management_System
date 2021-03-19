/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import static admin.Admin_GUI.cont;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author Hady Ahmed
 */
public class Remove_Book extends javax.swing.JFrame {
int id;
String name;
    /**
     * Creates new form Remove_Book
     */
    public Remove_Book() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("ic_logo.png")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jSeparator30 = new javax.swing.JSeparator();
        jSeparator31 = new javax.swing.JSeparator();
        jSeparator32 = new javax.swing.JSeparator();
        jSeparator33 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Library Management System");
        setResizable(false);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Remove Book");
        jPanel6.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, 120, 20));

        jTextField15.setBackground(new java.awt.Color(17, 9, 50));
        jTextField15.setForeground(new java.awt.Color(255, 255, 255));
        jTextField15.setText("Enter book name");
        jTextField15.setToolTipText("Enter book name");
        jTextField15.setBorder(null);
        jTextField15.setOpaque(false);
        jTextField15.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField15FocusGained(evt);
            }
        });
        jPanel6.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 200, 20));
        jPanel6.add(jSeparator30, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 200, 10));
        jPanel6.add(jSeparator31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 200, 10));
        jPanel6.add(jSeparator32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 200, 10));
        jPanel6.add(jSeparator33, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 200, 10));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/diff logo.png"))); // NOI18N
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 110, 80));

        jLabel26.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Book Name");
        jPanel6.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, -1, -1));

        jButton33.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jButton33.setForeground(new java.awt.Color(255, 255, 255));
        jButton33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/back 1.png"))); // NOI18N
        jButton33.setText("Back");
        jButton33.setToolTipText("Back to the previous page");
        jButton33.setBorder(null);
        jButton33.setBorderPainted(false);
        jButton33.setContentAreaFilled(false);
        jButton33.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton33.setDefaultCapable(false);
        jButton33.setFocusPainted(false);
        jButton33.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton33.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/back 2.png"))); // NOI18N
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton33, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 200, 50));

        jButton34.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jButton34.setForeground(new java.awt.Color(255, 255, 255));
        jButton34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/logout 1.png"))); // NOI18N
        jButton34.setText("Logout");
        jButton34.setToolTipText("Logout");
        jButton34.setBorder(null);
        jButton34.setBorderPainted(false);
        jButton34.setContentAreaFilled(false);
        jButton34.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton34.setDefaultCapable(false);
        jButton34.setFocusPainted(false);
        jButton34.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton34.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/logout 2.png"))); // NOI18N
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton34, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 200, 50));

        jButton35.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jButton35.setForeground(new java.awt.Color(255, 255, 255));
        jButton35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/home 1.png"))); // NOI18N
        jButton35.setText("Home");
        jButton35.setToolTipText("Home");
        jButton35.setBorder(null);
        jButton35.setBorderPainted(false);
        jButton35.setContentAreaFilled(false);
        jButton35.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton35.setDefaultCapable(false);
        jButton35.setFocusPainted(false);
        jButton35.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton35.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/home 2.png"))); // NOI18N
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton35, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 200, 50));

        jButton17.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jButton17.setForeground(new java.awt.Color(255, 255, 255));
        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/botton.png"))); // NOI18N
        jButton17.setText("Remove the Book");
        jButton17.setToolTipText("Remove the Book");
        jButton17.setBorder(null);
        jButton17.setBorderPainted(false);
        jButton17.setContentAreaFilled(false);
        jButton17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton17.setFocusPainted(false);
        jButton17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton17.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/botton2_1.png"))); // NOI18N
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 180, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/lefte.jpg"))); // NOI18N
        jLabel2.setText("jLabel1");
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 490));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/right.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 740, 490));

        getContentPane().add(jPanel6);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        
        name=jTextField15.getText();
        librarian.remove_book(name);
        
        
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        // TODO add your handling code here:
        cont.remov_book.setVisible(false);
        cont.home.setVisible(true);
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        // TODO add your handling code here:
        cont.remov_book.setVisible(false);
        cont.Admin.setVisible(true);
        cont.Admin.setResizable(false);
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jTextField15FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField15FocusGained
        // TODO add your handling code here:
        jTextField15.setText("");
    }//GEN-LAST:event_jTextField15FocusGained

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        // TODO add your handling code here:
          cont.remov_book.setVisible(false );
        cont.log.setVisible(true);
        cont.log.setResizable(false);
    }//GEN-LAST:event_jButton34ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator30;
    private javax.swing.JSeparator jSeparator31;
    private javax.swing.JSeparator jSeparator32;
    private javax.swing.JSeparator jSeparator33;
    private javax.swing.JTextField jTextField15;
    // End of variables declaration//GEN-END:variables
}
