/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E_mail;

import HMS.MyConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author Mizanur Rahman
 */
public class E_mail1 extends javax.swing.JFrame {

    /**
     * Creates new form E_mail1
     */
    public E_mail1() {
        initComponents();
        name();
       this.txtsub.requestFocus();
    }
    Connection con=null;
  Statement pst=null;
    ResultSet rs=null;
void Myconnect(){

        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital_management","root","");
            pst=con.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
}
String n="";
void name(){
    String j="";
        try {
            Myconnect();
            String m="SELECT *FROM `e_mail`";
            rs=pst.executeQuery(m);
            if(rs.next()){
                
              j=rs.getString(1);
              n=rs.getString(2);
                
            }
            own_email.setText(j);
        } catch (SQLException ex) {
            Logger.getLogger(E_mail1.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}

    void g_mail(){
        final String own=own_email.getText().toString();
        final String sent=sentemail.getText().toString();
        String sub=txtsub.getText().toString();
        String issu=txtissue.getText().toString();
           Properties pros=new Properties();
        pros.put("mail.smtp.host", "smtp.gmail.com");
        pros.put("mail.smtp.socketFactory.port","465");
        pros.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        pros.put("mail.smtp.auth", "true");
         pros.put("mail.smtp.port", "465");
         
         Session session=Session.getDefaultInstance(pros, 
                 
                 new javax.mail.Authenticator() {
                     
                     @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(own, n);
            }
            
                 }
                 
             );
         try{
        Message message=new MimeMessage(session);
        message.setFrom(new InternetAddress(own));
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(sent));
        message.setSubject(sub);
        message.setText(issu);
        Transport.send(message);
        JOptionPane.showMessageDialog(null, "E-mail sent Succesful!");
        
        
        
        
         }catch(Exception e){
             JOptionPane.showMessageDialog(null, e);
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

        jPanel1 = new javax.swing.JPanel();
        txtsub = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        own_email = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        sentemail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtissue = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        txtsub.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtsub.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        txtsub.setOpaque(false);
        jPanel1.add(txtsub);
        txtsub.setBounds(100, 210, 320, 40);

        jLabel2.setText("Subject:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 220, 50, 30);

        own_email.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        own_email.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        own_email.setOpaque(false);
        jPanel1.add(own_email);
        own_email.setBounds(100, 110, 320, 40);

        jLabel3.setText("From:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 120, 50, 30);

        sentemail.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        sentemail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        sentemail.setOpaque(false);
        jPanel1.add(sentemail);
        sentemail.setBounds(100, 160, 320, 40);

        jLabel4.setText("To:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 170, 50, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/E_mail/icons8_gmail_60px.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(240, 0, 60, 60);

        jLabel5.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("G-MAIL");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(220, 60, 100, 30);

        txtissue.setColumns(20);
        txtissue.setRows(5);
        jScrollPane1.setViewportView(txtissue);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(60, 300, 380, 170);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/E_mail/icons8_paper_plane_25px.png"))); // NOI18N
        jButton1.setText("Sent");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(200, 493, 110, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 520, 550);

        setSize(new java.awt.Dimension(531, 586));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            g_mail();
            own_email.setText("");
            sentemail.setText("");
            txtsub.setText("");
            txtissue.setText("");
            Myconnect();
            String m="DELETE FROM `e_mail` WHERE `pass`='"+n+"'";
            pst.executeUpdate(m);
        } catch (SQLException ex) {
            Logger.getLogger(E_mail1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        try {
            // TODO add your handling code here:
            Myconnect();
            String m="DELETE FROM `e_mail` WHERE `pass`='"+n+"'";
            pst.executeUpdate(m);
        } catch (SQLException ex) {
            Logger.getLogger(E_mail1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(E_mail1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(E_mail1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(E_mail1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(E_mail1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new E_mail1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField own_email;
    private javax.swing.JTextField sentemail;
    private javax.swing.JTextArea txtissue;
    private javax.swing.JTextField txtsub;
    // End of variables declaration//GEN-END:variables
}
