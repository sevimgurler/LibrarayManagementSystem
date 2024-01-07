/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javalibrarymanagement.data.model;

public class BorrowRequest {

    public String getMemberName() {
        return memberName;
    }

    public String getBookISBN() {
        return bookISBN;
    }

    public String getBookName() {
        return bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public String getRequestStatus() {
        return requestStatus;
    }

    public String getRequestDate() {
        return requestDate;
    }

    public BorrowRequest(String bookISBN, String bookName, String bookAuthor, String requestStatus, String requestDate, String memberName) {
        this.bookISBN = bookISBN;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.requestStatus = requestStatus;
        this.requestDate = requestDate;
        this.memberName = memberName;
    }
    
    private String bookISBN;
    private String bookName;
    private String bookAuthor;
    private String requestStatus;
    private String requestDate;
    private String memberName;
    
    
}
