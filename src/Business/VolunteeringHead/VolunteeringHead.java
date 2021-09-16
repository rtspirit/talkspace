/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.VolunteeringHead;

import Business.Organization.Organization;
import Business.Person.Person;
import Business.Role.Role;
import Business.WorkQueue.FinanceRequestDirectory;
import Business.WorkQueue.VolunteerRequestDirectory;

/**
 *
 * @author rtspi
 */
public class VolunteeringHead extends Person {
    private Organization org;
    private FinanceRequestDirectory financeRequestDirectory;
    private VolunteerRequestDirectory volunteerRequestDirectory;

    public VolunteeringHead(String name, String contactNumber, String zipcode, String city, String gender, String userName, String password, String dateOfBirthe, String state, String country, String email, Role role, Organization org) {
        super(name, contactNumber, zipcode, city, gender, userName, password, dateOfBirthe, state, country, email, role);
        this.org = org;
    }

    public Organization getOrg() {
        return org;
    }

    public void setOrg(Organization org) {
        this.org = org;
    }

    public FinanceRequestDirectory getFinanceRequestDirectory() {
        if(financeRequestDirectory == null){
            financeRequestDirectory = new FinanceRequestDirectory();
        }
        return financeRequestDirectory;
    }

    public VolunteerRequestDirectory getVolunteerRequestDirectory() {
        if(volunteerRequestDirectory == null){
            volunteerRequestDirectory = new VolunteerRequestDirectory();
        }
        return volunteerRequestDirectory;
    }

    public void setVolunteerRequestDirectory(VolunteerRequestDirectory volunteerRequestDirectory) {
        this.volunteerRequestDirectory = volunteerRequestDirectory;
    }
    
    
    
    

    @Override
    public String toString() {
        return getName(); //To change body of generated methods, choose Tools | Templates.
    }
}
