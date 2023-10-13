/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Account;
import model.AccountDirectory;

/**
 *
 * @author reshma
 */
public class CreateAccountJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private AccountDirectory accDirectory;
    /**
     * Creates new form CreateAccountJPanel
     */
    public CreateAccountJPanel() {
        initComponents();
    }

    public CreateAccountJPanel(JPanel userProcessContainer, AccountDirectory accDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.accDirectory = accDirectory;
    }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblRoutingNo = new javax.swing.JLabel();
        lblAccountNo = new javax.swing.JLabel();
        lblBankName = new javax.swing.JLabel();
        txtRoutingNo = new javax.swing.JTextField();
        txtAccountNo = new javax.swing.JTextField();
        txtBankName = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        lblBalance = new javax.swing.JLabel();
        txtBalance = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        lblRoutingNoValidation = new javax.swing.JLabel();
        lblAccountNoValidation = new javax.swing.JLabel();
        lblBalanceValidation = new javax.swing.JLabel();
        lblBankNameValidation = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 153));

        lblTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Create Account ");

        lblRoutingNo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblRoutingNo.setText("Routing Number:");

        lblAccountNo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblAccountNo.setText("Account Number:");

        lblBankName.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblBankName.setText("Bank Name:");

        txtRoutingNo.setBackground(new java.awt.Color(255, 255, 204));
        txtRoutingNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRoutingNoActionPerformed(evt);
            }
        });

        txtAccountNo.setBackground(new java.awt.Color(255, 255, 204));

        txtBankName.setBackground(new java.awt.Color(255, 255, 204));

        btnCreate.setBackground(new java.awt.Color(255, 255, 204));
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        lblBalance.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblBalance.setText("Balance:");

        txtBalance.setBackground(new java.awt.Color(255, 255, 204));

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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblAccountNo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRoutingNo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBankName, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCreate)
                            .addComponent(txtRoutingNo, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                            .addComponent(txtAccountNo)
                            .addComponent(txtBankName)
                            .addComponent(txtBalance))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAccountNoValidation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblRoutingNoValidation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblBalanceValidation, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                            .addComponent(lblBankNameValidation, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(btnBack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRoutingNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRoutingNo)
                            .addComponent(lblRoutingNoValidation, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblAccountNo)
                        .addComponent(txtAccountNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblAccountNoValidation, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblBankName)
                        .addComponent(txtBankName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblBankNameValidation, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblBalance)
                        .addComponent(txtBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblBalanceValidation, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(40, 40, 40))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtRoutingNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRoutingNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRoutingNoActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        String routingNumber = txtRoutingNo.getText();
        String accountNumber = txtAccountNo.getText();
        String bankName = txtBankName.getText();
        int balance = Integer.parseInt(txtBalance.getText());
        
        if(validateFields()){
        
            Account account = accDirectory.addAccount();
            account.setRoutingNumber(routingNumber);
            account.setAccountNumber(accountNumber);
            account.setBankNmae(bankName);
            account.setBalance(balance);

            JOptionPane.showMessageDialog(null, "Account Successfully created");
        } else {
            JOptionPane.showMessageDialog(null, "Account not created");
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private boolean match(String patternString, String input) {
        Pattern pattern = Pattern.compile(patternString);
         Matcher matcher = pattern.matcher(input);
         return matcher.matches();
    }
    
    private boolean validateFields() {
        String routingNumber = txtRoutingNo.getText();
        String accountNumber = txtAccountNo.getText();
        String bankName = txtBankName.getText();
        String balance = txtBalance.getText();
        
        String numberRegex = "^[0-9]{10}$";
        String bankNameRegex = "^[A-Za-z\\s]+$";
        String balanceRegex = "^[0-9]+.?[0-9]*$";
        Boolean isValidRoutingNo = match(numberRegex,routingNumber);
        Boolean isValidAccountNo = match(numberRegex,accountNumber);
        Boolean isValidBankName = match(bankNameRegex, bankName);
        Boolean isValidBalance = match(balanceRegex, balance);
        lblRoutingNoValidation.setText(isValidRoutingNo ? "" : "Invalid Routing Number");
        lblAccountNoValidation.setText(isValidAccountNo ? "" : "Invalid Account Number");
        lblBankNameValidation.setText(isValidBankName ? "" : "Invalid Bank Name");
        lblBalanceValidation.setText(isValidBalance ? "" : "Invalid Balance");
        return isValidRoutingNo && isValidAccountNo && isValidBankName && isValidBalance;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JLabel lblAccountNo;
    private javax.swing.JLabel lblAccountNoValidation;
    private javax.swing.JLabel lblBalance;
    private javax.swing.JLabel lblBalanceValidation;
    private javax.swing.JLabel lblBankName;
    private javax.swing.JLabel lblBankNameValidation;
    private javax.swing.JLabel lblRoutingNo;
    private javax.swing.JLabel lblRoutingNoValidation;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtAccountNo;
    private javax.swing.JTextField txtBalance;
    private javax.swing.JTextField txtBankName;
    private javax.swing.JTextField txtRoutingNo;
    // End of variables declaration//GEN-END:variables
}
