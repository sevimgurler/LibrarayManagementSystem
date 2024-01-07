/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javalibrarymanagement.utils;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTable;

public class TableDecarator {
    
    public static void tableCustomize(JTable table){
        table.getTableHeader().setFont(new Font("Poppins", Font.CENTER_BASELINE ,8));
        table.getTableHeader().setOpaque(false);
        table.getTableHeader().setBackground(new Color(0,102,102));
        table.getTableHeader().setForeground(new Color(255,255,255));
        table.setRowHeight(25);
    }
    
}
