/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.betteru.betteru;

import java.awt.Color;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONObject;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import org.json.JSONArray;
import org.json.JSONException;

/**
 *
 * @author James
 */
public class QuoteAPI extends javax.swing.JFrame {

    /**
     * Creates new form QuoteAPI
     */
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    String LoggedInUser = null;

    public QuoteAPI(String User) {
        initComponents();
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

        btnQuote = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        mainMenuButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnQuote.setText("Get Quote");
        btnQuote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuoteActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Random Inspirational Quote From API");

        mainMenuButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main_Menu35.png"))); // NOI18N
        mainMenuButton.setText("Main Menu");
        mainMenuButton.setFocusPainted(false);
        mainMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainMenuButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Logged in User:");

        userLabel.setText("jLabel3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userLabel)
                        .addGap(0, 7, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 51, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(167, 167, 167))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(309, 309, 309)
                .addComponent(btnQuote)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mainMenuButton)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(userLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnQuote)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
                .addComponent(mainMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQuoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuoteActionPerformed
        jTextArea1.setText("");
        String apiUrl = "https://zenquotes.io/api/random";

        OkHttpClient httpClient = new OkHttpClient();
        Request request = new Request.Builder()
                .url(apiUrl)
                .build();

        try {
            Response response = httpClient.newCall(request).execute();
            String jsonResponse = response.body().string();
            System.out.println("JSON response: " + jsonResponse);
            JSONArray json = new JSONArray(jsonResponse);
            JSONObject quoteObj = json.getJSONObject(0);
            String quote = quoteObj.getString("q");
            String author = quoteObj.getString("a");
            String quoteWithAuthor = quote + " - " + author;

            jTextArea1.append(quoteWithAuthor);

            response.close();

            String sql = "INSERT INTO RandomQuote (Quote, Author, Date, User) VALUES (?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, quote);
            pst.setString(2, author);

            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            Date date = new Date();
            String strDate = dateFormat.format(date);

            pst.setString(3, strDate);
            pst.setString(4, LoggedInUser);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Quote saved to database.");
            pst.close();

        } catch (IOException e) {
            System.err.println("Error making API request: " + e.getMessage());
        } catch (JSONException e) {
            System.err.println("Error parsing JSON response: " + e.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }


    }//GEN-LAST:event_btnQuoteActionPerformed

    private void mainMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMenuButtonActionPerformed

        dispose();
    }//GEN-LAST:event_mainMenuButtonActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnQuote;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton mainMenuButton;
    private javax.swing.JLabel userLabel;
    // End of variables declaration//GEN-END:variables
}
