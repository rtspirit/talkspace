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
import UserInterface.GovernmentAdminWorkArea.GOVTAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author rtspi
 */
public class GOVTEnterpriseAdmin extends Role{

    
    

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem system, Network network) {
        return new GOVTAdminWorkAreaJPanel(userProcessContainer,account,organization,enterprise,system);
    }
    
    @Override
    public String toString() {
        return RoleType.GOVTEnterpriseAdmin.getValue(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
