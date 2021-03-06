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
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author HP
 */
public class GenerateEditDemad extends javax.swing.JFrame {

    /**
     * Creates new form GenerateEditDemad
     */
    public GenerateEditDemad() {
        initComponents();
        setTitle("Generate/Edit Demand");
        
        try {
        	Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con4=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","Ckj123@0909");
            Statement st4=con4.createStatement();
            String s4="SELECT CONSUMERNO FROM CONSUMER11";
            
            ResultSet rs4=st4.executeQuery(s4);
            while(rs4.next()!=false)
            {
                String str4=rs4.getString("CONSUMERNO");
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
        consumer_number = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tariff = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        phase = new javax.swing.JTextField();
        cld = new javax.swing.JTextField();
        previous_reading = new javax.swing.JTextField();
        present_reading = new javax.swing.JTextField();
        units_consumed = new javax.swing.JTextField();
        demand_id = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        net_amount_payable = new javax.swing.JTextField();
        interest_on_od = new javax.swing.JTextField();
        total = new javax.swing.JTextField();
        previous_arrears = new javax.swing.JTextField();
        advanced_paid = new javax.swing.JTextField();
        subsidy = new javax.swing.JTextField();
        demand_for = new javax.swing.JTextField();
        re_con_fee = new javax.swing.JTextField();
        meter_rent = new javax.swing.JTextField();
        duty_to_govt = new javax.swing.JTextField();
        energy_charge = new javax.swing.JTextField();
        fixed_charge = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        Show_Bill_Details_ = new javax.swing.JButton();
        Exit_ = new javax.swing.JButton();
        due_date = new javax.swing.JTextField();
        bill_date = new javax.swing.JTextField();
        disconnection_date = new javax.swing.JTextField();
        meter_reader_code = new javax.swing.JTextField();
        area_code = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 102));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setText("GENERATE / EDIT DEMAND");

        jLabel2.setText("Area Code");

        consumer_number.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));
        consumer_number.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                consumer_numberFocusLost(evt);
            }
        });

        jLabel3.setText("Meter Reader Code");

        jLabel4.setText("Consumer Number");

        jLabel5.setText("Tariff");

        jLabel6.setText("Phase");

        jLabel7.setText("CLD");

        jLabel8.setText("Previous Reading");

        jLabel9.setText("Present Reading");

        jLabel10.setText("Units Consumed");

        jLabel11.setForeground(new java.awt.Color(255, 51, 51));
        jLabel11.setText("Demand ID");

        previous_reading.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previous_readingActionPerformed(evt);
            }
        });

        jLabel12.setText("Fixed Charge");

        jLabel13.setText("Energy Charge");

        jLabel14.setText("DUTY TO GOVT. :");

        jLabel15.setText("Meter Rent");

        jLabel16.setText("Re con: fee");

        jLabel17.setText("Demand For...");

        jLabel18.setText("Subsidy");

        jLabel19.setText("Advanced Paid");

        jLabel20.setText("Previous Arrears");

        jLabel21.setText("Total");

        jLabel22.setText("Interest on OD");

        jLabel23.setText("NET AMOUNT PAYABLE");

        energy_charge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                energy_chargeActionPerformed(evt);
            }
        });

        jLabel24.setText("Bill Date");

        jLabel25.setText("Due Date");

        jLabel26.setText("Disconnection Date");

        Show_Bill_Details_.setText("PRINT");
        Show_Bill_Details_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Show_Bill_Details_ActionPerformed(evt);
            }
        });

        Exit_.setText("Exit");
        Exit_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit_ActionPerformed(evt);
            }
        });

        bill_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bill_dateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(344, 344, 344)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel8))
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Show_Bill_Details_, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(166, 166, 166)
                        .addComponent(Exit_, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tariff, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                .addComponent(phase)
                                .addComponent(cld)
                                .addComponent(previous_reading)
                                .addComponent(present_reading)
                                .addComponent(units_consumed)
                                .addComponent(demand_id)
                                .addComponent(meter_reader_code))
                            .addComponent(consumer_number, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(area_code, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel22)
                            .addComponent(jLabel21)
                            .addComponent(jLabel20)
                            .addComponent(jLabel19)
                            .addComponent(jLabel18)
                            .addComponent(jLabel17)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 15, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(net_amount_payable)
                            .addComponent(interest_on_od)
                            .addComponent(total)
                            .addComponent(previous_arrears)
                            .addComponent(advanced_paid)
                            .addComponent(subsidy)
                            .addComponent(demand_for)
                            .addComponent(re_con_fee)
                            .addComponent(meter_rent)
                            .addComponent(duty_to_govt, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                            .addComponent(energy_charge)
                            .addComponent(fixed_charge))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26)
                            .addComponent(jLabel25)
                            .addComponent(jLabel24))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bill_date)
                            .addComponent(due_date)
                            .addComponent(disconnection_date, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
                        .addContainerGap(128, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(fixed_charge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(bill_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consumer_number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(energy_charge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(area_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(duty_to_govt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(due_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(meter_reader_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tariff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(meter_rent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(phase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(re_con_fee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(disconnection_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(demand_for, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(previous_reading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(subsidy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(present_reading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(advanced_paid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(units_consumed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(previous_arrears, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(demand_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(interest_on_od, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(net_amount_payable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Show_Bill_Details_)
                    .addComponent(Exit_))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void previous_readingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previous_readingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_previous_readingActionPerformed

    private void bill_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bill_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bill_dateActionPerformed

    private void energy_chargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_energy_chargeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_energy_chargeActionPerformed

    private void Show_Bill_Details_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Show_Bill_Details_ActionPerformed
        JPanel panelToPrint=null;
        printRecord(panelToPrint);
        
    }//GEN-LAST:event_Show_Bill_Details_ActionPerformed

    private void consumer_numberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_consumer_numberFocusLost

        
        try {
        	Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","Ckj123@0909");
            Statement st=con.createStatement();
            String s="SELECT * FROM BILLDETAILS WHERE CONSUMERNO='"+consumer_number.getSelectedItem()+"'  ";
            ResultSet rs=st.executeQuery(s);
            while(rs.next()!=false)
            {
                area_code.setText(rs.getString("AREACODE"));
                meter_reader_code.setText(rs.getString("MRCODE"));
                previous_reading.setText(rs.getString("PREVIOUSREADING"));
                present_reading.setText(rs.getString("PRESENTREADIND"));
                units_consumed.setText(rs.getString("UNITSCONSUMED"));
                demand_id.setText(rs.getString("DEMANDID"));
                fixed_charge.setText(rs.getString("FIXEDCHARGED"));
                energy_charge.setText(rs.getString("ENERGYCHARGE"));
                duty_to_govt.setText(rs.getString("DUTYTOGOVT"));
                meter_rent.setText(rs.getString("METERRENT"));
                re_con_fee.setText(rs.getString("RECONFEE"));
                demand_for.setText(rs.getString("DEMANDFOR"));
                subsidy.setText(rs.getString("SUBSIDY"));
                advanced_paid.setText(rs.getString("ADVANCEDPAID"));
                previous_arrears.setText(rs.getString("PREVIOUSARREARS"));
                total.setText(rs.getString("TOTAL"));
                interest_on_od.setText(rs.getString("INTERESTONCD"));
                net_amount_payable.setText(rs.getString("NETAMOUNTPAID"));
                bill_date.setText(rs.getString("BILLDATE"));
                due_date.setText(rs.getString("BILLDATE"));
                disconnection_date.setText(rs.getString("DISCONNECTIONDATE"));
           
            }
            
            ResultSet rs2=st.executeQuery("SELECT * FROM CONSUMER11 WHERE CONSUMERNO='"+consumer_number.getSelectedItem()+"'   ");
            while(rs2.next()!=false)
            {
                tariff.setText(rs2.getString("TARIFF"));
                phase.setText(rs2.getString("PHASE"));
                cld.setText(rs2.getString("CLOAD"));
            }
            
            
        } catch (Exception ex) {
            Logger.getLogger(GenerateEditDemad.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_consumer_numberFocusLost

    private void Exit_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit_ActionPerformed

        OfficeAdministration o=new OfficeAdministration();
        o.show();dispose();
    }//GEN-LAST:event_Exit_ActionPerformed

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
            java.util.logging.Logger.getLogger(GenerateEditDemad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GenerateEditDemad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GenerateEditDemad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GenerateEditDemad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GenerateEditDemad().setVisible(true);
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
    private javax.swing.JButton Exit_;
    private javax.swing.JButton Show_Bill_Details_;
    private javax.swing.JTextField advanced_paid;
    private javax.swing.JTextField area_code;
    private javax.swing.JTextField bill_date;
    private javax.swing.JTextField cld;
    private javax.swing.JComboBox consumer_number;
    private javax.swing.JTextField demand_for;
    private javax.swing.JTextField demand_id;
    private javax.swing.JTextField disconnection_date;
    private javax.swing.JTextField due_date;
    private javax.swing.JTextField duty_to_govt;
    private javax.swing.JTextField energy_charge;
    private javax.swing.JTextField fixed_charge;
    private javax.swing.JTextField interest_on_od;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField meter_reader_code;
    private javax.swing.JTextField meter_rent;
    private javax.swing.JTextField net_amount_payable;
    private javax.swing.JTextField phase;
    private javax.swing.JTextField present_reading;
    private javax.swing.JTextField previous_arrears;
    private javax.swing.JTextField previous_reading;
    private javax.swing.JTextField re_con_fee;
    private javax.swing.JTextField subsidy;
    private javax.swing.JTextField tariff;
    private javax.swing.JTextField total;
    private javax.swing.JTextField units_consumed;
    // End of variables declaration//GEN-END:variables
}
