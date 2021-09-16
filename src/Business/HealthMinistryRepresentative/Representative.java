/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.HealthMinistryRepresentative;

import Business.Organization.Organization;
import Business.Person.Person;
import Business.Role.Role;
import Business.WorkQueue.GovernmentRequestDirectory;
import Business.WorkQueue.RationRequestDirectory;
import Business.WorkQueue.VolunteerRequestDirectory;

/**
 *
 * @author rtspi
 */
public class Representative extends Person{
    private Organization org;
    private GovernmentRequestDirectory governmentRequestDirectory;
    private RationRequestDirectory rationRequestDirectory;
    private VolunteerRequestDirectory volunteerRequestDirectory;

    public Representative(String name, String contactNumber, String zipcode, String city, String gender, String userName, String password, String dateOfBirthe, String state, String country, String email, Role role, Organization org) {
        super(name, contactNumber, zipcode, city, gender, userName, password, dateOfBirthe, state, country, email, role);
        this.org = org;
    }

    public Organization getOrg() {
        return org;
    }

    public void setOrg(Organization org) {
        this.org = org;
    }

    public GovernmentRequestDirectory getGovernmentRequestDirectory() {
        if(governmentRequestDirectory == null){
            governmentRequestDirectory = new GovernmentRequestDirectory();
        }
        return governmentRequestDirectory;
    }

    public RationRequestDirectory getRationRequestDirectory() {
        if(rationRequestDirectory == null){
            rationRequestDirectory = new RationRequestDirectory();
        }
        return rationRequestDirectory;
    }

    public void setRationRequestDirectory(RationRequestDirectory rationRequestDirectory) {
        this.rationRequestDirectory = rationRequestDirectory;
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
