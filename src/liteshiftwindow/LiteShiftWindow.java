// This code in this file (LiteShiftWindow.java) is essentially entirely 
//  automatically generated.
// It instantiates an LSForm (home screen) and makes it visible.
// At the moment, it is also instantiating an employeeRoster frame (invisible)
//  This may be deprecated in the future when employees are actually stored in
//  file(s).


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liteshiftwindow;

import javax.swing.UIManager;

/**
 *
 * @author Alec, Matthew, Taylor
 */



public class LiteShiftWindow {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try { 
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel"); 
        } catch (Exception ex) { 
            ex.printStackTrace(); 
        }
        LSForm form = new LSForm();
        form.setfirstRun();
        form.setVisible(true);
        
        employeeRosterFrame roster = new employeeRosterFrame();
        if(!form.firstRun)
            return;
        
        form.setEnabled(false);
        firstRunWizard frw = new firstRunWizard();
        frw.setVisible(true);
        
        
        
    }
    
}
