/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javalibrarymanagement.data.model;

public class Annoucement {

    public int getAnnoucementID() {
        return annoucementID;
    }

    public String getAnnoucementName() {
        return annoucementName;
    }

    public String getAnnoucementDesc() {
        return annoucementDesc;
    }

    public String getAnnoucementDate() {
        return annoucementDate;
    }

    public int getLibrarianID() {
        return librarianID;
    }

    public Annoucement(int annoucementID, String annoucementName, String annoucementDesc, String annoucementDate, int librarianID) {
        this.annoucementID = annoucementID;
        this.annoucementName = annoucementName;
        this.annoucementDesc = annoucementDesc;
        this.annoucementDate = annoucementDate;
        this.librarianID = librarianID;
    }
    
    private int annoucementID;
    private String annoucementName;
    private String annoucementDesc;
    private String annoucementDate;
    private int librarianID;
    
}
