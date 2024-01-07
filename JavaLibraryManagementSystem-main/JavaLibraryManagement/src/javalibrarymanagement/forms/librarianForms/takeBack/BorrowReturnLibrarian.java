package javalibrarymanagement.forms.librarianForms.takeBack;

import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javalibrarymanagement.data.LibraryService;
import javalibrarymanagement.data.model.BookIssue;
import javalibrarymanagement.data.model.Librarian;
import javalibrarymanagement.data.model.Member;
import javalibrarymanagement.forms.librarianForms.LibrarianIntro;
import javalibrarymanagement.utils.CenterScreen;
import javalibrarymanagement.utils.TableDecarator;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class BorrowReturnLibrarian extends javax.swing.JFrame {

    private final Librarian currentLibrarian;  
    private final DefaultTableModel model;
    private final DefaultTableModel model2;
    private final DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
    private final LibraryService service = LibraryService.getInstance();  
    private ArrayList<Member> memberList = service.getAllMembers();
    private final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    private ArrayList<BookIssue> issueList = service.getAllIssues();
    
    public BorrowReturnLibrarian(Librarian librarian) {
        initComponents();
        CenterScreen.centerScreen(this);
        currentLibrarian = librarian;
        txtWelcome.setText("Librarian : "+currentLibrarian.getLibrarianName());
        model = (DefaultTableModel)tblMembers.getModel();
        model2 = (DefaultTableModel)tblBorrows.getModel();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        tblMembers.setDefaultRenderer(String.class, centerRenderer);
        tblMembers.setDefaultRenderer(int.class, centerRenderer);
        tblBorrows.setDefaultRenderer(String.class, centerRenderer);
        tblBorrows.setDefaultRenderer(int.class, centerRenderer);
        addMembersToTable(memberList);
        addIssuessToTable(issueList);
        TableDecarator.tableCustomize(tblMembers);
        TableDecarator.tableCustomize(tblBorrows);
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
        jLabel7 = new javax.swing.JLabel();
        etReturnDate = new com.toedter.calendar.JDateChooser();
        btnTakeBack = new javax.swing.JButton();
        btnSelectUser = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(127, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 230, 550);

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
            tblBorrows.getColumnModel().getColumn(4).setResizable(false);
            tblBorrows.getColumnModel().getColumn(5).setResizable(false);
            tblBorrows.getColumnModel().getColumn(6).setResizable(false);
            tblBorrows.getColumnModel().getColumn(7).setResizable(false);
        }

        jLabel4.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel4.setText("Borrows");

        jLabel7.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel7.setText("Return Date");

        etReturnDate.setDateFormatString("d MM y");

        btnTakeBack.setBackground(new java.awt.Color(0, 102, 102));
        btnTakeBack.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btnTakeBack.setForeground(new java.awt.Color(255, 255, 255));
        btnTakeBack.setText("Take Back The Book");
        btnTakeBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTakeBackActionPerformed(evt);
            }
        });

        btnSelectUser.setBackground(new java.awt.Color(0, 102, 102));
        btnSelectUser.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btnSelectUser.setForeground(new java.awt.Color(255, 255, 255));
        btnSelectUser.setText("Select User");
        btnSelectUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectUserActionPerformed(evt);
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
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etName)
                            .addComponent(btnTakeBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etReturnDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etID, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(btnSelectUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(38, 38, 38))
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
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etReturnDate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTakeBack, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(230, 0, 1270, 550);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
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

    private void btnTakeBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTakeBackActionPerformed
        int selectedRow = tblBorrows.getSelectedRow();
        if(etReturnDate.getDate() != null){
            if(selectedRow != -1){
                String date = sdf.format(etReturnDate.getDate());
                String memberID = service.searchMembersWithName(tblBorrows.getValueAt(selectedRow, 3).toString()).get(0).getUserID();
                String bookISBN = tblBorrows.getValueAt(selectedRow, 0).toString();
                System.err.println(memberID);
                System.err.println(date);
                System.err.println(bookISBN);
                if(!service.returnBook(date,memberID,bookISBN, service.searchWithISBN(bookISBN).get(0).getCopy())){
                    model2.setRowCount(0);
                    issueList = service.getAllIssues();
                    addIssuessToTable(issueList);
                    JOptionPane.showMessageDialog(this, "Successfully taked back", "Success",JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(this, "Error", "Error",JOptionPane.INFORMATION_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(this, "Please select borrow in the table", "Error",JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Please  enter true date format (dd-mm-yyyy)", "Error",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnTakeBackActionPerformed

    private void btnSelectUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectUserActionPerformed
        int selectedRow = tblMembers.getSelectedRow();
        if(selectedRow != -1){
            model2.setRowCount(0);
            Member member = service.searchMembersWithName(tblMembers.getValueAt(selectedRow, 1).toString()).get(0);
            issueList = service.getMyIssues(member);
            addIssuessToTable(issueList);
        }else{
            JOptionPane.showMessageDialog(this, "Please select member in the table", "Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSelectUserActionPerformed

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
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSelectUser;
    private javax.swing.JButton btnTakeBack;
    private javax.swing.JTextField etID;
    private javax.swing.JTextField etName;
    private com.toedter.calendar.JDateChooser etReturnDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblBorrows;
    private javax.swing.JTable tblMembers;
    private javax.swing.JLabel txtWelcome;
    // End of variables declaration//GEN-END:variables
}
