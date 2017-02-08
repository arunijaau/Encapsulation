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
public class Company {
    
    private String name;
    private Office office;
    private ArrayList<Department> departments;
    private EmployeeReportService reportService;
    
    public Company(String name){
        reportService = new EmployeeReportService();
        this.name = name;
        departments = new ArrayList<>();
        this.office = new Office("HR Office");
    }
    
    public void run(){
        Department finance = new Department("Finance", reportService);
        Employee peter = new Employee("Peter","Piper","333-33-3333", reportService );
        Employee john = new Employee("John", "Davis", "444-45-3455", reportService);
        office.hireEmployee(peter, finance);
        office.hireEmployee(john, finance);
        office.performOrientation(peter);
        office.performOrientation(john);
        reportService.outputReport();
        
        
    }
    
    public void addDepartment(Department dept){
        departments.add(dept);
    }
    
    
    @Override 
    public String toString(){
        return this.name;
    }
}
