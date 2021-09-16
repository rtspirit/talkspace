/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.User.UserAdminWorkAreaJPanel;
import UserInterface.User.UserRegistrationJPanel;
import javax.swing.JPanel;

/**
 *
 * @author juhip
 */
public class UserRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem system, Network network) {
        return new UserAdminWorkAreaJPanel(userProcessContainer,account,organization,enterprise,system);
//    return null; //add something here
    }
    
    
    
    
}
