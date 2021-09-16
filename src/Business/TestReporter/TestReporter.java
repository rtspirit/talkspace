/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.TestReporter;

import Business.Organization.Organization;
import Business.Role.Role;
import Business.TestDefiner.TestDirectory;
import Business.WorkQueue.RequestDirectory;

/**
 *
 * @author juhip
 */
public class TestReporter extends Business.Person.Person{
    private Organization org;
    private RequestDirectory requestDirectory;
    public TestReporter(String name, String contactNumber, String zipcode, String city, String gender, String userName, String password, String dateOfBirthe, String state, String country, String email, Role role, Organization org) {
        super(name, contactNumber, zipcode, city, gender, userName, password, dateOfBirthe, state, country, email, role);
        this.org = org;
    }

    @Override
    public String toString() {
        return getName();
    } 

    public Organization getOrg() {
        return org;
    }

    public void setOrg(Organization org) {
        this.org = org;
    }
     public RequestDirectory getRequestDirectory() {
        if(requestDirectory == null){
            requestDirectory = new RequestDirectory();
        }
        return requestDirectory;
    }
    
}
