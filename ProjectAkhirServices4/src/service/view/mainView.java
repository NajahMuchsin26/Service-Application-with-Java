/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.view;

import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Najah Muchsin
 */
public class mainView extends javax.swing.JFrame {
    public int harga;
    public double hasil;
    public void durasi() {
        for (int i = 1; i < 7; i++) {
            cbDuration.addItem("" + i);
        }
    }
    private void kosongkan_form() {
        txtName.setEditable(true);
        txtName.setText(null);
        groupGender.clearSelection();
        cbCategory.setSelectedItem(this);
        txtHarga.setText(null);
        txtNoTelp.setText(null);
        txtAddress.setText(null);
        txtEmail.setText(null);
        txtSearch.setText(null);
    }

    private void kosongkan_form2() {
        txtNamaR.setEditable(true);
        txtNamaR.setText(null);
        txtAddressR.setText(null);
        txtNoTelpR.setText(null);
        cbDuration.setSelectedItem(null);
        txtDate.setText(null);
        txtTotal.setText(null);
        txtNama2.setText(null);
        groupGender2.clearSelection();
        cbCategory2.setSelectedItem(this);
        txtHarga2.setText(null);
        txtNoTelp2.setText(null);
        txtAddress2.setText(null);
        txtEmail2.setText(null);
        txtSearch2.setText(null);
    }

