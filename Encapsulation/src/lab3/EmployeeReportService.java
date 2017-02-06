/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import javax.swing.JOptionPane;

/**
 *
 * @author Aruni
 */
public class EmployeeReportService {
    private Employee employee;
    
    public EmployeeReportService(Employee emp){
        this.employee = emp;
    }
    
    private String getEmployeeName(){
        String name = employee.getFirstName() + " " + employee.getLastName();
        return name;
    }
    
    public void outputMeetingStatusForBenefitAndSalaryInfo(){
        JOptionPane.showMessageDialog(null, getEmployeeName() + " met with her on "
            + employee.getFormattedDate());
    }

    public void outputMeetingStatusWithDeptStaff() {
        JOptionPane.showMessageDialog(null, getEmployeeName() + " met with department staff on "
            + employee.getFormattedDate());
    }

    void outputStatusOfReviewingDeptPolicies() {
        JOptionPane.showMessageDialog(null, getEmployeeName() + " reviewed Department policies on "
            + employee.getFormattedDate());
    }

    void outputStatusOfMovingIntoCubicles() {
        JOptionPane.showMessageDialog(null, getEmployeeName() + " moved into cubicle " + employee.getCubeId() 
                + " on " + employee.getFormattedDate());
    }
    
}
