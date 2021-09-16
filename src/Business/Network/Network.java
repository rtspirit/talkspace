/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;
import Business.Enterprise.EnterpriseDirectory;
/**
 *
 * @author juhip
 */
public class Network {
     private String name;
    private EnterpriseDirectory enterpriseDirectory;
    
    public Network(){
        
            enterpriseDirectory=new EnterpriseDirectory();
        
        
        this.name=name;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public EnterpriseDirectory getEnterpriseDirectory() {
        if(enterpriseDirectory == null){
            enterpriseDirectory=new EnterpriseDirectory();
        }
        return enterpriseDirectory;
    }

    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }

    @Override
    public String toString() {
        return name; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
