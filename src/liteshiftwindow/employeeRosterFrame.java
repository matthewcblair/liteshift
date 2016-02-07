// The code in this file (employeeRosterFrame.java) covers all functionality
//  surrounding the 'Employee Roster' window that can be opened at the home
//  screen. This window is non-disposable, meaning when it is closed, the
//  information (employee tabs) are not lost. The window is hidden, rather.

// This window receives some information from the 'AddEmployeeForm'. This is 
//  further explained in the documentation of the newEmployeeForm function below.

// Brian's 'Add Employee Form' is not being disposed of.
// We the EditAvail info is updating Brian's AEF rather than Tim's, so Tim's isn't being saved.



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liteshiftwindow;


import java.awt.Color;
import liteshiftwindow.AddEmployeeForm;
import java.awt.Frame;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.ListModel;

/**
 *
 * @author Alec, Matthew, Taylor
 */
public class employeeRosterFrame extends javax.swing.JFrame {

    /**
     * Creates new form employeeRosterFrame
     */
    public employeeRosterFrame() {
        initComponents();
        populateTabs();
    }
    
    public DefaultListModel empListModel = new DefaultListModel();
    public Employee selectedEmployee = new Employee();
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelSelectedEmployee = new javax.swing.JLabel();
        buttonNewEmployee = new javax.swing.JButton();
        buttonEditSelected = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        labelEmployeeTitle = new javax.swing.JLabel();
        labelEmployeeName = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        labelMinPrefHours = new javax.swing.JLabel();
        labelMaxPrefHours = new javax.swing.JLabel();
        labelAbsMinHours = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        labelAbsMaxHours = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        listPanelEmployees = new javax.swing.JList();
        labelEmployeeList = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Employee Roster");

        labelSelectedEmployee.setText("Selected Employee");

