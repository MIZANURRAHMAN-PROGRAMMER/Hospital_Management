/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_Info;

import HMS.MyConnection;
import HMS.Sub_Bill;
import com.toedter.calendar.JCalendar;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Mizanur Rahman
 */
public class Blood_test extends javax.swing.JFrame {

    /**
     * Creates new form Blood_test
     */
    public Blood_test() {
        initComponents();
       cuDate(txtdate);
       txtreport.setText("HMSB-"+autoid());
    }
       Connection con=null;
  Statement st=null,st2=null;
    ResultSet rs=null,rs2=null;
void Myconnect(){

        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital_management","root","");
            st=con.createStatement();
            st2=con.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
}
int autoid(){
        int a = 0;
        try {
            
            Myconnect();
            String m="SELECT `id` FROM `blood_test` ORDER BY `id` ASC";
            rs=st.executeQuery(m);
            while(rs.next()){
                a=rs.getInt(1);
                
                
            }
            a++;
        } catch (SQLException ex) {
            Logger.getLogger(Urine_test.class.getName()).log(Level.SEVERE, null, ex);
        }
        return a;
    }
 void cuDate(JLabel t){
         JCalendar d=new JCalendar();
         SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd");
            String mm=sd.format(d.getDate());
      t.setText(mm);
       //si.selectedCombo(txtmedicine);
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
        jLabel2 = new javax.swing.JLabel();
        txtpname = new javax.swing.JLabel();
        txtgender = new javax.swing.JLabel();
        txtdate = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtreport = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txt1 = new javax.swing.JLabel();
        txt2 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txt3 = new javax.swing.JLabel();
        txt5 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txt6 = new javax.swing.JLabel();
        txt7 = new javax.swing.JLabel();
        txt8 = new javax.swing.JLabel();
        txt9 = new javax.swing.JLabel();
        txt10 = new javax.swing.JLabel();
        txt11 = new javax.swing.JLabel();
        txt4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        txtpid = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        txth = new javax.swing.JTextField();
        txtc = new javax.swing.JTextField();
        txtd = new javax.swing.JTextField();
        txte = new javax.swing.JTextField();
        txtf = new javax.swing.JTextField();
        txtg = new javax.swing.JTextField();
        txta = new javax.swing.JTextField();
        txti = new javax.swing.JTextField();
        txtj = new javax.swing.JTextField();
        txtk = new javax.swing.JTextField();
        txtb = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel2.setText("HMSL-01");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(150, 130, 130, 20);
        jPanel1.add(txtpname);
        txtpname.setBounds(150, 150, 130, 30);
        jPanel1.add(txtgender);
        txtgender.setBounds(150, 180, 130, 20);
        jPanel1.add(txtdate);
        txtdate.setBounds(500, 150, 130, 40);

        jLabel6.setText("TEST NAME");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(80, 280, 130, 20);
        jPanel1.add(txtreport);
        txtreport.setBounds(150, 104, 130, 30);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setText("Hope Hospital Pvt. Ltd");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(240, 20, 200, 30);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        jLabel10.setText("Bangodda Bazzer,Nangolkot,Comilla");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(270, 40, 310, 30);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        jLabel11.setText("Mobile:01645316379,E-mail:mizan81025@gmail.com");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(230, 60, 320, 30);

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("3.5-5.5");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(490, 340, 130, 20);

        jLabel13.setText("HEMOGLOBIN");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(80, 310, 130, 20);

        jLabel14.setText("RBC");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(80, 340, 130, 20);

        jLabel15.setText("HCT");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(80, 370, 130, 20);
        jPanel1.add(txt1);
        txt1.setBounds(290, 310, 130, 20);
        jPanel1.add(txt2);
        txt2.setBounds(290, 340, 130, 20);

        jLabel18.setText("MCH");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(80, 430, 130, 20);
        jPanel1.add(txt3);
        txt3.setBounds(290, 370, 130, 20);
        jPanel1.add(txt5);
        txt5.setBounds(290, 430, 130, 20);

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("COMPLETE BLOOD COUNT");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(220, 240, 200, 20);

        jLabel22.setText("MCHC");
        jPanel1.add(jLabel22);
        jLabel22.setBounds(80, 460, 130, 20);

        jLabel23.setText("RDW-CV");
        jPanel1.add(jLabel23);
        jLabel23.setBounds(80, 490, 130, 20);

        jLabel24.setText("RDW-SD");
        jPanel1.add(jLabel24);
        jLabel24.setBounds(80, 520, 130, 20);

        jLabel25.setText("NEU%");
        jPanel1.add(jLabel25);
        jLabel25.setBounds(80, 550, 130, 20);

        jLabel26.setText("LYM%");
        jPanel1.add(jLabel26);
        jLabel26.setBounds(80, 580, 130, 20);

        jLabel27.setText("GRA#");
        jPanel1.add(jLabel27);
        jLabel27.setBounds(80, 610, 130, 20);

        jLabel28.setText("MCV");
        jPanel1.add(jLabel28);
        jLabel28.setBounds(80, 400, 130, 20);
        jPanel1.add(txt6);
        txt6.setBounds(290, 460, 130, 20);
        jPanel1.add(txt7);
        txt7.setBounds(290, 490, 130, 20);
        jPanel1.add(txt8);
        txt8.setBounds(290, 520, 130, 20);
        jPanel1.add(txt9);
        txt9.setBounds(290, 550, 130, 20);
        jPanel1.add(txt10);
        txt10.setBounds(290, 580, 130, 20);
        jPanel1.add(txt11);
        txt11.setBounds(290, 610, 130, 20);
        jPanel1.add(txt4);
        txt4.setBounds(290, 400, 130, 20);

        jLabel3.setText("NORMAL RANGE");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(510, 290, 110, 14);

        jLabel16.setText("RESULT(S)");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(290, 280, 130, 20);

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("37.0-50.0");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(490, 370, 130, 20);

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("82-95");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(490, 400, 130, 20);

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("27-31");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(490, 430, 130, 20);

        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("32.0-36.0");
        jPanel1.add(jLabel29);
        jLabel29.setBounds(490, 460, 130, 20);

        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("11.5-14.5");
        jPanel1.add(jLabel30);
        jLabel30.setBounds(490, 490, 130, 20);

        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("35-56");
        jPanel1.add(jLabel31);
        jLabel31.setBounds(490, 520, 130, 20);

        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("0-2");
        jPanel1.add(jLabel32);
        jLabel32.setBounds(490, 580, 130, 20);

        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("11.0-16.0");
        jPanel1.add(jLabel33);
        jLabel33.setBounds(490, 310, 130, 20);

        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("40-70");
        jPanel1.add(jLabel34);
        jLabel34.setBounds(490, 550, 130, 20);

        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("2.0-7.5");
        jPanel1.add(jLabel37);
        jLabel37.setBounds(490, 610, 130, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Lab_Info/Test_pic.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 650, 710);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(60, 0, 650, 710);

        jLabel36.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("BLOOD TEST");
        jLabel36.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        getContentPane().add(jLabel36);
        jLabel36.setBounds(760, 20, 320, 70);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PATIENTS INFO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel35.setText("PATIENT ID:");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HMS/picture/DepartmentPicture/icons8_ok_20px_1.png"))); // NOI18N
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtpid, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtpid, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(730, 100, 370, 130);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TEST INFO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel3.setLayout(null);

        jLabel38.setText("HEMOGLOBIN");
        jPanel3.add(jLabel38);
        jLabel38.setBounds(60, 60, 110, 20);

        jLabel39.setText("RBC");
        jPanel3.add(jLabel39);
        jLabel39.setBounds(60, 90, 110, 20);

        jLabel40.setText("HCT");
        jPanel3.add(jLabel40);
        jLabel40.setBounds(60, 120, 110, 20);

        jLabel41.setText("MCV");
        jPanel3.add(jLabel41);
        jLabel41.setBounds(60, 150, 120, 20);

        jLabel42.setText("MCH");
        jPanel3.add(jLabel42);
        jLabel42.setBounds(60, 180, 110, 20);

        jLabel43.setText("MCHC");
        jPanel3.add(jLabel43);
        jLabel43.setBounds(60, 210, 110, 20);

        jLabel44.setText("RDW-CV");
        jPanel3.add(jLabel44);
        jLabel44.setBounds(60, 240, 100, 20);

        jLabel45.setText("RDW-SD");
        jPanel3.add(jLabel45);
        jLabel45.setBounds(60, 270, 110, 20);

        jLabel46.setText("NEU%");
        jPanel3.add(jLabel46);
        jLabel46.setBounds(60, 300, 100, 20);

        jLabel47.setText("LYM%");
        jPanel3.add(jLabel47);
        jLabel47.setBounds(60, 330, 100, 20);

        jLabel48.setText("GRA#");
        jPanel3.add(jLabel48);
        jLabel48.setBounds(60, 360, 110, 20);
        jPanel3.add(txth);
        txth.setBounds(180, 260, 160, 30);
        jPanel3.add(txtc);
        txtc.setBounds(180, 110, 160, 30);
        jPanel3.add(txtd);
        txtd.setBounds(180, 140, 160, 30);
        jPanel3.add(txte);
        txte.setBounds(180, 170, 160, 30);
        jPanel3.add(txtf);
        txtf.setBounds(180, 200, 160, 30);
        jPanel3.add(txtg);
        txtg.setBounds(180, 230, 160, 30);
        jPanel3.add(txta);
        txta.setBounds(180, 50, 160, 30);
        jPanel3.add(txti);
        txti.setBounds(180, 290, 160, 30);
        jPanel3.add(txtj);
        txtj.setBounds(180, 320, 160, 30);
        jPanel3.add(txtk);
        txtk.setBounds(180, 350, 160, 30);
        jPanel3.add(txtb);
        txtb.setBounds(180, 80, 160, 30);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HMS/picture/DepartmentPicture/icons8_send_to_printer_20px.png"))); // NOI18N
        jButton7.setText("PRINT");
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7);
        jButton7.setBounds(230, 400, 110, 30);

