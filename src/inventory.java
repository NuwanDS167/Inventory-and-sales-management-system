import java.sql.*;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author nuwan
 */
public class inventory extends javax.swing.JFrame {

        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
    /**
     * Creates new form inventory
     */
    public inventory() {
        initComponents();
        con = (Connection) databaseconnection.connection();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        itid.requestFocus();
        table_update();
        
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
        homebtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        qty = new javax.swing.JTextField();
        pr = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        itid = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        itna = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        itde = new javax.swing.JTextArea();
        addi = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        items = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        searchbtn = new javax.swing.JButton();
        updatebtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        homebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home btn.png"))); // NOI18N
        homebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homebtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Inventory");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel2.setText("Item ID");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel3.setText("Qty");

        qty.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        pr.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel4.setText("Price");

        itid.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        itid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itidActionPerformed(evt);
            }
        });
        itid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                itidKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel5.setText("Item Name");

        itna.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel6.setText("Item");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel7.setText("Description");

        itde.setColumns(20);
        itde.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        itde.setRows(5);
        jScrollPane2.setViewportView(itde);

        addi.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        addi.setText("Add");
        addi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addiActionPerformed(evt);
            }
        });

        items.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Item_ID", "Item_Name", "Item_Description", "Available_Quantity", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(items);
        if (items.getColumnModel().getColumnCount() > 0) {
            items.getColumnModel().getColumn(0).setResizable(false);
            items.getColumnModel().getColumn(0).setPreferredWidth(20);
            items.getColumnModel().getColumn(1).setResizable(false);
            items.getColumnModel().getColumn(1).setPreferredWidth(40);
            items.getColumnModel().getColumn(2).setResizable(false);
            items.getColumnModel().getColumn(2).setPreferredWidth(100);
            items.getColumnModel().getColumn(3).setResizable(false);
            items.getColumnModel().getColumn(3).setPreferredWidth(25);
            items.getColumnModel().getColumn(4).setResizable(false);
            items.getColumnModel().getColumn(4).setPreferredWidth(25);
        }

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jButton2.setText("Refresh");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        searchbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search.png"))); // NOI18N
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });

        updatebtn.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        updatebtn.setText("Update");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addi, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(itid)
                                    .addComponent(qty, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(updatebtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pr, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                    .addComponent(itna))
                                .addGap(119, 119, 119)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(71, 71, 71)
                .addComponent(homebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(homebtn)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel5)
                                                .addComponent(itna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel6)
                                                .addComponent(jLabel2)
                                                .addComponent(itid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel7)
                                            .addGap(34, 34, 34)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel3)
                                                .addComponent(qty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(pr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel4)))
                                        .addComponent(jScrollPane2))
                                    .addComponent(searchbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(90, 90, 90)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                                .addGap(66, 66, 66))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(177, 177, 177)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton2)
                                    .addComponent(addi)
                                    .addComponent(updatebtn))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
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
       
       java.sql.PreparedStatement preparedStmt= con.prepareStatement("select * from inventoryitems ");
       ResultSet rs = preparedStmt.executeQuery();
       
       ResultSetMetaData rsd =rs.getMetaData();
       
       c=rsd.getColumnCount();
       
       DefaultTableModel d = (DefaultTableModel)items.getModel();
       d.setRowCount(0);
       
       while(rs.next())
       {
           Vector v2 = new Vector();
           
           for(int i=1; i<=c; i++)
           {
               v2.add(rs.getString("Item_ID"));
               v2.add(rs.getString("Item_Name"));
               v2.add(rs.getString("Item_Description"));
               v2.add(rs.getInt("Available_Quantity"));
               v2.add(rs.getInt("Price"));
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

    private void addiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addiActionPerformed
        // TODO add your handling code here:
        try
        {

            stmt = con.createStatement();

            String itemid = (String) itid.getText();
            String itemname = itna.getText();
            String itemdescription = itde.getText();
            int availablequantity = Integer.parseInt(qty.getText());
            int price = Integer.parseInt(pr.getText());

            String query = "INSERT INTO inventoryitems (Item_ID, Item_Name, Item_Description, Available_Quantity, Price) VALUES (?,?,?,?,?)";

            java.sql.PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setString(1, itemid);
            preparedStmt.setString(2, itemname);
            preparedStmt.setString(3, itemdescription);
            preparedStmt.setInt(4, availablequantity);
            preparedStmt.setInt(5, price);

            preparedStmt.execute();
            JOptionPane.showMessageDialog(null, "Item added");
            table_update();
            
            
            itid.setText("");
            itna.setText("");
            itde.setText("");
            qty.setText("");
            pr.setText("");
            
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(this, "Invalid Qty or Price");
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Item ID already taken")   ;
        }

    }//GEN-LAST:event_addiActionPerformed

    private void itidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itidKeyPressed
        // TODO add your handling code here:
       
        
    }//GEN-LAST:event_itidKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        table_update();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
        // TODO add your handling code here:
        try{
            stmt = con.createStatement();
            
            String itemid = itid.getText();
            String query ="select * from inventoryitems";
            rs = stmt.executeQuery(query);
            
            while(rs.next())
            {
            if(itemid.equals(rs.getString("Item_ID")))
            {
                itna.setText(rs.getString("Item_Name"));
                itde.setText(rs.getString("Item_Description"));
                qty.setText(String.format("%s", rs.getInt("Available_Quantity")));
                pr.setText(String.format("%s", rs.getInt("Price")));
                
            }
            }
        
        }
        
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_searchbtnActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        // TODO add your handling code here:
        try
        {

            stmt = con.createStatement();

            String itemid = (String) itid.getText();
            String itemname = itna.getText();
            String itemdescription = itde.getText();
            int availablequantity = Integer.parseInt(qty.getText());
            int price = Integer.parseInt(pr.getText());

            String query = "UPDATE inventoryitems SET Item_Name=?, Item_Description=?, Available_Quantity=?, Price=? WHERE Item_ID=?";

            java.sql.PreparedStatement preparedStmt = con.prepareStatement(query);
            
            preparedStmt.setString(1, itemname);
            preparedStmt.setString(2, itemdescription);
            preparedStmt.setInt(3, availablequantity);
            preparedStmt.setInt(4, price);
            preparedStmt.setString(5, itemid);

            preparedStmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Inventory updated");
            table_update();

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        
        
    }//GEN-LAST:event_updatebtnActionPerformed

    private void itidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itidActionPerformed

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
            java.util.logging.Logger.getLogger(inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inventory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addi;
    private javax.swing.JButton homebtn;
    private javax.swing.JTextArea itde;
    private javax.swing.JTable items;
    private javax.swing.JTextField itid;
    private javax.swing.JTextField itna;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField pr;
    private javax.swing.JTextField qty;
    private javax.swing.JButton searchbtn;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}
