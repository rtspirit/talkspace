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
public class GovernmentRequestDirectory {
    
    ArrayList<GovernmentRequest> governmentRequestList = new ArrayList<>();

    public ArrayList<GovernmentRequest> getGovernmentRequestList() {
        if(governmentRequestList == null){
            governmentRequestList = new ArrayList<>();
        }
        return governmentRequestList;
    }
    
    public void addGovernmentRequest(GovernmentRequest request){
        governmentRequestList.add(request);
    
    }
    
     public void removeGovernmentRequest(GovernmentRequest request){
        governmentRequestList.remove(request);
    
    }
    
}
