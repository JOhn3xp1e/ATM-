
package mysystem;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import mysystem.database.DatabaseConnection;


public class LoginFrame extends javax.swing.JFrame {
    
    private Color bgcolor, fgcolor;

     private static class RoundBorder implements Border {
        private int radius;
        private Color color;

        public RoundBorder(int radius, Color color) {
            this.radius = radius;
            this.color = color;
        }

        @Override
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            g.setColor(color);
            g.drawRoundRect(x, y, width - 1, height - 1, radius, radius);
        }

        @Override
        public Insets getBorderInsets(Component c) {
            return new Insets(radius, radius, radius, radius);
        }

        @Override
        public boolean isBorderOpaque() {
            return true;
        }
    }
    public LoginFrame() {
        initComponents();
        
        try {
            DatabaseConnection.initializeDatabase(); // Initialize database on startup
            // Verify database connection and table existence
            try (Connection conn = DatabaseConnection.getConnection()) {
                if (!DatabaseConnection.doesUsersTableExist(conn)) {
                    JOptionPane.showMessageDialog(this, "Error: Users table is missing. Please restart the application.");
                    System.exit(1);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Failed to connect to database: " + e.getMessage());
            System.exit(1);
        }
        
        
       
       bgcolor = new Color (255,204,0);
       fgcolor = new Color (0,0,0);
       
       LOGINBTN.setBorderPainted(true);
       LOGINBTN.setBorder(new RoundBorder(30, Color.BLACK));
       signupBtn.setBorderPainted(true);
       signupBtn.setBorder(new RoundBorder(30, Color.BLACK));
 
        logindp.setVisible(false);
        sigindp.setVisible(false);
        tutorialdp.setVisible(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel21 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        loginpaneldb = new javax.swing.JPanel();
        logindp = new javax.swing.JLabel();
        loginDb = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        headerpanelbot = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        signinpaneldb = new javax.swing.JPanel();
        sigindp = new javax.swing.JLabel();
        signindb = new javax.swing.JLabel();
        headersider = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        turorialpaneldb = new javax.swing.JPanel();
        tutorialdp = new javax.swing.JLabel();
        turorialdb = new javax.swing.JLabel();
        ParentPanel = new javax.swing.JPanel();
        firstpagepanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        tutorialdashboard = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        signupdashboard = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        mainpanelsigin = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        fullnamesignup = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        phonenumbersignup = new javax.swing.JTextPane();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        agesignup = new javax.swing.JTextPane();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        addresssignup = new javax.swing.JTextPane();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        pinnumbersignup = new javax.swing.JTextPane();
        jLabel5 = new javax.swing.JLabel();
        signupBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        emailsignup = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        headerpanelbot3 = new javax.swing.JPanel();
        headerpanelbot4 = new javax.swing.JPanel();
        headersider3 = new javax.swing.JPanel();
        headersider4 = new javax.swing.JPanel();
        logindashboard = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        mainpanellogin = new javax.swing.JPanel();
        LOGINBTN = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        headerpanelbot1 = new javax.swing.JPanel();
        headerpanelbot2 = new javax.swing.JPanel();
        headersider1 = new javax.swing.JPanel();
        headersider2 = new javax.swing.JPanel();

        jLabel21.setText("jLabel21");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 204, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginpaneldb.setBackground(new java.awt.Color(255, 204, 0));
        loginpaneldb.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        loginpaneldb.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logindp.setBackground(new java.awt.Color(255, 255, 255));
        logindp.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        logindp.setForeground(new java.awt.Color(255, 255, 255));
        logindp.setText("________");
        loginpaneldb.add(logindp, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, -1, -1));

        loginDb.setBackground(new java.awt.Color(0, 0, 0));
        loginDb.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        loginDb.setText("                     Login");
        loginDb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginDb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginDbMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                loginDbMousePressed(evt);
            }
        });
        loginpaneldb.add(loginDb, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 100));

        jPanel2.add(loginpaneldb, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 440, 100));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 50)); // NOI18N
        jLabel1.setText("ATM");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, -1, -1));
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 60, -1));

        jLabel3.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jLabel3.setText("Fast. Simple. Secure");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));

        headerpanelbot.setBackground(new java.awt.Color(255, 255, 255));
        headerpanelbot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerpanelbotMousePressed(evt);
            }
        });

        javax.swing.GroupLayout headerpanelbotLayout = new javax.swing.GroupLayout(headerpanelbot);
        headerpanelbot.setLayout(headerpanelbotLayout);
        headerpanelbotLayout.setHorizontalGroup(
            headerpanelbotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );
        headerpanelbotLayout.setVerticalGroup(
            headerpanelbotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.add(headerpanelbot, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 290, 10));

        jPanel9.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 300, -1));

        signinpaneldb.setBackground(new java.awt.Color(255, 204, 0));
        signinpaneldb.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        signinpaneldb.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sigindp.setBackground(new java.awt.Color(255, 255, 255));
        sigindp.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        sigindp.setForeground(new java.awt.Color(255, 255, 255));
        sigindp.setText("__________");
        signinpaneldb.add(sigindp, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, -1));

        signindb.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        signindb.setText("                   Sign Up");
        signindb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signindb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signindbMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                signindbMousePressed(evt);
            }
        });
        signinpaneldb.add(signindb, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 438, 100));

        jPanel2.add(signinpaneldb, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 440, 100));

        headersider.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout headersiderLayout = new javax.swing.GroupLayout(headersider);
        headersider.setLayout(headersiderLayout);
        headersiderLayout.setHorizontalGroup(
            headersiderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 11, Short.MAX_VALUE)
        );
        headersiderLayout.setVerticalGroup(
            headersiderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        jPanel2.add(headersider, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, -1, 90));

        jPanel12.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 71, 10, 90));

        turorialpaneldb.setBackground(new java.awt.Color(255, 204, 0));
        turorialpaneldb.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        turorialpaneldb.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tutorialdp.setBackground(new java.awt.Color(255, 255, 255));
        tutorialdp.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        tutorialdp.setForeground(new java.awt.Color(255, 255, 255));
        tutorialdp.setText("_____________");
        turorialpaneldb.add(tutorialdp, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        turorialdb.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        turorialdb.setText("                 Learn More");
        turorialdb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        turorialdb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                turorialdbMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                turorialdbMousePressed(evt);
            }
        });
        turorialpaneldb.add(turorialdb, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 438, 110));

        jPanel2.add(turorialpaneldb, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 440, 110));

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 760));

        ParentPanel.setBackground(new java.awt.Color(255, 255, 255));
        ParentPanel.setLayout(new java.awt.CardLayout());

        firstpagepanel.setBackground(new java.awt.Color(255, 255, 255));
        firstpagepanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        firstpagepanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Serif", 1, 30)); // NOI18N
        jLabel4.setText("Easy Access with ATM!");
        firstpagepanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 100, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Screenshot_2025-05-27_211756-removebg-preview (1) (1).png"))); // NOI18N
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        firstpagepanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 230, 200));

        jLabel6.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel6.setText("Last Updated: May 27, 2025");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(395, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        firstpagepanel.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 60));

        ParentPanel.add(firstpagepanel, "card5");

        tutorialdashboard.setBackground(new java.awt.Color(255, 255, 255));
        tutorialdashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 51, 0));
        jLabel16.setText("HOW TO SIGN UP:");
        tutorialdashboard.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 290, 50));
        tutorialdashboard.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 180, 20));

        jLabel22.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabel22.setText("Full name: Enter your complete legal name (First Name, Middle Name, Last Name.) ");
        tutorialdashboard.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel23.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel23.setText("Full Name:");
        tutorialdashboard.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, 20));
        tutorialdashboard.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 180, 20));

        jLabel24.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel24.setText("Address:");
        tutorialdashboard.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));
        tutorialdashboard.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(153, 0, 0));
        jLabel25.setText("Dont know how to create your own account? In this page we will help you how ");
        tutorialdashboard.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 670, 20));

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(153, 0, 0));
        jLabel26.setText("to sign up and log in to your account.");
        tutorialdashboard.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel27.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabel27.setText("Address: Provide your full residential address, street, city, province, and postal code.");
        tutorialdashboard.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        jLabel28.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel28.setText("Age:");
        tutorialdashboard.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));
        tutorialdashboard.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 180, 20));

        jLabel29.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabel29.setText("Age: Enter your current age.");
        tutorialdashboard.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        jLabel30.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel30.setText("Phone Number:");
        tutorialdashboard.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, -1));

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        tutorialdashboard.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 180, 20));

        jLabel31.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabel31.setText("Phone Number: Provide your active mobile number for account verification and transaction.");
        tutorialdashboard.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, -1, -1));

        jLabel32.setText("Pin number:");
        tutorialdashboard.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, -1, -1));

        ParentPanel.add(tutorialdashboard, "card4");

        signupdashboard.setBackground(new java.awt.Color(255, 255, 255));
        signupdashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 153, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 146, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 16, -1, -1));

        signupdashboard.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 60));

        mainpanelsigin.setBackground(new java.awt.Color(255, 255, 255));
        mainpanelsigin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 3));
        mainpanelsigin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        mainpanelsigin.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 200, -1, -1));
        mainpanelsigin.add(fullnamesignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 260, 35));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel11.setText("Full Name");
        mainpanelsigin.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jScrollPane2.setViewportView(phonenumbersignup);

        mainpanelsigin.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 260, 37));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel12.setText("Phone Number");
        mainpanelsigin.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jScrollPane3.setViewportView(agesignup);

        mainpanelsigin.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 242, 35));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel13.setText("Age");
        mainpanelsigin.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, -1, -1));

        jScrollPane5.setViewportView(addresssignup);

        mainpanelsigin.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 260, 37));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel15.setText("Address");
        mainpanelsigin.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jScrollPane6.setViewportView(pinnumbersignup);

        mainpanelsigin.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 240, 37));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel5.setText("Pin Number");
        mainpanelsigin.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, -1, -1));

        signupBtn.setBackground(new java.awt.Color(255, 255, 255));
        signupBtn.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        signupBtn.setText("Sign up");
        signupBtn.setBorderPainted(false);
        signupBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signupBtn.setFocusPainted(false);
        signupBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupBtnActionPerformed(evt);
            }
        });
        mainpanelsigin.add(signupBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 530, 60));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel8.setText("Email");
        mainpanelsigin.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, -1, -1));

        emailsignup.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        mainpanelsigin.add(emailsignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 240, 40));

        signupdashboard.add(mainpanelsigin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 590, 460));

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

        signupdashboard.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 340, 140));

        ParentPanel.add(signupdashboard, "card3");

        logindashboard.setBackground(new java.awt.Color(255, 255, 255));
        logindashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setAutoscrolls(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        logindashboard.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 60));

        mainpanellogin.setBackground(new java.awt.Color(255, 255, 255));
        mainpanellogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        mainpanellogin.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        mainpanellogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LOGINBTN.setBackground(new java.awt.Color(255, 255, 255));
        LOGINBTN.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        LOGINBTN.setText("Login");
        LOGINBTN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        LOGINBTN.setBorderPainted(false);
        LOGINBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LOGINBTN.setFocusPainted(false);
        LOGINBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGINBTNActionPerformed(evt);
            }
        });
        mainpanellogin.add(LOGINBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 380, 60));

        jTextField1.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        mainpanellogin.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 380, 40));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("Pin Number");
        mainpanellogin.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, 20));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setText("Phone Number");
        mainpanellogin.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 140, -1));

        jTextField2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        mainpanellogin.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 380, 40));

        logindashboard.add(mainpanellogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 500, 390));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("SansSerif", 1, 50)); // NOI18N
        jLabel17.setText("ATM");
        jPanel10.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        jLabel18.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jLabel18.setText("Fast. Simple. Secure");
        jPanel10.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, 30));

        jPanel11.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel10.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 300, -1));

        jPanel13.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        jPanel10.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 10, 90));

        headerpanelbot1.setBackground(new java.awt.Color(255, 255, 255));
        headerpanelbot1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerpanelbot1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout headerpanelbot1Layout = new javax.swing.GroupLayout(headerpanelbot1);
        headerpanelbot1.setLayout(headerpanelbot1Layout);
        headerpanelbot1Layout.setHorizontalGroup(
            headerpanelbot1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );
        headerpanelbot1Layout.setVerticalGroup(
            headerpanelbot1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel10.add(headerpanelbot1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 290, 10));

        headerpanelbot2.setBackground(new java.awt.Color(255, 204, 0));
        headerpanelbot2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        headerpanelbot2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerpanelbot2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout headerpanelbot2Layout = new javax.swing.GroupLayout(headerpanelbot2);
        headerpanelbot2.setLayout(headerpanelbot2Layout);
        headerpanelbot2Layout.setHorizontalGroup(
            headerpanelbot2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );
        headerpanelbot2Layout.setVerticalGroup(
            headerpanelbot2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel10.add(headerpanelbot2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        headersider1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout headersider1Layout = new javax.swing.GroupLayout(headersider1);
        headersider1.setLayout(headersider1Layout);
        headersider1Layout.setHorizontalGroup(
            headersider1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 11, Short.MAX_VALUE)
        );
        headersider1Layout.setVerticalGroup(
            headersider1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        jPanel10.add(headersider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, -1, 90));

        headersider2.setBackground(new java.awt.Color(255, 204, 0));
        headersider2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout headersider2Layout = new javax.swing.GroupLayout(headersider2);
        headersider2.setLayout(headersider2Layout);
        headersider2Layout.setHorizontalGroup(
            headersider2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        headersider2Layout.setVerticalGroup(
            headersider2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 98, Short.MAX_VALUE)
        );

        jPanel10.add(headersider2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 22, 10, 100));

        logindashboard.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 340, 140));

        ParentPanel.add(logindashboard, "card2");

        jPanel4.add(ParentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 640, 760));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 757, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginDbMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginDbMousePressed
        
        loginpaneldb.setBackground(Color.BLACK);
        loginDb.setForeground(Color.WHITE);
        signinpaneldb.setBackground(bgcolor);
        signindb.setForeground(fgcolor);
        turorialpaneldb.setBackground(bgcolor);
        turorialdb.setForeground(fgcolor);
         logindp.setVisible(true);
        sigindp.setVisible(false);
        tutorialdp.setVisible(false);
        
    }//GEN-LAST:event_loginDbMousePressed

    private void signindbMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signindbMousePressed
        signinpaneldb.setBackground(Color.BLACK);
        signindb.setForeground(Color.WHITE);
        loginpaneldb.setBackground(bgcolor);
        loginDb.setForeground(fgcolor);
        turorialpaneldb.setBackground(bgcolor);
        turorialdb.setForeground(fgcolor);
         logindp.setVisible(false);
        sigindp.setVisible(true);
        tutorialdp.setVisible(false);      
        
    }//GEN-LAST:event_signindbMousePressed

    private void turorialdbMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_turorialdbMousePressed
        
        signinpaneldb.setBackground(bgcolor);
        signindb.setForeground(fgcolor);
        loginpaneldb.setBackground(bgcolor);
        loginDb.setForeground(fgcolor);
        turorialpaneldb.setBackground(Color.BLACK);
        turorialdb.setForeground(Color.WHITE);
         logindp.setVisible(false);
        sigindp.setVisible(false);
        tutorialdp.setVisible(true);
    }//GEN-LAST:event_turorialdbMousePressed

    private void loginDbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginDbMouseClicked
        ParentPanel.removeAll();
        ParentPanel.add(logindashboard);
        ParentPanel.repaint();
        ParentPanel.revalidate();
    }//GEN-LAST:event_loginDbMouseClicked

    private void signindbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signindbMouseClicked
        ParentPanel.removeAll();
        ParentPanel.add(signupdashboard);
        ParentPanel.repaint();
        ParentPanel.revalidate();
    }//GEN-LAST:event_signindbMouseClicked

    private void turorialdbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_turorialdbMouseClicked
        ParentPanel.removeAll();
        ParentPanel.add(tutorialdashboard);
        ParentPanel.repaint();
        ParentPanel.revalidate();
    }//GEN-LAST:event_turorialdbMouseClicked

    private void headerpanelbotMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerpanelbotMousePressed

    }//GEN-LAST:event_headerpanelbotMousePressed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
 
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void headerpanelbot1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerpanelbot1MousePressed

    }//GEN-LAST:event_headerpanelbot1MousePressed

    private void headerpanelbot2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerpanelbot2MousePressed

    }//GEN-LAST:event_headerpanelbot2MousePressed

    private void headerpanelbot3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerpanelbot3MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_headerpanelbot3MousePressed

    private void headerpanelbot4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerpanelbot4MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_headerpanelbot4MousePressed

    private void LOGINBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGINBTNActionPerformed
        String phoneNumber = jTextField1.getText().trim();
    String pin = jTextField2.getText().trim();

  
    if (phoneNumber.isEmpty() || pin.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill in all fields.");
        return;
    }

   
    try (Connection conn = DatabaseConnection.getConnection();
         PreparedStatement pstmt = conn.prepareStatement(
             "SELECT full_name, phone_number, balance FROM Users WHERE phone_number = ? AND pin = ?")) {
        pstmt.setString(1, phoneNumber);
        pstmt.setString(2, pin);
        ResultSet rs = pstmt.executeQuery();

        if (rs.next()) {
            String fullName = rs.getString("full_name");
            String retrievedPhoneNumber = rs.getString("phone_number");
            double balance = rs.getDouble("balance"); // Assuming balance is a DOUBLE in the database

            JOptionPane.showMessageDialog(this, "Login successful! Welcome, " + fullName);

        
            MainMenu mainMenu = new MainMenu(fullName, retrievedPhoneNumber, balance);
            mainMenu.setVisible(true);
            this.dispose(); 

           
            jTextField1.setText("");
            jTextField2.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Invalid phone number or PIN.");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage());
    }
    }//GEN-LAST:event_LOGINBTNActionPerformed

    private void signupBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupBtnActionPerformed
    String fullName = fullnamesignup.getText().trim();
        String email = emailsignup.getText().trim();
        String ageText = agesignup.getText().trim();
        String address = addresssignup.getText().trim();
        String pin = pinnumbersignup.getText().trim();
        String phoneNumber = phonenumbersignup.getText().trim();

       
        if (fullName.isEmpty() || email.isEmpty() || ageText.isEmpty() ||
            address.isEmpty() || pin.isEmpty() || phoneNumber.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all fields.");
            return;
        }

        
        if (fullName.length() < 8) {
            JOptionPane.showMessageDialog(this, "Full Name must be at least 8 characters long.");
            return;
        }

       
        if (email.length() < 8 || !email.contains("@") || !email.contains(".")) {
            JOptionPane.showMessageDialog(this, "Email must be valid and at least 8 characters long.");
            return;
        }

        
        try {
            int age = Integer.parseInt(ageText);
            if (age < 18) {
                JOptionPane.showMessageDialog(this, "Age must be 18 or above (not a minor).");
                return;
            }
            if (age > 60) {
                JOptionPane.showMessageDialog(this, "Age must be 60 or below (not a senior).");
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Age must be a valid number.");
            return;
        }

        
        if (pin.length() != 4 || !pin.matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "PIN must be a 4-digit number.");
            return;
        }

  
        if (!phoneNumber.matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "Phone Number must contain only digits.");
            return;
        }
        if (phoneNumber.length() != 11) {
            JOptionPane.showMessageDialog(this, "Phone Number must be exactly 11 digits.");
            return;
        }
        if (!phoneNumber.startsWith("09")) {
            JOptionPane.showMessageDialog(this, "Phone Number must start with '09'.");
            return;
        }

       
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement checkStmt = conn.prepareStatement(
                 "SELECT COUNT(*) FROM Users WHERE phone_number = ?")) {
            checkStmt.setString(1, phoneNumber);
            ResultSet rs = checkStmt.executeQuery();
            if (rs.next() && rs.getInt(1) > 0) {
                JOptionPane.showMessageDialog(this, "Error: Phone number already exists.");
                return;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Database error during phone number check: " + e.getMessage());
            return;
        }

        
        int option = JOptionPane.showConfirmDialog(this,
            "Please remember your PIN (" + pin + ") and Phone Number (" + phoneNumber + ").\nDo you want to proceed?",
            "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

        if (option == JOptionPane.YES_OPTION) {
           
            try (Connection conn = DatabaseConnection.getConnection();
                 PreparedStatement pstmt = conn.prepareStatement(
                     "INSERT INTO Users (address, full_name, email, age, pin, phone_number) VALUES (?, ?, ?, ?, ?, ?)")) {
                pstmt.setString(1, address);
                pstmt.setString(2, fullName);
                pstmt.setString(3, email);
                pstmt.setInt(4, Integer.parseInt(ageText));
                pstmt.setString(5, pin);
                pstmt.setString(6, phoneNumber);
                pstmt.executeUpdate();
                JOptionPane.showMessageDialog(this, "Signup successful! Please login.");
             
                ParentPanel.removeAll();
                ParentPanel.add(logindashboard);
                ParentPanel.repaint();
                ParentPanel.revalidate();
            } catch (SQLException e) {
                if (e.getErrorCode() == 19) { // SQLite constraint violation (e.g., UNIQUE)
                    JOptionPane.showMessageDialog(this, "Error: Phone number already exists.");
                } else {
                    JOptionPane.showMessageDialog(this, "Database error during signup: " + e.getMessage());
                }
            }
        }
    }//GEN-LAST:event_signupBtnActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LOGINBTN;
    private javax.swing.JPanel ParentPanel;
    private javax.swing.JTextPane addresssignup;
    private javax.swing.JTextPane agesignup;
    private javax.swing.JTextField emailsignup;
    private javax.swing.JPanel firstpagepanel;
    private javax.swing.JTextField fullnamesignup;
    private javax.swing.JPanel headerpanelbot;
    private javax.swing.JPanel headerpanelbot1;
    private javax.swing.JPanel headerpanelbot2;
    private javax.swing.JPanel headerpanelbot3;
    private javax.swing.JPanel headerpanelbot4;
    private javax.swing.JPanel headersider;
    private javax.swing.JPanel headersider1;
    private javax.swing.JPanel headersider2;
    private javax.swing.JPanel headersider3;
    private javax.swing.JPanel headersider4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel loginDb;
    private javax.swing.JPanel logindashboard;
    private javax.swing.JLabel logindp;
    private javax.swing.JPanel loginpaneldb;
    private javax.swing.JPanel mainpanellogin;
    private javax.swing.JPanel mainpanelsigin;
    private javax.swing.JTextPane phonenumbersignup;
    private javax.swing.JTextPane pinnumbersignup;
    private javax.swing.JLabel sigindp;
    private javax.swing.JLabel signindb;
    private javax.swing.JPanel signinpaneldb;
    private javax.swing.JButton signupBtn;
    private javax.swing.JPanel signupdashboard;
    private javax.swing.JLabel turorialdb;
    private javax.swing.JPanel turorialpaneldb;
    private javax.swing.JPanel tutorialdashboard;
    private javax.swing.JLabel tutorialdp;
    // End of variables declaration//GEN-END:variables
}
