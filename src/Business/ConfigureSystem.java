/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author juhip
 */
public class ConfigureSystem {
 
    public static Ecosystem configure(){  
        Ecosystem system = Ecosystem.getInstance();
        Employee employee = system.getEmployeeDirectory().createEmployee("sysadmin");
        UserAccount ua = new UserAccount("sysadmin","sysadmin", "System Admin", new SystemAdminRole());
         system.getUserAccountDirectory().addAccount(ua);
        return system;
    }
    
}
