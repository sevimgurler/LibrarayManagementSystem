
package javalibrarymanagement.data.model;



public class Departmant {

    public int getDepartmantID() {
        return departmantID;
    }

    public String getDepartmantName() {
        return departmantName;
    }
    
    private int departmantID;
    private String departmantName;

    public Departmant(int departmantID, String departmantName) {
        this.departmantID = departmantID;
        this.departmantName = departmantName;
    }
    
}
