/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Controller.LoginCheck;
import Controller.Singleton;

/**
 * JPanel to allow user to login to program.
 * @author erd0008 and slm0041
 */
public class Login extends javax.swing.JPanel {

    /**
     * Creates new form Login2
     */
    public Login() {
        initComponents();
        info.setText("               Welcome to ShADE!\n     Enter your username and password\n            or create a new account.\n    Your username is the part of your first\n         registered email before the @.");
        info.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        goButton = new javax.swing.JButton();
        usernameInput = new javax.swing.JTextField();
        passwordInput = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        info = new javax.swing.JEditorPane();
        picture = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 255, 51));

        goButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        goButton.setText("Login");
        goButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goButtonMouseClicked(evt);
            }
        });
        goButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goButtonActionPerformed(evt);
            }
        });

        usernameInput.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        usernameInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usernameInput.setText("Username");
        usernameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameInputActionPerformed(evt);
            }
        });

        passwordInput.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        passwordInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordInput.setText("jPasswordField1");
        passwordInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordInputActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(info);

        picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Screen Shot 2017-11-01 at 11.27.25 PM.png"))); // NOI18N
        picture.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(picture, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(passwordInput)
                            .addComponent(usernameInput)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE))
                        .addGap(145, 145, 145))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(goButton, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(211, 211, 211))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(usernameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passwordInput, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(goButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addComponent(picture))
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addContainerGap(25, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Unused action.
     * @param evt 
     */
    private void usernameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameInputActionPerformed
  
    }//GEN-LAST:event_usernameInputActionPerformed
    /**
     * Unused action.
     * @param evt 
     */
    private void goButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goButtonMouseClicked

    }//GEN-LAST:event_goButtonMouseClicked
    /**
     * Unused action.
     * @param evt 
     */
    private void passwordInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordInputActionPerformed
    /**
     * Once pressed, checks if the username and password entered match the database. 
     * Calls LoginCheck. Outputs whether the login is found or not to the user.
     * @param evt 
     */
    private void goButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goButtonActionPerformed
        //Check if user's login is in database and output message
        LoginCheck login = new LoginCheck();
        String userText = usernameInput.getText();
        String passText = new String(passwordInput.getPassword());
        Singleton values = Singleton.getInstance();
        values.profid = login.check(userText, passText);
        if (values.profid == -1)
            info.setText("Account not found.\nTry Again or select 'Create Account'.");
        else
            info.setText("Account found!\nSelect 'Find a Ride' or 'Edit Account'.");
    }//GEN-LAST:event_goButtonActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton goButton;
    private javax.swing.JEditorPane info;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPasswordField passwordInput;
    private javax.swing.JLabel picture;
    private javax.swing.JTextField usernameInput;
    // End of variables declaration//GEN-END:variables
}
