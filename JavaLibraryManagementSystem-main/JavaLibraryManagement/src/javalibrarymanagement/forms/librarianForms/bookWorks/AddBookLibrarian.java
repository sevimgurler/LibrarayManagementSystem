package javalibrarymanagement.forms.librarianForms.bookWorks;

import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javalibrarymanagement.data.LibraryService;
import javalibrarymanagement.data.model.Author;
import javalibrarymanagement.data.model.Categories;
import javalibrarymanagement.data.model.Librarian;
import javalibrarymanagement.data.model.Location;
import javalibrarymanagement.data.model.Publisher;
import javalibrarymanagement.patterns.observer.Library;
import javalibrarymanagement.patterns.observer.LibraryPersonal;
import javalibrarymanagement.utils.CenterScreen;
import javax.swing.JOptionPane;


public class AddBookLibrarian extends javax.swing.JFrame {

    private final Librarian currentLibrarian;
    private final Library library = Library.getInstance(); 
    private final LibraryService service = LibraryService.getInstance();
    private final ArrayList<Categories> categoryList = service.getAllCategories();
    private final ArrayList<Location> locationList = service.getAllLocations();
    private final ArrayList<Author> authorList = service.getAllAuthors();
    private final ArrayList<Publisher> publisherList = service.getAllPublisher();
    private final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    private final LibraryPersonal personal; 
    
