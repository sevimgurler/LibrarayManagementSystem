/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javalibrarymanagement.patterns.observer;

import java.util.ArrayList;
import java.util.List;
import javalibrarymanagement.data.model.Annoucement;

/**
 *
 * @author erenm
 */
abstract class LibrarySubject {
    private List<LibraryObserver> observers = new ArrayList<>();

    public void addObserver(LibraryObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(LibraryObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String annoucementTitle, String annoucementDesc, String annoucementDate) {
        for (LibraryObserver observer : observers) {
            observer.update(annoucementTitle, annoucementDesc, annoucementDate);
        }
    }
}
