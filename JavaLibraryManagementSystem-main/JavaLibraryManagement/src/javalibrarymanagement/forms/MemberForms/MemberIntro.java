
package javalibrarymanagement.forms.memberForms;

import javalibrarymanagement.forms.memberForms.memberRequests.BookRequestsForMember;
import javalibrarymanagement.forms.memberForms.borrow.ShowBooksForMember;
import javalibrarymanagement.forms.memberForms.events.EventsForMember;
import javalibrarymanagement.forms.memberForms.annoucements.AnnoucementsForMember;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javalibrarymanagement.data.LibraryService;
import javalibrarymanagement.data.model.*;
import javalibrarymanagement.forms.Login;
import javalibrarymanagement.utils.CenterScreen;
import javalibrarymanagement.utils.TableDecarator;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class MemberIntro extends javax.swing.JFrame {
    
    private final Member currentMember;
    private final DefaultTableModel model;
    private ArrayList<BookIssue> allIssues = new ArrayList<>();
    private final DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
    private final LibraryService service = LibraryService.getInstance();

    public MemberIntro(Member member) {
        initComponents();
        CenterScreen.centerScreen(this);
        currentMember = member;
        txtRights.setText("Current Books & Avaible Right : "+member.getMemberCurrentRight());
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        tblCurrentBooks.setDefaultRenderer(String.class, centerRenderer);
        tblCurrentBooks.setDefaultRenderer(int.class, centerRenderer);
        txtWelcome.setText(currentMember.getUserName());
        model = (DefaultTableModel)tblCurrentBooks.getModel();
        allIssues = service.getMyIssues(currentMember);
        TableDecarator.tableCustomize(tblCurrentBooks);
        for(BookIssue issue:allIssues){
            Object[] row = {
                issue.getISBN(),
                issue.getBookName(),
                issue.getAuthorName(),
                issue.getLibrarianName(),
                issue.getStatus(),
                issue.getBorrowingDate(),
                issue.getReturnDate()
            };
            model.addRow(row);
        }
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
        btnShowBooks = new javax.swing.JButton();
        btnShowProfile = new javax.swing.JButton();
        btnEventCalendar = new javax.swing.JButton();
        btnShowAnnouncements = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCurrentBooks = new javax.swing.JTable();
        txtRights = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        btnChangeUser = new javax.swing.JButton();

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

        btnShowBooks.setBackground(new java.awt.Color(0, 102, 102));
        btnShowBooks.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btnShowBooks.setForeground(new java.awt.Color(255, 255, 255));
        btnShowBooks.setText("Show Books & Borrow Book");
        btnShowBooks.setBorderPainted(false);
        btnShowBooks.setFocusPainted(false);
        btnShowBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowBooksActionPerformed(evt);
            }
        });
        jPanel1.add(btnShowBooks);
        btnShowBooks.setBounds(28, 268, 327, 100);

        btnShowProfile.setBackground(new java.awt.Color(0, 102, 102));
        btnShowProfile.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btnShowProfile.setForeground(new java.awt.Color(255, 255, 255));
        btnShowProfile.setText("My Book Request");
        btnShowProfile.setBorderPainted(false);
        btnShowProfile.setFocusPainted(false);
        btnShowProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowProfileActionPerformed(evt);
            }
        });
        jPanel1.add(btnShowProfile);
        btnShowProfile.setBounds(28, 374, 327, 100);

        btnEventCalendar.setBackground(new java.awt.Color(0, 102, 102));
        btnEventCalendar.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btnEventCalendar.setForeground(new java.awt.Color(255, 255, 255));
        btnEventCalendar.setText("Event Calendar");
        btnEventCalendar.setBorderPainted(false);
        btnEventCalendar.setFocusPainted(false);
        btnEventCalendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEventCalendarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEventCalendar);
        btnEventCalendar.setBounds(363, 374, 327, 100);

        btnShowAnnouncements.setBackground(new java.awt.Color(0, 102, 102));
        btnShowAnnouncements.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btnShowAnnouncements.setForeground(new java.awt.Color(255, 255, 255));
        btnShowAnnouncements.setText("Announcements");
        btnShowAnnouncements.setBorderPainted(false);
        btnShowAnnouncements.setFocusPainted(false);
        btnShowAnnouncements.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowAnnouncementsActionPerformed(evt);
            }
        });
        jPanel1.add(btnShowAnnouncements);
        btnShowAnnouncements.setBounds(363, 268, 327, 100);

        tblCurrentBooks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ISBN", "Name", "Author", "Librarian", "Status", "Borrowing Date", "Return Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCurrentBooks.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblCurrentBooks.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblCurrentBooks);
        if (tblCurrentBooks.getColumnModel().getColumnCount() > 0) {
            tblCurrentBooks.getColumnModel().getColumn(0).setResizable(false);
            tblCurrentBooks.getColumnModel().getColumn(1).setResizable(false);
            tblCurrentBooks.getColumnModel().getColumn(2).setResizable(false);
            tblCurrentBooks.getColumnModel().getColumn(3).setResizable(false);
            tblCurrentBooks.getColumnModel().getColumn(4).setResizable(false);
            tblCurrentBooks.getColumnModel().getColumn(5).setResizable(false);
            tblCurrentBooks.getColumnModel().getColumn(6).setResizable(false);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(28, 134, 660, 122);

        txtRights.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtRights.setText("Current Books & Avaible Right : ?");
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
        btnExit.setBounds(640, 20, 48, 55);

        btnChangeUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javalibrarymanagement/changeUser.png"))); // NOI18N
        btnChangeUser.setBorder(null);
        btnChangeUser.setBorderPainted(false);
        btnChangeUser.setContentAreaFilled(false);
        btnChangeUser.setFocusPainted(false);
        btnChangeUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeUserActionPerformed(evt);
            }
        });
        jPanel1.add(btnChangeUser);
        btnChangeUser.setBounds(560, 10, 60, 70);

        jPanel2.add(jPanel1);
        jPanel1.setBounds(231, 0, 720, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnShowBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowBooksActionPerformed
             new ShowBooksForMember(currentMember).setVisible(true);
             this.setVisible(false);
             this.dispose();
    }//GEN-LAST:event_btnShowBooksActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.processWindowEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnChangeUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeUserActionPerformed
        new Login().setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnChangeUserActionPerformed

    private void btnShowProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowProfileActionPerformed
        new BookRequestsForMember(currentMember).setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnShowProfileActionPerformed

    private void btnShowAnnouncementsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowAnnouncementsActionPerformed
        new AnnoucementsForMember(currentMember).setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnShowAnnouncementsActionPerformed

    private void btnEventCalendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEventCalendarActionPerformed
        new EventsForMember(currentMember).setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnEventCalendarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Right;
    private javax.swing.JButton btnChangeUser;
    private javax.swing.JButton btnEventCalendar;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnShowAnnouncements;
    private javax.swing.JButton btnShowBooks;
    private javax.swing.JButton btnShowProfile;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCurrentBooks;
    private javax.swing.JLabel txtRights;
    private javax.swing.JLabel txtWelcome;
    // End of variables declaration//GEN-END:variables
}
