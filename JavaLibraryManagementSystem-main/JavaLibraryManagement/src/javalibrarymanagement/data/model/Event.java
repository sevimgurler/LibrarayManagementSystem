/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javalibrarymanagement.data.model;


public class Event {

    public int getEventID() {
        return eventID;
    }

    public String getEventType() {
        return eventType;
    }

    public String getEventDate() {
        return eventDate;
    }

    public String getEventName() {
        return eventName;
    }

    public String getEventDesc() {
        return eventDesc;
    }

    public int getLibrarianID() {
        return librarianID;
    }
    
    private int eventID;
    private String eventType;
    private String eventDate;
    private String eventName;
    private String eventDesc;
    private int librarianID;

    public Event(int eventID, String eventType, String eventDate, String eventName, String eventDesc, int librarianID) {
        this.eventID = eventID;
        this.eventType = eventType;
        this.eventDate = eventDate;
        this.eventName = eventName;
        this.eventDesc = eventDesc;
        this.librarianID = librarianID;
    }
    
    
}
