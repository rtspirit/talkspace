/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.User.UserDirectory;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author juhip
 */
public class Ecosystem extends Organization{
    private static Ecosystem ecosystem;
    private ArrayList<Network> networkList;
    private ArrayList<UserAccount> userAccountList;
    private UserDirectory userDirectory;
    
    public static Ecosystem getInstance() {
         if(ecosystem==null){
            ecosystem=new Ecosystem();
             System.out.println("Business.Ecosystem.getInstance()");
        }
        return ecosystem;
    }
    public static void setInstance(Ecosystem system) {
        ecosystem = system;
    }
 

    public static Ecosystem getEcosytem() {
        return ecosystem;
    }

    public static void setEcosytem(Ecosystem ecosytem) {
        Ecosystem.ecosystem = ecosytem;
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }

    public Ecosystem() {
        super(null);
        networkList = new ArrayList<Network>();
    } 
    public Network createAndAddNetwork(){
    Network network = new Network();
    networkList.add(network);
    return network;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    public boolean checkIfUsernameIsUnique(String username){
    for (UserAccount ua : userAccountList){
        if (ua.getUsername().equals(username))
            return false;
    }
    return true;
}
    
    public boolean checkUserIdExists(String userName) {
            if (ecosystem.getUserAccountDirectory().checkIfUsernameIsUnique(userName)) {
                if (ecosystem.getUserAccountDirectory().checkIfUsernameIsUnique(userName)) {
                    for (Network network : ecosystem.getNetworkList()) {
                        for (Enterprise enterprise : network.getEnterpriseDirectory().getEntList()) {
                            if (enterprise.getUserAccountDirectory().checkIfUsernameIsUnique(userName)) {
                                if (enterprise.getOrganizationDirectory().getOrgList().size() > 0) {
                                    for (Organization organization : enterprise.getOrganizationDirectory().getOrgList()) {
                                        if (organization.getUserAccountDirectory().checkIfUsernameIsUnique(userName)) {
                                            return true;

                                        } else {
                                            return false;
                                        }

                                    }
                                } else {
                                    return true;
                                }
                            } else {
                                return false;

                            }
                        }
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
            return false;
        }



    public boolean checkIfEmployeeAlreadyPresent(Employee employee) {
        return true;
    }

//    public boolean checkIfUserIdisUnq(String userId) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    public UserDirectory getUserDirectory() {
        if(userDirectory == null){
                userDirectory = new UserDirectory();
        }
        return userDirectory;
    }
    
    public boolean checkIfNetworkIsUnique(String name){
        for(Network network : networkList){
            if(network.getName().equalsIgnoreCase(name)){
                return false;
            }
        }
        return true;
    }
    
    
    
}