        buttonNewEmployee.setText("New Employee");
        buttonNewEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNewEmployeeActionPerformed(evt);
            }
        });

        buttonEditSelected.setText("Edit Selected");
        buttonEditSelected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditSelectedActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabel3.setText("Name:");

        labelEmployeeTitle.setText("-");

        labelEmployeeName.setText("-");

        jLabel6.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabel6.setText("Title:");

        jLabel7.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabel7.setText("Min. Preferred Hours:");

        jLabel8.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabel8.setText("Max. Preferred Hours:");

        labelMinPrefHours.setText("-");

        labelMaxPrefHours.setText("-");

        labelAbsMinHours.setText("-");

        jLabel12.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabel12.setText("Absolute Min. Hours:");

        labelAbsMaxHours.setText("-");

        jLabel14.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabel14.setText("Absolute Max. Hours:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelEmployeeName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelEmployeeTitle))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelAbsMaxHours)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelMaxPrefHours))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelAbsMinHours)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelMinPrefHours)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(labelEmployeeTitle)
                    .addComponent(labelEmployeeName)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAbsMinHours)
                    .addComponent(jLabel12)
                    .addComponent(labelMinPrefHours)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(labelMaxPrefHours)
                    .addComponent(jLabel14)
                    .addComponent(labelAbsMaxHours))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        listPanelEmployees.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listPanelEmployeesValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listPanelEmployees);

        labelEmployeeList.setText("Employee List");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(147, 147, 147)
                                .addComponent(buttonNewEmployee)
                                .addGap(36, 36, 36)
                                .addComponent(buttonEditSelected, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(labelSelectedEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 3, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelEmployeeList)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSelectedEmployee)
                    .addComponent(labelEmployeeList))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonEditSelected)
                    .addComponent(buttonNewEmployee))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void populateTabs(){
        LSForm ls;
        Frame [] frameArray = Frame.getFrames();
        listPanelEmployees.setModel(empListModel);
        for (Frame curFrame : frameArray){
            if (curFrame.getTitle().equals("LiteShift")) {
                ls = (LSForm) curFrame;
                if(!ls.firstRun){
                    for(int i = 0; i < ls.employeeList.size(); i++){
                        newEmployeeForm((Employee)ls.employeeList.get(i));
                    }
                    
                }
                
            }
        }
        ls = getLSForm();
        populateEmployeePanel( ((Employee)ls.employeeList.get(0)) );
        listPanelEmployees.setSelectedIndex(0);
        selectedEmployee = ((Employee)ls.employeeList.get(0));
    }
    
    public void populateAdmin(){
        LSForm ls;
        Frame [] frameArray = Frame.getFrames();
        for (Frame curFrame : frameArray){
            if (curFrame.getTitle().equals("LiteShift")) {
                ls = (LSForm) curFrame;
                newEmployeeForm(ls.admin);
            }
        }
        
        ls = getLSForm();
        populateEmployeePanel( ((Employee)ls.employeeList.get(0)) );
        listPanelEmployees.setSelectedIndex(0);
        selectedEmployee = ((Employee)ls.employeeList.get(0));
        
    }
    // Handling funtion for clicking the 'New Eployee' button.
    // Instantiae a (disposable) 'Add Employee' form. Make it visible.
    private void buttonNewEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNewEmployeeActionPerformed
        Employee newEmployee = new Employee();
        newEmployee.Name = "?New";
        AddEmployeeForm addEmpForm = new AddEmployeeForm();
        addEmpForm.editedEmployee = newEmployee;
        addEmpForm.setVisible(true);
       
    }//GEN-LAST:event_buttonNewEmployeeActionPerformed

    // Handling code for the 'Edit Selected' button
    
    private void buttonEditSelectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditSelectedActionPerformed
        
        AddEmployeeForm addEmpForm = new AddEmployeeForm();
        addEmpForm.populateForEmployeeEdit(selectedEmployee);
        addEmpForm.editExisting = true;
        addEmpForm.editedEmployee = selectedEmployee;
        addEmpForm.hardAvail = selectedEmployee.hardShiftConstraints;
        addEmpForm.softAvail = selectedEmployee.softShiftConstraints;
        addEmpForm.setVisible(true);
        
        
    }//GEN-LAST:event_buttonEditSelectedActionPerformed
    
    public LSForm getLSForm(){
        Frame [] frameArray = Frame.getFrames();
        for (Frame curFrame : frameArray){
            if (curFrame.getTitle().equals("LiteShift")) {
                LSForm ls = (LSForm) curFrame;
                return ls;
                
            }
        }
        return null;
    }
    
    public void populateEmployeePanel(Employee emp){
        labelEmployeeName.setText(emp.Name);
        labelEmployeeTitle.setText(emp.Title);
        labelMinPrefHours.setText(Integer.toString(emp.softMinHours));
        labelMaxPrefHours.setText(Integer.toString(emp.softMaxHours));
        labelAbsMinHours.setText(Integer.toString(emp.hardMinHours));
        labelAbsMaxHours.setText(Integer.toString(emp.hardMaxHours));
    }
    
    private void listPanelEmployeesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listPanelEmployeesValueChanged
        Employee emp;
        LSForm ls = getLSForm();
        
        if(!evt.getValueIsAdjusting()){
            emp = ls.getEmployeeObjectFromString((String) listPanelEmployees.getSelectedValue());
            populateEmployeePanel(emp);
            selectedEmployee = emp;
            
        }
    }//GEN-LAST:event_listPanelEmployeesValueChanged
    

    
    // This funciton is called by another window (the 'Add Employee' form)
    // (The Add Employee form asks the user for information about a new employee)
    // When the user is finished filling this information out, they click on the
    //  'Add Employee' button. The inputted information (string format) is 
    //  collectively translated into a new Employee object. That object is passed
    //  to this funciton.
    
    public void newEmployeeForm(Employee newEmployee){
        

        empListModel.addElement(newEmployee.Name);
        
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(employeeRosterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(employeeRosterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(employeeRosterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(employeeRosterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new employeeRosterFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEditSelected;
    private javax.swing.JButton buttonNewEmployee;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelAbsMaxHours;
    private javax.swing.JLabel labelAbsMinHours;
    private javax.swing.JLabel labelEmployeeList;
    private javax.swing.JLabel labelEmployeeName;
    private javax.swing.JLabel labelEmployeeTitle;
    private javax.swing.JLabel labelMaxPrefHours;
    private javax.swing.JLabel labelMinPrefHours;
    private javax.swing.JLabel labelSelectedEmployee;
    private javax.swing.JList listPanelEmployees;
    // End of variables declaration//GEN-END:variables
}