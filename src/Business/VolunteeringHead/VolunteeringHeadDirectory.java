/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.VolunteeringHead;

import java.util.ArrayList;

/**
 *
 * @author rtspi
 */
public class VolunteeringHeadDirectory {
    ArrayList<VolunteeringHead> volunteersList= new ArrayList<>();

    public ArrayList<VolunteeringHead> getVolunteersList() {
        if(volunteersList == null){
            volunteersList = new ArrayList<>();
        }
        return volunteersList;
    }

    public void addVolunteeringHead(VolunteeringHead gt){
        volunteersList.add(gt);
    
    }
    
     public void removeVolunteeringHead(VolunteeringHead gt){
        volunteersList.remove(gt);
    
    }
     
     public VolunteeringHead findUserByUserName(String username){
        VolunteeringHead user = null;
        
        for(VolunteeringHead usr: volunteersList){
        if(usr.getUsername().equalsIgnoreCase(username)){
            user=usr;
        }
        }
        return user;
     }
}
