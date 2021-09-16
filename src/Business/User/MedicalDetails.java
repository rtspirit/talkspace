/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.User;

import java.util.ArrayList;

/**
 *
 * @author juhip
 */
public class MedicalDetails {
    
     ArrayList<String> reasonForTreatment = new ArrayList<>();
    ArrayList<String> medicalConditions = new ArrayList<>();
    ArrayList<String> medicalSymptoms = new ArrayList<>();

    public ArrayList<String> getReasonForTreatment() {
        if(reasonForTreatment == null){
            reasonForTreatment = new ArrayList<>();
        }
        return reasonForTreatment;
    }

    public ArrayList<String> getMedicalConditions() {
        if(medicalConditions == null){
            medicalConditions = new ArrayList<>();
        }
        return medicalConditions;
    }

    public ArrayList<String> getMedicalSymptoms() {
         if(medicalSymptoms == null){
            medicalSymptoms = new ArrayList<>();
        }
        return medicalSymptoms;
    }
    
    private void addReasonForTreatment(String condition){
        reasonForTreatment.add(condition);
    }
    private void addMedicalConditions(String condition){
        medicalConditions.add(condition);
    }
     private void addMedicalSymptoms(String condition){
        medicalSymptoms.add(condition);
    }
    
     private void removeReasonForTreatment(String condition){
        reasonForTreatment.remove(condition);
    }
     private void removeMedicalConditions(String condition){
        medicalConditions.remove(condition);
    }
     
     private void removeMedicalSymptoms(String condition){
        medicalSymptoms.remove(condition);
    }
}
