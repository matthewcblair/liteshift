/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liteshiftwindow;

/**
 *
 * @author TEE
 */
public class Employee
{
    public String Name;
    public String Title;
    public boolean fullTime;
    public boolean hardShiftConstraints[][];
    public boolean softShiftConstraints[][];
    public String [] actualSchedule = new String [7];
    private int currentShifts;
    private boolean full;
    public int hardMinHours = 0;
    public int hardMaxHours = 0;
    public int softMinHours = 0;
    public int softMaxHours = 0;
    
    
    
    
    public Employee()
    {
        currentShifts = 0;
        hardShiftConstraints = new boolean[7][3];
        softShiftConstraints = new boolean[7][3];
        this.full = false;
    }
    
    public Employee(String Name, int fullTime, boolean hardShiftConstraints[][],
            boolean softShiftConstraints[][])
    {
        this.Name = Name;
        this.full = false;
        if(fullTime == 1)
            this.fullTime = true;
        else
            this.fullTime = false;
        this.hardShiftConstraints = new boolean[3][7];
        this.softShiftConstraints = new boolean[3][7];
        currentShifts = 0;
        for(int i = 0; i < softShiftConstraints.length;i++)
        {
            System.arraycopy(hardShiftConstraints[i], 0, this.hardShiftConstraints[i], 0,
                    this.hardShiftConstraints[0].length);
            System.arraycopy(softShiftConstraints[i], 0, this.softShiftConstraints[i], 0, 
                    this.hardShiftConstraints[0].length);
        }
    }
    
    public String Name()
    {
        return Name;
    }
    
    public boolean fullTime()
    {
        return fullTime;
    }
    void reset()
    {
        currentShifts = 0;
        this.full = false;
    }
    
    void updateShifts()
    {
        ++currentShifts;
        if(fullTime){
            if(currentShifts>=10)
                full = true;
            
        }
        else
            if(currentShifts>=7)
                full = true;          
    }
    public boolean isFull()
    {
            return full;
    }
    
    public String getName(){
        return Name;
    }
    
    public void setName(String newName){
        Name = newName;
    }
       
}
