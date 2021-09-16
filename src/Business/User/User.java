/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.User;

import Business.Network.Network;
import Business.Person.Person;
import Business.Role.Role;
import Business.WorkQueue.RequestDirectory;
import java.util.ArrayList;

/**
 *
 * @author juhip
 */
public class User extends Person{
  private MedicalDetails medicalDetails;
  private String userType;
  private RequestDirectory requestDirectory;
  private Network network;
    public User( String name, String contactNumber, String zipcode, String city, String gender, String userName, String password, String dateOfBirthe, String state, String country, String email, String userType,Role role, Network network) {
        super(name, contactNumber, zipcode, city, gender, userName, password, dateOfBirthe, state, country, email, role);
        this.userType = userType;
        this.network = network;
    }

    public MedicalDetails getMedicalDetails() {
        if(medicalDetails == null){
        medicalDetails = new MedicalDetails();
        }
        return medicalDetails;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public RequestDirectory getRequestDirectory() {
        if(requestDirectory == null){
            requestDirectory = new RequestDirectory();
        }
        return requestDirectory;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }
    
    
       
    @Override
    public String toString() {
        return getName();
    }

    
}
