package admin;

import static admin.Admin_GUI.cont;
import javax.swing.JOptionPane;

    public class Add_User extends javax.swing.JFrame 
    {
        String first_name ;
        String last_name;
        int id;
        String password;
        String address;
        String phone;
        String email;
        boolean isblooked;
        public Add_User() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jSeparator15 = new javax.swing.JSeparator();
        jTextField5 = new javax.swing.JTextField();
        jSeparator14 = new javax.swing.JSeparator();
        jButton13 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Add User Form");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 160, -1));

        jTextField1.setBackground(new java.awt.Color(17, 9, 50));
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("Enter last name");
        jTextField1.setBorder(null);
        jTextField1.setOpaque(false);
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
        });
        jPanel3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, 200, 20));
        jPanel3.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 200, 10));
        jPanel3.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, 200, 10));

        jLabel9.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Password");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, -1, -1));
        jPanel3.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 210, 10));

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Name");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, -1, -1));
        jPanel3.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 200, 10));
        jPanel3.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 200, 10));
        jPanel3.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 200, 10));

        jPasswordField1.setBackground(new java.awt.Color(17, 9, 50));
        jPasswordField1.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField1.setText("jPasswordField1");
        jPasswordField1.setBorder(null);
        jPasswordField1.setOpaque(false);
        jPasswordField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusGained(evt);
            }
        });
        jPanel3.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 210, -1));

        jLabel11.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Contacts");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 90, -1));

        jTextField2.setBackground(new java.awt.Color(17, 9, 50));
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setText("Enter first name");
        jTextField2.setBorder(null);
        jTextField2.setOpaque(false);
        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField2FocusGained(evt);
            }
        });
        jPanel3.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 200, 20));

        jTextField4.setBackground(new java.awt.Color(17, 9, 50));
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.setText("Enter address");
        jTextField4.setBorder(null);
        jTextField4.setOpaque(false);
        jTextField4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField4FocusGained(evt);
            }
        });
        jPanel3.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 210, 20));
        jPanel3.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 210, 10));

        jButton24.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jButton24.setForeground(new java.awt.Color(255, 255, 255));
        jButton24.setText("Back");
        jButton24.setBorder(null);
        jButton24.setBorderPainted(false);
        jButton24.setContentAreaFilled(false);
        jButton24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton24.setDefaultCapable(false);
        jButton24.setFocusPainted(false);
        jButton24.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 200, 50));

        jButton25.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jButton25.setForeground(new java.awt.Color(255, 255, 255));
        jButton25.setText("Logout");
        jButton25.setBorder(null);
        jButton25.setBorderPainted(false);
        jButton25.setContentAreaFilled(false);
        jButton25.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton25.setDefaultCapable(false);
        jButton25.setFocusPainted(false);
        jButton25.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 200, 50));

        jButton26.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jButton26.setForeground(new java.awt.Color(255, 255, 255));
        jButton26.setText("Home");
        jButton26.setBorder(null);
        jButton26.setBorderPainted(false);
        jButton26.setContentAreaFilled(false);
        jButton26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton26.setDefaultCapable(false);
        jButton26.setFocusPainted(false);
        jButton26.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 200, 50));

        jLabel10.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Address");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 90, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/diff logo.png"))); // NOI18N
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 110, 80));

        jTextField6.setBackground(new java.awt.Color(17, 9, 50));
        jTextField6.setForeground(new java.awt.Color(255, 255, 255));
        jTextField6.setText("Enter email");
        jTextField6.setBorder(null);
        jTextField6.setOpaque(false);
        jTextField6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField6FocusGained(evt);
            }
        });
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 280, 210, 20));
        jPanel3.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 300, 210, 10));

        jTextField5.setBackground(new java.awt.Color(17, 9, 50));
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        jTextField5.setText("Enter phone number");
        jTextField5.setBorder(null);
        jTextField5.setOpaque(false);
        jTextField5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField5FocusGained(evt);
            }
        });
        jPanel3.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 210, 20));
        jPanel3.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 210, 10));

        jButton13.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/botton.png"))); // NOI18N
        jButton13.setText("Save User");
        jButton13.setBorder(null);
        jButton13.setBorderPainted(false);
        jButton13.setContentAreaFilled(false);
        jButton13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton13.setFocusPainted(false);
        jButton13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 420, 180, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/home icon.png"))); // NOI18N
        jLabel3.setText(" ");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/back icon.png"))); // NOI18N
        jLabel6.setText(" ");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/logout icon.png"))); // NOI18N
        jLabel12.setText(" ");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/lefte.jpg"))); // NOI18N
        jLabel2.setText("jLabel1");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 490));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/right.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 740, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // TODO add your handling code here:
        cont.add_user.setVisible(false);
        cont.Admin.setVisible(true);
        
        
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        // TODO add your handling code here:
        jTextField1.setText("");
  
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusGained
        // TODO add your handling code here:
        jTextField2.setText("");
    }//GEN-LAST:event_jTextField2FocusGained

    private void jPasswordField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusGained
        // TODO add your handling code here:
        jPasswordField1.setText("");
    }//GEN-LAST:event_jPasswordField1FocusGained

    private void jTextField4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4FocusGained
        // TODO add your handling code here:
        jTextField4.setText("");
    }//GEN-LAST:event_jTextField4FocusGained

    private void jTextField5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField5FocusGained
        // TODO add your handling code here:
        jTextField5.setText("");
    }//GEN-LAST:event_jTextField5FocusGained

    private void jTextField6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField6FocusGained
        // TODO add your handling code here:
        jTextField6.setText("");
    }//GEN-LAST:event_jTextField6FocusGained

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
        cont.add_user.setVisible(false);
        cont.home.setVisible(true);
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
       if(Validation.valid2(jTextField1.getText())&&Validation.valid2(jTextField2.getText())&&Validation.valid3(jTextField6.getText())){
        cont.add_user.setVisible(false);
        cont.new_user_info.setVisible(true);
        Home.r_index++;
        Home.userid++;
        last_name=jTextField1.getText();
        first_name=jTextField2.getText();
        id=Integer.valueOf(Home.userid);
        password=jPasswordField1.getText();
        address=jTextField4.getText();
        phone=jTextField5.getText();
        email=jTextField6.getText();
        librarian.add_rEADER( id, password, first_name, last_name, phone, "r", address, email, isblooked);
        cont.new_user_info.set_the_new(first_name+" "+last_name, id, password, address, phone, email); 
        JOptionPane.showMessageDialog(new Add_User(),"You have added a new reader successfully");
        
        }
       else
       {
           JOptionPane.showMessageDialog(new Add_Book(), "There is missing data or invalid data","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
