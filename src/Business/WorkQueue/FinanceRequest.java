/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.BGAdmin.BGAdmin;
import Business.Distributor.Distributor;
import Business.OnlineReceptionist.OnlineReceptionist;
import Business.User.User;
import Business.VolunteeringHead.VolunteeringHead;
import java.util.Random;

/**
 *
 * @author juhip
 */
public class FinanceRequest {
    private String requestNumber;
    private String requestName;
    private String status;
    private User user;
    private VolunteeringHead volunteer;
    private Distributor rationDistributor;
    private BGAdmin bgAdmin;

    public FinanceRequest(String requestName, String status, User user) {
        Random rnd = new Random();
        requestNumber = "FinReq-" + rnd.nextInt(99999);
        this.requestName = requestName;
        this.status = status;
        this.user = user;
    }

    

    public String getRequestNumber() {
        return requestNumber;
    }

    public void setRequestNumber(String requestNumber) {
        this.requestNumber = requestNumber;
    }

    public String getRequestName() {
        return requestName;
    }

    public void setRequestName(String requestName) {
        this.requestName = requestName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public VolunteeringHead getVolunteer() {
        return volunteer;
    }

    public void setVolunteer(VolunteeringHead volunteer) {
        this.volunteer = volunteer;
    }

    public Distributor getRationDistributor() {
        return rationDistributor;
    }

    public void setRationDistributor(Distributor rationDistributor) {
        this.rationDistributor = rationDistributor;
    }

    public BGAdmin getBgAdmin() {
        return bgAdmin;
    }

    public void setBgAdmin(BGAdmin bgAdmin) {
        this.bgAdmin = bgAdmin;
    }

    
    
    
    
    

    @Override
    public String toString() {
        return requestName;
    } 
}
