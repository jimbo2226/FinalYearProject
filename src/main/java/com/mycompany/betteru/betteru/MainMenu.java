/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.betteru.betteru;

//import static com.mycompany.betteru.betteru.SetReminder.dateTime;
//import static com.mycompany.betteru.betteru.SetReminder.task;
import java.awt.Color;
import java.awt.Image;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author James
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    String LoggedInUser = null;

    public MainMenu(String User) {
        initComponents();
        setResizable(false);
       // jButton3.setVisible(false);
        ImageIcon icon = new ImageIcon(this.getClass().getResource("/icon.png"));
        Image image = icon.getImage().getScaledInstance(icon.getIconWidth() * 4, icon.getIconHeight() * 4, Image.SCALE_DEFAULT);
        this.setIconImage(image);
        Color color = new Color(245, 245, 220);
        getContentPane().setBackground(color);
        LoggedInUser = User;
        userLabel.setText(LoggedInUser);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnOpenCalorieCalculator = new javax.swing.JButton();
        btnOpenCalorieTracker = new javax.swing.JButton();
        btnOpenRandomQuote = new javax.swing.JButton();
        btnOpenReminder = new javax.swing.JButton();
        btnOpenHabbitTracker = new javax.swing.JButton();
        btnOpenStatsStatisics = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        btnOpenBmiCalculator = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnOpenChangePassword = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnOpenCalorieCalculator.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Calorie_Calculator.png"))); // NOI18N
        btnOpenCalorieCalculator.setText("Calorie Calculator");
        btnOpenCalorieCalculator.setFocusPainted(false);
        btnOpenCalorieCalculator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenCalorieCalculatorActionPerformed(evt);
            }
        });

        btnOpenCalorieTracker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Calorie_Tracker.png"))); // NOI18N
        btnOpenCalorieTracker.setText("Calorie Tracker");
        btnOpenCalorieTracker.setFocusPainted(false);
        btnOpenCalorieTracker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenCalorieTrackerActionPerformed(evt);
            }
        });

        btnOpenRandomQuote.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Quote.png"))); // NOI18N
        btnOpenRandomQuote.setText("Random Quote");
        btnOpenRandomQuote.setFocusPainted(false);
        btnOpenRandomQuote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenRandomQuoteActionPerformed(evt);
            }
        });

        btnOpenReminder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Reminder.png"))); // NOI18N
        btnOpenReminder.setText("Reminder");
        btnOpenReminder.setFocusPainted(false);
        btnOpenReminder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenReminderActionPerformed(evt);
            }
        });

        btnOpenHabbitTracker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Habbit_Tracker.png"))); // NOI18N
        btnOpenHabbitTracker.setText("Habbit Tracker");
        btnOpenHabbitTracker.setFocusPainted(false);
        btnOpenHabbitTracker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenHabbitTrackerActionPerformed(evt);
            }
        });

        btnOpenStatsStatisics.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Stats.png"))); // NOI18N
        btnOpenStatsStatisics.setText("Stats & Suggestions");
        btnOpenStatsStatisics.setFocusPainted(false);
        btnOpenStatsStatisics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenStatsStatisicsActionPerformed(evt);
            }
        });

        jLabel2.setText("Logged in User:");

        userLabel.setText("jLabel3");

        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Log_Out40.png"))); // NOI18N
        btnLogout.setText("Log Out");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnOpenBmiCalculator.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BMI_Calculator.png"))); // NOI18N
        btnOpenBmiCalculator.setText("BMI Calculator");
        btnOpenBmiCalculator.setFocusPainted(false);
        btnOpenBmiCalculator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenBmiCalculatorActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BetterU.png"))); // NOI18N

        btnOpenChangePassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Settings35.png"))); // NOI18N
        btnOpenChangePassword.setText("Change Password");
        btnOpenChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenChangePasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userLabel)
                .addGap(158, 158, 158)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(209, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnOpenReminder, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnOpenRandomQuote, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnOpenCalorieCalculator, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnOpenCalorieTracker, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnOpenBmiCalculator, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnOpenHabbitTracker, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnOpenStatsStatisics, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOpenChangePassword))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnOpenChangePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(userLabel))
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addComponent(btnOpenBmiCalculator, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOpenCalorieTracker, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOpenHabbitTracker, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOpenCalorieCalculator, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOpenReminder, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOpenRandomQuote, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOpenStatsStatisics, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOpenCalorieCalculatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenCalorieCalculatorActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalorieCalculator(LoggedInUser).setVisible(true);
            }
        });
    }//GEN-LAST:event_btnOpenCalorieCalculatorActionPerformed

    private void btnOpenRandomQuoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenRandomQuoteActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuoteAPI(LoggedInUser).setVisible(true);
            }
        });
    }//GEN-LAST:event_btnOpenRandomQuoteActionPerformed

    private void btnOpenReminderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenReminderActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SetReminder(LoggedInUser).setVisible(true);
            }
        });
    }//GEN-LAST:event_btnOpenReminderActionPerformed

    private void btnOpenCalorieTrackerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenCalorieTrackerActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalorieTracker(LoggedInUser).setVisible(true);
            }
        });
    }//GEN-LAST:event_btnOpenCalorieTrackerActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to Logout?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.YES_OPTION) {
            LoggedInUser = "";
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new Login().setVisible(true);
                }
            });
            dispose();
        } else {
           
        }
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnOpenHabbitTrackerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenHabbitTrackerActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HabbitTracker(LoggedInUser).setVisible(true);
            }
        });
    }//GEN-LAST:event_btnOpenHabbitTrackerActionPerformed

    private void btnOpenBmiCalculatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenBmiCalculatorActionPerformed
        // openBmiCalculator.setMargin(new Insets(0, 0, 0, 0));
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorBMI(LoggedInUser).setVisible(true);
            }
        });
    }//GEN-LAST:event_btnOpenBmiCalculatorActionPerformed

    private void btnOpenStatsStatisicsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenStatsStatisicsActionPerformed
                java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StatsStatistics(LoggedInUser).setVisible(true);
            }
        });
    }//GEN-LAST:event_btnOpenStatsStatisicsActionPerformed

    private void btnOpenChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenChangePasswordActionPerformed
           java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PasswordChange(LoggedInUser).setVisible(true);
            }
        });
    }//GEN-LAST:event_btnOpenChangePasswordActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnOpenBmiCalculator;
    private javax.swing.JButton btnOpenCalorieCalculator;
    private javax.swing.JButton btnOpenCalorieTracker;
    private javax.swing.JButton btnOpenChangePassword;
    private javax.swing.JButton btnOpenHabbitTracker;
    private javax.swing.JButton btnOpenRandomQuote;
    private javax.swing.JButton btnOpenReminder;
    private javax.swing.JButton btnOpenStatsStatisics;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel userLabel;
    // End of variables declaration//GEN-END:variables
}
