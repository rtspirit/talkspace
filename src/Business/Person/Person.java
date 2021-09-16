/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import Business.Role.Role;
import Business.UserAccount.UserAccount;

/**
 *
 * @author juhip
 */
public class Person extends Business.UserAccount.UserAccount{
    private String name;
    private String contactNumber;
    private String zipcode;
    private String city;
    private String gender;
    private String dateOfBirthe;
    private String state;
    private String country;
    private String email;

    public Person(String name, String contactNumber, String zipcode, String city, String gender, String userName, String password, String dateOfBirthe, String state, String country, String email, Role role) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.zipcode = zipcode;
        this.city = city;
        this.gender = gender;
        this.dateOfBirthe = dateOfBirthe;
        this.state = state;
        this.country = country;
        this.email = email;
        setUsername(userName);
        setPassword(password);
        setRole(role);
        setName(name);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateOfBirthe() {
        return dateOfBirthe;
    }

    public void setDateOfBirthe(String dateOfBirthe) {
        this.dateOfBirthe = dateOfBirthe;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    
    @Override
    public String toString() {
        return name;
    }
    
    
}
