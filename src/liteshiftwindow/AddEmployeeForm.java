// The code in this file (AddEmployeeForm.java) covers all functionality
//  surrounding the 'Add Employee' window/form. This is a disposable frame, 
//  meaning after it is closed, the information inputted into it is forgotten.
// This window's purpose is to collect information from the user about a new
//  employee.
// When the user is finished inputting, the information is passed directly
//  to the employeeRosterFrame window for writing to a new Employee Tab. That
//  particular functionality (the passing and writing to a new tab) is
//  documented in the 'addEmployeeForm' function documentation 
//  (in the employeeRosterFrame.java file).


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liteshiftwindow;

import java.awt.Color;
import java.awt.Component;
import java.awt.Frame;
import java.awt.List;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.ListModel;
import liteshiftwindow.employeeRosterFrame;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author Alec, Matthew, Taylor
 */
public class AddEmployeeForm extends javax.swing.JFrame {

    /**
     * Creates new form modifyEmployeeForm
     */
    public AddEmployeeForm() {
        initComponents();
    }
    
    
    public JPanel selectedPanel;
    public Employee newEmployee;
    public Employee editedEmployee;
    public boolean [][] softAvail = new boolean [7][3];
    public boolean [][] hardAvail = new boolean [7][3];
    
    public boolean editExisting = false;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {

        employeeForm10 = new javax.swing.JPanel();
        comboEmployeeTitle = new javax.swing.JComboBox();
        jLabel32 = new javax.swing.JLabel();
        buttonSave = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        fieldEmployeeName = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        spinnerHardMax = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        spinnerHardMin = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        spinnerSoftMax = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        spinnerSoftMin = new javax.swing.JSpinner();
        jSeparator2 = new javax.swing.JSeparator();
        buttonCancel = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Employee");

        comboEmployeeTitle.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Crew", "Manager" }));

        jLabel32.setText("Company Title");

        buttonSave.setText("Save");
        buttonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveActionPerformed(evt);
            }
        });

        jLabel1.setText("Name");

        jLabel2.setText("Edit Employee Information");

        jLabel3.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel3.setText("Hard Constraints");

        jLabel4.setText("Max Weekly Hours");

        jLabel5.setText("Min Weekly Hours");

        jLabel6.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel6.setText("Soft Constraints");

        jLabel7.setText("Max Weekly Hours");

        jLabel8.setText("Min Weekly Hours");

        buttonCancel.setText("Cancel");
        buttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel16.setText("Daily Availability");

        jButton2.setText("Edit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout employeeForm10Layout = new javax.swing.GroupLayout(employeeForm10);
        employeeForm10.setLayout(employeeForm10Layout);
        employeeForm10Layout.setHorizontalGroup(
            employeeForm10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(employeeForm10Layout.createSequentialGroup()
                .addGroup(employeeForm10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, employeeForm10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2)
                    .addGroup(employeeForm10Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1)
                        .addGap(269, 269, 269)
                        .addComponent(jLabel32))
                    .addGroup(employeeForm10Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(fieldEmployeeName, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(179, 179, 179)
                        .addComponent(comboEmployeeTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(employeeForm10Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3)
                        .addGap(192, 192, 192)
                        .addComponent(jLabel6))
                    .addGroup(employeeForm10Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5)
                        .addGap(178, 178, 178)
                        .addComponent(jLabel8))
                    .addGroup(employeeForm10Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(spinnerHardMin, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(217, 217, 217)
                        .addComponent(spinnerSoftMin, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(employeeForm10Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4)
                        .addGap(174, 174, 174)
                        .addComponent(jLabel7))
                    .addGroup(employeeForm10Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(spinnerHardMax, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(217, 217, 217)
                        .addComponent(spinnerSoftMax, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(employeeForm10Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(employeeForm10Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(buttonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        employeeForm10Layout.setVerticalGroup(
            employeeForm10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(employeeForm10Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(employeeForm10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel32))
                .addGap(6, 6, 6)
                .addGroup(employeeForm10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldEmployeeName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboEmployeeTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(employeeForm10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addGap(14, 14, 14)
                .addGroup(employeeForm10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8))
                .addGap(4, 4, 4)
                .addGroup(employeeForm10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spinnerHardMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinnerSoftMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(employeeForm10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addGap(4, 4, 4)
                .addGroup(employeeForm10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spinnerHardMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinnerSoftMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(employeeForm10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(employeeForm10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSave)
                    .addComponent(buttonCancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(employeeForm10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(employeeForm10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    
    public employeeRosterFrame getERFrame(){
        Frame [] frameArray = Frame.getFrames();
        for (Frame curFrame : frameArray){
            if (curFrame.getTitle().equals("Employee Roster")) {
                employeeRosterFrame er = (employeeRosterFrame) curFrame;
                return er;
                
            }
        }
        return null;
    }
    
    public void populateForEmployeeEdit(Employee emp){
        fieldEmployeeName.setText(emp.Name);
        comboEmployeeTitle.setSelectedIndex( (emp.Title.equals("Crew")) ? 0 : 1 );
        spinnerHardMin.setValue(emp.hardMinHours);
        spinnerHardMax.setValue(emp.hardMaxHours);
        spinnerSoftMin.setValue(emp.softMinHours);
        spinnerSoftMax.setValue(emp.softMaxHours);
        
    }
    
    
    public void updateEmployeeFile(Employee oldEmp, Employee newEmp){
        
        LSForm ls = getLSForm();
        
        // Delete the old employee File
        // Clear the employeeList File
        // Update the employeeList File
        File dirPath = new File("").getAbsoluteFile();
        File empListFile = new File(dirPath + ((System.getProperty("os.name").contains("Mac")) ? "/employees/employeeList.txt" : "\\employees\\employeeList.txt"));
        try{
            if(System.getProperty("os.name").contains("Mac")){
                File file = new File(dirPath + "/employees/" + (oldEmp.Name).replace(" ", "_") + ".txt");
                file.delete();
                PrintWriter pw = new PrintWriter(dirPath + "/employees/employeeList.txt");
                pw.close();
            }
            else{
                File file = new File(dirPath + "\\employees\\" + (oldEmp.Name).replace(" ", "_") + ".txt");
                file.delete();
                PrintWriter pw = new PrintWriter(dirPath + "\\employees\\employeeList.txt");
                pw.close();
            }
            FileWriter listWriter = new FileWriter(empListFile.getAbsoluteFile(), true);
            BufferedWriter listBuffer = new BufferedWriter(listWriter);
            
            for(int i = 0; i < ls.employeeList.size(); i++){
                listBuffer.write( (  ((Employee)(ls.employeeList.get(i))).Name  ).replace(" ", "_"));
                listBuffer.newLine();
                
            }
            
            listBuffer.close();
            listWriter.close();
            
        }
        catch (IOException e) {
            System.out.println(e);
	}
        
        // Create a new file with the updated information for the employee
        saveEmployeeToFile(newEmp, true);

    }

    public void saveEmployeeToFile(Employee emp, boolean editing){      
        File dirPath = new File("").getAbsoluteFile();
        String empName = fieldEmployeeName.getText().replace(" ", "_");
        File newFile;
        File empListFile;
        if(System.getProperty("os.name").contains("Mac")){
            newFile = new File(dirPath + "/employees/" + empName + ".txt");
            empListFile = new File(dirPath + "/employees/employeeList.txt");
        }
        else{
            newFile = new File(dirPath + "\\employees\\" + empName + ".txt");
            empListFile = new File(dirPath + "\\employees\\employeeList.txt");
        }
        String boolString;
        
        try{
        
            FileWriter writer = new FileWriter(newFile.getAbsoluteFile());
            FileWriter listWriter = new FileWriter(empListFile.getAbsoluteFile(), true);
            BufferedWriter buffer = new BufferedWriter(writer);
            BufferedWriter listBuffer = new BufferedWriter(listWriter);
            
            // Write the new employee's name to the employeeList.txt file
            if(!editing){
                listBuffer.write(emp.Name.replace(" ", "_"));
                listBuffer.newLine();
                listBuffer.close();
            }
            
            //write Name, Title, HardMinHours, HardMaxHours, SoftMinHours, SoftMaxHours to the employee's personal file
            buffer.write(emp.Name + "," + emp.Title + "," + emp.hardMinHours + "," + emp.hardMaxHours + "," + emp.softMinHours + "," + emp.softMaxHours);
            buffer.newLine();
            
            // write (soft) availability matrix 
            for(int i = 0; i < 7; i++){
                for(int j = 0; j < 3; j++){
                    boolString = ((this.softAvail[i][j] == false) ? "0" : "1");
                    if( i == 6 && j == 2 ){
                        buffer.write(boolString);
                        
                    }
                    else{
                        buffer.write(boolString + ",");
                        
                    }
                   
                }
                
                
            }
            
            buffer.newLine();
            
            // write (hard) availability matrix 
            for(int i = 0; i < 7; i++){
                for(int j = 0; j < 3; j++){
                    boolString = ((this.hardAvail[i][j] == false) ? "0" : "1");
                    if( i == 6 && j == 2 )
                        buffer.write(boolString);
                    else
                        buffer.write(boolString + ",");
                    
                }
                
            }
            
            buffer.close();
        } 
        
        catch (IOException e) {
            System.out.println(e);
	}
    
    }
    
    // Handling fucntion for clicking Save button.
    // This is essentialy the only functionality of the Add Employee form.
    // It reads all of the information the user has inputted into the fields and
    //  then translates that information into a new Employee object. The employee
    //  object is passed to the Employee Roster window. (see documentation of
    //  addEmployeeForm in employeeRosterFrame.java for further details.
    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed

        // do not allow a save if the 'Employee Name' field has not been filled
        LSForm ls = getLSForm();
        if("".equals(fieldEmployeeName.getText())){
            javax.swing.JOptionPane.showMessageDialog(null,"Please fill out the 'Employee Name' field.","Error in Input",javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        String [] illegalSymbols = {"?", "\\", "/", ":", "*", "\"", "<", ">", "|" };
        for(int i = 0; i < 9; i++){
            if( (fieldEmployeeName.getText()).contains(illegalSymbols[i])  ){
                javax.swing.JOptionPane.showMessageDialog(null,"The 'Employee Name' may not contain the following characters: ? \\ / : * \" < > |","Error in Input",javax.swing.JOptionPane.WARNING_MESSAGE);
                return;
            }
        }
        
        if(editExisting){
            saveEdits();
            this.dispose();
            return;
        }
        
        // do not allow a save if the Employee Name already exists in the roster
        for(int i = 0; i < ls.employeeList.size(); i++){
            if(    (((Employee) (ls.employeeList.get(i))).Name).equals(fieldEmployeeName.getText())   ){
                javax.swing.JOptionPane.showMessageDialog(null,"An Employee with that name already exists. Consider adding a Middle Initial.","Error in Input",javax.swing.JOptionPane.WARNING_MESSAGE);
                return;
            }
        }
        
        
        Frame [] frameArray = Frame.getFrames();
        newEmployee = new Employee();
        //JLabel [][] excludedDays = {{labelSunM, labelSunA}, {labelMonM, labelMonA}, {labelTueM, labelTueA}, {labelWedM, labelWedA}, {labelThrM, labelThrA}, {labelFriM, labelFriA}, {labelSatM, labelSatA}};
        
        newEmployee.Name = fieldEmployeeName.getText();
        newEmployee.Title = comboEmployeeTitle.getSelectedItem().toString();
        newEmployee.softMinHours = (int)spinnerSoftMin.getValue();
        newEmployee.softMaxHours = (int)spinnerSoftMax.getValue();
        newEmployee.hardMinHours = (int)spinnerHardMin.getValue();
        newEmployee.hardMaxHours = (int)spinnerHardMax.getValue();
        newEmployee.hardShiftConstraints = hardAvail;
        newEmployee.softShiftConstraints = softAvail;
        
        
        // Pass the constructed Employee object to the 'home' window
        // The 'home' window keeps track of a list of all employees, used for
        //  outputting new schedules. We add the new employee to that list.

        ls.employeeList.add(newEmployee);
        
        
        // Pass the constructed Employee object to the 'Employee Roster' window
        for (Frame curFrame : frameArray){
            if (curFrame.getTitle().equals("Employee Roster")) {
                
                employeeRosterFrame erFrame = (employeeRosterFrame) curFrame;
                
                erFrame.newEmployeeForm(newEmployee);
                
                erFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                dispose();
            }
        }
        
        saveEmployeeToFile(newEmployee, false);
        employeeRosterFrame er = getERFrame();
        er.populateEmployeePanel(newEmployee);
        er.selectedEmployee = newEmployee;
        
    }//GEN-LAST:event_buttonSaveActionPerformed
    
    
    
    
    public void saveEdits(){
        newEmployee = new Employee();
        LSForm ls = getLSForm();
        //JLabel [][] excludedDays = {{labelSunM, labelSunA}, {labelMonM, labelMonA}, {labelTueM, labelTueA}, {labelWedM, labelWedA}, {labelThrM, labelThrA}, {labelFriM, labelFriA}, {labelSatM, labelSatA}};
        newEmployee.Name = fieldEmployeeName.getText();
        newEmployee.Title = comboEmployeeTitle.getSelectedItem().toString();
        newEmployee.softMinHours = (int)spinnerSoftMin.getValue();
        newEmployee.softMaxHours = (int)spinnerSoftMax.getValue();
        newEmployee.hardMinHours = (int)spinnerHardMin.getValue();
        newEmployee.hardMaxHours = (int)spinnerHardMax.getValue();
        newEmployee.hardShiftConstraints = hardAvail;
        newEmployee.softShiftConstraints = softAvail;
        
        // Update employeeList with the new employee information
        for(int i = 0; i < ls.employeeList.size(); i++){
            if(   ( ((Employee)(ls.employeeList.get(i))).Name ).equals(editedEmployee.Name)   )
                ls.employeeList.set(i, newEmployee);
        }
        
        // Update the JList with the new employee name
        employeeRosterFrame er = getERFrame();
        for(int i = 0; i < er.empListModel.size(); i++){
            if(   ( er.empListModel.get(i) ).equals(editedEmployee.Name)   ){
                er.empListModel.set(i, newEmployee.Name);
            }
        }
        
        updateEmployeeFile(editedEmployee, newEmployee);
        er.populateEmployeePanel(newEmployee);
        er.selectedEmployee = newEmployee;
        
    }
    
    // This function changes a given (box) label's color.
    // The context of changing a box's color is explained inside of the
    //  buttonSaveActionPerformed function above.
    // This function is called when clicking on one of the boxes (labels).
    public void swapLabelColor(JLabel l){
        if(l.getBackground() != Color.BLACK && l.getBackground() != Color.LIGHT_GRAY)
            l.setBackground(Color.BLACK);
        else if(l.getBackground() == Color.BLACK)
            l.setBackground(Color.LIGHT_GRAY);
        else
            l.setBackground(Color.WHITE);
    }
    
    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_buttonCancelActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        editAvailabilityForm editAvailForm = new editAvailabilityForm();
        editAvailForm.editedEmployee = editedEmployee;
        if(editExisting){
            editAvailForm.populateCheckBoxes(softAvail, hardAvail);
        }
            
        editAvailForm.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed
//</editor-fold>
    
    
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
            java.util.logging.Logger.getLogger(AddEmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEmployeeForm().setVisible(true);
            }
        });
    }
    
    
    //<editor-fold defaultstate="collapsed" desc=" Variables declaration ">                 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton buttonSave;
    private javax.swing.JComboBox comboEmployeeTitle;
    private javax.swing.JPanel employeeForm10;
    private javax.swing.JTextField fieldEmployeeName;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSpinner spinnerHardMax;
    private javax.swing.JSpinner spinnerHardMin;
    private javax.swing.JSpinner spinnerSoftMax;
    private javax.swing.JSpinner spinnerSoftMin;
    // End of variables declaration//GEN-END:variables
            //</editor-fold>
}
