/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javalibrarymanagement.data.model;

public class Publisher {
    
    
    private int publisherID;
    private String name;
    private String language;

    public int getPublisherID() {
        return publisherID;
    }

    public String getName() {
        return name;
    }

    public String getLanguage() {
        return language;
    }

    public Publisher(int publisherID, String name, String language) {
        this.publisherID = publisherID;
        this.name = name;
        this.language = language;
    }

    
}

