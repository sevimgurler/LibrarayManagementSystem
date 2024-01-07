package javalibrarymanagement.data.model;

public class Location{

    public Location(int locationID, int shelfNo, String shelfName, int floorNo) {
        this.locationID = locationID;
        this.shelfNo = shelfNo;
        this.shelfName = shelfName;
        this.floorNo = floorNo;
    }
    
    private int locationID;

    public int getLocationID() {
        return locationID;
    }
    private int shelfNo;
    private String shelfName;
    private int floorNo;
    
    public String getLocation(){
        return "Shelf:"+shelfName+" No:"+shelfNo+" Floor:"+floorNo;
    }
}
