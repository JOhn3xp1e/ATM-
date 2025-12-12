/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysystem;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.JOptionPane;
import mysystem.database.DatabaseConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.border.Border;

/**
 *
 * @author Carla Jean Berjuega
 */
public class MainMenu extends javax.swing.JFrame {

    private Color bg,fg;
    
    public MainMenu(String fullName, String phoneNumber, double balance) {
        initComponents();
        
        bg = new Color (255,255,255);
        fg = new Color (0,0,0);
        
        // Set account holder name in all panels
        accounfullnamedp.setText(fullName);
        accountholdernamedisplaydiposit.setText(fullName);
        withdrawaccountholdernamedp.setText(fullName);
        
        // Set phone number in all panels
        phonenumberdp.setText(phoneNumber);
        phonenumberdisplaydiposit.setText(phoneNumber);
        withdrawphonenumberdp.setText(phoneNumber);
        
        // Set balance in all panels
        String formattedBalance = String.format("%.2f", balance);
        currentbalancedisplay.setText(formattedBalance);
        currentbalancedisplaydiposit.setText(formattedBalance);
        withdrawcurrentbalancedp.setText(formattedBalance);
        
                                                                                                                
        balancepaneldp.setBackground(fg); 
        balancedp.setForeground(bg); 
       
        
        withdrawpaneldp.setBackground(bg); 
        withdrawdp.setForeground(fg); 
        
        
        depositpaneldp.setBackground(bg); 
        depositdp.setForeground(fg); 
        
        
        transactionhistorypaneldp.setBackground(bg); 
        transactiondp.setForeground(fg);
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        withdrawpaneldp = new javax.swing.JPanel();
        withdrawdp = new javax.swing.JLabel();
        balancepaneldp = new javax.swing.JPanel();
        balancedp = new javax.swing.JLabel();
        depositpaneldp = new javax.swing.JPanel();
        depositdp = new javax.swing.JLabel();
        transactionhistorypaneldp = new javax.swing.JPanel();
        transactiondp = new javax.swing.JLabel();
        ParentPanel = new javax.swing.JPanel();
        BalanceDashboard = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        accounfullnamedp = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        phonenumberdp = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        currentbalancedisplay = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        headerpanelbot3 = new javax.swing.JPanel();
        headerpanelbot4 = new javax.swing.JPanel();
        headersider3 = new javax.swing.JPanel();
        headersider4 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        H22 = new javax.swing.JLabel();
        H23 = new javax.swing.JLabel();
        H24 = new javax.swing.JLabel();
        H25 = new javax.swing.JLabel();
        H27 = new javax.swing.JLabel();
        H28 = new javax.swing.JLabel();
        H29 = new javax.swing.JLabel();
        TransactionHistoryDashboard = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        H = new javax.swing.JLabel();
        H1 = new javax.swing.JLabel();
        H2 = new javax.swing.JLabel();
        H3 = new javax.swing.JLabel();
        H4 = new javax.swing.JLabel();
        H5 = new javax.swing.JLabel();
        H6 = new javax.swing.JLabel();
        FirstPage = new javax.swing.JPanel();
        DepositDashboard = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        accountholdernamedisplaydiposit = new javax.swing.JLabel();
        phonenumberdisplaydiposit = new javax.swing.JLabel();
        currentbalancedisplaydiposit = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        amounttodeposit = new javax.swing.JTextField();
        depositbtn = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        H15 = new javax.swing.JLabel();
        H16 = new javax.swing.JLabel();
        H17 = new javax.swing.JLabel();
        H18 = new javax.swing.JLabel();
        H19 = new javax.swing.JLabel();
        H20 = new javax.swing.JLabel();
        H21 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        headerpanelbot7 = new javax.swing.JPanel();
        headerpanelbot8 = new javax.swing.JPanel();
        headersider7 = new javax.swing.JPanel();
        headersider8 = new javax.swing.JPanel();
        WithdrawDashboard = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        withdrawaccountholdernamedp = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        withdrawphonenumberdp = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        withdrawcurrentbalancedp = new javax.swing.JLabel();
        enteramountwithdraw = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        wdrawalBtn = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        H7 = new javax.swing.JLabel();
        H8 = new javax.swing.JLabel();
        H9 = new javax.swing.JLabel();
        H10 = new javax.swing.JLabel();
        H11 = new javax.swing.JLabel();
        H12 = new javax.swing.JLabel();
        H13 = new javax.swing.JLabel();
        H14 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        headerpanelbot5 = new javax.swing.JPanel();
        headerpanelbot6 = new javax.swing.JPanel();
        headersider5 = new javax.swing.JPanel();
        headersider6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        withdrawpaneldp.setBackground(new java.awt.Color(255, 255, 255));
        withdrawpaneldp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        withdrawdp.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        withdrawdp.setText("         WITHDRAW");
        withdrawdp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        withdrawdp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                withdrawdpMousePressed(evt);
            }
        });

        javax.swing.GroupLayout withdrawpaneldpLayout = new javax.swing.GroupLayout(withdrawpaneldp);
        withdrawpaneldp.setLayout(withdrawpaneldpLayout);
        withdrawpaneldpLayout.setHorizontalGroup(
            withdrawpaneldpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(withdrawdp, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
        );
        withdrawpaneldpLayout.setVerticalGroup(
            withdrawpaneldpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(withdrawdp, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
        );

        jPanel3.add(withdrawpaneldp, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 240, 60));

        balancepaneldp.setBackground(new java.awt.Color(255, 255, 255));
        balancepaneldp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        balancedp.setBackground(new java.awt.Color(255, 255, 255));
        balancedp.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        balancedp.setText("          BALANCE");
        balancedp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        balancedp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                balancedpMousePressed(evt);
            }
        });

        javax.swing.GroupLayout balancepaneldpLayout = new javax.swing.GroupLayout(balancepaneldp);
        balancepaneldp.setLayout(balancepaneldpLayout);
        balancepaneldpLayout.setHorizontalGroup(
            balancepaneldpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(balancedp, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
        );
        balancepaneldpLayout.setVerticalGroup(
            balancepaneldpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(balancedp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.add(balancepaneldp, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 240, 60));

        depositpaneldp.setBackground(new java.awt.Color(255, 255, 255));
        depositpaneldp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        depositdp.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        depositdp.setText("            DEPOSIT");
        depositdp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        depositdp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                depositdpMousePressed(evt);
            }
        });

        javax.swing.GroupLayout depositpaneldpLayout = new javax.swing.GroupLayout(depositpaneldp);
        depositpaneldp.setLayout(depositpaneldpLayout);
        depositpaneldpLayout.setHorizontalGroup(
            depositpaneldpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(depositdp, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
        );
        depositpaneldpLayout.setVerticalGroup(
            depositpaneldpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(depositdp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.add(depositpaneldp, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, 240, 60));

        transactionhistorypaneldp.setBackground(new java.awt.Color(255, 255, 255));
        transactionhistorypaneldp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        transactiondp.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        transactiondp.setText("     TRANSACTION HISTORY");
        transactiondp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        transactiondp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                transactiondpMousePressed(evt);
            }
        });

        javax.swing.GroupLayout transactionhistorypaneldpLayout = new javax.swing.GroupLayout(transactionhistorypaneldp);
        transactionhistorypaneldp.setLayout(transactionhistorypaneldpLayout);
        transactionhistorypaneldpLayout.setHorizontalGroup(
            transactionhistorypaneldpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(transactiondp, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
        );
        transactionhistorypaneldpLayout.setVerticalGroup(
            transactionhistorypaneldpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(transactiondp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.add(transactionhistorypaneldp, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 30, 350, 60));

        ParentPanel.setBackground(new java.awt.Color(255, 255, 255));
        ParentPanel.setLayout(new java.awt.CardLayout());

        BalanceDashboard.setBackground(new java.awt.Color(255, 255, 255));
        BalanceDashboard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BalanceDashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel2.setText("Account Holder Name:");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, -1, -1));

        accounfullnamedp.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        accounfullnamedp.setText("dgsdg");
        jPanel4.add(accounfullnamedp, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 270, 60));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel3.setText("Phone Number:");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, -1, -1));

        phonenumberdp.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        phonenumberdp.setText("dgd");
        jPanel4.add(phonenumberdp, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 310, 50));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel4.setText("Current Balance:");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, -1, -1));

        currentbalancedisplay.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        currentbalancedisplay.setText("jLabel6");
        jPanel4.add(currentbalancedisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 280, 60));

        BalanceDashboard.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 790, 310));

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("SansSerif", 1, 50)); // NOI18N
        jLabel19.setText("ATM");
        jPanel14.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        jLabel20.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jLabel20.setText("Fast. Simple. Secure");
        jPanel14.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, 30));

        jPanel15.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel14.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 300, -1));

        jPanel16.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        jPanel14.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 10, 90));

        headerpanelbot3.setBackground(new java.awt.Color(255, 255, 255));
        headerpanelbot3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerpanelbot3MousePressed(evt);
            }
        });

        javax.swing.GroupLayout headerpanelbot3Layout = new javax.swing.GroupLayout(headerpanelbot3);
        headerpanelbot3.setLayout(headerpanelbot3Layout);
        headerpanelbot3Layout.setHorizontalGroup(
            headerpanelbot3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );
        headerpanelbot3Layout.setVerticalGroup(
            headerpanelbot3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel14.add(headerpanelbot3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 290, 10));

        headerpanelbot4.setBackground(new java.awt.Color(255, 204, 0));
        headerpanelbot4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        headerpanelbot4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerpanelbot4MousePressed(evt);
            }
        });

        javax.swing.GroupLayout headerpanelbot4Layout = new javax.swing.GroupLayout(headerpanelbot4);
        headerpanelbot4.setLayout(headerpanelbot4Layout);
        headerpanelbot4Layout.setHorizontalGroup(
            headerpanelbot4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );
        headerpanelbot4Layout.setVerticalGroup(
            headerpanelbot4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel14.add(headerpanelbot4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        headersider3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout headersider3Layout = new javax.swing.GroupLayout(headersider3);
        headersider3.setLayout(headersider3Layout);
        headersider3Layout.setHorizontalGroup(
            headersider3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 11, Short.MAX_VALUE)
        );
        headersider3Layout.setVerticalGroup(
            headersider3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        jPanel14.add(headersider3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, -1, 90));

        headersider4.setBackground(new java.awt.Color(255, 204, 0));
        headersider4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout headersider4Layout = new javax.swing.GroupLayout(headersider4);
        headersider4.setLayout(headersider4Layout);
        headersider4Layout.setHorizontalGroup(
            headersider4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        headersider4Layout.setVerticalGroup(
            headersider4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 98, Short.MAX_VALUE)
        );

        jPanel14.add(headersider4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 22, 10, 100));

        BalanceDashboard.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 340, 130));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        H22.setFont(new java.awt.Font("Times New Roman", 1, 50)); // NOI18N
        H22.setText("B");

        H23.setFont(new java.awt.Font("Times New Roman", 1, 50)); // NOI18N
        H23.setText("A");

        H24.setFont(new java.awt.Font("Times New Roman", 1, 50)); // NOI18N
        H24.setText("L");

        H25.setFont(new java.awt.Font("Times New Roman", 1, 50)); // NOI18N
        H25.setText("A");

        H27.setFont(new java.awt.Font("Times New Roman", 1, 50)); // NOI18N
        H27.setText("N");

        H28.setFont(new java.awt.Font("Times New Roman", 1, 50)); // NOI18N
        H28.setText("C");

        H29.setFont(new java.awt.Font("Times New Roman", 1, 50)); // NOI18N
        H29.setText("E");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(H29)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(H27)
                            .addComponent(H22)
                            .addComponent(H24))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(H23)
                            .addComponent(H25)
                            .addComponent(H28))
                        .addGap(30, 30, 30))))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(H22, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(H23, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(H25, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(H28, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(H24, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)
                        .addComponent(H27, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(H29, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
        );

        BalanceDashboard.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 0, 160, 590));

        ParentPanel.add(BalanceDashboard, "card3");

        TransactionHistoryDashboard.setBackground(new java.awt.Color(255, 255, 255));
        TransactionHistoryDashboard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TransactionHistoryDashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        H.setFont(new java.awt.Font("Times New Roman", 1, 50)); // NOI18N
        H.setText("H");

        H1.setFont(new java.awt.Font("Times New Roman", 1, 50)); // NOI18N
        H1.setText("I");

        H2.setFont(new java.awt.Font("Times New Roman", 1, 50)); // NOI18N
        H2.setText("S");

        H3.setFont(new java.awt.Font("Times New Roman", 1, 50)); // NOI18N
        H3.setText("T");

        H4.setFont(new java.awt.Font("Times New Roman", 1, 50)); // NOI18N
        H4.setText("O");

        H5.setFont(new java.awt.Font("Times New Roman", 1, 50)); // NOI18N
        H5.setText("R");

        H6.setFont(new java.awt.Font("Times New Roman", 1, 50)); // NOI18N
        H6.setText("Y");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(H)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(H2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(H3)
                                    .addComponent(H1)))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(H5)))
                        .addGap(30, 30, 30))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(H6)
                            .addComponent(H4))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(H, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(H2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(H1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(H3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(H4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addComponent(H6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
        );

        TransactionHistoryDashboard.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 0, 160, 590));

        FirstPage.setBackground(new java.awt.Color(255, 255, 255));
        FirstPage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        FirstPage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        TransactionHistoryDashboard.add(FirstPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 590));

        ParentPanel.add(TransactionHistoryDashboard, "card6");

        DepositDashboard.setBackground(new java.awt.Color(255, 255, 255));
        DepositDashboard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        DepositDashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel7.setText("Account Holder Number:");
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 62, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel9.setText("Phone Number:");
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 96, -1, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel11.setText("Current Balance:");
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 131, -1, -1));

        accountholdernamedisplaydiposit.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        accountholdernamedisplaydiposit.setText("jLabel13");
        jPanel6.add(accountholdernamedisplaydiposit, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 62, 198, -1));

        phonenumberdisplaydiposit.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        phonenumberdisplaydiposit.setText("jLabel14");
        jPanel6.add(phonenumberdisplaydiposit, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 95, 254, 27));

        currentbalancedisplaydiposit.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        currentbalancedisplaydiposit.setText("jLabel15");
        jPanel6.add(currentbalancedisplaydiposit, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 131, 230, -1));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel16.setText("Enter Amount to Deposit");
        jPanel6.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, -1, -1));

        amounttodeposit.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        amounttodeposit.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        amounttodeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amounttodepositActionPerformed(evt);
            }
        });
        jPanel6.add(amounttodeposit, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 520, 50));

        depositbtn.setBackground(new java.awt.Color(255, 255, 255));
        depositbtn.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        depositbtn.setText("Confirm Deposit");
        depositbtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        depositbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        depositbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositbtnActionPerformed(evt);
            }
        });
        jPanel6.add(depositbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 520, 56));

        DepositDashboard.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 840, 390));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        H15.setFont(new java.awt.Font("Times New Roman", 1, 50)); // NOI18N
        H15.setText("D");

        H16.setFont(new java.awt.Font("Times New Roman", 1, 50)); // NOI18N
        H16.setText("E");

        H17.setFont(new java.awt.Font("Times New Roman", 1, 50)); // NOI18N
        H17.setText("P");

        H18.setFont(new java.awt.Font("Times New Roman", 1, 50)); // NOI18N
        H18.setText("O");

        H19.setFont(new java.awt.Font("Times New Roman", 1, 50)); // NOI18N
        H19.setText("S");

        H20.setFont(new java.awt.Font("Times New Roman", 1, 50)); // NOI18N
        H20.setText("I");

        H21.setFont(new java.awt.Font("Times New Roman", 1, 50)); // NOI18N
        H21.setText("T");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(H15)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(H17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(H18)
                                    .addComponent(H16)))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(H20)))
                        .addGap(30, 30, 30))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(H21)
                            .addComponent(H19))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(H15, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(H17, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(H16, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(H18, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(H19, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H20, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addComponent(H21, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
        );

        DepositDashboard.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 0, 160, 590));

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("SansSerif", 1, 50)); // NOI18N
        jLabel23.setText("ATM");
        jPanel20.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        jLabel24.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jLabel24.setText("Fast. Simple. Secure");
        jPanel20.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, 30));

        jPanel21.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel20.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 300, -1));

        jPanel22.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        jPanel20.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 10, 90));

        headerpanelbot7.setBackground(new java.awt.Color(255, 255, 255));
        headerpanelbot7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerpanelbot7MousePressed(evt);
            }
        });

        javax.swing.GroupLayout headerpanelbot7Layout = new javax.swing.GroupLayout(headerpanelbot7);
        headerpanelbot7.setLayout(headerpanelbot7Layout);
        headerpanelbot7Layout.setHorizontalGroup(
            headerpanelbot7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );
        headerpanelbot7Layout.setVerticalGroup(
            headerpanelbot7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel20.add(headerpanelbot7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 290, 10));

        headerpanelbot8.setBackground(new java.awt.Color(255, 204, 0));
        headerpanelbot8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        headerpanelbot8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerpanelbot8MousePressed(evt);
            }
        });

        javax.swing.GroupLayout headerpanelbot8Layout = new javax.swing.GroupLayout(headerpanelbot8);
        headerpanelbot8.setLayout(headerpanelbot8Layout);
        headerpanelbot8Layout.setHorizontalGroup(
            headerpanelbot8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );
        headerpanelbot8Layout.setVerticalGroup(
            headerpanelbot8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel20.add(headerpanelbot8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        headersider7.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout headersider7Layout = new javax.swing.GroupLayout(headersider7);
        headersider7.setLayout(headersider7Layout);
        headersider7Layout.setHorizontalGroup(
            headersider7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 11, Short.MAX_VALUE)
        );
        headersider7Layout.setVerticalGroup(
            headersider7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        jPanel20.add(headersider7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, -1, 90));

        headersider8.setBackground(new java.awt.Color(255, 204, 0));
        headersider8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout headersider8Layout = new javax.swing.GroupLayout(headersider8);
        headersider8.setLayout(headersider8Layout);
        headersider8Layout.setHorizontalGroup(
            headersider8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        headersider8Layout.setVerticalGroup(
            headersider8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 98, Short.MAX_VALUE)
        );

        jPanel20.add(headersider8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 22, 10, 100));

        DepositDashboard.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 340, 130));

        ParentPanel.add(DepositDashboard, "card5");

        WithdrawDashboard.setBackground(new java.awt.Color(255, 255, 255));
        WithdrawDashboard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        WithdrawDashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel6.setText("Account Holder Number:");

        withdrawaccountholdernamedp.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        withdrawaccountholdernamedp.setText("jLabel7");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel8.setText("Phone Number:");

        withdrawphonenumberdp.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        withdrawphonenumberdp.setText("jLabel9");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel10.setText("Current Balance:");

        withdrawcurrentbalancedp.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        withdrawcurrentbalancedp.setText("jLabel11");

        enteramountwithdraw.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        enteramountwithdraw.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        enteramountwithdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enteramountwithdrawActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel12.setText("Enter Amount To Withdraw");

        wdrawalBtn.setBackground(new java.awt.Color(255, 255, 255));
        wdrawalBtn.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        wdrawalBtn.setText("Confirm Withdrawal");
        wdrawalBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        wdrawalBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        wdrawalBtn.setDefaultCapable(false);
        wdrawalBtn.setFocusPainted(false);
        wdrawalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wdrawalBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(withdrawphonenumberdp, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(withdrawaccountholdernamedp, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(withdrawcurrentbalancedp, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(167, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(291, 291, 291))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(wdrawalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enteramountwithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(137, 137, 137))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(withdrawaccountholdernamedp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(withdrawphonenumberdp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(withdrawcurrentbalancedp))
                .addGap(37, 37, 37)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enteramountwithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(wdrawalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        WithdrawDashboard.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 850, 380));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        H7.setFont(new java.awt.Font("Times New Roman", 1, 50)); // NOI18N
        H7.setText("W");

        H8.setFont(new java.awt.Font("Times New Roman", 1, 50)); // NOI18N
        H8.setText("I");

        H9.setFont(new java.awt.Font("Times New Roman", 1, 50)); // NOI18N
        H9.setText("T");

        H10.setFont(new java.awt.Font("Times New Roman", 1, 50)); // NOI18N
        H10.setText("H");

        H11.setFont(new java.awt.Font("Times New Roman", 1, 50)); // NOI18N
        H11.setText("D");

        H12.setFont(new java.awt.Font("Times New Roman", 1, 50)); // NOI18N
        H12.setText("R");

        H13.setFont(new java.awt.Font("Times New Roman", 1, 50)); // NOI18N
        H13.setText("A");

        H14.setFont(new java.awt.Font("Times New Roman", 1, 50)); // NOI18N
        H14.setText("W");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(H7)
                            .addComponent(H9)
                            .addComponent(H11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(H12)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(H8, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(H10, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addGap(30, 30, 30))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(H13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(H14)
                        .addContainerGap())))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(H8, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(H10, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(H7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(H9, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(H11, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(H12, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H13, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(80, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(H14, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        WithdrawDashboard.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 0, 160, 590));

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("SansSerif", 1, 50)); // NOI18N
        jLabel21.setText("ATM");
        jPanel17.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        jLabel22.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jLabel22.setText("Fast. Simple. Secure");
        jPanel17.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, 30));

        jPanel18.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel17.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 300, -1));

        jPanel19.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        jPanel17.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 10, 90));

        headerpanelbot5.setBackground(new java.awt.Color(255, 255, 255));
        headerpanelbot5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerpanelbot5MousePressed(evt);
            }
        });

        javax.swing.GroupLayout headerpanelbot5Layout = new javax.swing.GroupLayout(headerpanelbot5);
        headerpanelbot5.setLayout(headerpanelbot5Layout);
        headerpanelbot5Layout.setHorizontalGroup(
            headerpanelbot5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );
        headerpanelbot5Layout.setVerticalGroup(
            headerpanelbot5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel17.add(headerpanelbot5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 290, 10));

        headerpanelbot6.setBackground(new java.awt.Color(255, 204, 0));
        headerpanelbot6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        headerpanelbot6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerpanelbot6MousePressed(evt);
            }
        });

        javax.swing.GroupLayout headerpanelbot6Layout = new javax.swing.GroupLayout(headerpanelbot6);
        headerpanelbot6.setLayout(headerpanelbot6Layout);
        headerpanelbot6Layout.setHorizontalGroup(
            headerpanelbot6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );
        headerpanelbot6Layout.setVerticalGroup(
            headerpanelbot6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel17.add(headerpanelbot6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        headersider5.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout headersider5Layout = new javax.swing.GroupLayout(headersider5);
        headersider5.setLayout(headersider5Layout);
        headersider5Layout.setHorizontalGroup(
            headersider5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 11, Short.MAX_VALUE)
        );
        headersider5Layout.setVerticalGroup(
            headersider5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        jPanel17.add(headersider5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, -1, 90));

        headersider6.setBackground(new java.awt.Color(255, 204, 0));
        headersider6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout headersider6Layout = new javax.swing.GroupLayout(headersider6);
        headersider6.setLayout(headersider6Layout);
        headersider6Layout.setHorizontalGroup(
            headersider6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        headersider6Layout.setVerticalGroup(
            headersider6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 98, Short.MAX_VALUE)
        );

        jPanel17.add(headersider6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 22, 10, 100));

        WithdrawDashboard.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 340, 130));

        ParentPanel.add(WithdrawDashboard, "card4");

        jPanel3.add(ParentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 1070, 590));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel1.setText("LOGOUT");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 0, 100, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel5.setText("   EDIT PROFILE");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
        });
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void balancedpMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_balancedpMousePressed
        
        balancepaneldp.setBackground(fg); 
        balancedp.setForeground(bg); 
       
        
        withdrawpaneldp.setBackground(bg); 
        withdrawdp.setForeground(fg); 
        
        
        depositpaneldp.setBackground(bg); 
        depositdp.setForeground(fg); 
        
        
        transactionhistorypaneldp.setBackground(bg); 
        transactiondp.setForeground(fg); 
       
        

    ParentPanel.removeAll();
    ParentPanel.add(BalanceDashboard);
    ParentPanel.repaint();
    ParentPanel.revalidate();
    }//GEN-LAST:event_balancedpMousePressed

    private void withdrawdpMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_withdrawdpMousePressed
        balancepaneldp.setBackground(bg); 
        balancedp.setForeground(fg); 
        
        withdrawpaneldp.setBackground(fg); 
        withdrawdp.setForeground(bg); 
        
        depositpaneldp.setBackground(bg); 
        depositdp.setForeground(fg); 
        
        transactionhistorypaneldp.setBackground(bg); 
        transactiondp.setForeground(fg);
    
        
        withdrawaccountholdernamedp.setText(accounfullnamedp.getText());
        withdrawphonenumberdp.setText(phonenumberdp.getText());
        withdrawcurrentbalancedp.setText(currentbalancedisplay.getText());
        
        
        enteramountwithdraw.setText("");
        
       
        wdrawalBtn.setEnabled(true);
    
        ParentPanel.removeAll();
        ParentPanel.add(WithdrawDashboard);
        ParentPanel.repaint();
        ParentPanel.revalidate();
    }//GEN-LAST:event_withdrawdpMousePressed

    private void depositdpMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depositdpMousePressed
        balancepaneldp.setBackground(bg); 
        balancedp.setForeground(fg); 
       
        
        withdrawpaneldp.setBackground(bg); 
        withdrawdp.setForeground(fg); 
        
        
        depositpaneldp.setBackground(fg); 
        depositdp.setForeground(bg); 
        
        
        transactionhistorypaneldp.setBackground(bg); 
        transactiondp.setForeground(fg);
    
    
    ParentPanel.removeAll();
    ParentPanel.add(DepositDashboard);
    ParentPanel.repaint();
    ParentPanel.revalidate();
    }//GEN-LAST:event_depositdpMousePressed

    private void transactiondpMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transactiondpMousePressed
        balancepaneldp.setBackground(bg); 
        balancedp.setForeground(fg); 
        
        withdrawpaneldp.setBackground(bg); 
        withdrawdp.setForeground(fg); 
        
        depositpaneldp.setBackground(bg); 
        depositdp.setForeground(fg); 
        
        transactionhistorypaneldp.setBackground(fg); 
        transactiondp.setForeground(bg);
    
        // Get transaction history
        String phoneNumber = phonenumberdp.getText();
        try {
            Connection conn = DatabaseConnection.getConnection();
            String sql = "SELECT type, amount, date FROM Transactions WHERE phone_number = ? ORDER BY date DESC";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, phoneNumber);
            ResultSet rs = pstmt.executeQuery();
            
            // Clear previous transaction list components while keeping the HISTORY panel (jPanel7)
            for (java.awt.Component comp : TransactionHistoryDashboard.getComponents()) {
                if (comp != jPanel7) { // Keep the HISTORY panel
                    TransactionHistoryDashboard.remove(comp);
                }
            }
            
            // Create a panel to hold the title and transaction entries
            javax.swing.JPanel historyContentPanel = new javax.swing.JPanel();
            historyContentPanel.setLayout(new javax.swing.BoxLayout(historyContentPanel, javax.swing.BoxLayout.Y_AXIS));
            historyContentPanel.setBackground(new java.awt.Color(255, 255, 255));
            
            // Add title
            javax.swing.JLabel titleLabel = new javax.swing.JLabel("Transaction History");
            titleLabel.setFont(new java.awt.Font("Times New Roman", 1, 20));
            titleLabel.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
            historyContentPanel.add(titleLabel);
            historyContentPanel.add(javax.swing.Box.createVerticalStrut(10));
            
            while (rs.next()) {
                String type = rs.getString("type");
                double amount = rs.getDouble("amount");
                String date = rs.getString("date");
                
                // Create transaction panel for a single entry
                javax.swing.JPanel transactionEntryPanel = new javax.swing.JPanel();
                transactionEntryPanel.setLayout(new javax.swing.BoxLayout(transactionEntryPanel, javax.swing.BoxLayout.Y_AXIS));
                transactionEntryPanel.setBackground(new java.awt.Color(255, 255, 255));
                transactionEntryPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                
                // Add transaction details (Type, Amount, Date)
                javax.swing.JPanel infoPanel = new javax.swing.JPanel();
                infoPanel.setLayout(new javax.swing.BoxLayout(infoPanel, javax.swing.BoxLayout.X_AXIS));
                infoPanel.setBackground(new java.awt.Color(255, 255, 255));
                
                javax.swing.JLabel typeLabel = new javax.swing.JLabel(type);
                javax.swing.JLabel amountLabel = new javax.swing.JLabel(String.format("%.2f", amount));
                javax.swing.JLabel dateLabel = new javax.swing.JLabel(date);
                
                typeLabel.setFont(new java.awt.Font("Times New Roman", 0, 14));
                amountLabel.setFont(new java.awt.Font("Times New Roman", 0, 14));
                dateLabel.setFont(new java.awt.Font("Times New Roman", 0, 14));
                
                infoPanel.add(javax.swing.Box.createHorizontalGlue()); // Push components to center/right
                infoPanel.add(typeLabel);
                infoPanel.add(javax.swing.Box.createHorizontalStrut(20));
                infoPanel.add(amountLabel);
                infoPanel.add(javax.swing.Box.createHorizontalStrut(20));
                infoPanel.add(dateLabel);
                infoPanel.add(javax.swing.Box.createHorizontalGlue()); // Push components to center/left
                
                transactionEntryPanel.add(infoPanel);
                
                // Add breakdown for withdrawals
                if (type.equals("WITHDRAWAL")) {
                    // Ensure amount is a positive integer for breakdown
                    int totalAmount = (int) Math.abs(amount);
                    int thousands = totalAmount / 1000;
                    int hundreds = (totalAmount % 1000) / 100;
                    int pesos = totalAmount % 100;
                    
                    javax.swing.JPanel breakdownPanel = new javax.swing.JPanel();
                    breakdownPanel.setLayout(new javax.swing.BoxLayout(breakdownPanel, javax.swing.BoxLayout.X_AXIS));
                    breakdownPanel.setBackground(new java.awt.Color(255, 255, 255));
                    
                    javax.swing.JLabel breakdownLabel = new javax.swing.JLabel("Breakdown: ");
                    breakdownLabel.setFont(new java.awt.Font("Times New Roman", 0, 14));
                    
                    javax.swing.JLabel breakdown = new javax.swing.JLabel(
                        String.format("%d x 1000, %d x 100, %d pesos", thousands, hundreds, pesos)
                    );
                    breakdown.setFont(new java.awt.Font("Times New Roman", 0, 14));
                    
                    breakdownPanel.add(javax.swing.Box.createHorizontalGlue()); // Push components to center/right
                    breakdownPanel.add(breakdownLabel);
                    breakdownPanel.add(breakdown);
                    breakdownPanel.add(javax.swing.Box.createHorizontalGlue()); // Push components to center/left
                    
                    transactionEntryPanel.add(breakdownPanel);
                }
                
                historyContentPanel.add(transactionEntryPanel);
                historyContentPanel.add(javax.swing.Box.createVerticalStrut(10));
            }
            
            // Add scroll pane containing the transaction list content panel
            javax.swing.JScrollPane scrollPane = new javax.swing.JScrollPane(historyContentPanel);
            scrollPane.setVerticalScrollBarPolicy(javax.swing.JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
            scrollPane.setHorizontalScrollBarPolicy(javax.swing.JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
            
            // Add the scroll pane to the TransactionHistoryDashboard next to jPanel7
            // Assuming jPanel7 is at (910, 0) with width 160
            TransactionHistoryDashboard.add(scrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 880, 570));
            
            rs.close();
            pstmt.close();
            conn.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error loading transaction history: " + e.getMessage());
        }
    
        ParentPanel.removeAll();
        ParentPanel.add(TransactionHistoryDashboard);
        ParentPanel.repaint();
        ParentPanel.revalidate();
    }//GEN-LAST:event_transactiondpMousePressed

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed
    
    }//GEN-LAST:event_jLabel5MousePressed

    private void headerpanelbot3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerpanelbot3MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_headerpanelbot3MousePressed

    private void headerpanelbot4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerpanelbot4MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_headerpanelbot4MousePressed

    private void enteramountwithdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enteramountwithdrawActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enteramountwithdrawActionPerformed

    private void depositbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositbtnActionPerformed
        try {
            String amountStr = amounttodeposit.getText().trim();
            if (amountStr.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter an amount to deposit.");
                return;
            }

            double amount = Double.parseDouble(amountStr);
            if (amount <= 0) {
                JOptionPane.showMessageDialog(this, "Please enter a valid amount greater than 0.");
                return;
            }

            String phoneNumber = phonenumberdp.getText();
            if (DatabaseConnection.deposit(phoneNumber, amount)) {
                JOptionPane.showMessageDialog(this, "Deposit successful!\nAmount deposited: " + String.format("%.2f", amount));
                // Update balance display
                double newBalance = DatabaseConnection.getBalance(phoneNumber);
                String formattedBalance = String.format("%.2f", newBalance);
                currentbalancedisplay.setText(formattedBalance);
                currentbalancedisplaydiposit.setText(formattedBalance);
                withdrawcurrentbalancedp.setText(formattedBalance);
                amounttodeposit.setText("");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number.");
        }
    }//GEN-LAST:event_depositbtnActionPerformed

    private void amounttodepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amounttodepositActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amounttodepositActionPerformed

    private void confirmwithdrawaltnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmwithdrawaltnActionPerformed
        
    }//GEN-LAST:event_confirmwithdrawaltnActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
       new LoginFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void headerpanelbot5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerpanelbot5MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_headerpanelbot5MousePressed

    private void headerpanelbot6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerpanelbot6MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_headerpanelbot6MousePressed

    private void headerpanelbot7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerpanelbot7MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_headerpanelbot7MousePressed

    private void headerpanelbot8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerpanelbot8MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_headerpanelbot8MousePressed

    private void wdrawalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wdrawalBtnActionPerformed
      try {
            String amountStr = enteramountwithdraw.getText().trim();
            if (amountStr.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter an amount to withdraw.");
                return;
            }

            double amount = Double.parseDouble(amountStr);
            if (amount <= 0) {
                JOptionPane.showMessageDialog(this, "Please enter a valid amount greater than 0.");
                return;
            }

            // Check if amount is greater than current balance
            double currentBalance = DatabaseConnection.getBalance(phonenumberdp.getText());
            if (amount > currentBalance) {
                JOptionPane.showMessageDialog(this, "Insufficient balance. Your current balance is: " + String.format("%.2f", currentBalance));
                return;
            }

            String phoneNumber = phonenumberdp.getText();
            if (DatabaseConnection.withdraw(phoneNumber, amount)) {
                JOptionPane.showMessageDialog(this, "Withdrawal successful!\nAmount withdrawn: " + String.format("%.2f", amount));
                // Update balance display
                double newBalance = DatabaseConnection.getBalance(phoneNumber);
                String formattedBalance = String.format("%.2f", newBalance);
                currentbalancedisplay.setText(formattedBalance);
                currentbalancedisplaydiposit.setText(formattedBalance);
                withdrawcurrentbalancedp.setText(formattedBalance);
                enteramountwithdraw.setText("");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number.");
        }
    }//GEN-LAST:event_wdrawalBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BalanceDashboard;
    private javax.swing.JPanel DepositDashboard;
    private javax.swing.JPanel FirstPage;
    private javax.swing.JLabel H;
    private javax.swing.JLabel H1;
    private javax.swing.JLabel H10;
    private javax.swing.JLabel H11;
    private javax.swing.JLabel H12;
    private javax.swing.JLabel H13;
    private javax.swing.JLabel H14;
    private javax.swing.JLabel H15;
    private javax.swing.JLabel H16;
    private javax.swing.JLabel H17;
    private javax.swing.JLabel H18;
    private javax.swing.JLabel H19;
    private javax.swing.JLabel H2;
    private javax.swing.JLabel H20;
    private javax.swing.JLabel H21;
    private javax.swing.JLabel H22;
    private javax.swing.JLabel H23;
    private javax.swing.JLabel H24;
    private javax.swing.JLabel H25;
    private javax.swing.JLabel H27;
    private javax.swing.JLabel H28;
    private javax.swing.JLabel H29;
    private javax.swing.JLabel H3;
    private javax.swing.JLabel H4;
    private javax.swing.JLabel H5;
    private javax.swing.JLabel H6;
    private javax.swing.JLabel H7;
    private javax.swing.JLabel H8;
    private javax.swing.JLabel H9;
    private javax.swing.JPanel ParentPanel;
    private javax.swing.JPanel TransactionHistoryDashboard;
    private javax.swing.JPanel WithdrawDashboard;
    private javax.swing.JLabel accounfullnamedp;
    private javax.swing.JLabel accountholdernamedisplaydiposit;
    private javax.swing.JTextField amounttodeposit;
    private javax.swing.JLabel balancedp;
    private javax.swing.JPanel balancepaneldp;
    private javax.swing.JLabel currentbalancedisplay;
    private javax.swing.JLabel currentbalancedisplaydiposit;
    private javax.swing.JButton depositbtn;
    private javax.swing.JLabel depositdp;
    private javax.swing.JPanel depositpaneldp;
    private javax.swing.JTextField enteramountwithdraw;
    private javax.swing.JPanel headerpanelbot3;
    private javax.swing.JPanel headerpanelbot4;
    private javax.swing.JPanel headerpanelbot5;
    private javax.swing.JPanel headerpanelbot6;
    private javax.swing.JPanel headerpanelbot7;
    private javax.swing.JPanel headerpanelbot8;
    private javax.swing.JPanel headersider3;
    private javax.swing.JPanel headersider4;
    private javax.swing.JPanel headersider5;
    private javax.swing.JPanel headersider6;
    private javax.swing.JPanel headersider7;
    private javax.swing.JPanel headersider8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel phonenumberdisplaydiposit;
    private javax.swing.JLabel phonenumberdp;
    private javax.swing.JLabel transactiondp;
    private javax.swing.JPanel transactionhistorypaneldp;
    private javax.swing.JButton wdrawalBtn;
    private javax.swing.JLabel withdrawaccountholdernamedp;
    private javax.swing.JLabel withdrawcurrentbalancedp;
    private javax.swing.JLabel withdrawdp;
    private javax.swing.JPanel withdrawpaneldp;
    private javax.swing.JLabel withdrawphonenumberdp;
    // End of variables declaration//GEN-END:variables
}
