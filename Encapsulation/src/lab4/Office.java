/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author Aruni
 */
public class Office {
    
    private String name;
    
    public Office(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void hireEmployee(Employee emp, Department dept) { 
        dept.addEmployee(emp);       
    }
    
    public void performOrientation(Employee emp){
        emp.doFirstTimeOrientation(emp.getDepartment().getCalculatedCubeId());
    }
    
    @Override 
    public String toString(){
        return this.name;
    }
    
}
