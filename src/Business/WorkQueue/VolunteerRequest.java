/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Executive.Executive;
import Business.VolunteeringHead.VolunteeringHead;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author rtspi
 */
public class VolunteerRequest {
    
    private int requestNum;
    private String requestName;
    private String units;
    private String typeOfVolunteer;
    private String status;
    private VolunteeringHead volunteer;
    private Executive executive;
    private Date date;

    public VolunteerRequest(String type) {
        date = new Date();
         Random rnd = new Random();
        this.requestName = "Req-" + rnd.nextInt(99999);
        this.typeOfVolunteer = type;
    }

    public int getRequestNum() {
        return requestNum;
    }

    public void setRequestNum(int requestNum) {
        this.requestNum = requestNum;
    }

    public String getRequestName() {
        return requestName;
    }

    public void setRequestName(String requestName) {
        this.requestName = requestName;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public String getTypeOfVolunteer() {
        return typeOfVolunteer;
    }

    public void setTypeOfVolunteer(String typeOfVolunteer) {
        this.typeOfVolunteer = typeOfVolunteer;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public VolunteeringHead getVolunteer() {
        return volunteer;
    }

    public void setVolunteer(VolunteeringHead volunteer) {
        this.volunteer = volunteer;
    }

    public Executive getExecutive() {
        return executive;
    }

    public void setExecutive(Executive executive) {
        this.executive = executive;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    
    
    @Override
    public String toString() {
        return typeOfVolunteer; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
    
}
