/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.GeneralTherapist;

import Business.Organization.Organization;
import Business.Person.Person;
import Business.Role.Role;
import Business.WorkQueue.RequestDirectory;

/**
 *
 * @author juhip
 */
public class GeneralTherapist extends Business.Person.Person{
    
    private String expertise;
    private Organization org;
    private RequestDirectory requestDirectory;
    public GeneralTherapist(String name, String contactNumber, String zipcode, String city, String gender, String userName, String password, String dateOfBirthe, String state, String country, String email, Role role, String expertise, Organization org) {
        super(name, contactNumber, zipcode, city, gender, userName, password, dateOfBirthe, state, country, email, role);
        this.expertise = expertise;
        this.org = org;
    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    public Organization getOrg() {
        return org;
    }

    public void setOrg(Organization org) {
        this.org = org;
    }
    

    @Override
    public String toString() {
        return getName();
    }

    public RequestDirectory getRequestDirectory() {
        if(requestDirectory == null){
            requestDirectory = new RequestDirectory();
        }
        return requestDirectory;
    }
    
    
    
}
