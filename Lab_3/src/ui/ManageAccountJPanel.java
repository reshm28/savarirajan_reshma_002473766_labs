/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Account;
import model.AccountDirectory;

/**
 *
 * @author reshma
 */
public class ManageAccountJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private AccountDirectory accDirectory;
    /**
     * Creates new form ManageAccountJPanel
     */
   
    ManageAccountJPanel(JPanel userProcessContainer, AccountDirectory accDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.accDirectory = accDirectory;
        populateTable();
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
        tblBankAccounts = new javax.swing.JTable();
        btnSearchAcctNo = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtSearchAcctNo = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 153));

        tblBankAccounts.setBackground(new java.awt.Color(255, 255, 204));
        tblBankAccounts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Bank Name", "Routing Number", "Account Number", "Balance"
            }
        ));
        jScrollPane1.setViewportView(tblBankAccounts);

        btnSearchAcctNo.setBackground(new java.awt.Color(255, 255, 204));
        btnSearchAcctNo.setText("Search by Account Number");
        btnSearchAcctNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchAcctNoActionPerformed(evt);
            }
        });

        btnView.setBackground(new java.awt.Color(255, 255, 204));
        btnView.setText("View Details");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(255, 255, 204));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        txtSearchAcctNo.setBackground(new java.awt.Color(255, 255, 204));

        btnBack.setBackground(new java.awt.Color(255, 255, 204));
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnView))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSearchAcctNo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSearchAcctNo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(btnBack)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearchAcctNo)
                    .addComponent(txtSearchAcctNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchAcctNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchAcctNoActionPerformed
        // TODO add your handling code here:
        Account result = accDirectory.searchAccount(txtSearchAcctNo.getText());
        if (result == null) {
            JOptionPane.showMessageDialog(null,"Account number you entered does not exist","Information", JOptionPane.INFORMATION_MESSAGE);
        } else {
            ViewAccountJPanel viewPanel = new ViewAccountJPanel(userProcessContainer, result);
            userProcessContainer.add("ViewAccountJPanel",viewPanel );
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_btnSearchAcctNoActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblBankAccounts.getSelectedRow();
        if(selectedRow >= 0) {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null,"Would you like to delete the account details","Warning",dialogButton);
            if (dialogResult == JOptionPane.YES_OPTION){
                Account account = (Account) tblBankAccounts.getValueAt(selectedRow, 0);
                accDirectory.deleteAccount(account);
                populateTable();
            }
        } else  {
            JOptionPane.showMessageDialog(null,"Please select a row from table first","Warning", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
         int selectedRow = tblBankAccounts.getSelectedRow();
        if(selectedRow < 0) {
                JOptionPane.showMessageDialog(null,"Please select a row from table first to view details","Warning", JOptionPane.WARNING_MESSAGE);
            } else  {
                Account account = (Account) tblBankAccounts.getValueAt(selectedRow, 0);
                ViewAccountJPanel viewPanel = new ViewAccountJPanel(userProcessContainer, account);
                userProcessContainer.add("ViewAccountJPanel",viewPanel );
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
        }
        
    }//GEN-LAST:event_btnViewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearchAcctNo;
    private javax.swing.JButton btnView;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBankAccounts;
    private javax.swing.JTextField txtSearchAcctNo;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
         DefaultTableModel model = (DefaultTableModel) tblBankAccounts.getModel();
        model.setRowCount(0);
        
        for (Account account : accDirectory.getAccDirectory()){
            
            Object[] row = new Object[4];
            row[0] = account;
            row[1] = account.getRoutingNumber(); 
            row[2] = account.getAccountNumber();
            row[3] = account.getBalance();
            
            model.addRow(row);
        }
    }
}
