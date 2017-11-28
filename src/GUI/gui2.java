/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Container;
/**
 *
 * @author SusiManning
 */
public class gui2 extends javax.swing.JFrame {
    /**
     * Creates new form gui2
     */
    public gui2() {
        initComponents();
        
    }
    
    private String newfont;
    private int fontcount = 0;
    
    public static  void changeColor (Component component, Color color){
        component.setBackground(color);
    }
    
    private static void changeFont ( Component component, String font )
    {
        component.setFont ( new Font(font, component.getFont().getStyle(), 
        component.getFont().getSize()) );
        if ( component instanceof Container )
            for ( Component child : ( ( Container )
                    component ).getComponents () )
                {
                    changeFont ( child, font );
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

        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        parentPanel = new javax.swing.JPanel();
        login1 = new GUI.Login();
        info1 = new GUI.Info();
        addClasses1 = new GUI.AddClasses();
        ride1 = new GUI.Ride();
        buttonPanel = new javax.swing.JPanel();
        loginButtons = new javax.swing.JPanel();
        createAccount = new javax.swing.JButton();
        letsRideButton = new javax.swing.JButton();
        editAccount = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        matchButtons = new javax.swing.JPanel();
        editAccountButton = new javax.swing.JButton();
        accountButtons = new javax.swing.JPanel();
        cancelButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        addClassButton = new javax.swing.JButton();
        addClassesButtons = new javax.swing.JPanel();
        findRideButton = new javax.swing.JButton();

        jButton7.setText("jButton5");

        jButton9.setText("jButton5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        parentPanel.setLayout(new java.awt.CardLayout());
        parentPanel.add(login1, "card6");
        parentPanel.add(info1, "card6");
        parentPanel.add(addClasses1, "card6");
        parentPanel.add(ride1, "card6");

        buttonPanel.setBackground(new java.awt.Color(0, 0, 0));
        buttonPanel.setLayout(new java.awt.CardLayout());

        loginButtons.setBackground(new java.awt.Color(0, 0, 0));

        createAccount.setText("Create Account");
        createAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAccountActionPerformed(evt);
            }
        });

