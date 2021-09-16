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
import UserInterface.GOVTRepresentative.GOVTRepresentativeWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author rtspi
 */
public class Representative extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem system, Network network) {
        return new GOVTRepresentativeWorkAreaJPanel(userProcessContainer, system,enterprise,account,organization);//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return RoleType.Representative.getValue(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
