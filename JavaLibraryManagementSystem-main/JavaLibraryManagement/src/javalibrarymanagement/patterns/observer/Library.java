/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javalibrarymanagement.patterns.observer;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javalibrarymanagement.data.model.Book;

/**
 *
 * @author erenm
 */
public class Library extends LibrarySubject{
    
    private static Library instance;
    
    public static Library getInstance(){
        if(instance==null){
            instance = new Library();
        }
        return instance;
    }
    
    public void addBook(String bookName) {
        notifyObservers("New Book Added",bookName,LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
    }

    public void updateBook(Book old, Book newBook) {
        notifyObservers("Book Updated","Old:"+old.printInfo()+" New:"+newBook.printInfo(),LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
    }
}
