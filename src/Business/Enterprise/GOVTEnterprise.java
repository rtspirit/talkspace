/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author juhip
 */
public class GOVTEnterprise extends Enterprise{
    
    public GOVTEnterprise(String name){
        super(name, Enterprise.EnterpriseType.GOVTEnterprise);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
//        roles = new ArrayList<Role>();
////        roles.add(new GOVTEnterpriseAdmin());
////        roles.add(new GOVTExecutive());
////        
        return null; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
