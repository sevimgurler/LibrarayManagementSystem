/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javalibrarymanagement.patterns.observer;

import javalibrarymanagement.data.LibraryService;
import javalibrarymanagement.data.model.Annoucement;
import javalibrarymanagement.data.model.Librarian;

/**
 *
 * @author erenm
 */
public class LibraryPersonal implements LibraryObserver{
    private Librarian librarian;
    private LibraryService service = LibraryService.getInstance();

    public LibraryPersonal(Librarian librarian) {
        this.librarian = librarian;
    }

    @Override
    public void update(String annoucementTitle, String annoucementDesc, String annoucementDate) {
        service.addAnnoucements(new Annoucement(0, annoucementTitle, annoucementDesc, annoucementDate, librarian.getLibrarianID()), librarian.getLibrarianID());
    }
}
