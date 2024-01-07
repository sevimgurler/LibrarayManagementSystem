
package javalibrarymanagement.forms.memberForms.borrow;

import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import javalibrarymanagement.data.LibraryService;
import javalibrarymanagement.data.model.*;
import javalibrarymanagement.utils.CenterScreen;
import javax.swing.JOptionPane;
public class BorrowBook extends javax.swing.JFrame {

    private final Member currentMember;
    private final Book currentBook;
    private final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    private final LibraryService service = LibraryService.getInstance();
    
    public BorrowBook(Book book, Member member) {
        initComponents();
        currentMember = member;
        currentBook = book;
        CenterScreen.centerScreen(this);
        txtWelcome.setText(currentMember.getUserName());
        lblISBN.setText(currentBook.getBookISBN());
        lblName.setText(currentBook.getBookName());
        lblAuthor.setText(currentBook.getAuthor());
        lblCategory.setText(currentBook.getCategoryName());
        lblEdition.setText(String.valueOf(currentBook.getBookEdition()));
        lblLanguage.setText(currentBook.getPublicationLanguage());
        lblPublisher.setText(currentBook.getPublisherName());
        lblLocation.setText(currentBook.getLocation());
        lblYear.setText(currentBook.getPublicationYear());
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
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lblISBN = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblPublisher = new javax.swing.JLabel();
        lblAuthor = new javax.swing.JLabel();
        lblYear = new javax.swing.JLabel();
        lblCategory = new javax.swing.JLabel();
        lblEdition = new javax.swing.JLabel();
        lblLanguage = new javax.swing.JLabel();
        lblLocation = new javax.swing.JLabel();
        btnCreateRequest = new javax.swing.JToggleButton();
        jLabel20 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        etDate = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(800, 500));
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel2.setLayout(null);

        Right.setBackground(new java.awt.Color(0, 102, 102));
        Right.setPreferredSize(new java.awt.Dimension(230, 500));

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
        jPanel1.setPreferredSize(new java.awt.Dimension(570, 500));
        jPanel1.setLayout(null);

        txtWelcome.setFont(new java.awt.Font("Poppins", 0, 36)); // NOI18N
        txtWelcome.setForeground(new java.awt.Color(0, 102, 102));
        txtWelcome.setText("Login");
        jPanel1.add(txtWelcome);
        txtWelcome.setBounds(29, 19, 340, 55);

        jLabel7.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel7.setText("Name  :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(67, 166, 50, 19);

        jLabel9.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel9.setText("Author  :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(62, 203, 50, 19);

        jLabel10.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel10.setText("Edition  :");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(62, 351, 50, 19);

        jLabel11.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel11.setText("Language  :");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(47, 388, 69, 19);

        jLabel12.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel12.setText("Location  :");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(56, 425, 60, 19);

        jLabel15.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel15.setText("Publisher :");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(50, 240, 70, 19);

        jLabel16.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel16.setText("Year  :");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(76, 277, 40, 19);

        jLabel17.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel17.setText("Category  :");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(47, 314, 70, 19);

        jLabel18.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel18.setText("Request Date");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(380, 320, 90, 19);

        jLabel19.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel19.setText("Selected Book;");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(29, 92, 330, 19);

        lblISBN.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        lblISBN.setText("XXXXX");
        jPanel1.add(lblISBN);
        lblISBN.setBounds(134, 129, 190, 19);

        lblName.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        lblName.setText("XXXXX");
        jPanel1.add(lblName);
        lblName.setBounds(134, 166, 210, 19);

        lblPublisher.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        lblPublisher.setText("XXXXX");
        jPanel1.add(lblPublisher);
        lblPublisher.setBounds(134, 240, 210, 19);

        lblAuthor.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        lblAuthor.setText("XXXXX");
        jPanel1.add(lblAuthor);
        lblAuthor.setBounds(134, 203, 210, 19);

        lblYear.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        lblYear.setText("XXXXX");
        jPanel1.add(lblYear);
        lblYear.setBounds(134, 277, 210, 19);

        lblCategory.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        lblCategory.setText("XXXXX");
        jPanel1.add(lblCategory);
        lblCategory.setBounds(134, 314, 210, 19);

        lblEdition.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        lblEdition.setText("XXXXX");
        jPanel1.add(lblEdition);
        lblEdition.setBounds(134, 351, 210, 19);

        lblLanguage.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        lblLanguage.setText("XXXXX");
        jPanel1.add(lblLanguage);
        lblLanguage.setBounds(134, 388, 210, 19);

        lblLocation.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        lblLocation.setText("XXXXX");
        jPanel1.add(lblLocation);
        lblLocation.setBounds(134, 425, 210, 19);

        btnCreateRequest.setBackground(new java.awt.Color(0, 102, 102));
        btnCreateRequest.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnCreateRequest.setForeground(new java.awt.Color(255, 255, 255));
        btnCreateRequest.setText("Create Request");
        btnCreateRequest.setBorderPainted(false);
        btnCreateRequest.setFocusPainted(false);
        btnCreateRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateRequestActionPerformed(evt);
            }
        });
        jPanel1.add(btnCreateRequest);
        btnCreateRequest.setBounds(380, 400, 160, 40);

        jLabel20.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel20.setText("ISBN :");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(80, 129, 40, 19);

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
        jPanel1.add(btnBack);
        btnBack.setBounds(410, 20, 60, 60);

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
        btnExit.setBounds(480, 20, 60, 60);

        etDate.setDateFormatString("d MMMM yyyy");
        etDate.setFocusable(false);
        etDate.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        etDate.setRequestFocusEnabled(false);
        jPanel1.add(etDate);
        etDate.setBounds(380, 350, 160, 40);

        jPanel2.add(jPanel1);
        jPanel1.setBounds(230, 0, 570, 500);

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

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new ShowBooksForMember(currentMember).setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCreateRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateRequestActionPerformed
        if(etDate.getDate() != null){
            Boolean isFailed = service.createBorrowRequest(currentBook.getBookISBN(), currentMember, sdf.format(etDate.getDate()));
            if(isFailed){
                JOptionPane.showMessageDialog(this, "Something was wrong", "Error.",JOptionPane.ERROR_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this, "Borrowing request successfully created.", "Succsess",JOptionPane.INFORMATION_MESSAGE);
                btnBackActionPerformed(evt);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Please enter true date format(Day-Mounth-Year).", "Succsess",JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_btnCreateRequestActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Right;
    private javax.swing.JButton btnBack;
    private javax.swing.JToggleButton btnCreateRequest;
    private javax.swing.JButton btnExit;
    private com.toedter.calendar.JDateChooser etDate;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAuthor;
    private javax.swing.JLabel lblCategory;
    private javax.swing.JLabel lblEdition;
    private javax.swing.JLabel lblISBN;
    private javax.swing.JLabel lblLanguage;
    private javax.swing.JLabel lblLocation;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPublisher;
    private javax.swing.JLabel lblYear;
    private javax.swing.JLabel txtWelcome;
    // End of variables declaration//GEN-END:variables
}
