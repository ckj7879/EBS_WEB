/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electricity.billing.system;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author HP
 */
public class ACDCollection extends javax.swing.JFrame {

    /**
     * Creates new form ACDCollection
     */
    public ACDCollection() {
        initComponents();
        try {
        	Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con4=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","Ckj123@0909");Statement st4=con4.createStatement();
            String s4="SELECT CONSUMERNO FROM CONSUMER11";
            
            ResultSet rs4=st4.executeQuery(s4);
            while(rs4.next()!=false)
            {
                String str4=rs4.getString("CONSUMERNO");
                System.out.println(str4);
                consumer_number.addItem(str4);
                
            }
            con4.close();
            st4.close();
            
        } catch (Exception ex) {
            Logger.getLogger(DataEntry.class.getName()).log(Level.SEVERE, null, ex);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        acd_to_be_collected = new javax.swing.JTextField();
        acd_collected = new javax.swing.JTextField();
        consumer_number = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("ACD COLLECTION");

        jLabel2.setText("Cnsumer Number");

        jLabel3.setText("ACD To Be Collecetd");

        jLabel4.setText("ACD Collected");

        jButton1.setText("PRINT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        acd_to_be_collected.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                acd_to_be_collectedFocusGained(evt);
            }
        });

        acd_collected.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                acd_collectedFocusLost(evt);
            }
        });

        consumer_number.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(acd_collected)
                    .addComponent(consumer_number, javax.swing.GroupLayout.Alignment.LEADING, 0, 154, Short.MAX_VALUE)
                    .addComponent(acd_to_be_collected, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(53, 53, 53))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(96, 96, 96))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(consumer_number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(acd_to_be_collected, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addComponent(jLabel4))
                    .addComponent(acd_collected, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(192, 192, 192))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void acd_to_be_collectedFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_acd_to_be_collectedFocusGained

                    try {
            String s2=(String)consumer_number.getSelectedItem();
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","Ckj123@0909");
            Statement st=con.createStatement();
            String s1="SELECT * FROM depositdetails WHERE CONSUMERNO='"+s2+"' ";
            ResultSet rs=st.executeQuery(s1);
            
            Statement st2=con.createStatement();
            String s3="SELECT CONSUMERNO FROM depositdetails WHERE CONSUMERNO='"+s2+"'  ";
            ResultSet rs2=st2.executeQuery(s3);
            String s4=null;
            while(rs2.next()!=false)
            {
                s4=rs2.getString(1);
            }
            
            if(s4.equals(s2))
            {
                while(rs.next()!=false)
                {

                    
                    acd_to_be_collected.setText(rs.getString("acd"));
                }
            }
            else
            {
               JOptionPane.showMessageDialog(null,"Consumer Number Deposit Details Not Found");
               
            }
                
                
            
            
             con.close();
            st.close();
            rs.close();
        } catch (Exception ex) {
            Logger.getLogger(DataView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_acd_to_be_collectedFocusGained

    private void acd_collectedFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_acd_collectedFocusLost

        try {
            
            double d1=Double.parseDouble(acd_to_be_collected.getText());
            double d2=Double.parseDouble(acd_collected.getText());
            
            double d3=d1-d2;
            String ss=Double.toString(d3);
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con4=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","Ckj123@0909");
            Statement st4=con4.createStatement();
            String s4="UPDATE DEPOSITDETAILS SET ACD='"+ss+"'  where consumerno='"+consumer_number.getSelectedItem()+"'  ";
            
            int k=st4.executeUpdate(s4);
           
            con4.close();
            st4.close();
            
        } catch (Exception ex) {
            Logger.getLogger(DataEntry.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_acd_collectedFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

         JPanel panelToPrint=null;
        printRecord(panelToPrint);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        OfficeAdministration o=new OfficeAdministration();
        o.show();dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ACDCollection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ACDCollection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ACDCollection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ACDCollection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ACDCollection().setVisible(true);
            }
        });
    }

    private void printRecord(JPanel panel1)
    {
        //create PrinterJob here
        PrinterJob pj=PrinterJob.getPrinterJob();
        //set PrinterJob Name
        pj.setJobName("Print Record");
        
        pj.setPrintable(new Printable() {

            @Override
            public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
                 //To change body of generated methods, choose Tools | Templates.
                if(pageIndex>0)
                            return Printable.NO_SUCH_PAGE;
                        
                        Graphics2D graphics2D=(Graphics2D)graphics;
                        
                        graphics2D.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
                        
                        graphics2D.scale(0.5,0.5);
                        
                       jPanel1.print(graphics2D);
                        
                        return Printable.PAGE_EXISTS;
            }
        });
                
                    
      boolean returningResult=pj.printDialog();
      if(returningResult)
      {
          try{
              pj.print();
          }
          catch(PrinterException pe)
          {JOptionPane.showMessageDialog(this,"Print Error : "+pe.getMessage());}
      }
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField acd_collected;
    private javax.swing.JTextField acd_to_be_collected;
    private javax.swing.JComboBox consumer_number;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
