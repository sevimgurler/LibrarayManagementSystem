/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package javalibrarymanagement.patterns.searchStrategy;

import java.util.ArrayList;
import javalibrarymanagement.data.model.Book;

public interface SearchStrategy {
    
    ArrayList<Book> search(String searchKeyword);
    
}
