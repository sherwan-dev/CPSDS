/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CPSDS;

/**
 *
 * @author Sherwan
 */
public class main_class {

    public static void main(String[] args) {
        
       java.awt.EventQueue.invokeLater(new Runnable() {
           @Override
            public void run() {
                new Version_1().setVisible(true);
            }
        });
       
    }
}
