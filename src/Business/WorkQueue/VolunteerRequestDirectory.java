/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author rtspi
 */
public class VolunteerRequestDirectory {
    
    ArrayList<VolunteerRequest> volunteerRequestList = new ArrayList<>();

    public ArrayList<VolunteerRequest> getVolunteerRequestList() {
        if(volunteerRequestList == null){
        volunteerRequestList = new ArrayList<>();
        }
        return volunteerRequestList;
    }
    
     public void addVolunteerRequest(VolunteerRequest request){
        volunteerRequestList.add(request);
    }
    
      public void removeVolunteerRequest(VolunteerRequest request){
        volunteerRequestList.remove(request);
    }
    
}
