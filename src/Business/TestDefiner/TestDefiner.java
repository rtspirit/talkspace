/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.TestDefiner;

import Business.Organization.Organization;
import Business.Role.Role;

/**
 *
 * @author juhip
 */
public class TestDefiner extends Business.Person.Person{
    private Organization org;
    private TestDirectory testDirectory;

    public TestDefiner(String name, String contactNumber, String zipcode, String city, String gender, String userName, String password, String dateOfBirthe, String state, String country, String email, Role role, Organization org) {
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

    public TestDirectory getTestDirectory() {
        if(testDirectory == null){
            testDirectory = new TestDirectory();
        }
        return testDirectory;
    }
    
    
}
