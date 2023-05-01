/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.betteru.betteru;

import static com.mycompany.betteru.betteru.SetReminder.dateTime;
import static com.mycompany.betteru.betteru.SetReminder.task;
import java.awt.Color;



/**
 *
 * @author James
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        initComponents();
        Color color=new Color(245,245,220);
        getContentPane().setBackground(color);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        openBmiCalculator = new javax.swing.JButton();
        openCalorieCalculator = new javax.swing.JButton();
        openCalorieTracker = new javax.swing.JButton();
        openRandomQuote = new javax.swing.JButton();
        openReminder = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        openBmiCalculator.setText("BMI Calculator");
        openBmiCalculator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openBmiCalculatorActionPerformed(evt);
            }
        });

        openCalorieCalculator.setText("Calorie Calculator");
        openCalorieCalculator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openCalorieCalculatorActionPerformed(evt);
            }
        });

        openCalorieTracker.setText("Calorie Tracker");
        openCalorieTracker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openCalorieTrackerActionPerformed(evt);
            }
        });

        openRandomQuote.setText("Random Quote");
        openRandomQuote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openRandomQuoteActionPerformed(evt);
            }
        });

        openReminder.setText("Reminder");
        openReminder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openReminderActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Welcome!");

        jButton1.setText("*Habbit Tracker*");

        jButton2.setText("*Stats*");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(openRandomQuote, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(openBmiCalculator, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(openCalorieTracker, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(openReminder, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(openCalorieCalculator, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(openBmiCalculator)
                    .addComponent(jButton1))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(openCalorieTracker)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(openReminder)
                .addGap(18, 18, 18)
                .addComponent(openRandomQuote)
                .addGap(18, 18, 18)
                .addComponent(openCalorieCalculator)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openBmiCalculatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openBmiCalculatorActionPerformed
                  java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorBMI().setVisible(true);
            }
        });
    }//GEN-LAST:event_openBmiCalculatorActionPerformed

    private void openCalorieCalculatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openCalorieCalculatorActionPerformed
               java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalorieCalculator().setVisible(true);
            }
        });
    }//GEN-LAST:event_openCalorieCalculatorActionPerformed

    private void openRandomQuoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openRandomQuoteActionPerformed
                java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuoteAPI().setVisible(true);
            }
        });
    }//GEN-LAST:event_openRandomQuoteActionPerformed

    private void openReminderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openReminderActionPerformed
    java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SetReminder(task, dateTime).setVisible(true);
            }
        });      
    }//GEN-LAST:event_openReminderActionPerformed

    private void openCalorieTrackerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openCalorieTrackerActionPerformed
        
    }//GEN-LAST:event_openCalorieTrackerActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton openBmiCalculator;
    private javax.swing.JButton openCalorieCalculator;
    private javax.swing.JButton openCalorieTracker;
    private javax.swing.JButton openRandomQuote;
    private javax.swing.JButton openReminder;
    // End of variables declaration//GEN-END:variables
}
