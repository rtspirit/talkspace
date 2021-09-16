/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author juhip
 */
public class Prescription {
    private String prescriptionDate;
    private String prescriptionDetails;
    private String comment;

    public String getPrescriptionDate() {
        return prescriptionDate;
    }

    public void setPrescriptionDate(String prescriptionDate) {
        this.prescriptionDate = prescriptionDate;
    }

    public String getPrescriptionDetails() {
        return prescriptionDetails;
    }

    public void setPrescriptionDetails(String prescriptionDetails) {
        this.prescriptionDetails = prescriptionDetails;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Prescription(String prescriptionDate, String prescriptionDetails, String comment) {
        this.prescriptionDate = prescriptionDate;
        this.prescriptionDetails = prescriptionDetails;
        this.comment = comment;
    }

    @Override
    public String toString() {
        return comment;
    }
    
    
    
}