    public AddBookLibrarian(Librarian librarian) {
        initComponents();
        CenterScreen.centerScreen(this);
        currentLibrarian = librarian;
        personal = new LibraryPersonal(currentLibrarian);
        library.addObserver(personal);
        for(Categories categories:categoryList){
            cbCategory.addItem(categories.getCategoryName());
        }
        for(Location location:locationList){
            cbLocation.addItem(location.getLocation());
        }
        for(Author author:authorList){
            cbAuthor.addItem(author.getAuthorName());
        }
        for(Publisher publisher:publisherList){
            cbPublisher.addItem(publisher.getName());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        txtWelcome1 = new javax.swing.JLabel();
        etISBN = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        etName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        etCopy = new javax.swing.JTextField();
        btnAddLocation = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        cbLocation = new javax.swing.JComboBox<>();
        btnResetForm = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        cbCategory = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        cbAuthor = new javax.swing.JComboBox<>();
        btnAddCategory = new javax.swing.JButton();
        btnAddAuthor = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        cbPublisher = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        btnAddPublisher = new javax.swing.JButton();
        etEdition = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        etYear = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(0, 255, 51));
        jPanel3.setPreferredSize(new java.awt.Dimension(1180, 435));
        jPanel3.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javalibrarymanagement/library.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Library Management System");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel1);
        jPanel1.setBounds(0, 0, 220, 440);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

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

        txtWelcome1.setFont(new java.awt.Font("Poppins", 0, 36)); // NOI18N
        txtWelcome1.setForeground(new java.awt.Color(0, 102, 102));
        txtWelcome1.setText("Login");

        etISBN.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel1.setText("ISBN");

        etName.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel3.setText("Year");

        jLabel8.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel8.setText("Total Copy");

        etCopy.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N

        btnAddLocation.setBackground(new java.awt.Color(0, 102, 102));
        btnAddLocation.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btnAddLocation.setForeground(new java.awt.Color(255, 255, 255));
        btnAddLocation.setText("+");
        btnAddLocation.setBorderPainted(false);
        btnAddLocation.setFocusPainted(false);
        btnAddLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddLocationActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel15.setText("Location");

        cbLocation.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N

        btnResetForm.setBackground(new java.awt.Color(0, 102, 102));
        btnResetForm.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btnResetForm.setForeground(new java.awt.Color(255, 255, 255));
        btnResetForm.setText("Reset");
        btnResetForm.setBorderPainted(false);
        btnResetForm.setFocusPainted(false);

        jLabel16.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel16.setText("Category");

        cbCategory.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel17.setText("Author");

        cbAuthor.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N

        btnAddCategory.setBackground(new java.awt.Color(0, 102, 102));
        btnAddCategory.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btnAddCategory.setForeground(new java.awt.Color(255, 255, 255));
        btnAddCategory.setText("+");
        btnAddCategory.setBorderPainted(false);
        btnAddCategory.setFocusPainted(false);
        btnAddCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCategoryActionPerformed(evt);
            }
        });

        btnAddAuthor.setBackground(new java.awt.Color(0, 102, 102));
        btnAddAuthor.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btnAddAuthor.setForeground(new java.awt.Color(255, 255, 255));
        btnAddAuthor.setText("+");
        btnAddAuthor.setBorderPainted(false);
        btnAddAuthor.setFocusPainted(false);
        btnAddAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAuthorActionPerformed(evt);
            }
        });

        btnCreate.setBackground(new java.awt.Color(0, 102, 102));
        btnCreate.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(255, 255, 255));
        btnCreate.setText("Create");
        btnCreate.setBorderPainted(false);
        btnCreate.setFocusPainted(false);
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        cbPublisher.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel18.setText("Publisher");

        btnAddPublisher.setBackground(new java.awt.Color(0, 102, 102));
        btnAddPublisher.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btnAddPublisher.setForeground(new java.awt.Color(255, 255, 255));
        btnAddPublisher.setText("+");
        btnAddPublisher.setBorderPainted(false);
        btnAddPublisher.setFocusPainted(false);
        btnAddPublisher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPublisherActionPerformed(evt);
            }
        });

        etEdition.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel4.setText("Edition");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2)
                                    .addComponent(etName, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(etCopy, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(etYear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(etEdition, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(cbAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnAddAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(cbLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnAddLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(cbPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnAddPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(etISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(cbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnAddCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnResetForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCreate, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(txtWelcome1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtWelcome1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBack, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(6, 6, 6)
                                .addComponent(etISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(28, 28, 28)
                                    .addComponent(cbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel16)
                                    .addGap(7, 7, 7)
                                    .addComponent(btnAddCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(6, 6, 6)
                                        .addComponent(etName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(cbAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnAddAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel15))
                                .addGap(6, 6, 6)
                                .addComponent(etCopy, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cbLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnAddLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(6, 6, 6))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(etEdition, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                                    .addComponent(etYear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(46, 46, 46))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cbPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnAddPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnResetForm, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel2);
        jPanel2.setBounds(220, 0, 720, 440);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 940, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new BookWorksLibrarian(currentLibrarian).setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.processWindowEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnAddLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddLocationActionPerformed
        new AddLocationLibrarian(currentLibrarian).setVisible(true);
        this.setVisible(false);
        this.dispose();        
    }//GEN-LAST:event_btnAddLocationActionPerformed

    private void btnAddCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCategoryActionPerformed
        new AddCategoryLibrarian(currentLibrarian).setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnAddCategoryActionPerformed

    private void btnAddAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAuthorActionPerformed
        new AddAuthorLibrarian(currentLibrarian).setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnAddAuthorActionPerformed

    private void btnAddPublisherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPublisherActionPerformed
        new AddPublisherLibrarian(currentLibrarian).setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnAddPublisherActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        String bookISBN = etISBN.getText();
        String name = etName.getText();
        String copies = etCopy.getText();
        String year = sdf.format(etYear.getDate());
        String edition = etEdition.getText();
        int location = findIDByLocationName(cbLocation.getSelectedItem().toString());
        int author = findIDByAuthorName(cbAuthor.getSelectedItem().toString());
        int publisher = findIDByPublisherName(cbPublisher.getSelectedItem().toString());
        int category = findIDByCategoryName(cbCategory.getSelectedItem().toString());
        if(!service.addBook(bookISBN, name, year, edition, Integer.parseInt(copies), location, category, publisher, author)){
            JOptionPane.showMessageDialog(this, "Book added", "Success",JOptionPane.INFORMATION_MESSAGE);
            library.addBook(name);
            new BookWorksLibrarian(currentLibrarian).setVisible(true);
            this.setVisible(false);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(this, "Error", "Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private int findIDByCategoryName(String searchKey){
        int ID=-1;
        for(Categories category:categoryList){
            if(category.getCategoryName().equals(searchKey)){
               ID = category.getCategoryID();
            }
        }
        return ID;
    }
    
    private int findIDByLocationName(String searchKey){
        int ID=-1;
        for(Location location:locationList){
            if(location.getLocation().equals(searchKey)){
               ID = location.getLocationID();
            }
        }
        return ID;
    }
        
    private int findIDByAuthorName(String searchKey){
        int ID=-1;
        for(Author author:authorList){
            if(author.getAuthorName().equals(searchKey)){
               ID = author.getAuthorID();
            }
        }
        return ID;
    }
    
    private int findIDByPublisherName(String searchKey){
        int ID=-1;
        for(Publisher publisher:publisherList){
            if(publisher.getName().equals(searchKey)){
               ID = publisher.getPublisherID();
            }
        }
        return ID;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddAuthor;
    private javax.swing.JButton btnAddCategory;
    private javax.swing.JButton btnAddLocation;
    private javax.swing.JButton btnAddPublisher;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnResetForm;
    private javax.swing.JComboBox<String> cbAuthor;
    private javax.swing.JComboBox<String> cbCategory;
    private javax.swing.JComboBox<String> cbLocation;
    private javax.swing.JComboBox<String> cbPublisher;
    private javax.swing.JTextField etCopy;
    private javax.swing.JTextField etEdition;
    private javax.swing.JTextField etISBN;
    private javax.swing.JTextField etName;
    private com.toedter.calendar.JDateChooser etYear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel txtWelcome1;
    // End of variables declaration//GEN-END:variables
}