        jButton4.setText("SET");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4);
        jButton4.setBounds(130, 400, 80, 30);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(730, 230, 370, 450);

        setSize(new java.awt.Dimension(1134, 749));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            // TODO add your handling code here:
            Myconnect();
            String a=txtpid.getText().toString();
            //String g="";
            String m="SELECT `fname`,`gender` FROM `patient_details` WHERE `pid`='"+a+"'";
            rs=st.executeQuery(m);
            if(rs.next()){
                txtpname.setText(rs.getString(1));
                txtgender.setText(rs.getString(2));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Urine_test.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try {
            // TODO add your handling code here:
            Myconnect();
            String pid=txtpid.getText().toString();
            String name=txtpname.getText();
            String date=txtdate.getText();
            String a=txta.getText();
            String b=txtb.getText();
            String c=txtc.getText();
            String d=txtd.getText();
            String e=txte.getText();
            String f=txtf.getText();
            String g=txtg.getText();
            String h=txth.getText();
            String i=txti.getText();
            String j=txtj.getText();
            String k=txtk.getText();
            String m="INSERT INTO `blood_test`(`pid`,`pname`,`date`,`hemo`,`rbc`,`hct`,`mcv`,`mch`,`mchc`,`rdw`,`rdw_sd`,`neu`,`lym`,`gra`) VALUES" +
            "('"+pid+"','"+name+"','"+date+"','"+a+"','"+b+"','"+c+"','"+d+"','"+e+"','"+f+"','"+g+"','"+h+"','"+i+"','"+j+"','"+k+"')";
            int gh=st.executeUpdate(m);
            if(gh>0){
                printBill(jPanel1);
                cl();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Urine_test.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton7ActionPerformed

    void cl(){
        txtpname.setText("");
        txtgender.setText("");
        txtpid.setText("");
        txtreport.setText("HMSUT-"+autoid());
        String pid=txtpid.getText().toString();
           txtpname.getText();
       txtdate.getText();
            txta.setText("");
           txtb.setText("");
           txtc.setText("");
            txtd.setText("");
            txte.setText("");
          txtf.setText("");
            txtg.setText("");
          txth.setText("");
           txti.setText("");
           txtj.setText("");
          txtk.setText("");
           txt1.setText("");
               txt2.setText("");
                txt3.setText("");
                txt4.setText("");
                txt5.setText("");
                txt6.setText("");
                txt7.setText("");
                txt8.setText("");
                txt9.setText("");
                txt10.setText("");
                txt11.setText("");
                
        
    }
    void printBill(final JPanel jPanel2){
        PrinterJob prJob=PrinterJob.getPrinterJob();
        prJob.setJobName("Bill Print");
        prJob.setPrintable(new Printable() {
            @Override
            public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
                if(pageIndex>0){
                    return Printable.NO_SUCH_PAGE;
                    
                    
                    
                }
                Graphics2D gp2d=(Graphics2D)graphics;
                gp2d.translate(pageFormat.getImageableX()*2,pageFormat.getImageableY()*2);
                gp2d.scale(0.8, 0.8);
                
                jPanel2.print(gp2d);
                
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           
            return Printable.PAGE_EXISTS;
            }
        });
        boolean pp=prJob.printDialog();
        if(pp){
            try {
                prJob.print();
            } catch (PrinterException ex) {
                Logger.getLogger(Sub_Bill.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
       //Bil_Detailsl bo=new Bil_Detailsl();
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //String id="";
        // TODO add your handling code here:
        // st1.Myconnect();
        String a=txta.getText();
        String b=txtb.getText();
        String c=txtc.getText();
        String d=txtd.getText();
        String e=txte.getText();
        String f=txtf.getText();
        String g=txtg.getText();
        String h=txth.getText();
        String i=txti.getText();
        String j=txtj.getText();
        String k=txtk.getText();
        txt1.setText(a);
        txt2.setText(b);
        txt3.setText(c);
        txt4.setText(d);
        txt5.setText(e);
        txt6.setText(f);
        txt7.setText(g);
        txt8.setText(h);
        txt9.setText(i);
        txt10.setText(j);
        txt11.setText(k);

    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Blood_test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Blood_test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Blood_test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Blood_test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Blood_test().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt10;
    private javax.swing.JLabel txt11;
    private javax.swing.JLabel txt2;
    private javax.swing.JLabel txt3;
    private javax.swing.JLabel txt4;
    private javax.swing.JLabel txt5;
    private javax.swing.JLabel txt6;
    private javax.swing.JLabel txt7;
    private javax.swing.JLabel txt8;
    private javax.swing.JLabel txt9;
    private javax.swing.JTextField txta;
    private javax.swing.JTextField txtb;
    private javax.swing.JTextField txtc;
    private javax.swing.JTextField txtd;
    private javax.swing.JLabel txtdate;
    private javax.swing.JTextField txte;
    private javax.swing.JTextField txtf;
    private javax.swing.JTextField txtg;
    private javax.swing.JLabel txtgender;
    private javax.swing.JTextField txth;
    private javax.swing.JTextField txti;
    private javax.swing.JTextField txtj;
    private javax.swing.JTextField txtk;
    private javax.swing.JTextField txtpid;
    private javax.swing.JLabel txtpname;
    private javax.swing.JLabel txtreport;
    // End of variables declaration//GEN-END:variables
}
