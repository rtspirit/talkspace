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
public class FinanceRequestDirectory {
    ArrayList<FinanceRequest> financeRequestList = new ArrayList<>();

    public ArrayList<FinanceRequest> getFinanceRequestList() {
        if(financeRequestList == null){
            financeRequestList = new ArrayList<>();
        }
        return financeRequestList;
    }
    
    public void addFinanceRequest(FinanceRequest request){
        financeRequestList.add(request);
    
    }
    
     public void removeFinanceRequest(FinanceRequest request){
        financeRequestList.remove(request);
    
    }
    
}
