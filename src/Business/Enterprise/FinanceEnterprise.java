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
public class FinanceEnterprise extends Enterprise {
    
    public FinanceEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.FinanceEnterprise);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
//        roles = new ArrayList<Role>();
//        roles.add(new BGAdmin());
//        roles.add(new FinanceEnterpriseAdmin());
//        roles.add(new VolunteeringHead());
//        roles.add(new Distributor());
        return null; //To change body of generated methods, choose Tools | Templates.
    }
    
}
