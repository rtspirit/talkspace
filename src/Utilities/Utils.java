/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

import Business.Dbo4util.DB4OUtil;
import Business.Ecosystem;

/**
 *
 * @author juhip
 */
public class Utils {
    
    private Ecosystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    
    public Utils() {
        system = dB4OUtil.retrieveSystem();
    }
    
     public void setDatabase(Ecosystem system) {
        dB4OUtil.storeSystem(system);
    }
}
