/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liteshiftwindow;

/**
 *
 * @author matthew
 */

public class Schedule 
{
    public Employee schedule[][][];
    
    public Schedule(int maxShifts)
    {
        schedule = new Employee[3][7][maxShifts];
    }
    
    void updateSchedule(int i, int j, int k, Employee x)
    {
        schedule[i][j][k] = x;
        x.updateShifts();
    }
    public boolean scheduledInMorning(int day, String name, int maxShifts)
    {
        for(int k = 0; k < maxShifts; k++)
        {
           // System.out.println(schedule[0][day][k].name());
        
            if(name.equals(schedule[0][day][k].Name()))
                        return true;
        }
                    
        return false;
    }
    void showName(int i, int j, int k)
    {
        System.out.print(schedule[i][j][k].Name() + " ");
    }
    public boolean ScoreCheck(int i, int j, int k)
    {
        return schedule[i][j][k].hardShiftConstraints[j][i] == schedule[i][j][k].softShiftConstraints[j][i];
    }
}
