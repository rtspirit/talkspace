/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.OnlineReceptionist;

import Business.Organization.Organization;
import Business.Role.Role;
import Business.WorkQueue.FinanceRequestDirectory;

/**
 *
 * @author juhip
 */
public class OnlineReceptionist extends Business.Person.Person{
    private Organization org;
//    private FinanceRequestDirectory financeRequestDirectory;
    public OnlineReceptionist(String name, String contactNumber, String zipcode, String city, String gender, String userName, String password, String dateOfBirthe, String state, String country, String email, Role role, Organization org) {
        super(name, contactNumber, zipcode, city, gender, userName, password, dateOfBirthe, state, country, email, role);
        this.org = org;
    }

    public Organization getOrg() {
        return org;
    }

    public void setOrg(Organization org) {
        this.org = org;
    }

//    public FinanceRequestDirectory getFinanceRequestDirectory() {
//        if(financeRequestDirectory == null){
//            financeRequestDirectory = new FinanceRequestDirectory();
//        }
//        return financeRequestDirectory;
//    }
    
    

    @Override
    public String toString() {
        return getName();
    }    
}