        letsRideButton.setText("Find a Ride");
        letsRideButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letsRideButtonActionPerformed(evt);
            }
        });

        editAccount.setText("Edit Account");
        editAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editAccountActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 204, 153));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BG Colors:");

        jButton12.setBackground(new java.awt.Color(102, 0, 102));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setBackground(new java.awt.Color(153, 153, 153));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(0, 240, 0));
        jButton14.setForeground(new java.awt.Color(0, 240, 0));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton1.setText("Change Font");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginButtonsLayout = new javax.swing.GroupLayout(loginButtons);
        loginButtons.setLayout(loginButtonsLayout);
        loginButtonsLayout.setHorizontalGroup(
            loginButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(editAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(letsRideButton, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(createAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        loginButtonsLayout.setVerticalGroup(
            loginButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginButtonsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(loginButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(loginButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(editAccount)
                            .addComponent(letsRideButton)
                            .addComponent(createAccount)
                            .addComponent(jLabel1))
                        .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        buttonPanel.add(loginButtons, "card6");

        matchButtons.setBackground(new java.awt.Color(0, 0, 0));

        editAccountButton.setText("Edit Account");
        editAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editAccountButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout matchButtonsLayout = new javax.swing.GroupLayout(matchButtons);
        matchButtons.setLayout(matchButtonsLayout);
        matchButtonsLayout.setHorizontalGroup(
            matchButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(matchButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(editAccountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(722, Short.MAX_VALUE))
        );
        matchButtonsLayout.setVerticalGroup(
            matchButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(matchButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(editAccountButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        buttonPanel.add(matchButtons, "card6");

        accountButtons.setBackground(new java.awt.Color(0, 0, 0));

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        saveButton.setText("Find A Ride");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        addClassButton.setText("Add Class");
        addClassButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addClassButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout accountButtonsLayout = new javax.swing.GroupLayout(accountButtons);
        accountButtons.setLayout(accountButtonsLayout);
        accountButtonsLayout.setHorizontalGroup(
            accountButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accountButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addClassButton, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saveButton, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                .addContainerGap())
        );
        accountButtonsLayout.setVerticalGroup(
            accountButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accountButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(accountButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addClassButton)
                    .addComponent(cancelButton)
                    .addComponent(saveButton))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        buttonPanel.add(accountButtons, "card7");

        addClassesButtons.setBackground(new java.awt.Color(0, 0, 0));

        findRideButton.setText("Find a Ride!");
        findRideButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findRideButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addClassesButtonsLayout = new javax.swing.GroupLayout(addClassesButtons);
        addClassesButtons.setLayout(addClassesButtonsLayout);
        addClassesButtonsLayout.setHorizontalGroup(
            addClassesButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addClassesButtonsLayout.createSequentialGroup()
                .addContainerGap(776, Short.MAX_VALUE)
                .addComponent(findRideButton, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        addClassesButtonsLayout.setVerticalGroup(
            addClassesButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addClassesButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(findRideButton)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        buttonPanel.add(addClassesButtons, "card6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(parentPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(buttonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(parentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 415, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Button to move to the login JPanel card and loginButtons JPanel.
     * @param evt 
     */
    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        parentPanel.removeAll();
        parentPanel.add(login1);
        parentPanel.repaint();
        parentPanel.revalidate();
        
        buttonPanel.removeAll();
        buttonPanel.add(loginButtons);
        buttonPanel.repaint();
        buttonPanel.revalidate(); 
     
    }//GEN-LAST:event_cancelButtonActionPerformed
    /**
     * Moves to the Ride JPanel and matchButtons JPanel.
     * @param evt 
     */
    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        parentPanel.removeAll();
        parentPanel.add(ride1);
        parentPanel.repaint();
        parentPanel.revalidate();
        
        buttonPanel.removeAll();
        buttonPanel.add(matchButtons);
        buttonPanel.repaint();
        buttonPanel.revalidate(); 
    }//GEN-LAST:event_saveButtonActionPerformed
   /**
     * Moves to the Ride JPanel and matchButtons JPanel.
     * @param evt 
     */
    private void letsRideButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letsRideButtonActionPerformed
        parentPanel.removeAll();
        parentPanel.add(ride1);
        parentPanel.repaint();
        parentPanel.revalidate(); 
        
        buttonPanel.removeAll();
        buttonPanel.add(matchButtons);
        buttonPanel.repaint();
        buttonPanel.revalidate();
    }//GEN-LAST:event_letsRideButtonActionPerformed
   /**
     * Moves to the Info JPanel and accountButtons JPanel.
     * @param evt 
     */
    private void editAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editAccountActionPerformed
        parentPanel.removeAll();
        parentPanel.add(info1);
        parentPanel.repaint();
        parentPanel.revalidate();
        
        buttonPanel.removeAll();
        buttonPanel.add(accountButtons);
        buttonPanel.repaint();
        buttonPanel.revalidate(); 
    }//GEN-LAST:event_editAccountActionPerformed
   /**
     * Moves to the Info JPanel and accountButtons JPanel.
     * @param evt 
     */
    private void createAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAccountActionPerformed
        parentPanel.removeAll();
        parentPanel.add(info1);
        parentPanel.repaint();
        parentPanel.revalidate(); 
        
        buttonPanel.removeAll();
        buttonPanel.add(accountButtons);
        buttonPanel.repaint();
        buttonPanel.revalidate();
    }//GEN-LAST:event_createAccountActionPerformed
   /**
     * Moves to the Info JPanel and accountButtons JPanel.
     * @param evt 
     */
    private void editAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editAccountButtonActionPerformed
        parentPanel.removeAll();
        parentPanel.add(info1);
        parentPanel.repaint();
        parentPanel.revalidate(); 

        buttonPanel.removeAll();
        buttonPanel.add(accountButtons);
        buttonPanel.repaint();
        buttonPanel.revalidate(); 
        
    }//GEN-LAST:event_editAccountButtonActionPerformed
/**
 * Changes color of JPanels.
 * @param evt 
 */
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        changeColor(info1,new Color(255,204,153));
        changeColor(ride1,new Color(255,204,153));
        changeColor(login1,new Color(255,204,153));
        changeColor(addClasses1,new Color(255,204,153));
    }//GEN-LAST:event_jButton5ActionPerformed
/**
 * Changes color of JPanels.
 * @param evt 
 */
    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
         changeColor(info1,new Color(102,0,102));
        changeColor(ride1,new Color(102,0,102));
        changeColor(login1,new Color(102,0,102));
        changeColor(addClasses1,new Color(102,0,102));
    }//GEN-LAST:event_jButton12ActionPerformed
/**
 * Changes color of JPanels.
 * @param evt 
 */
    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
         changeColor(info1,new Color(153,153,153));
        changeColor(ride1,new Color(153,153,153));
        changeColor(login1,new Color(153,153,153));
        changeColor(addClasses1,new Color(153,153,153));
    }//GEN-LAST:event_jButton13ActionPerformed
/**
 * Changes color of JPanels.
 * @param evt 
 */
    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
         changeColor(info1,new Color(0,240,0));
        changeColor(ride1,new Color(0,240,0));
        changeColor(login1,new Color(0,240,0));
        changeColor(addClasses1,new Color(0,240,0));
    }//GEN-LAST:event_jButton14ActionPerformed
/**
 * Goes through all text and changes fonts.
 * @param evt 
 */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(fontcount == 0)
              newfont = "Times New Roman";
        else if(fontcount == 1)
              newfont = "Arial";
        else if(fontcount == 2)
              newfont = "Comic Sans MS";
        else if(fontcount == 3){
              newfont = "Tahoma";
              fontcount = 0;
        }        

        changeFont(login1, newfont);
        changeFont(info1, newfont);
        changeFont(ride1, newfont);
        changeFont(addClasses1, newfont);
        changeFont(loginButtons, newfont);
        changeFont(matchButtons, newfont);
        changeFont(accountButtons, newfont);
        changeFont(addClassesButtons, newfont);

        fontcount += 1;
    }//GEN-LAST:event_jButton1ActionPerformed
   /**
     * Moves to the adClasses JPanel and addClassesButtons JPanel.
     * @param evt 
     */
    private void addClassButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addClassButtonActionPerformed
        parentPanel.removeAll();
        parentPanel.add(addClasses1);
        parentPanel.repaint();
        parentPanel.revalidate();

        buttonPanel.removeAll();
        buttonPanel.add(addClassesButtons);
        buttonPanel.repaint();
        buttonPanel.revalidate();
    }//GEN-LAST:event_addClassButtonActionPerformed
   /**
     * Moves to the Ride JPanel and matchButtons JPanel.
     * @param evt 
     */
    private void findRideButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findRideButtonActionPerformed
        parentPanel.removeAll();
        parentPanel.add(ride1);
        parentPanel.repaint();
        parentPanel.revalidate();

        buttonPanel.removeAll();
        buttonPanel.add(matchButtons);
        buttonPanel.repaint();
        buttonPanel.revalidate();
    }//GEN-LAST:event_findRideButtonActionPerformed

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
            java.util.logging.Logger.getLogger(gui2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gui2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gui2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gui2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gui2().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel accountButtons;
    private javax.swing.JButton addClassButton;
    private GUI.AddClasses addClasses1;
    private javax.swing.JPanel addClassesButtons;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton createAccount;
    private javax.swing.JButton editAccount;
    private javax.swing.JButton editAccountButton;
    private javax.swing.JButton findRideButton;
    private GUI.Info info1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton letsRideButton;
    private GUI.Login login1;
    private javax.swing.JPanel loginButtons;
    private javax.swing.JPanel matchButtons;
    private javax.swing.JPanel parentPanel;
    private GUI.Ride ride1;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
}
