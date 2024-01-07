package javalibrarymanagement.forms.librarianForms;

import javalibrarymanagement.forms.librarianForms.takeBack.BorrowReturnLibrarian;
import javalibrarymanagement.forms.librarianForms.userWorks.UserWorksLibrarian;
import java.awt.event.WindowEvent;
import javalibrarymanagement.data.model.*;
import javalibrarymanagement.forms.Login;
import javalibrarymanagement.forms.librarianForms.annoucements.AnnoucementsLibrarian;
import javalibrarymanagement.forms.librarianForms.bookWorks.BookWorksLibrarian;
import javalibrarymanagement.forms.librarianForms.events.EventsLibrarian;
import javalibrarymanagement.forms.librarianForms.giveBook.GiveBookLibrarian;
import javalibrarymanagement.utils.CenterScreen;

public class LibrarianIntro extends javax.swing.JFrame {

    private final Librarian currentLibrarian;
    
    public LibrarianIntro(Librarian librarian) {
        initComponents();
        CenterScreen.centerScreen(this);
        currentLibrarian = librarian;
        txtWelcome.setText("Librarian : "+currentLibrarian.getLibrarianName());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel8 = new javax.swing.JPanel();
        Right4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        librarianLeft = new javax.swing.JPanel();
        txtWelcome = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        btnChangeUser = new javax.swing.JButton();
        btnEventWorks = new javax.swing.JButton();
        btnUserWorks = new javax.swing.JButton();
        btnLibrarianWorks = new javax.swing.JButton();
        btnLibraryWorks = new javax.swing.JButton();
        btnAnnoucementWorks = new javax.swing.JButton();
        btnRequestWorks = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel8.setBackground(new java.awt.Color(102, 102, 0));
        jPanel8.setMaximumSize(new java.awt.Dimension(800, 500));
        jPanel8.setPreferredSize(new java.awt.Dimension(1500, 600));
        jPanel8.setLayout(null);

        Right4.setBackground(new java.awt.Color(0, 102, 102));
        Right4.setPreferredSize(new java.awt.Dimension(230, 500));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javalibrarymanagement/library.png"))); // NOI18N
        jLabel14.setText("jLabel5");

        jLabel15.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Library Management System");

        javax.swing.GroupLayout Right4Layout = new javax.swing.GroupLayout(Right4);
        Right4.setLayout(Right4Layout);
        Right4Layout.setHorizontalGroup(
            Right4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Right4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(Right4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        Right4Layout.setVerticalGroup(
            Right4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Right4Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel8.add(Right4);
        Right4.setBounds(0, 0, 230, 490);

        librarianLeft.setBackground(new java.awt.Color(255, 255, 255));
        librarianLeft.setMaximumSize(new java.awt.Dimension(1270, 600));
        librarianLeft.setPreferredSize(new java.awt.Dimension(1270, 600));

        txtWelcome.setFont(new java.awt.Font("Poppins", 0, 36)); // NOI18N
        txtWelcome.setForeground(new java.awt.Color(0, 102, 102));
        txtWelcome.setText("Login");

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

        btnEventWorks.setBackground(new java.awt.Color(0, 102, 102));
        btnEventWorks.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btnEventWorks.setForeground(new java.awt.Color(255, 255, 255));
        btnEventWorks.setText("Events");
        btnEventWorks.setBorderPainted(false);
        btnEventWorks.setFocusPainted(false);
        btnEventWorks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEventWorksActionPerformed(evt);
            }
        });

        btnUserWorks.setBackground(new java.awt.Color(0, 102, 102));
        btnUserWorks.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btnUserWorks.setForeground(new java.awt.Color(255, 255, 255));
        btnUserWorks.setText("User Works");
        btnUserWorks.setBorderPainted(false);
        btnUserWorks.setFocusPainted(false);
        btnUserWorks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserWorksActionPerformed(evt);
            }
        });

        btnLibrarianWorks.setBackground(new java.awt.Color(0, 102, 102));
        btnLibrarianWorks.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btnLibrarianWorks.setForeground(new java.awt.Color(255, 255, 255));
        btnLibrarianWorks.setText("Take Book Return");
        btnLibrarianWorks.setBorderPainted(false);
        btnLibrarianWorks.setFocusPainted(false);
        btnLibrarianWorks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLibrarianWorksActionPerformed(evt);
            }
        });

        btnLibraryWorks.setBackground(new java.awt.Color(0, 102, 102));
        btnLibraryWorks.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btnLibraryWorks.setForeground(new java.awt.Color(255, 255, 255));
        btnLibraryWorks.setText("Book Works");
        btnLibraryWorks.setBorderPainted(false);
        btnLibraryWorks.setFocusPainted(false);
        btnLibraryWorks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLibraryWorksActionPerformed(evt);
            }
        });

        btnAnnoucementWorks.setBackground(new java.awt.Color(0, 102, 102));
        btnAnnoucementWorks.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btnAnnoucementWorks.setForeground(new java.awt.Color(255, 255, 255));
        btnAnnoucementWorks.setText("Annoucements");
        btnAnnoucementWorks.setBorderPainted(false);
        btnAnnoucementWorks.setFocusPainted(false);
        btnAnnoucementWorks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnoucementWorksActionPerformed(evt);
            }
        });

        btnRequestWorks.setBackground(new java.awt.Color(0, 102, 102));
        btnRequestWorks.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btnRequestWorks.setForeground(new java.awt.Color(255, 255, 255));
        btnRequestWorks.setText("Give Book");
        btnRequestWorks.setBorderPainted(false);
        btnRequestWorks.setFocusPainted(false);
        btnRequestWorks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestWorksActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout librarianLeftLayout = new javax.swing.GroupLayout(librarianLeft);
        librarianLeft.setLayout(librarianLeftLayout);
        librarianLeftLayout.setHorizontalGroup(
            librarianLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(librarianLeftLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(librarianLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(librarianLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(librarianLeftLayout.createSequentialGroup()
                            .addComponent(btnUserWorks, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnEventWorks, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(librarianLeftLayout.createSequentialGroup()
                            .addComponent(txtWelcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(18, 18, 18)
                            .addComponent(btnChangeUser, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(26, 26, 26)
                            .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, librarianLeftLayout.createSequentialGroup()
                        .addGroup(librarianLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(librarianLeftLayout.createSequentialGroup()
                                .addComponent(btnLibrarianWorks, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAnnoucementWorks, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, librarianLeftLayout.createSequentialGroup()
                                .addComponent(btnRequestWorks, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnLibraryWorks, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(252, 252, 252)))
                .addGap(794, 794, 794))
        );
        librarianLeftLayout.setVerticalGroup(
            librarianLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(librarianLeftLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(librarianLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnChangeUser, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtWelcome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(librarianLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUserWorks, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEventWorks, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(librarianLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLibrarianWorks, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAnnoucementWorks, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(librarianLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRequestWorks, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLibraryWorks, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel8.add(librarianLeft);
        librarianLeft.setBounds(230, 0, 670, 490);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 896, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.processWindowEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnChangeUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeUserActionPerformed
        new Login().setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnChangeUserActionPerformed

    private void btnUserWorksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserWorksActionPerformed
        new UserWorksLibrarian(currentLibrarian).setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnUserWorksActionPerformed

    private void btnLibrarianWorksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLibrarianWorksActionPerformed
        new BorrowReturnLibrarian(currentLibrarian).setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnLibrarianWorksActionPerformed

    private void btnLibraryWorksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLibraryWorksActionPerformed
        new BookWorksLibrarian(currentLibrarian).setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnLibraryWorksActionPerformed

    private void btnRequestWorksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestWorksActionPerformed
        new GiveBookLibrarian(currentLibrarian).setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnRequestWorksActionPerformed

    private void btnEventWorksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEventWorksActionPerformed
        new EventsLibrarian(currentLibrarian).setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnEventWorksActionPerformed

    private void btnAnnoucementWorksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnoucementWorksActionPerformed
        new AnnoucementsLibrarian(currentLibrarian).setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnAnnoucementWorksActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Right4;
    private javax.swing.JButton btnAnnoucementWorks;
    private javax.swing.JButton btnChangeUser;
    private javax.swing.JButton btnEventWorks;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLibrarianWorks;
    private javax.swing.JButton btnLibraryWorks;
    private javax.swing.JButton btnRequestWorks;
    private javax.swing.JButton btnUserWorks;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel librarianLeft;
    private javax.swing.JLabel txtWelcome;
    // End of variables declaration//GEN-END:variables
}
