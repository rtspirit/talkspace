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
public class RationRequestDirectory {
    
    ArrayList<RationRequest> rationRequestList = new ArrayList<>();

    public ArrayList<RationRequest> getRationRequestList() {
        if(rationRequestList == null){
        rationRequestList = new ArrayList<>();
        }
        return rationRequestList;
    }
    
     public void addRationRequest(RationRequest request){
        rationRequestList.add(request);
    }
    
      public void removeRationRequest(RationRequest request){
        rationRequestList.remove(request);
    }
}
