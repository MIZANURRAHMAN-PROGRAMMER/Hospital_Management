/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HMS;

/**
 *
 * @author Mizanur Rahman
 */
public class Neourology extends javax.swing.JFrame {

    /**
     * Creates new form Neourology
     */
    public Neourology() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        txtdpid = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        txtdpid1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        txtdpid2 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(0, 0, 0));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTabbedPane1.setOpaque(true);

        jPanel1.setLayout(null);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HMS/picture/icons8_search_30px_1.png"))); // NOI18N
        jButton6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.setOpaque(false);
        jPanel1.add(jButton6);
        jButton6.setBounds(470, 160, 35, 40);

        txtdpid.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtdpid.setForeground(new java.awt.Color(51, 0, 51));
        txtdpid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtdpid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdpidActionPerformed(evt);
            }
        });
        jPanel1.add(txtdpid);
        txtdpid.setBounds(470, 160, 320, 40);

        jTable3.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient ID", "Name", "2nd Name", "Age", "Gender", "Merital", "Date", "Address", "Phone", "Type", "Doc Name", "Dep", "Word", "Bed", "Active", "Ref"
            }
        ));
        jTable3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable3.setGridColor(new java.awt.Color(102, 153, 255));
        jTable3.setOpaque(false);
        jScrollPane3.setViewportView(jTable3);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(0, 270, 1200, 530);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HMS/picture/DepartmentPicture/NeurologyDep.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 1224, 360);

        jTabbedPane1.addTab("VIEW PATIENTS", jPanel1);

        jPanel2.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(30, 280, 1160, 402);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HMS/picture/icons8_search_30px_1.png"))); // NOI18N
        jButton7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton7.setOpaque(false);
        jPanel2.add(jButton7);
        jButton7.setBounds(420, 190, 35, 40);

        txtdpid1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtdpid1.setForeground(new java.awt.Color(51, 0, 51));
        txtdpid1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtdpid1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdpid1ActionPerformed(evt);
            }
        });
        jPanel2.add(txtdpid1);
        txtdpid1.setBounds(420, 190, 320, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HMS/picture/DepartmentPicture/NeurologyDep.jpg"))); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(0, 0, 1224, 360);

        jTabbedPane1.addTab("VIEW WORD & BED", jPanel2);

        jPanel3.setLayout(null);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HMS/picture/icons8_search_30px_1.png"))); // NOI18N
        jButton8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton8.setOpaque(false);
        jPanel3.add(jButton8);
        jButton8.setBounds(390, 170, 35, 40);

        txtdpid2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtdpid2.setForeground(new java.awt.Color(51, 0, 51));
        txtdpid2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtdpid2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdpid2ActionPerformed(evt);
            }
        });
        jPanel3.add(txtdpid2);
        txtdpid2.setBounds(390, 170, 320, 40);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Doctor ID", "Name", "2nd Name", "E-mail", "Specialist", "Address", "Phone", "Fee", "Scheduel", "Salary", "Date"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(0, 260, 1190, 402);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HMS/picture/DepartmentPicture/NeurologyDep.jpg"))); // NOI18N
        jPanel3.add(jLabel8);
        jLabel8.setBounds(0, 0, 1224, 360);

        jTabbedPane1.addTab("VIEW DOCTOR", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1404, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 721, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1420, 760));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtdpidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdpidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdpidActionPerformed

    private void txtdpid1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdpid1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdpid1ActionPerformed

    private void txtdpid2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdpid2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdpid2ActionPerformed

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
            java.util.logging.Logger.getLogger(Neourology.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Neourology.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Neourology.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Neourology.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Neourology().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField txtdpid;
    private javax.swing.JTextField txtdpid1;
    private javax.swing.JTextField txtdpid2;
    // End of variables declaration//GEN-END:variables
}
