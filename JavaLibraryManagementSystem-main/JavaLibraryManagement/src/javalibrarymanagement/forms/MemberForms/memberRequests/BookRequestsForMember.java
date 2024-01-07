
package javalibrarymanagement.forms.memberForms.memberRequests;

import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javalibrarymanagement.data.LibraryService;
import javalibrarymanagement.data.model.BorrowRequest;
import javalibrarymanagement.data.model.Member;
import javalibrarymanagement.forms.memberForms.MemberIntro;
import javalibrarymanagement.utils.CenterScreen;
import javalibrarymanagement.utils.TableDecarator;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class BookRequestsForMember extends javax.swing.JFrame {

    private final Member currentMember;
    private final DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
    private final DefaultTableModel model;
    private final LibraryService service = LibraryService.getInstance();
    
    public BookRequestsForMember(Member member) {
        initComponents();
        CenterScreen.centerScreen(this);
        txtWelcome.setText(member.getUserName());
        model = (DefaultTableModel)tblRequests.getModel();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        tblRequests.setDefaultRenderer(String.class, centerRenderer);
        tblRequests.setDefaultRenderer(int.class, centerRenderer);
        currentMember = member;
        TableDecarator.tableCustomize(tblRequests);
        getAndFillTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        Right = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtWelcome = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRequests = new javax.swing.JTable();
        txtRights = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(800, 500));
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel2.setLayout(null);

        Right.setBackground(new java.awt.Color(0, 102, 102));
        Right.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javalibrarymanagement/library.png"))); // NOI18N
        jLabel5.setText("jLabel5");

        jLabel6.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Library Management System");

        javax.swing.GroupLayout RightLayout = new javax.swing.GroupLayout(Right);
        Right.setLayout(RightLayout);
        RightLayout.setHorizontalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        RightLayout.setVerticalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        jPanel2.add(Right);
        Right.setBounds(0, 0, 230, 500);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(400, 500));
        jPanel1.setLayout(null);

        txtWelcome.setFont(new java.awt.Font("Poppins", 0, 36)); // NOI18N
        txtWelcome.setForeground(new java.awt.Color(0, 102, 102));
        txtWelcome.setText("Login");
        jPanel1.add(txtWelcome);
        txtWelcome.setBounds(28, 20, 340, 55);

        btnCancel.setBackground(new java.awt.Color(0, 102, 102));
        btnCancel.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Cancel");
        btnCancel.setBorderPainted(false);
        btnCancel.setFocusPainted(false);
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancel);
        btnCancel.setBounds(280, 380, 250, 100);

        tblRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ISBN", "Name", "Author", "Request Date", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblRequests.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tblRequests);
        if (tblRequests.getColumnModel().getColumnCount() > 0) {
            tblRequests.getColumnModel().getColumn(0).setResizable(false);
            tblRequests.getColumnModel().getColumn(1).setResizable(false);
            tblRequests.getColumnModel().getColumn(2).setResizable(false);
            tblRequests.getColumnModel().getColumn(3).setResizable(false);
            tblRequests.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(28, 134, 500, 230);

        txtRights.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtRights.setText("My Current Request");
        jPanel1.add(txtRights);
        txtRights.setBounds(28, 94, 330, 22);

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
        jPanel1.add(btnExit);
        btnExit.setBounds(486, 20, 48, 55);

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javalibrarymanagement/back.png"))); // NOI18N
        btnBack.setBorderPainted(false);
        btnBack.setContentAreaFilled(false);
        btnBack.setFocusPainted(false);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack);
        btnBack.setBounds(410, 20, 60, 50);

        jPanel2.add(jPanel1);
        jPanel1.setBounds(231, 0, 570, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.processWindowEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        int selectedRow = tblRequests.getSelectedRow();
        if(selectedRow != -1){
            Boolean res = service.deleteBorrowRequestFromUser(tblRequests.getValueAt(selectedRow, 0).toString(), currentMember);
            if(res){
                JOptionPane.showMessageDialog(this, "Something was wrong", "Delete Error.",JOptionPane.ERROR_MESSAGE);
            }else{
               JOptionPane.showMessageDialog(this, "Request successfully deleted", "Successfuly.",JOptionPane.INFORMATION_MESSAGE); 
               model.setRowCount(0);
               getAndFillTable();
            }
        }else{
          JOptionPane.showMessageDialog(this, "Please select a request from the table and click on the button.", "Request has not selected",JOptionPane.ERROR_MESSAGE);         
        }
        
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new MemberIntro(currentMember).setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void getAndFillTable(){
        ArrayList<BorrowRequest> requests = service.getMemberRequests(currentMember.getUserID());
        for(BorrowRequest borrowRequest:requests){
            Object[] row = {
            borrowRequest.getBookISBN(),
            borrowRequest.getBookName(),
            borrowRequest.getBookAuthor(),
            borrowRequest.getRequestStatus(),
            borrowRequest.getRequestDate()
            };
            model.addRow(row);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Right;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnExit;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRequests;
    private javax.swing.JLabel txtRights;
    private javax.swing.JLabel txtWelcome;
    // End of variables declaration//GEN-END:variables
}
