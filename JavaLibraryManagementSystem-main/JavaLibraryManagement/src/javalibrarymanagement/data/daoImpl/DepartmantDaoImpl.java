package javalibrarymanagement.data.daoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javalibrarymanagement.data.dao.DepartmantDao;
import javalibrarymanagement.data.model.Departmant;
import javalibrarymanagement.patterns.SingletonDataWorks;


public class DepartmantDaoImpl implements DepartmantDao{

    private final Statement statement = SingletonDataWorks.getStatement();
    private ResultSet results;    
    private static DepartmantDao instance;
    
    public static synchronized DepartmantDao getInstance(){
        if (instance == null) {
            instance = new DepartmantDaoImpl();
        }
        return instance;
    }
       
    @Override
    public ArrayList<Departmant> getAllDepartmants() {
        ArrayList<Departmant> departmantList = new ArrayList<>();
        try{
            results = statement.executeQuery("SELECT * FROM library_management_system.departmant;");
            while(results.next()){
                departmantList.add(new Departmant(
                results.getInt("departmantID"),
                results.getString("departmantName")
                ));
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return departmantList;
    }
    
}
