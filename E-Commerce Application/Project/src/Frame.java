import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.*;

public class Frame extends javax.swing.JFrame {
    public Frame() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel40 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jTextField12 = new javax.swing.JTextField();
        jButton12 = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jLabel52 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton16 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jPanel11 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel22 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jPasswordField3 = new javax.swing.JPasswordField();
        jLabel24 = new javax.swing.JLabel();
        jPasswordField4 = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jPasswordField5 = new javax.swing.JPasswordField();
        jPasswordField6 = new javax.swing.JPasswordField();
        jButton6 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jPanel13 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel34 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel35 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jTextField33 = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox<>();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jLabel49 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Buyer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 110, 40));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Seller");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, 110, 40));

        jLabel40.setBackground(new java.awt.Color(51, 51, 51));
        jLabel40.setForeground(new java.awt.Color(255, 0, 0));
        jLabel40.setText("                                                                                     @2021-2025 Best Buy.in");
        jPanel1.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 690, -1));

        jLabel39.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Downloads\\Project\\Project Pic\\N0.jfif")); // NOI18N
        jPanel1.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 390, 160));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("      ABOUT US !");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 150, 30));

        jLabel41.setText("Best Buy is the only website to overcome all problems related to online shopping");
        jPanel1.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 550, -1));

        jLabel42.setText("Our verified Data helps you to shop easily and safely");
        jPanel1.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 340, -1));

        jLabel47.setForeground(new java.awt.Color(255, 0, 0));
        jLabel47.setText("                                                                                         All Rights Reserved.");
        jPanel1.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 700, -1));

        jTabbedPane1.addTab("Welcome", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("User Name");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 100, 20));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Password");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 100, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 200, -1));

        jButton3.setBackground(new java.awt.Color(255, 0, 0));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setText("Log In");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 110, 30));

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("New User");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 120, -1));
        jPanel2.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 200, -1));

        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("*Invalid Username/Password*");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, -1, -1));

        jLabel45.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Downloads\\Project\\Project Pic\\N1.jfif")); // NOI18N
        jPanel2.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 230, 240));

        jLabel43.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel43.setText("Buyer Login");
        jPanel2.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        jTabbedPane1.addTab("Buyer", jPanel2);

        jPanel4.setBackground(new java.awt.Color(255, 255, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("User Name ");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 100, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Password");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 90, -1));

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel4.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 190, -1));

        jButton9.setBackground(new java.awt.Color(255, 0, 0));
        jButton9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton9.setText("Log In");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 100, 30));

        jButton11.setBackground(new java.awt.Color(0, 0, 0));
        jButton11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("New User");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 120, -1));
        jPanel4.add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 190, -1));

        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("*Invalid Username/Password*");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, -1, -1));
        jPanel4.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, -1, 210));

        jLabel44.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Downloads\\Project\\Project Pic\\N2.jfif")); // NOI18N
        jPanel4.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 260, 230));

        jLabel51.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel51.setText("Seller Login");
        jPanel4.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        jTabbedPane1.addTab("Seller", jPanel4);

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));
        jPanel5.setForeground(new java.awt.Color(0, 255, 255));

        jButton12.setText("Search");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "MRP Price", "Expiry", "Seller Name", "Selling Price", "Contact Number", "Seller Username"
            }
        ));
        jScrollPane9.setViewportView(jTable2);

        jButton13.setText("Feed Back");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setText("Log Out");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jLabel52.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel52.setText("Homepage");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(303, 303, 303)
                        .addComponent(jLabel52)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel52)
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField12))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                    .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Home B", jPanel5);

        jPanel7.setBackground(new java.awt.Color(204, 204, 255));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel15.setText("Homepage ");

        jButton7.setText("Add Product");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("View All Products");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "MRP Price", "My Price", "Expiry time ", "Type"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton16.setText("Log Out");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(299, 299, 299)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(220, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        jTabbedPane1.addTab("Home S", jPanel7);

        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(153, 255, 255));
        jPanel11.setMaximumSize(new java.awt.Dimension(327, 327));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel19.setText("Name");
        jPanel11.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 90, 21));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel20.setText("Shop Name");
        jPanel11.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 90, 17));

        jTextField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField16ActionPerformed(evt);
            }
        });
        jPanel11.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 190, -1));

        jTextField17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField17ActionPerformed(evt);
            }
        });
        jPanel11.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 190, -1));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel21.setText("Address");
        jPanel11.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 90, -1));

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        jPanel11.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 190, -1));

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel22.setText("User Name");
        jPanel11.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 90, 20));

        jTextField18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField18ActionPerformed(evt);
            }
        });
        jPanel11.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 190, -1));

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel23.setText("Password");
        jPanel11.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 90, -1));

        jPasswordField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField3ActionPerformed(evt);
            }
        });
        jPanel11.add(jPasswordField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 190, -1));

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel24.setText("Confirm Password");
        jPanel11.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, -1, 20));

        jPasswordField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField4ActionPerformed(evt);
            }
        });
        jPanel11.add(jPasswordField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, 190, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Contact Number");
        jPanel11.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, 130, -1));
        jPanel11.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, 190, -1));

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton5.setText("Submit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(553, 280, 100, 50));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText(" SIGN UP");
        jPanel11.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 120, 42));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("Shop Type");
        jPanel11.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Grocery", "Sports", "Bakery", "Dress", " " }));
        jPanel11.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 480, 190, -1));

        jLabel13.setForeground(new java.awt.Color(255, 51, 51));
        jLabel13.setText("*Username Already Taken*");
        jPanel11.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, -1, 20));
        jPanel11.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 540, -1, -1));

        jLabel54.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Downloads\\Project\\Project Pic\\Sigin.jpeg")); // NOI18N
        jPanel11.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 760, 570));

        jScrollPane5.setViewportView(jPanel11);

        jPanel10.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 750, 480));

        jTabbedPane1.addTab("B Sign In", jPanel10);

        jPanel8.setBackground(new java.awt.Color(153, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Name");
        jPanel8.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 75, 91, -1));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel16.setText("Address");
        jPanel8.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 115, 91, -1));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel17.setText("User Name");
        jPanel8.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 219, 91, -1));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel18.setText("Password");
        jPanel8.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 301, 91, -1));

        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel25.setText("Confirm Password");
        jPanel8.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 361, 135, -1));

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel26.setText("Contact Number");
        jPanel8.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 415, 135, -1));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane4.setViewportView(jTextArea2);

        jPanel8.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 115, 169, -1));

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jPanel8.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 74, 169, -1));
        jPanel8.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 218, 224, -1));

        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        jPanel8.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 414, 169, -1));

        jPasswordField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField5ActionPerformed(evt);
            }
        });
        jPanel8.add(jPasswordField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 360, 169, -1));

        jPasswordField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField6ActionPerformed(evt);
            }
        });
        jPanel8.add(jPasswordField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 300, 224, -1));

        jButton6.setText("Submit");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 244, 104, 42));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setText("        Sign Up");
        jPanel8.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 11, 134, -1));

        jLabel14.setForeground(new java.awt.Color(255, 0, 0));
        jLabel14.setText("*Username Already Taken*");
        jPanel8.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 244, -1, -1));

        jLabel55.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Downloads\\Project\\Project Pic\\Sigin.jpeg")); // NOI18N
        jPanel8.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -16, 760, 520));

        jScrollPane2.setViewportView(jPanel8);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 742, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("S Sign IN", jPanel6);

        jPanel13.setBackground(new java.awt.Color(51, 255, 204));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Product Name");
        jPanel13.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 78, -1));

        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Ingredians");
        jPanel13.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 78, -1));

        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("MRP");
        jPanel13.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 78, -1));

        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Your Price");
        jPanel13.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 78, -1));

        jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("About");
        jPanel13.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 78, -1));

        jLabel32.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Exipiry");
        jPanel13.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 40, -1));

        jLabel33.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Product Type");
        jPanel13.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 78, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane7.setViewportView(jTextArea1);

        jPanel13.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, -1, 70));

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jScrollPane8.setViewportView(jTextArea4);

        jPanel13.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, -1, -1));
        jPanel13.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 180, -1));
        jPanel13.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 180, -1));
        jPanel13.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 180, -1));
        jPanel13.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 180, -1));

        jButton10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton10.setText("Add Product");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sports", "Grocery", "Bakery", "Stationary", "Others" }));
        jPanel13.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 180, -1));

        jLabel34.setForeground(new java.awt.Color(255, 0, 0));
        jLabel34.setText("   *Enter All Details*");
        jPanel13.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 113, 20));

        jLabel48.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("Product");
        jPanel13.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 90, -1));

        jLabel50.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Downloads\\Project\\Project Pic\\NP.jpeg")); // NOI18N
        jPanel13.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 480));

        jScrollPane6.setViewportView(jPanel13);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Product", jPanel9);

        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Person", "Rating", "Comment"
            }
        ));
        jScrollPane11.setViewportView(jTable3);

        jPanel14.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 301, 740, 160));

        jLabel35.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("    FeedBack & Comments");
        jPanel14.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 290, 23));

        jButton15.setText("Submit");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 140, -1));

        jLabel36.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("User Name");
        jPanel14.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 80, 83, -1));

        jLabel37.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Rating");
        jPanel14.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 130, 83, -1));

        jLabel38.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Comments");
        jPanel14.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 190, 83, -1));
        jPanel14.add(jTextField33, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 77, 180, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "4", "3", "2", "1" }));
        jPanel14.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 130, 180, -1));

        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jScrollPane12.setViewportView(jTextArea5);

        jPanel14.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 182, 180, -1));

        jButton17.setText("View Comments");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 140, -1));

        jButton18.setText("Exit");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, 140, -1));

        jLabel49.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Downloads\\Project\\Project Pic\\AnimeX_564835.jpeg")); // NOI18N
        jPanel14.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 300));

        jScrollPane10.setViewportView(jPanel14);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("FeedBack", jPanel3);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -41, -1, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static String loggedperson = null; 
    /*Seller Login*/
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        String Username = jTextField6.getText();
        String Password = jPasswordField2.getText();
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Sujith");
            Statement stmt = conn.createStatement();
            try
            {
		ResultSet value = stmt.executeQuery("select username,password from Seller where username = '"+ Username + "' and password = '" + Password + "'");
                while(value.next())
                {
                    if(Username.equals(value.getString("username")) && Password.equals(value.getString("password")))
                    {
                        stmt.close();
                        conn.close();
                        jTextField6.setText("");
                        jPasswordField2.setText("");
                        loggedperson = Username;
                        jTabbedPane1.setSelectedIndex(4);
                    }
                }
                stmt.close();
                conn.close();
                jLabel11.setVisible(true);
            }
            catch(SQLException sqle)
            {
		jLabel11.setVisible(true);
            }
        }
	catch(Exception sqle)
	{
            JOptionPane.showMessageDialog(null,"Cannot connect to the database","Warning",JOptionPane.INFORMATION_MESSAGE);
	}        
    }//GEN-LAST:event_jButton9ActionPerformed
    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        
    }//GEN-LAST:event_jTextField6ActionPerformed
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jLabel12.setVisible(false);
        jTabbedPane1.setSelectedIndex(1); 
        
    }//GEN-LAST:event_jButton1ActionPerformed
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jLabel11.setVisible(false);
        jTabbedPane1.setSelectedIndex(2);  
    }//GEN-LAST:event_jButton2ActionPerformed
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jLabel13.setVisible(false);
        jTabbedPane1.setSelectedIndex(5);        
    }//GEN-LAST:event_jButton4ActionPerformed
    /*Buyer Login*/
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String Username = jTextField1.getText();
        String Password = jPasswordField1.getText();
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Sujith");
            Statement stmt = conn.createStatement();
            try
            {
		ResultSet value = stmt.executeQuery("select username,password from Buyer where username = '"+ Username + "' and password = '" + Password + "'");
                while(value.next())
                {
                    if(Username.equals(value.getString("username")) && Password.equals(value.getString("password")))
                    {
                        stmt.close();
                        conn.close();
                        loggedperson = Username;
                        jTextField1.setText("");
                        jPasswordField1.setText("");
                        jTabbedPane1.setSelectedIndex(3);
                    }    
                }
                stmt.close();
                conn.close();
                jLabel12.setVisible(true);
            }
            catch(SQLException sqle)
            {
                jLabel12.setVisible(true);
            }
        }
	catch(Exception sqle)
	{
            JOptionPane.showMessageDialog(null,"Cannot connect to the database","Warning",JOptionPane.INFORMATION_MESSAGE);
	}        
    }//GEN-LAST:event_jButton3ActionPerformed
    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        jLabel14.setVisible(false);
        jTabbedPane1.setSelectedIndex(6);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        
    }//GEN-LAST:event_jTextField1ActionPerformed
    private void jTextField18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField18ActionPerformed
        
    }//GEN-LAST:event_jTextField18ActionPerformed
    private void jPasswordField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField3ActionPerformed
        
    }//GEN-LAST:event_jPasswordField3ActionPerformed
    private void jPasswordField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField4ActionPerformed
        
    }//GEN-LAST:event_jPasswordField4ActionPerformed
    private void jTextField17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField17ActionPerformed
        
    }//GEN-LAST:event_jTextField17ActionPerformed
    private void jTextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField16ActionPerformed
        
    }//GEN-LAST:event_jTextField16ActionPerformed
    /*Buyer Sign in*/
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String name = jTextField16.getText();
        String shopname = jTextField17.getText();
        String Address = jTextArea3.getText();
        String Username = jTextField18.getText();
        String Password = jPasswordField3.getText();
        String ConfirmPassword = jPasswordField4.getText();
        if(!Password.equals(ConfirmPassword))
        {
            JOptionPane.showMessageDialog(null,"Password does not match","Warning",JOptionPane.INFORMATION_MESSAGE);
        }
        String shoptype = jComboBox1.getSelectedItem().toString();
        String number = jTextField2.getText();
        long Contactnumber = Long.parseLong(number);
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Sujith");
            PreparedStatement pStmt = conn.prepareStatement("insert into Buyer values(?,?,?,?,?,?,?)");
            try
            {
		pStmt.setString(1, name);
                pStmt.setString(2, Address);
                pStmt.setString(3, shopname);
                pStmt.setString(4, Username);
                pStmt.setString(5, Password);
                pStmt.setLong(6, Contactnumber);
                pStmt.setString(7,shoptype);
                pStmt.executeUpdate();
                jLabel12.setVisible(false);
                jTextField16.setText("");
                jTextField17.setText("");
                jTextArea3.setText("");
                jTextField18.setText("");
                jPasswordField3.setText("");
                jPasswordField4.setText("");
                jTextField2.setText("");
                jTabbedPane1.setSelectedIndex(1);
            }
            catch(SQLException sqle)
            {
		jLabel13.setVisible(true);
            }
            pStmt.close();
            conn.close();
        }
	catch(Exception sqle)
	{
            JOptionPane.showMessageDialog(null,"Cannot connect to the database","Warning",JOptionPane.INFORMATION_MESSAGE);
	}
    }//GEN-LAST:event_jButton5ActionPerformed
    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        
    }//GEN-LAST:event_jTextField10ActionPerformed
    private void jPasswordField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField5ActionPerformed
        
    }//GEN-LAST:event_jPasswordField5ActionPerformed
    private void jPasswordField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField6ActionPerformed
        
    }//GEN-LAST:event_jPasswordField6ActionPerformed
    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        
    }//GEN-LAST:event_jTextField7ActionPerformed
    /*Seller Sign in*/
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String name = jTextField7.getText();
        String Address = jTextArea2.getText();
        String Username = jTextField8.getText();
        String Password = jPasswordField6.getText();
        String ConfirmPassword = jPasswordField5.getText();
        String number = jTextField10.getText();
        long Contactnumber = Long.parseLong(number);
        if(!Password.equals(ConfirmPassword))
        {
            JOptionPane.showMessageDialog(null,"Password does not match","Warning",JOptionPane.INFORMATION_MESSAGE);
        }
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Sujith");
            PreparedStatement pStmt = conn.prepareStatement("insert into Seller values(?,?,?,?,?)");
            try
            {
		pStmt.setString(1, name);
                pStmt.setString(2, Address);
                pStmt.setString(3, Username);
                pStmt.setString(4, Password);
                pStmt.setLong(5, Contactnumber);
                pStmt.executeUpdate();
                jLabel11.setVisible(false);
                jTextField7.setText("");
                jTextArea2.setText("");
                jTextField8.setText("");
                jPasswordField6.setText("");
                jPasswordField5.setText("");
                jTextField10.setText("");
                jTabbedPane1.setSelectedIndex(2);
            }
            catch(Exception sqle)
            {
		jLabel14.setVisible(true);
            }
            pStmt.close();
            conn.close();
        }
	catch(Exception sqle)
	{
            JOptionPane.showMessageDialog(null,"Cannot connect to the database","Warning",JOptionPane.INFORMATION_MESSAGE);
	}     
    }//GEN-LAST:event_jButton6ActionPerformed
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jLabel34.setVisible(false);
        jTabbedPane1.setSelectedIndex(7);
    }//GEN-LAST:event_jButton7ActionPerformed
    /*view seller products details*/
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Sujith");
            Statement stmt = conn.createStatement();
            try
            {
		ResultSet value = stmt.executeQuery("select ProductName,MRP,price,BestBefore,Type from Product where Username = '"+ loggedperson + "'");
                DefaultTableModel dm = (DefaultTableModel)jTable1.getModel();
                dm.getDataVector().removeAllElements();
                revalidate();
                while(value.next())
                {
                    String ProductName = value.getString("ProductName");
                    String MRP = String.valueOf(value.getInt("MRP"));
                    String price = String.valueOf(value.getInt("price"));
                    String expiry = String.valueOf(value.getInt("Bestbefore"));
                    String Type = value.getString("Type");
                    String tbData[] = {ProductName,MRP,price,expiry,Type};
                    DefaultTableModel tb1Model = (DefaultTableModel)jTable1.getModel();
                    tb1Model.addRow(tbData);
                }
                stmt.close();
                conn.close();
            }
            catch(SQLException sqle)
            {
		JOptionPane.showMessageDialog(null,"Cannot Retain Values","Warning",JOptionPane.INFORMATION_MESSAGE);
            }
        }
	catch(Exception sqle)
	{
            JOptionPane.showMessageDialog(null,"Cannot connect to the database","Warning",JOptionPane.INFORMATION_MESSAGE);
	}
    }//GEN-LAST:event_jButton8ActionPerformed
    /*Product inserting tab*/
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        String Productname = jTextField3.getText();
        String Ingredians = jTextArea1.getText();
        String ProductType = jComboBox2.getSelectedItem().toString();
        String About = jTextArea4.getText();
        String number = jTextField4.getText();
        long MRP = Long.parseLong(number);
        number = jTextField5.getText();
        long Price = Long.parseLong(number);
        number = jTextField9.getText();
        int expiry = Integer.parseInt(number);
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Sujith");
            PreparedStatement pStmt = conn.prepareStatement("insert into Product values(?,?,?,?,?,?,?,?)");
            try
            {
		pStmt.setString(1, loggedperson);
                pStmt.setString(2, Productname);
                pStmt.setString(3, Ingredians);
                pStmt.setString(4, About);
                pStmt.setLong(5, MRP);
                pStmt.setLong(6, Price);
                pStmt.setInt(7, expiry);
                pStmt.setString(8, ProductType);
                pStmt.executeUpdate();
                jTextField3.setText("");
                jTextArea1.setText("");
                jTextArea4.setText("");
                jTextField4.setText("");
                jTextField5.setText("");
                jTextField9.setText("");
                jTabbedPane1.setSelectedIndex(4);
            }
            catch(Exception sqle)
            {
		jLabel34.setVisible(true);
            }
            pStmt.close();
            conn.close();
        }
	catch(Exception sqle)
	{
            JOptionPane.showMessageDialog(null,"Cannot connect to the database","Warning",JOptionPane.INFORMATION_MESSAGE);
	}        
    }//GEN-LAST:event_jButton10ActionPerformed
    /*Buyer Search Panel*/
    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        String Product = jTextField12.getText();
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Sujith");
            Statement stmt = conn.createStatement();
            try
            {
                String Query = "select name,contactnumber,seller.username as username,productname,price,mrp,bestbefore from seller,product where seller.username=product.username and productname='" + Product + "'";
		ResultSet value = stmt.executeQuery(Query);
                DefaultTableModel dm = (DefaultTableModel)jTable2.getModel();
                dm.getDataVector().removeAllElements();
                revalidate();
                while(value.next())
                {
                    String name = value.getString("name");
                    String contactNumber = String.valueOf(value.getLong("contactnumber"));
                    String username = value.getString("username");
                    String ProductName = value.getString("productname");
                    String MRP = String.valueOf(value.getInt("mrp"));
                    String price = String.valueOf(value.getInt("price"));
                    String expiry = String.valueOf(value.getInt("bestbefore"));
                    String tbData[] = {ProductName,MRP,expiry,name,price,contactNumber,username};
                    DefaultTableModel tb1Model = (DefaultTableModel)jTable2.getModel();
                    tb1Model.addRow(tbData);
                }
                stmt.close();
                conn.close();
            }
            catch(SQLException sqle)
            {
		JOptionPane.showMessageDialog(null,"Error Msg","Warning",JOptionPane.INFORMATION_MESSAGE);
            }
        }
	catch(Exception sqle)
	{
            JOptionPane.showMessageDialog(null,"Cannot connect to the database","Warning",JOptionPane.INFORMATION_MESSAGE);
	}
    }//GEN-LAST:event_jButton12ActionPerformed
    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        jTabbedPane1.setSelectedIndex(8);        
    }//GEN-LAST:event_jButton13ActionPerformed
    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        loggedperson = null;  
        jTabbedPane1.setSelectedIndex(0);   
    }//GEN-LAST:event_jButton14ActionPerformed
    /*Feedback*/
    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        String username = jTextField33.getText();
        String number= jComboBox3.getSelectedItem().toString();
        String comments = jTextArea5.getText();
        int rating = Integer.parseInt(number);
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Sujith");
            PreparedStatement cStmt = conn.prepareStatement("insert into comments values(?,?,?)");
            PreparedStatement rStmt = conn.prepareStatement("insert into rating values(?,?,?)");
            try
            {
		cStmt.setString(1, loggedperson);
                cStmt.setString(2, username);
                cStmt.setString(3, comments);
                rStmt.setString(1, loggedperson);
                rStmt.setString(2, username);
                rStmt.setInt(3, rating);
                cStmt.executeUpdate();
                rStmt.executeUpdate();
                jTextField33.setText("");
                jTextArea5.setText("");
                jTabbedPane1.setSelectedIndex(3);
            }
            catch(Exception sqle)
            {
		JOptionPane.showMessageDialog(null,"Invalid Username","Warning",JOptionPane.INFORMATION_MESSAGE);
            }
            cStmt.close();
            rStmt.close();
            conn.close();
        }
	catch(Exception sqle)
	{
            JOptionPane.showMessageDialog(null,"Cannot connect to the database","Warning",JOptionPane.INFORMATION_MESSAGE);
	}
    }//GEN-LAST:event_jButton15ActionPerformed
    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        loggedperson = null;
        jTabbedPane1.setSelectedIndex(0);        
    }//GEN-LAST:event_jButton16ActionPerformed
    /*View Comments*/
    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        String username = jTextField33.getText();
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Sujith");
            Statement stmt = conn.createStatement();
            try
            {
                String Query = "select comments.buyerusername as username,remarks,rating from comments,rating where comments.buyerusername=rating.buyerusername and rating.sellerusername='" + username + "'";
		ResultSet value = stmt.executeQuery(Query);
                DefaultTableModel dm = (DefaultTableModel)jTable3.getModel();
                dm.getDataVector().removeAllElements();
                revalidate();
                while(value.next())
                {
                    String buyername = value.getString("username");
                    String remarks = value.getString("remarks");
                    String rating = String.valueOf(value.getInt("rating"));
                    String tbData[] = {buyername,rating,remarks};
                    DefaultTableModel tb1Model = (DefaultTableModel)jTable3.getModel();
                    tb1Model.addRow(tbData);
                }
                stmt.close();
                conn.close();
            }
            catch(SQLException sqle)
            {
		JOptionPane.showMessageDialog(null,"Cannot Retrieve values","Warning",JOptionPane.INFORMATION_MESSAGE);
            }
        }
	catch(Exception sqle)
	{
            JOptionPane.showMessageDialog(null,"Cannot connect to the database","Warning",JOptionPane.INFORMATION_MESSAGE);
	}
    }//GEN-LAST:event_jButton17ActionPerformed
    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_jButton18ActionPerformed
   /*Main*/
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
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
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JPasswordField jPasswordField4;
    private javax.swing.JPasswordField jPasswordField5;
    private javax.swing.JPasswordField jPasswordField6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}