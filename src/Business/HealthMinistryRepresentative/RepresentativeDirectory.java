/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.HealthMinistryRepresentative;

import java.util.ArrayList;

/**
 *
 * @author rtspi
 */
public class RepresentativeDirectory {
    ArrayList<Representative> representativeList= new ArrayList<>();

    public ArrayList<Representative> getRepresentativeList() {
        if(representativeList == null){
            representativeList = new ArrayList<>();
        }
        return representativeList;
    }

    public void addRepresentative(Representative gt){
        representativeList.add(gt);
    
    }
    
     public void removeRepresentative(Representative gt){
        representativeList.remove(gt);
    
    }
     
     public Representative findUserByUserName(String username){
        Representative user = null;
        
        for(Representative usr: representativeList){
        if(usr.getUsername().equalsIgnoreCase(username)){
            user=usr;
        }
        }
        return user;
     }
}
