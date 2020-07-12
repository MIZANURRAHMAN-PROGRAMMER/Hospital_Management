/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pharmecy;
import HMS.MyConnection;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Mizanur Rahman
 */
public class Pharmecy_Invoice_report extends javax.swing.JFrame {

    /**
     * Creates new form Pharmecy_Invoice_report
     */
    public Pharmecy_Invoice_report() {
        initComponents();
        String m="SELECT *FROM `pharmecy_bill` ";
        ShowData(m);
    }
 Connection con=null;
  Statement st=null;
    ResultSet rs=null;
void Myconnect(){

        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital_management","root","");
            st=con.createStatement();
            
        } catch (SQLException ex) {
            Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtdue = new javax.swing.JLabel();
        dateset2 = new com.toedter.calendar.JDateChooser();
        dateset1 = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        search = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pharmecy Invoice", "Patients Id", "Patients Name", "Date", "Total", "Paid", "Due"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 230, 1266, 402);
        getContentPane().add(txtdue);
        txtdue.setBounds(1140, 640, 60, 20);
        getContentPane().add(dateset2);
        dateset2.setBounds(450, 170, 260, 40);
        getContentPane().add(dateset1);
        dateset1.setBounds(450, 120, 260, 40);

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setLayout(null);
        jPanel3.add(jSeparator2);
        jSeparator2.setBounds(837, 99, 270, 0);

        search.setBackground(new java.awt.Color(102, 102, 102));
        search.setForeground(new java.awt.Color(255, 255, 255));
        search.setText("Search");
        search.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchMouseClicked(evt);
            }
        });
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchKeyPressed(evt);
            }
        });
        jPanel3.add(search);
        search.setBounds(1090, 60, 180, 30);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HMS/picture/DepartmentPicture/icons8_search_30px_2.png"))); // NOI18N
        jPanel3.add(jLabel15);
        jLabel15.setBounds(1060, 60, 30, 40);

        jLabel6.setFont(new java.awt.Font("Algerian", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("pharmecy invoice report");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(230, 20, 750, 50);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 1410, 110);

        jButton4.setText("Day");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(700, 120, 70, 40);

        jButton1.setText("Month");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(770, 120, 70, 40);

        jButton2.setText("Year");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(840, 120, 70, 40);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HMS/picture/DepartmentPicture/icons8_ok_20px_1.png"))); // NOI18N
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(700, 170, 70, 40);

        jLabel2.setText("Total Due:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(1080, 640, 60, 20);

        setSize(new java.awt.Dimension(1301, 728));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseClicked
        // TODO add your handling code here:
        search.setText("");
    }//GEN-LAST:event_searchMouseClicked

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void searchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyPressed
        // Search pressed enter key
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            String id=search.getText().toString();
            String m="SELECT *FROM `pharmecy_bill`  WHERE `id`='"+id+"'";
            ShowData(m);
        }
    }//GEN-LAST:event_searchKeyPressed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:

        SimpleDateFormat dtm=new SimpleDateFormat("yyyy-MM-dd");
        String g=dtm.format(dateset1.getDate());
        String sp="SELECT *FROM `pharmecy_bill` WHERE `pdate`='"+g+"'";
        ShowData(sp);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        SimpleDateFormat dtm=new SimpleDateFormat("yyyy-MM");
        String g=dtm.format(dateset1.getDate());
        String sp="SELECT *FROM `pharmecy_bill` WHERE `pdate` like '%"+g+"%'";
        ShowData(sp);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         
         Date dt=new Date();
        SimpleDateFormat dtm=new SimpleDateFormat("yyyy-MM-dd");
        String g=dtm.format(dateset1.getDate());
        String e=dtm.format(dateset2.getDate());
       String sp="SELECT *FROM `pharmecy_bill` WHERE `pdate` BETWEEN '"+g+"' AND '"+e+"'";
        ShowData(sp);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat dtm=new SimpleDateFormat("yyyy");
        String g=dtm.format(dateset1.getDate());
        String sp="SELECT *FROM `pharmecy_bill` WHERE `pdate` like '%"+g+"%'";
        ShowData(sp);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    void ShowData(String m){
        try {
            DefaultTableModel dt=(DefaultTableModel)jTable1.getModel();
            dt.setRowCount(0);
            Myconnect();
            rs=st.executeQuery(m);
            double s=0;
            while(rs.next()){
                s=s+rs.getInt(6);
            dt.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(7),rs.getString(4),rs.getString(5),rs.getString(6)});
        
            }
            txtdue.setText(s+"");
        } catch (SQLException ex) {
            Logger.getLogger(Pharmecy_Invoice_report.class.getName()).log(Level.SEVERE, null, ex);
        }
        
                
        
        
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
            java.util.logging.Logger.getLogger(Pharmecy_Invoice_report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pharmecy_Invoice_report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pharmecy_Invoice_report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pharmecy_Invoice_report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pharmecy_Invoice_report().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser dateset1;
    private com.toedter.calendar.JDateChooser dateset2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField search;
    private javax.swing.JLabel txtdue;
    // End of variables declaration//GEN-END:variables
}