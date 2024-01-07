/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package javalibrarymanagement.patterns.observer;

import javalibrarymanagement.data.model.Annoucement;

/**
 *
 * @author erenm
 */
public interface LibraryObserver {
    void update(String annoucementTitle, String annoucementDesc, String annoucementDate);
}
