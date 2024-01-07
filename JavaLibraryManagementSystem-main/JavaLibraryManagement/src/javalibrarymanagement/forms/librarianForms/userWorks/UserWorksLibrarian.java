package javalibrarymanagement.forms.librarianForms.userWorks;

import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javalibrarymanagement.data.LibraryService;
import javalibrarymanagement.data.model.Academician;
import javalibrarymanagement.data.model.Book;
import javalibrarymanagement.data.model.Librarian;
import javalibrarymanagement.data.model.Member;
import javalibrarymanagement.data.model.Student;
import javalibrarymanagement.forms.librarianForms.LibrarianIntro;
import javalibrarymanagement.utils.CenterScreen;
import javalibrarymanagement.utils.TableDecarator;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class UserWorksLibrarian extends javax.swing.JFrame {

    private final Librarian currentLibrarian;
    private final LibraryService service = LibraryService.getInstance();    
    private final DefaultTableModel model;
    private final DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
    private ArrayList<Member> memberList = service.getAllMembers();
    
    public UserWorksLibrarian(Librarian librarian) {
        initComponents();
        CenterScreen.centerScreen(this);
        currentLibrarian = librarian;
        txtWelcome.setText("Librarian : "+currentLibrarian.getLibrarianName());
        model = (DefaultTableModel)tblMembers.getModel();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        tblMembers.setDefaultRenderer(String.class, centerRenderer);
        tblMembers.setDefaultRenderer(int.class, centerRenderer);
        addMembersToTable(memberList);
        TableDecarator.tableCustomize(tblMembers);
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
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMembers = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        etID = new javax.swing.JTextField();
        etName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

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
                .addContainerGap(107, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 230, 530);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        txtWelcome.setFont(new java.awt.Font("Poppins", 0, 36)); // NOI18N
        txtWelcome.setForeground(new java.awt.Color(0, 102, 102));
        txtWelcome.setText("Login");
        jPanel3.add(txtWelcome);
        txtWelcome.setBounds(19, 20, 953, 55);

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
        jPanel3.add(btnBack);
        btnBack.setBounds(1104, 20, 55, 55);

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
        jPanel3.add(btnExit);
        btnExit.setBounds(1177, 20, 55, 55);

        btnAdd.setBackground(new java.awt.Color(0, 102, 102));
        btnAdd.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("AddUser");
        btnAdd.setBorderPainted(false);
        btnAdd.setFocusPainted(false);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel3.add(btnAdd);
        btnAdd.setBounds(1032, 291, 200, 60);

        btnDelete.setBackground(new java.awt.Color(0, 102, 102));
        btnDelete.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("DeleteUser");
        btnDelete.setBorderPainted(false);
        btnDelete.setFocusPainted(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel3.add(btnDelete);
        btnDelete.setBounds(1032, 369, 200, 60);

        btnUpdate.setBackground(new java.awt.Color(0, 102, 102));
        btnUpdate.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("UpdateUser");
        btnUpdate.setBorderPainted(false);
        btnUpdate.setFocusPainted(false);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel3.add(btnUpdate);
        btnUpdate.setBounds(1032, 447, 200, 60);

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
            tblMembers.getColumnModel().getColumn(7).setPreferredWidth(30);
            tblMembers.getColumnModel().getColumn(8).setResizable(false);
        }

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(19, 133, 995, 374);

        jLabel1.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel1.setText("Current Users");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(19, 93, 310, 22);

        etID.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        etID.setToolTipText("");
        etID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                etIDKeyReleased(evt);
            }
        });
        jPanel3.add(etID);
        etID.setBounds(1032, 156, 200, 40);

        etName.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        etName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                etNameKeyReleased(evt);
            }
        });
        jPanel3.add(etName);
        etName.setBounds(1032, 233, 200, 40);

        jLabel2.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel2.setText("Name");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(1032, 208, 37, 19);

        jLabel3.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel3.setText("ID");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(1032, 131, 37, 19);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(230, 0, 1270, 530);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        new AddUserLibrarian(currentLibrarian).setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int selectedRow = tblMembers.getSelectedRow();
        if(selectedRow != -1){
            Boolean result = false;
            String memberID = tblMembers.getValueAt(selectedRow, 0).toString();
            if(tblMembers.getValueAt(selectedRow, 8).toString().equals("Academician")){
                result=service.deleteMember(memberID, "Academician");
            }else if(tblMembers.getValueAt(selectedRow, 8).toString().equals("Student")){
                result=service.deleteMember(memberID, "Student");
            }
            if(result){
                JOptionPane.showMessageDialog(this, "Member successfully deleted.", "Success",JOptionPane.INFORMATION_MESSAGE);
                model.setRowCount(0);
                memberList = service.getAllMembers();
                addMembersToTable(memberList);
            }else{
                JOptionPane.showMessageDialog(this, "Member have borrowed books first take back the books", "Error",JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Please select member in the table", "Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        int selectedRow = tblMembers.getSelectedRow();
        if(selectedRow != -1){
            ArrayList<Member> member = service.searchMembersWithID(tblMembers.getValueAt(selectedRow, 0).toString());    
            if(tblMembers.getValueAt(selectedRow, 8).toString().equals("Academician")){
                new UpdateAcademicianLibrarian(currentLibrarian, (Academician)member.get(0)).setVisible(true);
                this.setVisible(false);
                this.dispose();
            }else if(tblMembers.getValueAt(selectedRow, 8).toString().equals("Student")){
                new UpdateStudentLibrarian(currentLibrarian, (Student)member.get(0)).setVisible(true);
                this.setVisible(false);
                this.dispose();
            }
        }else{
            JOptionPane.showMessageDialog(this, "Please select member in the table", "Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JTextField etID;
    private javax.swing.JTextField etName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMembers;
    private javax.swing.JLabel txtWelcome;
    // End of variables declaration//GEN-END:variables
}
