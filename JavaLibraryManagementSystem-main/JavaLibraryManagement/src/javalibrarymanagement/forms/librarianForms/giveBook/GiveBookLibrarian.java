package javalibrarymanagement.forms.librarianForms.giveBook;

import javalibrarymanagement.forms.librarianForms.takeBack.*;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javalibrarymanagement.data.LibraryService;
import javalibrarymanagement.data.model.BookIssue;
import javalibrarymanagement.data.model.BorrowRequest;
import javalibrarymanagement.data.model.Librarian;
import javalibrarymanagement.data.model.Member;
import javalibrarymanagement.forms.librarianForms.LibrarianIntro;
import javalibrarymanagement.utils.CenterScreen;
import javalibrarymanagement.utils.TableDecarator;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class GiveBookLibrarian extends javax.swing.JFrame {

    private final Librarian currentLibrarian;
    private final LibraryService service = LibraryService.getInstance();    
    private final DefaultTableModel model;
    private final DefaultTableModel model2;
    private final DefaultTableModel model3;
    private final DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
    private final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    private ArrayList<Member> memberList = service.getAllMembers();
    private ArrayList<BookIssue> issueList = service.getAllIssues();
    private ArrayList<BorrowRequest> requestList = service.getAllRequests();
    
    public GiveBookLibrarian(Librarian librarian) {
        initComponents();
        CenterScreen.centerScreen(this);
        currentLibrarian = librarian;
        txtWelcome.setText("Librarian : "+currentLibrarian.getLibrarianName());
        model = (DefaultTableModel)tblMembers.getModel();
        model2 = (DefaultTableModel)tblBorrows.getModel();
        model3 = (DefaultTableModel)tblRequest.getModel();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        tblMembers.setDefaultRenderer(String.class, centerRenderer);
        tblMembers.setDefaultRenderer(int.class, centerRenderer);
        tblBorrows.setDefaultRenderer(String.class, centerRenderer);
        tblBorrows.setDefaultRenderer(int.class, centerRenderer);    
        tblRequest.setDefaultRenderer(String.class, centerRenderer);
        tblRequest.setDefaultRenderer(int.class, centerRenderer);
        addMembersToTable(memberList);
        addIssuessToTable(issueList);
        addRequestsToTable(requestList);
        TableDecarator.tableCustomize(tblMembers);
        TableDecarator.tableCustomize(tblBorrows);
        TableDecarator.tableCustomize(tblRequest);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtWelcome = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMembers = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        etID = new javax.swing.JTextField();
        etName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblBorrows = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        btnSelectUser = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblRequest = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        btnApprove = new javax.swing.JButton();
        btnGive = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 153, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(1500, 530));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javalibrarymanagement/library.png"))); // NOI18N
        jLabel5.setText("jLabel5");

        jLabel6.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Library Management System");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(230, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(172, 172, 172))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 230, 730);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        txtWelcome.setFont(new java.awt.Font("Poppins", 0, 36)); // NOI18N
        txtWelcome.setForeground(new java.awt.Color(0, 102, 102));
        txtWelcome.setText("Login");

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javalibrarymanagement/back.png"))); // NOI18N
        btnBack.setBorder(null);
        btnBack.setBorderPainted(false);
        btnBack.setContentAreaFilled(false);
        btnBack.setFocusPainted(false);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javalibrarymanagement/exit.png"))); // NOI18N
        btnExit.setBorder(null);
        btnExit.setBorderPainted(false);
        btnExit.setContentAreaFilled(false);
        btnExit.setFocusPainted(false);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        tblMembers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Phone", "Adress", "Mail", "Username", "Departmant", "Avaible Right", "Type"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMembers.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblMembers);
        if (tblMembers.getColumnModel().getColumnCount() > 0) {
            tblMembers.getColumnModel().getColumn(0).setResizable(false);
            tblMembers.getColumnModel().getColumn(1).setResizable(false);
            tblMembers.getColumnModel().getColumn(2).setResizable(false);
            tblMembers.getColumnModel().getColumn(3).setResizable(false);
            tblMembers.getColumnModel().getColumn(4).setResizable(false);
            tblMembers.getColumnModel().getColumn(5).setResizable(false);
            tblMembers.getColumnModel().getColumn(6).setResizable(false);
            tblMembers.getColumnModel().getColumn(7).setResizable(false);
            tblMembers.getColumnModel().getColumn(8).setResizable(false);
            tblMembers.getColumnModel().getColumn(8).setHeaderValue("Type");
        }

        jLabel1.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel1.setText("If you want to show user's borrows, select in the table");

        etID.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        etID.setToolTipText("");
        etID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                etIDKeyReleased(evt);
            }
        });

        etName.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        etName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                etNameKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel3.setText("ID");

        tblBorrows.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ISBN", "Book", "Author", "Member", "Librarian", "Issue Date", "Return Date", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblBorrows.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tblBorrows);
        if (tblBorrows.getColumnModel().getColumnCount() > 0) {
            tblBorrows.getColumnModel().getColumn(0).setResizable(false);
            tblBorrows.getColumnModel().getColumn(1).setResizable(false);
            tblBorrows.getColumnModel().getColumn(2).setResizable(false);
            tblBorrows.getColumnModel().getColumn(3).setResizable(false);
            tblBorrows.getColumnModel().getColumn(3).setHeaderValue("Member");
            tblBorrows.getColumnModel().getColumn(4).setResizable(false);
            tblBorrows.getColumnModel().getColumn(5).setResizable(false);
            tblBorrows.getColumnModel().getColumn(6).setResizable(false);
            tblBorrows.getColumnModel().getColumn(6).setHeaderValue("Return Date");
            tblBorrows.getColumnModel().getColumn(7).setResizable(false);
        }

        jLabel4.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel4.setText("Borrows");

        btnSelectUser.setBackground(new java.awt.Color(0, 102, 102));
        btnSelectUser.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btnSelectUser.setForeground(new java.awt.Color(255, 255, 255));
        btnSelectUser.setText("Select User");
        btnSelectUser.setBorderPainted(false);
        btnSelectUser.setFocusPainted(false);
        btnSelectUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectUserActionPerformed(evt);
            }
        });

        tblRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ISBN", "Book", "Author", "Member", "Request Date", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblRequest.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tblRequest);
        if (tblRequest.getColumnModel().getColumnCount() > 0) {
            tblRequest.getColumnModel().getColumn(0).setResizable(false);
            tblRequest.getColumnModel().getColumn(1).setResizable(false);
            tblRequest.getColumnModel().getColumn(2).setResizable(false);
            tblRequest.getColumnModel().getColumn(3).setResizable(false);
            tblRequest.getColumnModel().getColumn(4).setResizable(false);
            tblRequest.getColumnModel().getColumn(5).setResizable(false);
        }

        jLabel8.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel8.setText("Requests");

        btnApprove.setBackground(new java.awt.Color(0, 102, 102));
        btnApprove.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btnApprove.setForeground(new java.awt.Color(255, 255, 255));
        btnApprove.setText("Approve Request");
        btnApprove.setBorderPainted(false);
        btnApprove.setFocusPainted(false);
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });

        btnGive.setBackground(new java.awt.Color(0, 102, 102));
        btnGive.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btnGive.setForeground(new java.awt.Color(255, 255, 255));
        btnGive.setText("Give Book");
        btnGive.setBorderPainted(false);
        btnGive.setFocusPainted(false);
        btnGive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGiveActionPerformed(evt);
            }
        });

        btnReject.setBackground(new java.awt.Color(0, 102, 102));
        btnReject.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btnReject.setForeground(new java.awt.Color(255, 255, 255));
        btnReject.setText("Reject Request");
        btnReject.setBorderPainted(false);
        btnReject.setFocusPainted(false);
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 953, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE))
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnGive, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etName)
                            .addComponent(etID)
                            .addComponent(btnSelectUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnApprove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(btnReject, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBack, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtWelcome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSelectUser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnApprove, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGive, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(230, 0, 1270, 730);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new LibrarianIntro(currentLibrarian).setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.processWindowEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_btnExitActionPerformed

    private void etIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_etIDKeyReleased
        etName.setText("");
        memberList = service.searchMembersWithID(etID.getText());
        model.setRowCount(0);
        addMembersToTable(memberList);
    }//GEN-LAST:event_etIDKeyReleased

    private void etNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_etNameKeyReleased
        etID.setText("");
        memberList = service.searchMembersWithName(etName.getText());
        model.setRowCount(0);
        addMembersToTable(memberList);
    }//GEN-LAST:event_etNameKeyReleased

    private void btnSelectUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectUserActionPerformed
        int selectedRow = tblMembers.getSelectedRow();
        if(selectedRow != -1){
            model2.setRowCount(0);
            Member member = service.searchMembersWithName(tblMembers.getValueAt(selectedRow, 1).toString()).get(0);
            issueList = service.getMyIssues(member);
            addIssuessToTable(issueList);
            model3.setRowCount(0);
            requestList = service.getMemberRequests(member.getUserID());
            addRequestsToTable(requestList);
        }else{
            JOptionPane.showMessageDialog(this, "Please select member in the table", "Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSelectUserActionPerformed

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        int selectedRow = tblRequest.getSelectedRow();
        if(selectedRow != -1){
            Member member = service.searchMembersWithName(tblRequest.getValueAt(selectedRow, 3).toString()).get(0);
            if(!service.approveRequest(member.getUserID(), tblRequest.getValueAt(selectedRow, 0).toString())){
                model3.setRowCount(0);
                requestList = service.getAllRequests();
                addRequestsToTable(requestList);
                JOptionPane.showMessageDialog(this, "Request successfully approved.", "Success",JOptionPane.INFORMATION_MESSAGE);
            }else{
            JOptionPane.showMessageDialog(this, "Error", "Error",JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Please select request in the table", "Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnApproveActionPerformed

    private void btnGiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGiveActionPerformed
        int selectedRow = tblRequest.getSelectedRow();
        String bookISBN = tblRequest.getValueAt(selectedRow, 0).toString();
        if(selectedRow != -1){
            Member member = service.searchMembersWithName(tblRequest.getValueAt(selectedRow, 3).toString()).get(0);
            if(!service.createIssue(bookISBN, member.getUserID(), currentLibrarian.getLibrarianID(), LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")), "0", service.searchWithISBN(bookISBN).get(0).getCopy())){
                if(!service.closeRequest(member.getUserID(), bookISBN) ){
                    model3.setRowCount(0);
                    requestList = service.getAllRequests();
                    addRequestsToTable(requestList);
                    model2.setRowCount(0);
                    JOptionPane.showMessageDialog(this, "Book successfully gived.", "Success",JOptionPane.INFORMATION_MESSAGE);   
                }else{
                    JOptionPane.showMessageDialog(this, "Error", "Error",JOptionPane.ERROR_MESSAGE);
                }
            }else{
            JOptionPane.showMessageDialog(this, "Error", "Error",JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Please select request in the table", "Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGiveActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        int selectedRow = tblRequest.getSelectedRow();
        String bookISBN = tblRequest.getValueAt(selectedRow, 0).toString();
        if(selectedRow != -1){
            Member member = service.searchMembersWithName(tblRequest.getValueAt(selectedRow, 3).toString()).get(0);
            if(!service.rejectRequest(member.getUserID(), bookISBN)){ 
                model3.setRowCount(0);
                requestList = service.getAllRequests();
                addRequestsToTable(requestList);
                JOptionPane.showMessageDialog(this, "Request successfully rejected.", "Success",JOptionPane.INFORMATION_MESSAGE);
            }else{
            JOptionPane.showMessageDialog(this, "Error", "Error",JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Please select request in the table", "Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRejectActionPerformed

    private Object[] mapMembersForTable(Member searchedMember){
        Object[] row = {
                searchedMember.getUserID(),
                searchedMember.getMemberName(),
                searchedMember.getMemberPhone(),
                searchedMember.getMemberAddress(),
                searchedMember.getMemberMail(),
                searchedMember.getMemberUsername(),
                searchedMember.getDepartmantName(),
                searchedMember.getMemberCurrentRight(),
                searchedMember.getMemberType()
            };
        return row;
    }
    
    private void addMembersToTable(ArrayList<Member> memberList){
        for(Member member:memberList){
            Object[] row = mapMembersForTable(member);
            model.addRow(row);
        }
    }
    
    private Object[] mapIssueForTable(BookIssue issue){
        Object[] row = {
                issue.getISBN(),
                issue.getBookName(),
                issue.getAuthorName(),
                issue.getMemberName(),
                issue.getLibrarianName(),
                issue.getBorrowingDate(),
                issue.getReturnDate(),
                issue.getStatus()
            };
        return row;
    }
    
    private void addIssuessToTable(ArrayList<BookIssue> bookIssues){
        for(BookIssue issue:bookIssues){
            Object[] row = mapIssueForTable(issue);
            model2.addRow(row);
        }
    }
    
    private Object[] mapRequestsForTable(BorrowRequest request){
        Object[] row = {
            request.getBookISBN(),
            request.getBookName(),
            request.getBookAuthor(),
            request.getMemberName(),
            request.getRequestDate(),
            request.getRequestStatus()
        };
        return row;
    }
    
    private void addRequestsToTable(ArrayList<BorrowRequest> borrowRequests){
        for(BorrowRequest request:borrowRequests){
            Object[] row = mapRequestsForTable(request);
            model3.addRow(row);
        }
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnGive;
    private javax.swing.JButton btnReject;
    private javax.swing.JButton btnSelectUser;
    private javax.swing.JTextField etID;
    private javax.swing.JTextField etName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblBorrows;
    private javax.swing.JTable tblMembers;
    private javax.swing.JTable tblRequest;
    private javax.swing.JLabel txtWelcome;
    // End of variables declaration//GEN-END:variables
}
