/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Executive;

import java.util.ArrayList;


/**
 *
 * @author rtspi
 */
public class ExecutiveDirectory {
    ArrayList<Executive> executiveList= new ArrayList<>();

    public ArrayList<Executive> getExecutiveList() {
        if(executiveList == null){
            executiveList = new ArrayList<>();
        }
        return executiveList;
    }

    public void addExecutive(Executive gt){
        executiveList.add(gt);
    
    }
    
     public void removeExecutive(Executive gt){
        executiveList.remove(gt);
    
    }
     
     public Executive findUserByUserName(String username){
        Executive user = null;
        
        for(Executive usr: executiveList){
        if(usr.getUsername().equalsIgnoreCase(username)){
            user=usr;
        }
        }
        return user;
     }
}
