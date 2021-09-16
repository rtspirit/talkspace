/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author rtspi
 */
public class BackgroundCheckOrganization extends Organization {

    public BackgroundCheckOrganization(String name) {
        super(name);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Type getType() {
        return Organization.Type.BackgroundCheckOrganization; //To change body of generated methods, choose Tools | Templates.
    }

   
    
    
}
