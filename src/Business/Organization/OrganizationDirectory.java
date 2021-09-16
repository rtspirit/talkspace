/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author juhip
 */
public class OrganizationDirectory {
    private ArrayList<Organization> orgList;

    public OrganizationDirectory() {
        orgList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrgList() {
        return orgList;
    }

    public void setOrgList(ArrayList<Organization> orgList) {
        this.orgList = orgList;
    }
    
    public Organization createOrganization(Type type, String name){
        Organization organization = null;
        if (type.getValue().equals(Type.ExpertTherapistOrganization.getValue())){
            organization = new ExpertTherapistOrganization(name); 
            orgList.add(organization);
        }else if (type.getValue().equals(Type.GeneralTherapistOrganization.getValue())){
            organization = new GeneralTherapistOrganization(name); 
            orgList.add(organization);
        }else if (type.getValue().equals(Type.OnlineReceptionistOrganization.getValue())){
            organization = new OnlineReceptionistOrganization(name); 
            orgList.add(organization);
        }else if (type.getValue().equals(Type.TestDefiner.getValue())){
            organization = new TestDefinerOrganization(name); 
            orgList.add(organization);
        }else if (type.getValue().equals(Type.TestReporter.getValue())){
            organization = new TestReporterOrganization(name); 
            orgList.add(organization);
        } else if(type.getValue().equals(Type.BackgroundCheckOrganization.getValue())){
            organization = new BackgroundCheckOrganization(name);
            orgList.add(organization);
        } else if(type.getValue().equals(Type.RationingOrganization.getValue())){
            organization = new RationingOrganization(name);
            orgList.add(organization);
        }else if(type.getValue().equals(Type.VolunteerOrganization.getValue())){
            organization = new VolunteerOrganization(name);
            orgList.add(organization);
        }else if(type.getValue().equals(Type.GOVTRepresentativeOrganization.getValue())){
            organization = new GOVTRepresentativeOrganization(name);
            orgList.add(organization);
        }else if(type.getValue().equals(Type.ExecutiveOrganization.getValue())){
            organization = new ExecutiveOrganization(name);
            orgList.add(organization);
        }
        return organization;
    } 
}
