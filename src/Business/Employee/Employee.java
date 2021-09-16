/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.Date;

/**
 *
 * @author juhip
 */
public class Employee {
    private String name;
    private int id;
    private static int count = 1;
 //   private int contactNumber;
  //  private Date dateOfBirth;
//    private String gender;
//    private String city;
//    private String state;
//    private String specialization;
//    private String address;

    public Employee() {
       // this.name = name;
        id = count;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
