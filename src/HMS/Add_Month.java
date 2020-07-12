/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HMS;

import Pharmecy.Product_info;
import Pharmecy.Purchase_Info;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Mizanur Rahman
 */
public class Add_Month extends javax.swing.JFrame {

    /**
     * Creates new form Add_Month
     */
    public Add_Month() {
        initComponents();
        String m="SELECT `id` FROM `chart_patient` ORDER BY `id` ASC";
               id.setText(""+autoid( m));
    }
    Purchase_Info pi=new Purchase_Info();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        mont = new javax.swing.JComboBox();
        date = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Date:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 190, 90, 30);

        id.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                idMouseClicked(evt);
            }
        });
        getContentPane().add(id);
        id.setBounds(120, 60, 160, 30);

        mont.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        mont.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "January", "February", "March", "April", "May", "June", "July", "August", "Septembar", "Octorbar", "Novembar", "Decembar" }));
        getContentPane().add(mont);
        mont.setBounds(120, 120, 160, 30);
        getContentPane().add(date);
        date.setBounds(120, 190, 160, 30);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("ID:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 60, 50, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Month:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 120, 50, 30);

        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(200, 240, 73, 30);

        jButton2.setText("ADD");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(120, 240, 60, 30);

        setBounds(100, 50, 379, 339);
    }// </editor-fold>//GEN-END:initComponents

    //Product_info pt=new Product_info();
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            // TODO add your handling code here:
            pi.Myconnect();
            String d=id.getText();
            String mon=mont.getSelectedItem().toString();
            SimpleDateFormat ft=new SimpleDateFormat("yyyy-MM-dd");
            String mm=ft.format(date.getDate());
            String m="INSERT INTO `chart_patient` (`id`,`month`,`cudate`) VALUES ('"+d+"','"+mon+"','"+mm+"')";
            int a=pi.pst.executeUpdate(m);
            if(a>0){
                JOptionPane.showMessageDialog(this, "Succesful");
                mont.setSelectedIndex(0);
                 String mmm="SELECT `id` FROM `chart_patient` ORDER BY `id` ASC";
               id.setText(""+autoid( mmm));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Add_Month.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            pi.Myconnect();
            String d=id.getText();
            String m="DELETE FROM `chart_patient` WHERE `id`='"+d+"'";
            int a=pi.pst.executeUpdate(m);
            if(a>0){
                JOptionPane.showMessageDialog(this, "Succesful");
                mont.setSelectedIndex(0);
                String mmm="SELECT `id` FROM `chart_patient` ORDER BY `id` ASC";
                id.setText(""+autoid( mmm));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Add_Month.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void idMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idMouseClicked
        // TODO add your handling code here:
        id.setText("");
    }//GEN-LAST:event_idMouseClicked
 ResultSet rs=null;
    public int autoid(String m){
        int a = 0;
        try {
            
           pi.Myconnect();
            
           
            rs=pi.pst.executeQuery(m);
            while(rs.next()){
                a=rs.getInt(1);
                
                
            }
            a++;
        } catch (SQLException ex) {
            Logger.getLogger(Product_info.class.getName()).log(Level.SEVERE, null, ex);
        }
        return a;
    }
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
            java.util.logging.Logger.getLogger(Add_Month.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Month.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Month.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Month.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Month().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox mont;
    // End of variables declaration//GEN-END:variables
}
