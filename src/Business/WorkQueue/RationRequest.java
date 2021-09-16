/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Distributor.Distributor;
import Business.Executive.Executive;
import java.util.Random;

/**
 *
 * @author rtspi
 */
public class RationRequest {
    
    private int requestNum;
    private String requestName;
    private String units;
    private String typeOfPacket;
    private String sizeOfPacket;
    private String status;
    private Distributor distributor;
    private Executive executive;

    public RationRequest(String type) {
        Random rnd = new Random();
        this.requestName = "Req-" + rnd.nextInt(99999);
        this.typeOfPacket = type;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public String getTypeOfPacket() {
        return typeOfPacket;
    }

    public void setTypeOfPacket(String typeOfPacket) {
        this.typeOfPacket = typeOfPacket;
    }

    public String getSizeOfPacket() {
        return sizeOfPacket;
    }

    public void setSizeOfPacket(String sizeOfPacket) {
        this.sizeOfPacket = sizeOfPacket;
    }

    public Distributor getDistributor() {
        return distributor;
    }

    public void setDistributor(Distributor distributor) {
        this.distributor = distributor;
    }

    public Executive getExecutive() {
        return executive;
    }

    public void setExecutive(Executive executive) {
        this.executive = executive;
    }
    
    

    @Override
    public String toString() {
        return typeOfPacket; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
