/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HMS;

import java.awt.event.KeyEvent;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mizanur Rahman
 */
public class Refference extends javax.swing.JFrame {

    /**
     * Creates new form Refference
     */
    public Refference() {
        initComponents();
        txtid.setText(""+autoid());
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
   
     int autoid(){
        int a = 0;
        try {
            
            Myconnect();
            String m="SELECT `rid` FROM `refference` ORDER BY `rid` ASC";
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
      void dataoperation(String m,String n){
          try {
            Myconnect();
          
            int b=st.executeUpdate(m);
            if(b>0){
               JOptionPane.showMessageDialog(this, "Data "+n+ "Succesful");
               Cl_panel();
            }
            else{
                JOptionPane.showMessageDialog(this, "Data "+n+" unsuccesfull");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Add_Dep.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        void Cl_panel(){
         txtid.setText(autoid()+"");
         txtname.setText("");
         txtsname.setText("");
         txtemail.setText("");
         txtdesig.setSelectedIndex(0);
         txtnation.setText("");
         txtrel.setText("");
         txtmobile.setText("");
         txtadd.setText("");
         txtpatient.setText("");
         //txtbirt.setDateFormatString("");
         //txtdate.setDateFormatString("");
     }
         void SelectedTablevaluesetTable(String x){
        int p=0;
       int a=txtdesig.getItemCount();
        for (int i = 0; i !=a; i++) {
            String m=txtdesig.getItemAt(i).toString();
            if(m.contains(x))
            {
               p=i; 
                
            }
            
        }
        txtdesig.setSelectedIndex(p);
       
        
        
    }
        void ShowData(){
        try {
            Myconnect();
            String id=txtid.getText().toString();
            String m="SELECT *FROM `refference` WHERE `rid`='"+id+"'";
            rs=st.executeQuery(m);
            if(rs.next()){
                txtname.setText(rs.getString(2));
                txtsname.setText(rs.getString(3));
                txtemail.setText(rs.getString(4));
                SelectedTablevaluesetTable(rs.getString(5));
                txtnation.setText(rs.getString(6));
                txtrel.setText(rs.getString(7));
                txtadd.setText(rs.getString(8));
                SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd");
           String mm=sd.format(rs.getDate(9));
        ((JTextField)txtdate.getDateEditor().getUiComponent()).setText(mm);
           
            
            txtmobile.setText(rs.getString(10));
            txtpatient.setText(rs.getString(11));
            
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Staff.class.getName()).log(Level.SEVERE, null, ex);
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        txtpatient = new javax.swing.JTextField();
        txtmobile = new javax.swing.JTextField();
        txtadd = new javax.swing.JTextField();
        txtnation = new javax.swing.JTextField();
        txtrel = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtsname = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtdesig = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtdate = new com.toedter.calendar.JDateChooser();
        txtid = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtsearch = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(0, 0, 51));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setOpaque(true);

        jPanel1.setLayout(null);

        txtpatient.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtpatient.setText("0");
        jPanel1.add(txtpatient);
        txtpatient.setBounds(750, 190, 210, 40);

        txtmobile.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(txtmobile);
        txtmobile.setBounds(750, 130, 210, 40);

        txtadd.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(txtadd);
        txtadd.setBounds(400, 500, 210, 40);

        txtnation.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(txtnation);
        txtnation.setBounds(400, 400, 210, 40);

        txtrel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(txtrel);
        txtrel.setBounds(400, 450, 210, 40);

        txtname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(txtname);
        txtname.setBounds(400, 180, 210, 40);

        txtsname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(txtsname);
        txtsname.setBounds(400, 250, 210, 40);

        txtemail.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        jPanel1.add(txtemail);
        txtemail.setBounds(400, 300, 210, 40);

        txtdesig.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Doctor", "Nurse", "Staff", "Others" }));
        jPanel1.add(txtdesig);
        txtdesig.setBounds(400, 350, 210, 40);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(680, 280, 90, 30);

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(870, 350, 80, 30);

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(920, 280, 100, 30);

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Update");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(800, 280, 90, 30);

        jLabel3.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N
        jLabel3.setText("Second name:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(290, 250, 90, 30);

        jLabel6.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N
        jLabel6.setText("E-mail:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(290, 310, 50, 30);

        jLabel7.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N
        jLabel7.setText("Designation:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(290, 350, 90, 30);

        jLabel8.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N
        jLabel8.setText("Nationality:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(290, 400, 80, 30);

        jLabel9.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N
        jLabel9.setText("Relagion:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(290, 450, 70, 30);

        jLabel10.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N
        jLabel10.setText("Address:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(290, 500, 70, 30);

        jLabel11.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N
        jLabel11.setText("Date of birth:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(290, 550, 90, 30);

        jLabel12.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N
        jLabel12.setText("Mobile:");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(650, 130, 60, 30);

        jLabel13.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N
        jLabel13.setText("Patients:");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(660, 190, 90, 30);

        jLabel14.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N
        jLabel14.setText("First name:");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(290, 180, 80, 30);
        jPanel1.add(txtdate);
        txtdate.setBounds(400, 550, 210, 40);

        txtid.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(txtid);
        txtid.setBounds(400, 120, 210, 40);

        jLabel15.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N
        jLabel15.setText("Refference ID:");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(290, 120, 110, 30);

        jPanel3.setBackground(new java.awt.Color(86, 170, 214));
        jPanel3.setLayout(null);

        jLabel16.setFont(new java.awt.Font("Poor Richard", 0, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("ADD REFFERENCE");
        jPanel3.add(jLabel16);
        jLabel16.setBounds(0, 10, 183, 28);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(170, 40, 310, 50);

        jButton6.setBackground(new java.awt.Color(0, 0, 0));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Search");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(740, 350, 80, 30);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HMS/picture/DepartmentPicture/Staff_Details.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, -20, 1355, 820);

        jTabbedPane1.addTab("ADD Refference", jPanel1);

        jPanel2.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ref ID", "Name", "Second Name", "E-mail", "Designation", "Nationality", "Relagion", "Address", "Date of Birth", "Mobile", "Patients"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(70, 220, 1250, 402);

        txtsearch.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtsearch.setForeground(new java.awt.Color(255, 255, 255));
        txtsearch.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtsearch.setOpaque(false);
        txtsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearchActionPerformed(evt);
            }
        });
        txtsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtsearchKeyPressed(evt);
            }
        });
        jPanel2.add(txtsearch);
        txtsearch.setBounds(650, 130, 280, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HMS/picture/icons8_search_30px_1.png"))); // NOI18N
        jPanel2.add(jLabel4);
        jLabel4.setBounds(620, 130, 30, 50);

        jPanel4.setBackground(new java.awt.Color(86, 170, 214));

        jLabel5.setFont(new java.awt.Font("Poor Richard", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("VIEW REFFERENCE");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4);
        jPanel4.setBounds(190, 40, 210, 50);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HMS/picture/DepartmentPicture/icons8_refresh_25px.png"))); // NOI18N
        jButton2.setText("Refresh");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(670, 630, 120, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HMS/picture/DepartmentPicture/Staff_Details.jpg"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, -20, 1355, 820);

        jTabbedPane1.addTab("VIEW Refference", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1362, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(1378, 784));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
         ShowData();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
         String id=txtid.getText().toString();
        String fname=txtname.getText().toString();
        String sname=txtsname.getText().toString();
        String email=txtemail.getText().toString();
        String desig=txtdesig.getSelectedItem().toString();
        String nation=txtnation.getText().toString();
        
        String rela=txtrel.getText().toString();
        String add=txtadd.getText().toString();
       SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd");
            String birth=sd.format(txtdate.getDate());
            String patient=txtpatient.getText().toString();
            String mobile=txtmobile.getText().toString();
            String m="INSERT INTO `refference` VALUES ('"+id+"','"+fname+"','"+sname+"','"+email+"','"+desig+"','"+nation+"','"+rela+"','"+add+"','"+birth+"','"+mobile+"','"+patient+"')";
        dataoperation(m,"Insert");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        
         String id=txtid.getText().toString();
        String fname=txtname.getText().toString();
        String sname=txtsname.getText().toString();
        String email=txtemail.getText().toString();
        String desig=txtdesig.getSelectedItem().toString();
        String nation=txtnation.getText().toString();
        
        String rela=txtrel.getText().toString();
        String add=txtadd.getText().toString();
      
            String patient=txtpatient.getText().toString();
            String mobile=txtmobile.getText().toString();
            String m="UPDATE `refference` SET `fname`='"+fname+"',`sname`='"+sname+"',`email`='"+email+"',`desig`='"+desig+"',`nation`='"+nation+"',`relagion`='"+rela+"',`address`='"+add+"',`mobile`='"+mobile+"',`patient`='"+patient+"' WHERE `rid`='"+id+"'";
             dataoperation(m,"Update");
    }//GEN-LAST:event_jButton5ActionPerformed

    void Showdata(String m){
        try {
            DefaultTableModel dt=(DefaultTableModel)jTable1.getModel();
            dt.setRowCount(0);
            rs=st.executeQuery(m);
            while(rs.next()){
                dt.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11)});
            }
        } catch (SQLException ex) {
            Logger.getLogger(Staff.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         String id=txtid.getText().toString();
        String m="DELETE FROM `refference` WHERE `rid`='"+id+"'";
        dataoperation(m,"Delete");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsearchActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String m="SELECT *FROM `refference`";
        Showdata( m);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtsearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyPressed
        // TODO add your handling code here:
          if(evt.getKeyCode()==KeyEvent.VK_ENTER){
             String id=txtsearch.getText().toString();
        String fname=txtsearch.getText().toString();
        //JOptionPane.showMessageDialog(this, ""+id);
            String m="SELECT *FROM `refference` WHERE `rid`='"+id+"' OR `fname`='"+fname+"'";
            Showdata(m);
        }
    }//GEN-LAST:event_txtsearchKeyPressed

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
            java.util.logging.Logger.getLogger(Refference.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Refference.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Refference.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Refference.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Refference().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtadd;
    private com.toedter.calendar.JDateChooser txtdate;
    private javax.swing.JComboBox txtdesig;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtmobile;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtnation;
    private javax.swing.JTextField txtpatient;
    private javax.swing.JTextField txtrel;
    private javax.swing.JTextField txtsearch;
    private javax.swing.JTextField txtsname;
    // End of variables declaration//GEN-END:variables
}
