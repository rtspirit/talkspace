/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.User.User;

/**
 *
 * @author rtspi
 */
public class GovernmentRequest {
    
    private String requestNumber;
    private String requestName;
    private String status;
    private User user;
    private Business.HealthMinistryRepresentative.Representative representative;
    private Business.Executive.Executive executive;

    public GovernmentRequest(String requestNumber, String requestName, String status, User user, Business.HealthMinistryRepresentative.Representative representative, Business.Executive.Executive executive) {
        this.requestNumber = requestNumber;
        this.requestName = requestName;
        this.status = status;
        this.user = user;
        this.representative = representative;
        this.executive = executive;
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

    public Business.HealthMinistryRepresentative.Representative getRepresentative() {
        return representative;
    }

    public void setRepresentative(Business.HealthMinistryRepresentative.Representative representative) {
        this.representative = representative;
    }

    public Business.Executive.Executive getExecutive() {
        return executive;
    }

    public void setExecutive(Business.Executive.Executive executive) {
        this.executive = executive;
    }

    @Override
    public String toString() {
        return requestNumber;
    }

   
    
    
    
}