    private void tampilkan_data() {

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No.");
        model.addColumn("Name");
        model.addColumn("Gender");
        model.addColumn("Category");
        model.addColumn("Price Per Hour");
        model.addColumn("No. Telp");
        model.addColumn("Address");
        model.addColumn("Email");

        try {
            int no = 1;
            String sql = "SELECT * FROM pelayanan WHERE Name like '%" + txtSearch.getText() + "%'"
                    + "or Gender like '%" + txtSearch.getText() + "%'"
                    + "or Category like '%" + txtSearch.getText() + "%'"
                    + "or Price_Per_Hour like '%" + txtSearch.getText() + "%'"
                    + "or No_Telp like '%" + txtSearch.getText() + "%'"
                    + "or Address like '%" + txtSearch.getText() + "%'"
                    + "or Email like '%" + txtSearch.getText() + "%'";
            java.sql.Connection conn = (Connection) Konfig.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);

            while (res.next()) {
                model.addRow(new Object[]{no++, res.getString(1), res.getString(2),
                    res.getString(3), res.getString(4), res.getString(5),
                    res.getString(6), res.getString(7)});
            }
            tabelDataLayanan.setModel(model);
            tabelDataLayanan2.setModel(model);
        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    private void tampilkan_data2() {

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No.");
        model.addColumn("Name");
        model.addColumn("Gender");
        model.addColumn("Category");
        model.addColumn("Price Per Hour");
        model.addColumn("No.Telp");
        model.addColumn("Address");
        model.addColumn("Email");

        try {
            int no = 1;
            String sql = "SELECT * FROM pelayanan WHERE Name like '%" + txtSearch2.getText() + "%'"
                    + "or Gender like '%" + txtSearch2.getText() + "%'"
                    + "or Category like '%" + txtSearch2.getText() + "%'"
                    + "or Price_Per_Hour like '%" + txtSearch2.getText() + "%'"
                    + "or No_Telp like '%" + txtSearch2.getText() + "%'"
                    + "or Address like '%" + txtSearch2.getText() + "%'"
                    + "or Email like '%" + txtSearch2.getText() + "%'";
            java.sql.Connection conn = (Connection) Konfig.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                model.addRow(new Object[]{no++, res.getString(1), res.getString(2),
                    res.getString(3), res.getString(4), res.getString(5),
                    res.getString(6), res.getString(7)});
            }
            tabelDataLayanan2.setModel(model);
        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    private void tampilkan_data3() {

        DefaultTableModel model1 = new DefaultTableModel();
        model1.addColumn("No.");
        model1.addColumn("Name Of Requisitioner");
        model1.addColumn("Address Of Requisitioner");
        model1.addColumn("No.Telp Of Requisitioner");
        model1.addColumn("Duration Of Request");
        model1.addColumn("Date/Time");
        model1.addColumn("Total");
        model1.addColumn("Name");
        model1.addColumn("Gender");
        model1.addColumn("Category");
        model1.addColumn("Price Per Hour");
        model1.addColumn("No. Telp");
        model1.addColumn("Address");
        model1.addColumn("Email");

        try {
            int no = 1;
            String sql = "SELECT * FROM request";
            java.sql.Connection conn = (Connection) Konfig.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);

            while (res.next()) {
                model1.addRow(new Object[]{no++, res.getString(1), res.getString(2), res.getString(3),
                    res.getString(4), res.getString(5), res.getString(6),
                    res.getString(7), res.getString(8), res.getString(9),
                    res.getString(10), res.getString(11), res.getString(12), res.getString(13)});
            }
            tabelRequest.setModel(model1);
        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
        }
    }


    public mainView() {
        initComponents();
        tampilkan_data();
        tampilkan_data3();
        durasi();
        tampilkan_data2();
        kosongkan_form();
        kosongkan_form2();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupGender = new javax.swing.ButtonGroup();
        groupGender2 = new javax.swing.ButtonGroup();
        bodyPanel = new javax.swing.JPanel();
        menuPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        home = new javax.swing.JLabel();
        apply = new javax.swing.JLabel();
        request = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        applyPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        rdMale = new javax.swing.JRadioButton();
        rdFemale = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        cbCategory = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtHarga = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtNoTelp = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelDataLayanan = new javax.swing.JTable();
        btnSave = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        requestPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelRequest = new javax.swing.JTable();
        txtAddress2 = new javax.swing.JTextField();
        btnRequest = new javax.swing.JButton();
        txtNamaR = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btnreset = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtNoTelp2 = new javax.swing.JTextField();
        btnedit = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        btndelete = new javax.swing.JButton();
        rdMale2 = new javax.swing.JRadioButton();
        txtEmail2 = new javax.swing.JTextField();
        rdFemale2 = new javax.swing.JRadioButton();
        txtSearch2 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        btnsearch = new javax.swing.JButton();
        cbCategory2 = new javax.swing.JComboBox<>();
        txtTotal = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtHarga2 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtAddressR = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtNoTelpR = new javax.swing.JTextField();
        cbDuration = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtNama2 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelDataLayanan2 = new javax.swing.JTable();
        jLabel26 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        btnTotal = new javax.swing.JButton();
        homePanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SERVICE'S");

        bodyPanel.setBackground(new java.awt.Color(204, 204, 204));

        menuPanel.setBackground(new java.awt.Color(52, 152, 219));

        jLabel1.setFont(new java.awt.Font("Humnst777 BlkCn BT", 0, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/service/icon/service.png"))); // NOI18N

        home.setFont(new java.awt.Font("Humnst777 BlkCn BT", 0, 14)); // NOI18N
        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/service/icon/home.png"))); // NOI18N
        home.setText("       HOME");
        home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });

        apply.setFont(new java.awt.Font("Humnst777 BlkCn BT", 0, 14)); // NOI18N
        apply.setIcon(new javax.swing.ImageIcon(getClass().getResource("/service/icon/suitcase.png"))); // NOI18N
        apply.setText("       APPLY");
        apply.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        apply.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                applyMouseClicked(evt);
            }
        });

        request.setFont(new java.awt.Font("Humnst777 BlkCn BT", 0, 14)); // NOI18N
        request.setIcon(new javax.swing.ImageIcon(getClass().getResource("/service/icon/request.png"))); // NOI18N
        request.setText("      REQUEST");
        request.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        request.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                requestMouseClicked(evt);
            }
        });

        logout.setFont(new java.awt.Font("Humnst777 BlkCn BT", 0, 14)); // NOI18N
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/service/icon/log-out.png"))); // NOI18N
        logout.setText("      LOGOUT");
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Humnst777 BlkCn BT", 0, 24)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("   SERVICE'S");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/service/icon/58-removebg-preview - Copy.png"))); // NOI18N

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel1))
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(home, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(jLabel5)
                            .addComponent(apply, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(request, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(apply, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(request, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setLayout(new java.awt.CardLayout());

        applyPanel.setBackground(new java.awt.Color(255, 255, 255));
        applyPanel.setPreferredSize(new java.awt.Dimension(1100, 606));
        applyPanel.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Humnst777 BlkCn BT", 0, 14)); // NOI18N
        jLabel4.setText("Name");
        applyPanel.add(jLabel4);
        jLabel4.setBounds(50, 110, 34, 18);

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        applyPanel.add(txtName);
        txtName.setBounds(160, 100, 258, 25);

        jLabel6.setFont(new java.awt.Font("Humnst777 BlkCn BT", 0, 14)); // NOI18N
        jLabel6.setText("Gender");
        applyPanel.add(jLabel6);
        jLabel6.setBounds(50, 150, 44, 18);

        rdMale.setBackground(new java.awt.Color(255, 255, 255));
        groupGender.add(rdMale);
        rdMale.setFont(new java.awt.Font("Humnst777 BlkCn BT", 0, 14)); // NOI18N
        rdMale.setText("Male");
        applyPanel.add(rdMale);
        rdMale.setBounds(160, 150, 55, 26);

        rdFemale.setBackground(new java.awt.Color(255, 255, 255));
        groupGender.add(rdFemale);
        rdFemale.setFont(new java.awt.Font("Humnst777 BlkCn BT", 0, 14)); // NOI18N
        rdFemale.setText("Female");
        rdFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdFemaleActionPerformed(evt);
            }
        });
        applyPanel.add(rdFemale);
        rdFemale.setBounds(230, 150, 68, 26);

        jLabel7.setFont(new java.awt.Font("Humnst777 BlkCn BT", 0, 14)); // NOI18N
        jLabel7.setText("Category");
        applyPanel.add(jLabel7);
        jLabel7.setBounds(50, 190, 55, 18);

        cbCategory.setFont(new java.awt.Font("Humnst777 BlkCn BT", 0, 14)); // NOI18N
        cbCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Private Teacher", "Driver", "Home Cleaning", "Laundry Service", "Hairstylist", "Babysitter", "Maid" }));
        applyPanel.add(cbCategory);
        cbCategory.setBounds(160, 190, 145, 27);

        jLabel8.setFont(new java.awt.Font("Humnst777 BlkCn BT", 0, 14)); // NOI18N
        jLabel8.setText("Price Per Hour");
        applyPanel.add(jLabel8);
        jLabel8.setBounds(50, 240, 88, 18);

        txtHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHargaActionPerformed(evt);
            }
        });
        applyPanel.add(txtHarga);
        txtHarga.setBounds(160, 230, 133, 25);

        jLabel9.setFont(new java.awt.Font("Humnst777 BlkCn BT", 0, 14)); // NOI18N
        jLabel9.setText("No. Telp");
        applyPanel.add(jLabel9);
        jLabel9.setBounds(567, 106, 51, 18);

        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });
        applyPanel.add(txtAddress);
        txtAddress.setBounds(660, 140, 237, 25);

        jLabel10.setFont(new java.awt.Font("Humnst777 BlkCn BT", 0, 14)); // NOI18N
        jLabel10.setText("Address");
        applyPanel.add(jLabel10);
        jLabel10.setBounds(570, 140, 49, 18);
        applyPanel.add(txtNoTelp);
        txtNoTelp.setBounds(658, 103, 237, 25);

        jLabel11.setFont(new java.awt.Font("Humnst777 BlkCn BT", 0, 14)); // NOI18N
        jLabel11.setText("E-mail");
        applyPanel.add(jLabel11);
        jLabel11.setBounds(570, 180, 37, 18);
        applyPanel.add(txtEmail);
        txtEmail.setBounds(660, 180, 237, 25);

        tabelDataLayanan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelDataLayanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelDataLayananMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelDataLayanan);

        applyPanel.add(jScrollPane1);
        jScrollPane1.setBounds(50, 424, 845, 103);

        btnSave.setBackground(new java.awt.Color(52, 152, 219));
        btnSave.setFont(new java.awt.Font("Humnst777 BlkCn BT", 0, 14)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        applyPanel.add(btnSave);
        btnSave.setBounds(229, 338, 80, 30);

        btnReset.setBackground(new java.awt.Color(52, 152, 219));
        btnReset.setFont(new java.awt.Font("Humnst777 BlkCn BT", 0, 14)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("RESET");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        applyPanel.add(btnReset);
        btnReset.setBounds(609, 338, 80, 30);

        btnEdit.setBackground(new java.awt.Color(52, 152, 219));
        btnEdit.setFont(new java.awt.Font("Humnst777 BlkCn BT", 0, 14)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("EDIT");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        applyPanel.add(btnEdit);
        btnEdit.setBounds(327, 338, 80, 30);

        btnDelete.setBackground(new java.awt.Color(52, 152, 219));
        btnDelete.setFont(new java.awt.Font("Humnst777 BlkCn BT", 0, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        applyPanel.add(btnDelete);
        btnDelete.setBounds(517, 338, 80, 30);

        btnExit.setBackground(new java.awt.Color(52, 152, 219));
        btnExit.setFont(new java.awt.Font("Humnst777 BlkCn BT", 0, 14)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("EXIT");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        applyPanel.add(btnExit);
        btnExit.setBounds(425, 338, 80, 30);
        applyPanel.add(txtSearch);
        txtSearch.setBounds(630, 384, 147, 25);

        btnSearch.setBackground(new java.awt.Color(52, 152, 219));
        btnSearch.setFont(new java.awt.Font("Humnst777 BlkCn BT", 0, 14)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("SEARCH");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        applyPanel.add(btnSearch);
        btnSearch.setBounds(805, 381, 90, 30);

        jLabel33.setFont(new java.awt.Font("Humnst777 BlkCn BT", 0, 14)); // NOI18N
        jLabel33.setText("USD");
        applyPanel.add(jLabel33);
        jLabel33.setBounds(320, 230, 25, 18);

        jPanel4.setBackground(new java.awt.Color(52, 152, 219));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        applyPanel.add(jPanel4);
        jPanel4.setBounds(30, 80, 900, 3);

        jLabel27.setFont(new java.awt.Font("Humnst777 BlkCn BT", 0, 48)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(10, 189, 227));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Apply Your Job !");
        jLabel27.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 5, 0, 0));
        applyPanel.add(jLabel27);
        jLabel27.setBounds(340, 10, 390, 60);

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/service/icon/apply2.jpg"))); // NOI18N
        applyPanel.add(jLabel34);
        jLabel34.setBounds(630, 220, 530, 390);

        mainPanel.add(applyPanel, "card3");

        requestPanel.setBackground(new java.awt.Color(255, 255, 255));
        requestPanel.setPreferredSize(new java.awt.Dimension(1100, 606));
        requestPanel.setLayout(null);

        tabelRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelRequest.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabelRequest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelRequestMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelRequest);

        requestPanel.add(jScrollPane2);
        jScrollPane2.setBounds(23, 459, 1010, 103);
        requestPanel.add(txtAddress2);
        txtAddress2.setBounds(797, 213, 237, 25);

        btnRequest.setBackground(new java.awt.Color(52, 152, 219));
        btnRequest.setFont(new java.awt.Font("Humnst777 BlkCn BT", 0, 14)); // NOI18N
        btnRequest.setForeground(new java.awt.Color(255, 255, 255));
        btnRequest.setText("REQUEST");
        btnRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestActionPerformed(evt);
            }
        });
        requestPanel.add(btnRequest);
        btnRequest.setBounds(38, 351, 88, 30);

        txtNamaR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaRActionPerformed(evt);
            }
        });
        requestPanel.add(txtNamaR);
        txtNamaR.setBounds(174, 52, 258, 25);

        jLabel12.setFont(new java.awt.Font("Humnst777 BlkCn BT", 0, 14)); // NOI18N
        jLabel12.setText("Address");
        requestPanel.add(jLabel12);
        jLabel12.setBounds(580, 215, 49, 18);

        btnreset.setBackground(new java.awt.Color(52, 152, 219));
        btnreset.setFont(new java.awt.Font("Humnst777 BlkCn BT", 0, 14)); // NOI18N
        btnreset.setForeground(new java.awt.Color(255, 255, 255));
        btnreset.setText("RESET");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });
        requestPanel.add(btnreset);
        btnreset.setBounds(182, 351, 80, 30);

        jLabel13.setFont(new java.awt.Font("Humnst777 BlkCn BT", 0, 14)); // NOI18N
        jLabel13.setText("Gender");
        requestPanel.add(jLabel13);
        jLabel13.setBounds(580, 90, 44, 18);

        txtNoTelp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoTelp2ActionPerformed(evt);
            }
        });
        requestPanel.add(txtNoTelp2);
        txtNoTelp2.setBounds(797, 182, 237, 25);

        btnedit.setBackground(new java.awt.Color(52, 152, 219));
        btnedit.setFont(new java.awt.Font("Humnst777 BlkCn BT", 0, 14)); // NOI18N
        btnedit.setForeground(new java.awt.Color(255, 255, 255));
        btnedit.setText("EDIT");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });
        requestPanel.add(btnedit);
        btnedit.setBounds(295, 351, 80, 30);

        jLabel14.setFont(new java.awt.Font("Humnst777 BlkCn BT", 0, 14)); // NOI18N
        jLabel14.setText("E-mail");
        requestPanel.add(jLabel14);
        jLabel14.setBounds(580, 250, 37, 18);

        btndelete.setBackground(new java.awt.Color(52, 152, 219));
        btndelete.setFont(new java.awt.Font("Humnst777 BlkCn BT", 0, 14)); // NOI18N
        btndelete.setForeground(new java.awt.Color(255, 255, 255));
        btndelete.setText("DELETE");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        requestPanel.add(btndelete);
        btndelete.setBounds(408, 351, 80, 30);

        rdMale2.setBackground(new java.awt.Color(255, 255, 255));
        groupGender2.add(rdMale2);
        rdMale2.setFont(new java.awt.Font("Humnst777 BlkCn BT", 0, 14)); // NOI18N
        rdMale2.setText("Male");
        requestPanel.add(rdMale2);
        rdMale2.setBounds(797, 86, 55, 26);

        txtEmail2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmail2ActionPerformed(evt);
            }
        });
        requestPanel.add(txtEmail2);
        txtEmail2.setBounds(797, 248, 237, 27);

        rdFemale2.setBackground(new java.awt.Color(255, 255, 255));
        groupGender2.add(rdFemale2);
        rdFemale2.setFont(new java.awt.Font("Humnst777 BlkCn BT", 0, 14)); // NOI18N
        rdFemale2.setText("Female");
        rdFemale2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdFemale2ActionPerformed(evt);
            }
        });
        requestPanel.add(rdFemale2);
        rdFemale2.setBounds(856, 86, 68, 26);
        requestPanel.add(txtSearch2);
        txtSearch2.setBounds(777, 291, 147, 25);

        jLabel15.setFont(new java.awt.Font("Humnst777 BlkCn BT", 0, 14)); // NOI18N
        jLabel15.setText("Category");
        requestPanel.add(jLabel15);
        jLabel15.setBounds(580, 121, 55, 18);

        btnsearch.setBackground(new java.awt.Color(52, 152, 219));
        btnsearch.setFont(new java.awt.Font("Humnst777 BlkCn BT", 0, 14)); // NOI18N
        btnsearch.setForeground(new java.awt.Color(255, 255, 255));
        btnsearch.setText("SEARCH");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });
        requestPanel.add(btnsearch);
        btnsearch.setBounds(942, 288, 90, 30);

        cbCategory2.setFont(new java.awt.Font("Humnst777 BlkCn BT", 0, 14)); // NOI18N
        cbCategory2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Private Teacher", "Driver", "Home Cleaning", "Laundry Service", "Hairstylist", "Babysitter", "Maid" }));
        requestPanel.add(cbCategory2);
        cbCategory2.setBounds(797, 116, 197, 27);

        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });
        requestPanel.add(txtTotal);
        txtTotal.setBounds(172, 260, 100, 25);

        jLabel17.setFont(new java.awt.Font("Humnst777 BlkCn BT", 0, 14)); // NOI18N
        jLabel17.setText("No. Telp");
        requestPanel.add(jLabel17);
        jLabel17.setBounds(580, 184, 51, 18);

        jLabel18.setFont(new java.awt.Font("Humnst777 BlkCn BT", 0, 14)); // NOI18N
        jLabel18.setText("Name");
        requestPanel.add(jLabel18);
        jLabel18.setBounds(23, 52, 34, 18);
        requestPanel.add(txtHarga2);
        txtHarga2.setBounds(797, 153, 58, 25);

        jLabel19.setFont(new java.awt.Font("Humnst777 BlkCn BT", 0, 14)); // NOI18N
        jLabel19.setText("Price Per Hour");
        requestPanel.add(jLabel19);
        jLabel19.setBounds(580, 156, 88, 19);

        jLabel20.setFont(new java.awt.Font("Humnst777 BlkCn BT", 0, 14)); // NOI18N
        jLabel20.setText("Address");
        requestPanel.add(jLabel20);
        jLabel20.setBounds(23, 87, 49, 18);
        requestPanel.add(txtAddressR);
        txtAddressR.setBounds(174, 87, 258, 25);

        jLabel21.setFont(new java.awt.Font("Humnst777 BlkCn BT", 0, 14)); // NOI18N
        jLabel21.setText("No. Telp");
        requestPanel.add(jLabel21);
        jLabel21.setBounds(23, 125, 51, 18);
        requestPanel.add(txtNoTelpR);
        txtNoTelpR.setBounds(174, 123, 258, 25);

        cbDuration.setFont(new java.awt.Font("Humnst777 BlkCn BT", 0, 14)); // NOI18N
        cbDuration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDurationActionPerformed(evt);
            }
        });
        requestPanel.add(cbDuration);
        cbDuration.setBounds(174, 158, 68, 27);

        jLabel23.setFont(new java.awt.Font("Humnst777 BlkCn BT", 2, 14)); // NOI18N
        jLabel23.setText("REQUESTER IDENTITIY");
        requestPanel.add(jLabel23);
        jLabel23.setBounds(227, 13, 150, 18);

        jLabel24.setFont(new java.awt.Font("Humnst777 BlkCn BT", 0, 14)); // NOI18N
        jLabel24.setText("Name");
        requestPanel.add(jLabel24);
        jLabel24.setBounds(580, 54, 34, 18);
        requestPanel.add(txtNama2);
        txtNama2.setBounds(797, 55, 237, 25);

        jLabel25.setFont(new java.awt.Font("Humnst777 BlkCn BT", 2, 14)); // NOI18N
        jLabel25.setText("REQUESTED IDENTITY");
        requestPanel.add(jLabel25);
        jLabel25.setBounds(777, 13, 138, 18);

        tabelDataLayanan2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelDataLayanan2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelDataLayanan2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabelDataLayanan2);

        requestPanel.add(jScrollPane3);
        jScrollPane3.setBounds(580, 325, 453, 103);

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Humnst777 BlkCn BT", 0, 14)); // NOI18N
        jLabel26.setText("Duration Of Request");
        requestPanel.add(jLabel26);
        jLabel26.setBounds(23, 158, 125, 18);

        jLabel29.setFont(new java.awt.Font("Humnst777 BlkCn BT", 0, 14)); // NOI18N
        jLabel29.setText("Hours");
        requestPanel.add(jLabel29);
        jLabel29.setBounds(247, 161, 36, 18);

        jLabel30.setFont(new java.awt.Font("Humnst777 BlkCn BT", 0, 14)); // NOI18N
        jLabel30.setText("Date/Time");
        requestPanel.add(jLabel30);
        jLabel30.setBounds(23, 215, 61, 18);
        requestPanel.add(txtDate);
        txtDate.setBounds(174, 213, 258, 25);

        jLabel31.setFont(new java.awt.Font("Humnst777 BlkCn BT", 0, 14)); // NOI18N
        jLabel31.setText("USD");
        requestPanel.add(jLabel31);
        jLabel31.setBounds(890, 155, 25, 18);

        jLabel32.setFont(new java.awt.Font("Humnst777 BlkCn BT", 0, 14)); // NOI18N
        jLabel32.setText("USD");
        requestPanel.add(jLabel32);
        jLabel32.setBounds(281, 244, 25, 18);

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/service/icon/req3.jpg"))); // NOI18N
        requestPanel.add(jLabel35);
        jLabel35.setBounds(110, 140, 690, 340);

        btnTotal.setFont(new java.awt.Font("Humnst777 BlkCn BT", 0, 14)); // NOI18N
        btnTotal.setText("Total");
        btnTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalActionPerformed(evt);
            }
        });
        requestPanel.add(btnTotal);
        btnTotal.setBounds(20, 260, 65, 28);

        mainPanel.add(requestPanel, "card4");

        homePanel.setBackground(new java.awt.Color(255, 255, 255));
        homePanel.setPreferredSize(new java.awt.Dimension(1100, 606));
        homePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/service/icon/gambar2.jpg"))); // NOI18N
        homePanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 127, 434, 296));

        jLabel16.setFont(new java.awt.Font("Humnst777 BlkCn BT", 0, 48)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(10, 189, 227));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Welcome To Service's");
        jLabel16.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 5, 0, 0));
        homePanel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 22, 616, -1));

        jPanel3.setBackground(new java.awt.Color(52, 152, 219));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 515, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        homePanel.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 88, -1, -1));

        jLabel22.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel22.setForeground(java.awt.Color.black);
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("We are a recruitment platform and service \n");
        homePanel.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 119, 511, -1));

        jLabel28.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel28.setForeground(java.awt.Color.black);
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("provider, connecting people to jobs \n");
        homePanel.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 153, 526, -1));

        jLabel36.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel36.setForeground(java.awt.Color.black);
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("and helping people to find services.\n");
        homePanel.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 187, 526, -1));

        jLabel37.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel37.setForeground(java.awt.Color.black);
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("We are a recruitment platform and service \n");
        homePanel.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 250, 526, -1));

        jLabel38.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel38.setForeground(java.awt.Color.black);
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("provider, connecting people to jobs and helping\n\n");
        homePanel.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 284, 526, -1));

        jLabel39.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel39.setForeground(java.awt.Color.black);
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("people to find services.");
        homePanel.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 318, 526, -1));

        jLabel41.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel41.setForeground(java.awt.Color.black);
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("Service's is an applications that provide ordering and service providers .");
        homePanel.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 980, 30));

        mainPanel.add(homePanel, "card2");

        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bodyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void rdFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdFemaleActionPerformed

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        // add panel
        mainPanel.add(homePanel);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_homeMouseClicked

    private void applyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_applyMouseClicked
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        // add panel
        mainPanel.add(applyPanel);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_applyMouseClicked

    private void requestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requestMouseClicked
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        // add panel
        mainPanel.add(requestPanel);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_requestMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        int dialogBtn = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Attention", "Are you sure want to logout?", dialogBtn);
        if (dialogResult == 0) {
            System.exit(0);
        } else {

        }
    }//GEN-LAST:event_logoutMouseClicked

    private void rdFemale2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdFemale2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdFemale2ActionPerformed

    private void txtEmail2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmail2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmail2ActionPerformed

    private void txtNamaRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaRActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String Gender = null;
        if (rdMale.isSelected()) {
            Gender = "Male";
        } else if (rdFemale.isSelected()) {
            Gender = "Female";
        }
        try {
            String sql = "INSERT INTO pelayanan VALUES ('"
                    + txtName.getText() + "','"
                    + Gender + "','"
                    + cbCategory.getSelectedItem() + "','"
                    + txtHarga.getText() + "','"
                    + txtNoTelp.getText() + "','"
                    + txtAddress.getText() + "','"
                    + txtEmail.getText() + "')";
            java.sql.Connection conn = (Connection) Konfig.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Data saved successfully..");
            tampilkan_data();
            tampilkan_data2();
            kosongkan_form();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        kosongkan_form();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        String Gender = null;
        if (rdMale.isSelected()) {
            Gender = "Male";
        } else if (rdFemale.isSelected()) {
            Gender = "Female";
        }
        try {
            String sql = "UPDATE pelayanan SET Name='"
                    + txtName.getText() + "',Gender='" + Gender + "', Category='"
                    + cbCategory.getSelectedItem() + "',Price_Per_Hour='" + txtHarga.getText()
                    + "',No_Telp='" + txtNoTelp.getText()
                    + "',Address='" + txtAddress.getText()
                    + "',Email='" + txtEmail.getText()
                    + "' WHERE Name='" + txtName.getText() + "'";
            java.sql.Connection conn = (Connection) Konfig.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Data Edited Successfully..");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        tampilkan_data();
        tampilkan_data2();
        kosongkan_form();
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            String sql = "DELETE FROM pelayanan WHERE Name='" + txtName.getText() + "'";
            java.sql.Connection conn = (Connection) Konfig.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Data Deleted Successfully..");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        tampilkan_data();
        tampilkan_data2();
        kosongkan_form();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        try {
            String sql = "SELECT * FROM pelayanan WHERE Name like '%" + txtSearch.getText() + "%'"
                    + "or Gender like '%" + txtSearch.getText() + "%'"
                    + "or Category like '%" + txtSearch.getText() + "%'"
                    + "or Price_Per_Hour like '%" + txtSearch.getText() + "%'"
                    + "or No_Telp like '%" + txtSearch.getText() + "%'"
                    + "or Address like '%" + txtSearch.getText() + "%'"
                    + "or Email like '%" + txtSearch.getText() + "%'";
            java.sql.Connection conn = (Connection) Konfig.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
        } catch (HeadlessException | SQLException e) {

        }
        tampilkan_data();
//        tampilkan_data2();
        kosongkan_form();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void tabelDataLayananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelDataLayananMouseClicked
        int baris = tabelDataLayanan.rowAtPoint(evt.getPoint());
        String nama = tabelDataLayanan.getValueAt(baris, 1).toString();
        txtName.setText(nama);
        if ("Male".equals(tabelDataLayanan.getValueAt(baris, 2))) {
            rdMale.setSelected(true);
        } else if ("Female".equals(tabelDataLayanan.getValueAt(baris, 2))) {
            rdFemale.setSelected(true);
        }
        String kategori = tabelDataLayanan.getValueAt(baris, 3).toString();
        cbCategory.setSelectedItem(kategori);
        String harga = tabelDataLayanan.getValueAt(baris, 4).toString();
        txtHarga.setText(harga);
        String telp = tabelDataLayanan.getValueAt(baris, 5).toString();
        txtNoTelp.setText(telp);
        String alamat = tabelDataLayanan.getValueAt(baris, 6).toString();
        txtAddress.setText(alamat);
        String email = tabelDataLayanan.getValueAt(baris, 7).toString();
        txtEmail.setText(email);
    }//GEN-LAST:event_tabelDataLayananMouseClicked

    private void txtHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHargaActionPerformed

    private void btnRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestActionPerformed
        
        String Gender = null;
        if (rdMale2.isSelected()) {
            Gender = "Male";
        } else if (rdFemale2.isSelected()) {
            Gender = "Female";
        }
        
        try {
            String sql = "INSERT INTO request VALUES ('"
                    + txtNamaR.getText() + "','"
                    + txtAddressR.getText() + "','"
                    + txtNoTelpR.getText() + "','"
                    + cbDuration.getSelectedItem() + "','"
                    + txtDate.getText() + "','"
                    + txtTotal.getText() + "','"
                    + txtNama2.getText() + "','"
                    + Gender + "','"
                    + cbCategory2.getSelectedItem() + "','"
                    + txtHarga2.getText() + "','"
                    + txtNoTelp2.getText() + "','"
                    + txtAddress2.getText() + "','"
                    + txtEmail2.getText() + "')";
            java.sql.Connection conn = (Connection) Konfig.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Your Request Process Was Successful..");
            tampilkan_data3();
            kosongkan_form2();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnRequestActionPerformed

    private void tabelDataLayanan2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelDataLayanan2MouseClicked
        int baris = tabelDataLayanan2.rowAtPoint(evt.getPoint());
        String nama = tabelDataLayanan2.getValueAt(baris, 1).toString();
        txtNama2.setText(nama);
        if ("Male".equals(tabelDataLayanan2.getValueAt(baris, 2))) {
            rdMale2.setSelected(true);
        } else if ("Female".equals(tabelDataLayanan2.getValueAt(baris, 2))) {
            rdFemale2.setSelected(true);
        }
        String kategori = tabelDataLayanan2.getValueAt(baris, 3).toString();
        cbCategory2.setSelectedItem(kategori);
        String harga = tabelDataLayanan2.getValueAt(baris, 4).toString();
        txtHarga2.setText(harga);
        String telp = tabelDataLayanan2.getValueAt(baris, 5).toString();
        txtNoTelp2.setText(telp);
        String alamat = tabelDataLayanan2.getValueAt(baris, 6).toString();
        txtAddress2.setText(alamat);
        String email = tabelDataLayanan2.getValueAt(baris, 7).toString();
        txtEmail2.setText(email);
    }//GEN-LAST:event_tabelDataLayanan2MouseClicked

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        kosongkan_form2();
    }//GEN-LAST:event_btnresetActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed

        String Gender = null;
        if (rdMale2.isSelected()) {
            Gender = "Male";
        } else if (rdFemale2.isSelected()) {
            Gender = "Female";
        }  
        try {
            String sql = "UPDATE request SET Name_R='" + txtNamaR.getText()
                    + "',Address_R='" + txtAddressR.getText()
                    + "',No_Telp_R='" + txtNoTelpR.getText()
                    + "',Duration_Of_R='" + cbDuration.getSelectedItem()
                    + "',Date_Time='" + txtDate.getText()
                    + "',Total='" + txtTotal.getText()
                    + "',Name='" + txtNama2.getText()
                    + "',Gender='" + Gender
                    + "',Category='" + cbCategory2.getSelectedItem()
                    + "',Price_Per_Hour='" + txtHarga2.getText()
                    + "',No_Telp='" + txtNoTelp2.getText()
                    + "',Address='" + txtAddress2.getText()
                    + "',Email='" + txtEmail2.getText()
                    + "' WHERE Name_R='" + txtNamaR.getText() + "'";
            java.sql.Connection conn = (Connection) Konfig.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Data Edited Successfully..");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        tampilkan_data3();
        kosongkan_form2();
    }//GEN-LAST:event_btneditActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        try {
            String sql = "DELETE FROM request WHERE Name_R='" + txtNamaR.getText() + "'";
            java.sql.Connection conn = (Connection) Konfig.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Data Deleted Successfully..");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        tampilkan_data3();
        kosongkan_form2();
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        try {
            String sql = "SELECT * FROM pelayanan WHERE Name like '%" + txtSearch2.getText() + "%'"
                    + "or Gender like '%" + txtSearch2.getText() + "%'"
                    + "or Category like '%" + txtSearch2.getText() + "%'"
                    + "or Price_Per_Hour like '%" + txtSearch2.getText() + "%'"
                    + "or No_Telp like '%" + txtSearch2.getText() + "%'"
                    + "or Address like '%" + txtSearch2.getText() + "%'"
                    + "or Email like '%" + txtSearch2.getText() + "%'";
            java.sql.Connection conn = (Connection) Konfig.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
        } catch (HeadlessException | SQLException e) {
        }
        tampilkan_data2();
        kosongkan_form2();
    }//GEN-LAST:event_btnsearchActionPerformed

    private void tabelRequestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelRequestMouseClicked
        int baris = tabelRequest.rowAtPoint(evt.getPoint());
        String namaR = tabelRequest.getValueAt(baris, 1).toString();
        txtNamaR.setText(namaR);
        String alamatR = tabelRequest.getValueAt(baris, 2).toString();
        txtAddressR.setText(alamatR);
        String telpR = tabelRequest.getValueAt(baris, 3).toString();
        txtNoTelpR.setText(telpR);
        String durasi = tabelRequest.getValueAt(baris, 4).toString();
        cbDuration.setSelectedItem(durasi);
        String date = tabelRequest.getValueAt(baris, 5).toString();
        txtDate.setText(date);
        String total = tabelRequest.getValueAt(baris, 6).toString();
        txtTotal.setText(total);
        String nama = tabelRequest.getValueAt(baris, 7).toString();
        txtNama2.setText(nama);
        if ("Male".equals(tabelRequest.getValueAt(baris, 8))) {
            rdMale2.setSelected(true);
        } else if ("Female".equals(tabelRequest.getValueAt(baris, 8))) {
            rdFemale2.setSelected(true);
        }
        String kategori = tabelRequest.getValueAt(baris, 9).toString();
        cbCategory2.setSelectedItem(kategori);
        String harga = tabelRequest.getValueAt(baris, 10).toString();
        txtHarga2.setText(harga);
        String telp = tabelRequest.getValueAt(baris, 11).toString();
        txtNoTelp2.setText(telp);
        String alamat = tabelRequest.getValueAt(baris, 12).toString();
        txtAddress2.setText(alamat);
        String email = tabelRequest.getValueAt(baris, 13).toString();
        txtEmail2.setText(email);
    }//GEN-LAST:event_tabelRequestMouseClicked

    private void cbDurationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDurationActionPerformed

    }//GEN-LAST:event_cbDurationActionPerformed

    private void txtNoTelp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoTelp2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoTelp2ActionPerformed

    private void btnTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalActionPerformed
        switch (cbDuration.getSelectedIndex()) {
            case 1:
                harga = Integer.parseInt(txtHarga2.getText());
                hasil = 2.0 * harga;
                txtTotal.setText(String.valueOf(hasil));
                break;
            case 2:
                harga = Integer.parseInt(txtHarga2.getText());
                hasil = 3.0 * harga;
                txtTotal.setText(String.valueOf(hasil));
                break;
            case 3:
                harga = Integer.parseInt(txtHarga2.getText());
                hasil = 4.0 * harga;
                txtTotal.setText(String.valueOf(hasil));
                break;
            case 4:
                harga = Integer.parseInt(txtHarga2.getText());
                hasil = 5.0 * harga;
                txtTotal.setText(String.valueOf(hasil));
                break;
            case 5:
                harga = Integer.parseInt(txtHarga2.getText());
                hasil = 6.0 * harga;
                txtTotal.setText(String.valueOf(hasil));
                break;
            default:
                txtTotal.setText(txtHarga2.getText());
                break;
        }
    }//GEN-LAST:event_btnTotalActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

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
            java.util.logging.Logger.getLogger(mainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apply;
    private javax.swing.JPanel applyPanel;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnRequest;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnTotal;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnreset;
    private javax.swing.JButton btnsearch;
    private javax.swing.JComboBox<String> cbCategory;
    private javax.swing.JComboBox<String> cbCategory2;
    private javax.swing.JComboBox<String> cbDuration;
    private javax.swing.ButtonGroup groupGender;
    private javax.swing.ButtonGroup groupGender2;
    private javax.swing.JLabel home;
    private javax.swing.JPanel homePanel;
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
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel logout;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JRadioButton rdFemale;
    private javax.swing.JRadioButton rdFemale2;
    private javax.swing.JRadioButton rdMale;
    private javax.swing.JRadioButton rdMale2;
    private javax.swing.JLabel request;
    private javax.swing.JPanel requestPanel;
    private javax.swing.JTable tabelDataLayanan;
    private javax.swing.JTable tabelDataLayanan2;
    private javax.swing.JTable tabelRequest;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAddress2;
    private javax.swing.JTextField txtAddressR;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmail2;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtHarga2;
    private javax.swing.JTextField txtNama2;
    private javax.swing.JTextField txtNamaR;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNoTelp;
    private javax.swing.JTextField txtNoTelp2;
    private javax.swing.JTextField txtNoTelpR;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSearch2;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
