/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;
import Business.Ecosystem;
import java.util.ArrayList;

/**
 *
 * @author juhip
 */
public class EmployeeDirectory {
    private ArrayList<Employee> employeeList = new ArrayList<>();

    public EmployeeDirectory() {
//        employeeList = new ArrayList<>();
    }
    
    public ArrayList<Employee> getEmployeeList() {
        if(employeeList == null){
            employeeList = new ArrayList<>();
        }
        return employeeList;
    }

    public Employee createEmployee(String name){
    Employee employee = new Employee();
    employee.setName(name);
    employeeList.add(employee);
    return employee;
    }
}
