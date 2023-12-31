import java.sql.*;
import java.awt.event.KeyEvent;
import java.sql.Statement;
import java.sql.ResultSet; 
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author nuwan
 */
public class vehicleslist extends javax.swing.JFrame {
        Connection con = null;
        Statement stmt = null;
        Statement stmt1 = null; 
        ResultSet rs = null;
        ResultSet rs1 = null;
        

    /**
     * Creates new form vehicleslist
     */
    public vehicleslist() {
        initComponents();
        con = (Connection) databaseconnection.connection();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        showRecord();
    }

    public void showRecord(){
        try
        {
            stmt = con.createStatement();
            if(V_type.getSelectedItem().equals("All"))
            { 
            String query ="SELECT * FROM vehicles";
            ResultSet re = stmt.executeQuery(query);
            vehicleltable.setModel(DbUtils.resultSetToTableModel(re));
            }
        
        }
        catch(Exception e)
        {
            System.out.println(e);
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
        addnewvehicle = new javax.swing.JButton();
        homebtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        V_type = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        vehicleltable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        bctable = new javax.swing.JTable();
        barcode = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Vehicles");

        addnewvehicle.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addnewvehicle.setText("Add New Vehicles");
        addnewvehicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addnewvehicleActionPerformed(evt);
            }
        });

        homebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home btn.png"))); // NOI18N
        homebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homebtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel2.setText("Vehicle Type");

        V_type.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        V_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Bike", "Bus", "Cab", "Car", "Jeep", "Lorry", "Rickshaw", "Tracktor", "Van", "*Special" }));
        V_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                V_typeActionPerformed(evt);
            }
        });

        vehicleltable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Vehicle ID", "Vehicle type", "Title 3", "Title 4"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(vehicleltable);

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel3.setText("Vehicle_ID");

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel6.setText("Barcode scan");

        bctable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Maintenance"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(bctable);
        if (bctable.getColumnModel().getColumnCount() > 0) {
            bctable.getColumnModel().getColumn(1).setPreferredWidth(600);
        }

        barcode.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        barcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                barcodeKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(125, 125, 125)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(barcode, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(112, 112, 112)
                                .addComponent(V_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(253, 253, 253)
                                .addComponent(addnewvehicle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 409, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(homebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(49, 49, 49))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(homebtn))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(V_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addnewvehicle)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jButton1)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3)
                    .addComponent(barcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
   
    
   
   
    private void table_update()
    {
    int c;
    try
    { 
       
       java.sql.PreparedStatement preparedStmt= con.prepareStatement("select * from vehicles ");
       ResultSet rs = preparedStmt.executeQuery();
       
       ResultSetMetaData rsd =rs.getMetaData();
       
       c=rsd.getColumnCount();
       
       DefaultTableModel d = (DefaultTableModel)vehicleltable.getModel();
       d.setRowCount(0);
       
       while(rs.next())
       {
           Vector v2 = new Vector();
           
           for(int i=1; i<=c; i++)
           {
               v2.add(rs.getString("Vehicle_ID"));
               v2.add(rs.getString("Vehicle_type"));
               v2.add(rs.getString("Vehicle_model"));
               v2.add(rs.getString("Register_Number"));
               v2.add(rs.getInt("Manufacture_Year"));
               v2.add(rs.getString("Manufacturer_Company"));
               

           }
          d.addRow(v2);
          
           
       }
    
    
    
    }
    
    
    
    catch(Exception e)
    {
        System.out.println(e);
    }
    
    
    
    
    } 
    
    
    
    private void homebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homebtnActionPerformed
        // TODO add your handling code here:
                    setVisible(false);
                    home view = new home();
                    view.setVisible(true);
    }//GEN-LAST:event_homebtnActionPerformed

    private void V_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_V_typeActionPerformed
        // TODO add your handling code here:
        try
        {
            stmt = con.createStatement();

            if(V_type.getSelectedItem().equals("All"))
            {
                String query ="SELECT * FROM vehicles";
                ResultSet re = stmt.executeQuery(query);
                vehicleltable.setModel(DbUtils.resultSetToTableModel(re));
            }

            if(V_type.getSelectedItem().equals("Bike"))
            {
                String query ="SELECT * FROM vehicles WHERE Vehicle_type='Bike' ";
                ResultSet re = stmt.executeQuery(query);
                vehicleltable.setModel(DbUtils.resultSetToTableModel(re));
            }

            if(V_type.getSelectedItem().equals("Bus"))
            {
                String query ="SELECT * FROM vehicles WHERE Vehicle_type='Bus' ";
                ResultSet re = stmt.executeQuery(query);
                vehicleltable.setModel(DbUtils.resultSetToTableModel(re));
            }

            if(V_type.getSelectedItem().equals("Cab"))
            {
                String query ="SELECT * FROM vehicles WHERE Vehicle_type='Cab' ";
                ResultSet re = stmt.executeQuery(query);
                vehicleltable.setModel(DbUtils.resultSetToTableModel(re));
            }

            if(V_type.getSelectedItem().equals("Car"))
            {
                String query ="SELECT * FROM vehicles WHERE Vehicle_type='Car' ";
                ResultSet re = stmt.executeQuery(query);
                vehicleltable.setModel(DbUtils.resultSetToTableModel(re));
            }

            if(V_type.getSelectedItem().equals("Jeep"))
            {
                String query ="SELECT * FROM vehicles WHERE Vehicle_type='Jeep' ";
                ResultSet re = stmt.executeQuery(query);
                vehicleltable.setModel(DbUtils.resultSetToTableModel(re));
            }

            if(V_type.getSelectedItem().equals("Lorry"))
            {
                String query ="SELECT * FROM vehicles WHERE Vehicle_type='Lorry' ";
                ResultSet re = stmt.executeQuery(query);
                vehicleltable.setModel(DbUtils.resultSetToTableModel(re));
            }

            if(V_type.getSelectedItem().equals("Rickshaw"))
            {
                String query ="SELECT * FROM vehicles WHERE Vehicle_type='Rickshaw' ";
                ResultSet re = stmt.executeQuery(query);
                vehicleltable.setModel(DbUtils.resultSetToTableModel(re));
            }

            if(V_type.getSelectedItem().equals("Tractor"))
            {
                String query ="SELECT * FROM vehicles WHERE Vehicle_type='Tractor' ";
                ResultSet re = stmt.executeQuery(query);
                vehicleltable.setModel(DbUtils.resultSetToTableModel(re));
            }

            if(V_type.getSelectedItem().equals("Van"))
            {
                String query ="SELECT * FROM vehicles WHERE Vehicle_type='Van' ";
                ResultSet re = stmt.executeQuery(query);
                vehicleltable.setModel(DbUtils.resultSetToTableModel(re));
            }

            if(V_type.getSelectedItem().equals("*Special"))
            {
                String query ="SELECT * FROM vehicles WHERE Vehicle_type='*Special' ";
                ResultSet re = stmt.executeQuery(query);
                vehicleltable.setModel(DbUtils.resultSetToTableModel(re));
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_V_typeActionPerformed

    private void addnewvehicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addnewvehicleActionPerformed
        // TODO add your handling code here:
                    setVisible(true);
                    vehicle view = new vehicle();
                    view.setVisible(true);
    }//GEN-LAST:event_addnewvehicleActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        table_update();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void barcodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_barcodeKeyPressed
     
        // Study more
        
        if(evt.getKeyCode()== KeyEvent.VK_ENTER)
        {
        int c;
             
             try {
                 
       java.sql.PreparedStatement preparedStmt= con.prepareStatement("select * from vmsales WHERE Vehicle_ID = '"+barcode.getText()+"'");
       ResultSet rs = preparedStmt.executeQuery();
       
       ResultSetMetaData rsd =rs.getMetaData();
       
                c=rsd.getColumnCount();
                 
                 DefaultTableModel model=(DefaultTableModel)bctable.getModel();
                 model.setRowCount(0);
       
       while(rs.next())
       {
           Vector v2 = new Vector();
           
           for(int i=1; i<=c; i++)
           {
               v2.add(rs.getString("date"));
               v2.add(rs.getString("maintenance"));
               
           }
        model.addRow(v2);
          
           
       }
                 
             }
// TODO add your handling code here:
             catch (SQLException ex) {
                 Logger.getLogger(vehicleslist.class.getName()).log(Level.SEVERE, null, ex);
             }
         
        }


    }//GEN-LAST:event_barcodeKeyPressed

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
            java.util.logging.Logger.getLogger(vehicleslist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vehicleslist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vehicleslist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vehicleslist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vehicleslist().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> V_type;
    private javax.swing.JButton addnewvehicle;
    private javax.swing.JTextField barcode;
    private javax.swing.JTable bctable;
    private javax.swing.JButton homebtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable vehicleltable;
    // End of variables declaration//GEN-END:variables
}
