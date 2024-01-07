/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javalibrarymanagement.utils.inputVerifiers;

import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.text.JTextComponent;


public class IDInputVerifier extends InputVerifier{

    @Override
    public boolean verify(JComponent source) {
        final JTextComponent input = (JTextComponent) source;
        String inputText = input.getText();
        if(inputText.length()!=11){
            return false;
        }else if(inputText.matches("[a-zA-Z_]+")){
            return false;
        }else{
            return true;
        }    
    }
    
}
