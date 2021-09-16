/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author juhip
 */
public class RequestDirectory {
    ArrayList<Request> requestList = new ArrayList<>();

    public ArrayList<Request> getRequestList() {
        if(requestList == null){
        requestList = new ArrayList<>();
        }
        return requestList;
    }
    
     public void addRequest(Request request){
        requestList.add(request);
    }
    
      public void removeRequest(Request request){
        requestList.remove(request);
    }
      
}
