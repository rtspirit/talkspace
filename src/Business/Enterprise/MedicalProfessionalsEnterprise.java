/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;


import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author juhip
 */
public class MedicalProfessionalsEnterprise extends Enterprise {
    
    public MedicalProfessionalsEnterprise(String name){
        super(name, Enterprise.EnterpriseType.MedicalProfessionalsEnterprise);
    }

 @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
    
    
}
