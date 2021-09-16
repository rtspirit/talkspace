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
public class PrescriptionDirectory {
    
    ArrayList<Prescription> prescriptionList = new ArrayList<>();

    public ArrayList<Prescription> getPrescriptionList() {
        if(prescriptionList == null){
            prescriptionList = new ArrayList<>();
        }
        return prescriptionList;
    }
    
    public void addPres(Prescription pres){
        prescriptionList.add(pres);
    }
    
     public void removePres(Prescription pres){
        prescriptionList.remove(pres);
    }
    
    
}
