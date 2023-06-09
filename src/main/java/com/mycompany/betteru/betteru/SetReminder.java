/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.betteru.betteru;

import java.awt.Color;
import java.awt.Image;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author James
 */
public class SetReminder extends javax.swing.JFrame {

    String task;
    LocalDateTime dateTime;
    Timer timer;
    String LoggedInUser = null;
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    /**
     * Creates new form Reminder
     */
    public SetReminder(String User) {
        //  this.task = task;
        //this.dateTime = dateTime;
        this.timer = new Timer();
        initComponents();
        setResizable(false);
        ImageIcon icon = new ImageIcon(this.getClass().getResource("/icon.png"));
        Image image = icon.getImage().getScaledInstance(icon.getIconWidth() * 4, icon.getIconHeight() * 4, Image.SCALE_DEFAULT);
        this.setIconImage(image);
        con = DbConnection.ConnectionDB();
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        taskField = new javax.swing.JTextField();
        startButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jSpinnerMinute = new javax.swing.JSpinner();
        jSpinnerHour = new javax.swing.JSpinner();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        mainMenuButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        btnView = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Reminder Text:");

        jLabel2.setText("Date of Reminder:");

        startButton.setText("Create Reminder");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Create a Reminder");

        jSpinnerMinute.setModel(new javax.swing.SpinnerNumberModel(0, null, 59, 1));

        jSpinnerHour.setModel(new javax.swing.SpinnerNumberModel(0, null, 23, 1));

        jLabel5.setText("Mins:");

        jLabel6.setText("Hour:");

        jLabel7.setText("Time of Reminder:");

        mainMenuButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main_Menu35.png"))); // NOI18N
        mainMenuButton.setText("Main Menu");
        mainMenuButton.setFocusPainted(false);
        mainMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainMenuButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Logged in User:");

        userLabel.setText("user");

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(mainMenuButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(userLabel)
                                .addGap(120, 120, 120)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(taskField, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                                            .addComponent(jCalendar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSpinnerHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5)
                                        .addGap(3, 3, 3)
                                        .addComponent(jSpinnerMinute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(202, 202, 202)
                                .addComponent(startButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 180, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(userLabel))
                        .addGap(46, 46, 46)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(taskField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinnerMinute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jSpinnerHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startButton)
                    .addComponent(btnView))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(mainMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        try {
            String task = taskField.getText().trim();
            if (task.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter a message for the reminder.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            LocalDate date = jCalendar1.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            int hour = (int) jSpinnerHour.getValue();
            int minute = (int) jSpinnerMinute.getValue();

            LocalDateTime dateTime = LocalDateTime.of(date, LocalTime.of(hour, minute));

            TimerTask reminderTask = new TimerTask() {
                @Override
                public void run() {
                    Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(SetReminder.this, "Reminder: " + task, "Reminder", JOptionPane.INFORMATION_MESSAGE);

                    timer.cancel();
                }
            };

            Timer timer = new Timer();
            timer.schedule(reminderTask, Date.from(dateTime.atZone(ZoneId.systemDefault()).toInstant()));

            taskField.setText("");
            String dateStr = dateTime.toLocalDate().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            String timeStr = dateTime.toLocalTime().format(DateTimeFormatter.ofPattern("HH:mm"));
            JOptionPane.showMessageDialog(this, "Reminder created for task '" + task + "' at " + dateStr + " " + timeStr, "Success", JOptionPane.INFORMATION_MESSAGE);

            String sql = "INSERT INTO Reminder (ReminderText, DateReminder, TimeReminder, Date, User) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, task);
            pst.setString(2, dateStr);
            pst.setDouble(3, Double.parseDouble(dateTime.toLocalTime().format(DateTimeFormatter.ofPattern("HH.mm"))));
            String formattedDate = dateTime.toLocalDate().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            pst.setString(4, formattedDate);
            pst.setString(5, LoggedInUser);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Reminder saved to database.");
            pst.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_startButtonActionPerformed

    private void mainMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMenuButtonActionPerformed

        dispose();
    }//GEN-LAST:event_mainMenuButtonActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewSetReminder(LoggedInUser).setVisible(true);
            }
        });
    }//GEN-LAST:event_btnViewActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnView;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSpinner jSpinnerHour;
    private javax.swing.JSpinner jSpinnerMinute;
    private javax.swing.JButton mainMenuButton;
    private javax.swing.JButton startButton;
    private javax.swing.JTextField taskField;
    private javax.swing.JLabel userLabel;
    // End of variables declaration//GEN-END:variables

    private void schedule() {
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                JOptionPane.showMessageDialog(SetReminder.this, "Reminder: " + SetReminder.this.task);
                SetReminder.this.timer.cancel();
            }
        };
        long delay = java.time.Duration.between(LocalDateTime.now(), dateTime).toMillis();
        this.timer.schedule(task, delay);

    }
}
