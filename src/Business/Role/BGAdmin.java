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
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import UserInterface.BackgroundCheckAdminWorkArea.BackgroundCheckAdminJPanel;
import javax.swing.JPanel;

/**
 *
 * @author rtspi
 */
public class BGAdmin extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem system, Network network) {
        return new BackgroundCheckAdminJPanel(userProcessContainer, system,enterprise, account, organization); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return RoleType.BGAdmin.getValue(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
