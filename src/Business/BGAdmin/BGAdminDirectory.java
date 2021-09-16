/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BGAdmin;

import java.util.ArrayList;

/**
 *
 * @author rtspi
 */
public class BGAdminDirectory {
    ArrayList<BGAdmin> bgAdminList= new ArrayList<>();

    public ArrayList<BGAdmin> getBgAdminList() {
        if(bgAdminList == null){
            bgAdminList = new ArrayList<>();
        }
        return bgAdminList;
    }

    public void addBGAdmin(BGAdmin gt){
        bgAdminList.add(gt);
    
    }
    
     public void removeBGAdmin(BGAdmin gt){
        bgAdminList.remove(gt);
    
    }
}
