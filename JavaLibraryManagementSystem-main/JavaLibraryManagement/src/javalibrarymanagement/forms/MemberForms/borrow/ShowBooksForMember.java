
package javalibrarymanagement.forms.memberForms.borrow;

import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javalibrarymanagement.data.LibraryService;
import javalibrarymanagement.data.model.*;
import javalibrarymanagement.forms.memberForms.MemberIntro;
import javalibrarymanagement.utils.CenterScreen;
import javalibrarymanagement.utils.TableDecarator;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class ShowBooksForMember extends javax.swing.JFrame {

    private final Member currentMember;
    private final DefaultTableModel model;
    private final DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
    private final LibraryService service = LibraryService.getInstance();
    private ArrayList<Book> bookList = service.getAllBooks();
    private final ArrayList<Categories> allCategories = service.getAllCategories();
   
    public ShowBooksForMember(Member member) {
        initComponents();
        CenterScreen.centerScreen(this);
        currentMember = member;
        txtWelcome.setText(currentMember.getUserName());
        model = (DefaultTableModel)tblBooks.getModel();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        tblBooks.setDefaultRenderer(String.class, centerRenderer);
        tblBooks.setDefaultRenderer(int.class, centerRenderer);
        addBooksToTable(bookList);
        TableDecarator.tableCustomize(tblBooks);
        for(Categories categories : allCategories){
            etCategory.addItem(categories.getCategoryName());
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBooks = new javax.swing.JTable();
        txtRights = new javax.swing.JLabel();
        etISBN = new javax.swing.JTextField();
        etCategory = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        etName = new javax.swing.JTextField();
        etAuthor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        etPublisher = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnBorrow = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1500, 600));

        jPanel2.setBackground(new java.awt.Color(102, 102, 0));
        jPanel2.setMaximumSize(new java.awt.Dimension(800, 500));
        jPanel2.setPreferredSize(new java.awt.Dimension(1500, 600));
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
                .addGap(128, 128, 128)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(144, Short.MAX_VALUE))
        );

        jPanel2.add(Right);
        Right.setBounds(0, 0, 230, 600);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1270, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(1270, 600));
        jPanel1.setLayout(null);

        txtWelcome.setFont(new java.awt.Font("Poppins", 0, 36)); // NOI18N
        txtWelcome.setForeground(new java.awt.Color(0, 102, 102));
        txtWelcome.setText("Login");
        jPanel1.add(txtWelcome);
        txtWelcome.setBounds(28, 16, 850, 55);

        tblBooks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ISBN", "Name", "Author", "Year", "Category", "Publisher", "Language", "Edition", "Status", "Location"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblBooks.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblBooks.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblBooks);
        if (tblBooks.getColumnModel().getColumnCount() > 0) {
            tblBooks.getColumnModel().getColumn(0).setResizable(false);
            tblBooks.getColumnModel().getColumn(1).setResizable(false);
            tblBooks.getColumnModel().getColumn(2).setResizable(false);
            tblBooks.getColumnModel().getColumn(3).setResizable(false);
            tblBooks.getColumnModel().getColumn(3).setPreferredWidth(25);
            tblBooks.getColumnModel().getColumn(4).setResizable(false);
            tblBooks.getColumnModel().getColumn(4).setPreferredWidth(40);
            tblBooks.getColumnModel().getColumn(5).setResizable(false);
            tblBooks.getColumnModel().getColumn(6).setResizable(false);
            tblBooks.getColumnModel().getColumn(6).setPreferredWidth(40);
            tblBooks.getColumnModel().getColumn(7).setResizable(false);
            tblBooks.getColumnModel().getColumn(7).setPreferredWidth(25);
            tblBooks.getColumnModel().getColumn(8).setResizable(false);
            tblBooks.getColumnModel().getColumn(9).setResizable(false);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(28, 138, 969, 450);

        txtRights.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtRights.setText("Current Books");
        jPanel1.add(txtRights);
        txtRights.setBounds(28, 98, 740, 22);

        etISBN.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        etISBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etISBNActionPerformed(evt);
            }
        });
        etISBN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                etISBNKeyReleased(evt);
            }
        });
        jPanel1.add(etISBN);
        etISBN.setBounds(1009, 166, 223, 40);

        etCategory.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        etCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select For Search" }));
        etCategory.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                etCategoryİtemStateChanged(evt);
            }
        });
        etCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etCategoryActionPerformed(evt);
            }
        });
        jPanel1.add(etCategory);
        etCategory.setBounds(1009, 359, 223, 40);

        jLabel1.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel1.setText("ISBN");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(1009, 138, 37, 22);

        jLabel2.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel2.setText("Name");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(1009, 232, 42, 22);

        jLabel3.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel3.setText("Category");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(1009, 331, 66, 22);

        etName.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        etName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                etNameKeyReleased(evt);
            }
        });
        jPanel1.add(etName);
        etName.setBounds(1009, 260, 223, 40);

        etAuthor.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        etAuthor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                etAuthorKeyReleased(evt);
            }
        });
        jPanel1.add(etAuthor);
        etAuthor.setBounds(1009, 454, 223, 40);

        jLabel4.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel4.setText("Author");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(1009, 426, 46, 22);

        etPublisher.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        etPublisher.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                etPublisherKeyReleased(evt);
            }
        });
        jPanel1.add(etPublisher);
        etPublisher.setBounds(1009, 548, 223, 40);

        jLabel7.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel7.setText("Publisher");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(1009, 520, 63, 22);

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
        btnBack.setBounds(1104, 30, 43, 50);

        btnBorrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javalibrarymanagement/borrow.png"))); // NOI18N
        btnBorrow.setBorder(null);
        btnBorrow.setBorderPainted(false);
        btnBorrow.setContentAreaFilled(false);
        btnBorrow.setFocusPainted(false);
        btnBorrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrowActionPerformed(evt);
            }
        });
        jPanel1.add(btnBorrow);
        btnBorrow.setBounds(1043, 30, 43, 50);

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
        btnExit.setBounds(1165, 30, 43, 50);

        jPanel2.add(jPanel1);
        jPanel1.setBounds(230, 0, 1270, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void etCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etCategoryActionPerformed

    private void etISBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etISBNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etISBNActionPerformed

    private void etISBNKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_etISBNKeyReleased
        etAuthor.setText("");
        etPublisher.setText("");
        etCategory.setSelectedIndex(0);
        etName.setText("");
        bookList = service.searchWithISBN(etISBN.getText());
        model.setRowCount(0);
        addBooksToTable(bookList);
    }//GEN-LAST:event_etISBNKeyReleased

    private void etAuthorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_etAuthorKeyReleased
        etPublisher.setText("");
        etISBN.setText("");
        etCategory.setSelectedIndex(0);
        etName.setText("");
        bookList = service.searchWithAuthor(etAuthor.getText());
        model.setRowCount(0);
        addBooksToTable(bookList);
    }//GEN-LAST:event_etAuthorKeyReleased

    private void etPublisherKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_etPublisherKeyReleased
        etAuthor.setText("");
        etISBN.setText("");
        etCategory.setSelectedIndex(0);
        etName.setText("");
        bookList = service.searchWithPublisher(etPublisher.getText());
        model.setRowCount(0);
        addBooksToTable(bookList);
    }//GEN-LAST:event_etPublisherKeyReleased

    private void etNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_etNameKeyReleased
        etAuthor.setText("");
        etISBN.setText("");
        etCategory.setSelectedIndex(0);
        etPublisher.setText("");
        bookList = service.searchWithName(etName.getText());
        model.setRowCount(0);
        addBooksToTable(bookList);
    }//GEN-LAST:event_etNameKeyReleased

    private void etCategoryİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_etCategoryİtemStateChanged
        if(etCategory.getSelectedItem() == "Select For Search"){          
            bookList = service.searchWithCategory("");
        }else{
            etAuthor.setText("");
            etISBN.setText("");
            etName.setText("");
            etPublisher.setText("");
            bookList = service.searchWithCategory(evt.getItem().toString());
        }
        model.setRowCount(0);
        addBooksToTable(bookList);
    }//GEN-LAST:event_etCategoryİtemStateChanged

    private void btnBorrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrowActionPerformed
       int selectedRow = tblBooks.getSelectedRow();
      if(selectedRow != -1){
          if(currentMember.getMemberCurrentRight() > 0){
              if(tblBooks.getValueAt(selectedRow, 8).toString().equals("Available")){
                  if(service.isSelectedBookRequested(currentMember, tblBooks.getValueAt(selectedRow, 0).toString())){
                      Book newBook = new Book(
                      (String)tblBooks.getValueAt(selectedRow, 0),
                      (String)tblBooks.getValueAt(selectedRow, 1),
                      (String)tblBooks.getValueAt(selectedRow, 2),
                      (String)tblBooks.getValueAt(selectedRow, 3),
                      (String)tblBooks.getValueAt(selectedRow, 4),
                      (String)tblBooks.getValueAt(selectedRow, 5),
                      (String)tblBooks.getValueAt(selectedRow, 6),
                      (int)tblBooks.getValueAt(selectedRow, 7),
                      (String)tblBooks.getValueAt(selectedRow, 8),
                      (String)tblBooks.getValueAt(selectedRow, 9),
                       0
                  );
                    new BorrowBook(newBook, currentMember).setVisible(true);
                    this.setVisible(false);
                    this.dispose();
                  }else{
                    JOptionPane.showMessageDialog(this, "You can create only one request for the same book", "Book already requested.",JOptionPane.ERROR_MESSAGE);         
                  }   
              }else{
                  JOptionPane.showMessageDialog(this, "Selected book is not avaible please try later", "Book is not avaible",JOptionPane.ERROR_MESSAGE);         
              }          
          }else{
             JOptionPane.showMessageDialog(this, "You have "+currentMember.getMemberRight()+" borrow right please try again after returning a book", "Limit exceeded",JOptionPane.ERROR_MESSAGE);         
            }  
      }else{
          JOptionPane.showMessageDialog(this, "Please select a book from the table and click on the button.", "Book has not selected",JOptionPane.ERROR_MESSAGE);         
      }
    }//GEN-LAST:event_btnBorrowActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.processWindowEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new MemberIntro(currentMember).setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private Object[] mapSearchedBooks(Book searchedElement){
         Object[] row = {
                searchedElement.getBookISBN(),
                searchedElement.getBookName(),
                searchedElement.getAuthor(),
                searchedElement.getPublicationYear(),
                searchedElement.getCategoryName(),
                searchedElement.getPublisherName(),
                searchedElement.getPublicationLanguage(),
                searchedElement.getBookEdition(),
                searchedElement.getStatus(),
                searchedElement.getLocation()
            };
         return row;
    }
    
    private void addBooksToTable(ArrayList<Book> bookList){
        for(Book book:bookList){
            Object[] row = mapSearchedBooks(book);
            model.addRow(row);
        }
    }   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Right;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBorrow;
    private javax.swing.JButton btnExit;
    private javax.swing.JTextField etAuthor;
    private javax.swing.JComboBox<String> etCategory;
    private javax.swing.JTextField etISBN;
    private javax.swing.JTextField etName;
    private javax.swing.JTextField etPublisher;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBooks;
    private javax.swing.JLabel txtRights;
    private javax.swing.JLabel txtWelcome;
    // End of variables declaration//GEN-END:variables
}
