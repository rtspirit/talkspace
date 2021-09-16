/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author juhip
 */
public abstract class Role {
    
     public enum RoleType{
        SystemAdmin("SysAdmin"),
//        PrimaryCare("PrimaryCareProvidor"),
//        Doctor("Doctor"),
//        HospitalEnterpriseAdmin("Hospital Admin"),
//        LabTechnician("LabTechnician"),
        BGAdmin("Background Check Admin"),
        FinanceEnterpriseAdmin("Finance Admin"),
        Distributor("Distributor"),
        VolunteeringHead("Head of Volunteers"),
//        MentalHealthEnterpriseAdmin("Mental Health Admin"),
//        Assistant("Health Overview Assistant"),
//        Coordinator("Coordinator"),
//        Psychiatrist("Psychiatrist"),
//        Facilitator("Assignment Facilitator"),
        Representative("Health Ministry Representative"),
        Executive("Government Executive"),
        GOVTEnterpriseAdmin("Health Ministry Admin"),
        UserRole("User"),
        MedicalProfessionalAdminRole("Medical Professional"),
        OnlineReceptionistRole("Online Receptionist"),
        GeneralTherapistRole("General Physician"),
        ExpertTherapistRole("Expert Therapist"),
        TestDefinerRole("Test Definer"),
        TestReporterRole("Test Reporter"),
        TestEnterpriseAdminRole("Test Enterprise")
        ;
        private String value;
        private RoleType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        } 
     } 
     public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            Ecosystem system,
            Network network);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
     
     
}
