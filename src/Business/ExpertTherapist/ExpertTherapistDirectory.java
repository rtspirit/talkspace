/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.ExpertTherapist;

import Business.GeneralTherapist.*;
import java.util.ArrayList;

/**
 *
 * @author juhip
 */
public class ExpertTherapistDirectory {
    ArrayList<ExpertTherapist> expertTherapistList = new ArrayList<>();

    public ArrayList<ExpertTherapist> getExpertTherapistList() {
        if(expertTherapistList == null){
        expertTherapistList = new ArrayList<>();
        }
        return expertTherapistList;
    }
    public void addExpertTherapist(ExpertTherapist et){
        expertTherapistList.add(et);
    
    }
     public void removeExpertTherapist(ExpertTherapist et){
        expertTherapistList.remove(et);
    
    }
    
      public ExpertTherapist findUserByUserName(String username){
        ExpertTherapist user = null;
        
        for(ExpertTherapist usr: expertTherapistList){
        if(usr.getUsername().equalsIgnoreCase(username)){
            user=usr;
        }
        }
        return user;
     }
}
