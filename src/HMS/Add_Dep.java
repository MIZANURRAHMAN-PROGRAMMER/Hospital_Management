/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HMS;

import java.awt.event.KeyEvent;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Mizanur Rahman
 */
public class Add_Dep extends javax.swing.JFrame {

    /**
     * Creates new form Add_Dep
     */
    public Add_Dep() {
        initComponents();
        room.setText(""+autoid());
        price.requestFocus();
    }
Connection con=null;
Statement st=null;
ResultSet rs=null;

int autoid(){
        int a = 0;
        try {
            
            Myconnect();
            String m="SELECT `Room_no` FROM `room` ORDER BY `Room_no` ASC";
            rs=st.executeQuery(m);
            while(rs.next()){
                a=rs.getInt(1);
                
                
            }
            a++;
        } catch (SQLException ex) {
            Logger.getLogger(Add_Dep.class.getName()).log(Level.SEVERE, null, ex);
        }
        return a;
    }
    void Myconnect(){

        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital_management","root","");
            st=con.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    void Dataoparation(String m,String n){
        try {
            Myconnect();
          
            int b=st.executeUpdate(m);
            if(b>0){
                JOptionPane.showMessageDialog(this, n+" Succesful!");
                Cl_panel();
            }
            else{
                JOptionPane.showMessageDialog(this, n+" not succesful!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Add_Dep.class.getName()).log(Level.SEVERE, null, ex);
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

        txttype = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        room = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        price = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        getContentPane().setLayout(null);

        txttype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "AC", "NON-AC" }));
        txttype.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                txttypePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        getContentPane().add(txttype);
        txttype.setBounds(390, 300, 210, 40);

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("ROOM NO:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(270, 240, 110, 40);

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("TYPE:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(230, 300, 120, 30);

        room.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        room.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                roomKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                roomKeyReleased(evt);
            }
        });
        getContentPane().add(room);
        room.setBounds(390, 240, 210, 40);

        jButton1.setText("EXIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(560, 450, 90, 40);

        jButton3.setText("ADD ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(340, 450, 80, 40);

        price.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(price);
        price.setBounds(390, 360, 210, 40);

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("PRICE:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(270, 370, 90, 20);

        jButton6.setText("DELETE ");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(440, 450, 100, 40);

        jLabel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Room Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poor Richard", 0, 14), new java.awt.Color(51, 51, 51))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(140, 210, 570, 230);

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HMS/picture/DepartmentPicture/Add_word.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1370, 706);

        setBounds(0, 0, 1386, 743);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    void Cl_panel(){
        
        txttype.setSelectedIndex(0);
        room.setText("");
        price.setText("");
      
    }
    
    
    private void txttypePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_txttypePopupMenuWillBecomeInvisible
             
    }//GEN-LAST:event_txttypePopupMenuWillBecomeInvisible

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         String g=txttype.getSelectedItem().toString();
            String word=room.getText().toString();
            String bed=price.getText().toString();
           
            String m="INSERT INTO `room` VALUES ('"+word+"','"+g+"','"+bed+"')";
            Dataoparation(m,"Added");
             room.setText(""+autoid());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void roomKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_roomKeyReleased
        // TODO add your handling code here:
         
    }//GEN-LAST:event_roomKeyReleased

    private void roomKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_roomKeyPressed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_roomKeyPressed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        
          String word=room.getText().toString();
        
         String m="DELETE FROM `room` WHERE `Room_no`='"+word+"'";
            Dataoparation(m,"Delete");
             room.setText(""+autoid());
        
    }//GEN-LAST:event_jButton6ActionPerformed

    
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
            java.util.logging.Logger.getLogger(Add_Dep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Dep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Dep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Dep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Dep().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField price;
    private javax.swing.JTextField room;
    private javax.swing.JComboBox txttype;
    // End of variables declaration//GEN-END:variables
}
