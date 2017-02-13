/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.ArrayList;

/**
 *
 * @author Aruni
 */
public class Department {

    private final String name;
    private final ArrayList<Employee> employees;
    private int nextCubeId;
    private final EmployeeReportService reportService;
        
    public Department(String name, EmployeeReportService reportService) {
        this.reportService = reportService;
        this.name = name;
        employees = new ArrayList<>();
        nextCubeId = 0;
    }
    
    public void addEmployee(Employee emp){
        employees.add(emp);
        emp.setDepartment(this);
        reportService.addData(emp + " was hired to " + this + " department.\n");
    } 

    public String getCalculatedCubeId() {
        return this.name.substring(0,1) + ++this.nextCubeId;
    }
    
    @Override
    public String toString(){
        return this.name;
    }
    
}
