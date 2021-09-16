/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;
import Business.BGAdmin.BGAdminDirectory;
import Business.Distributor.DistributorDirectory;
import Business.Employee.EmployeeDirectory;
import Business.Executive.ExecutiveDirectory;
import Business.ExpertTherapist.ExpertTherapistDirectory;
import Business.GeneralTherapist.GeneralTherapistDirectory;
import Business.HealthMinistryRepresentative.RepresentativeDirectory;
import Business.OnlineReceptionist.OnlineReceptionistDirectory;
import Business.Role.Role;
import Business.TestDefiner.TestDefinerDirectory;
import Business.TestReporter.TestReporterDirectory;
import Business.UserAccount.UserAccountDirectory;
import Business.VolunteeringHead.VolunteeringHead;
import Business.VolunteeringHead.VolunteeringHeadDirectory;
import Business.WorkQueue.FinanceRequestDirectory;
import Business.WorkQueue.RationRequestDirectory;
import Business.WorkQueue.RequestDirectory;
import Business.WorkQueue.VolunteerRequestDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author juhip
 */
public abstract class Organization {
    private String name;
    private WorkQueue workQueue;
    private UserAccountDirectory userAccountDirectory = new UserAccountDirectory();
    private EmployeeDirectory employeeDirectory = new EmployeeDirectory();
    private Type type;
    public ArrayList<Role> roles;
    private RequestDirectory requestDirectory = new RequestDirectory();
    private GeneralTherapistDirectory generalTherapistDirectory;
    private ExpertTherapistDirectory expertTherapistDirectory;
    private OnlineReceptionistDirectory onlineReceptionistDirectory;
    private TestDefinerDirectory testDefinerDirectory;
    private TestReporterDirectory testReporterDirectory;
    private BGAdminDirectory bgAdminDirectory;
    private VolunteeringHeadDirectory volunteeringHeadDirectory;
    private DistributorDirectory distributorDirectory;
    private ExecutiveDirectory executiveDirectory;
    private RepresentativeDirectory representativeDirectory;
    private RationRequestDirectory rationRequestDirectory = new RationRequestDirectory();
    private FinanceRequestDirectory financeRequestDirectory = new FinanceRequestDirectory();
    private VolunteerRequestDirectory volunteerRequestDirectory = new VolunteerRequestDirectory();
  
    public Organization(String name) {
        this.name = name;
        this.workQueue = workQueue;
        this.userAccountDirectory = userAccountDirectory;
        this.employeeDirectory = employeeDirectory;
    }
    public EmployeeDirectory getEmployeeDirectory() {
        if(employeeDirectory == null){
            employeeDirectory = new EmployeeDirectory();
        }
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }
   public abstract ArrayList<Role> getSupportedRole();
   
    public enum Type{
        Admin("Admin Organization"),
        BackgroundCheckOrganization("Background Check Organisation"),
        RationingOrganization("Ration Organization"),
        VolunteerOrganization("Volunteer Organization"),
        ExecutiveOrganization("Executive Organization"),
        GOVTRepresentativeOrganization("GOVT Representative Organization"),
        OnlineReceptionistOrganization("Online Receptionist"),
        ExpertTherapistOrganization("Expert Therapist"),
        GeneralTherapistOrganization("General Therapist"),
        TestDefiner("Test Definer"),
        TestReporter("Test Reporter");
        
        
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        } 
    }
    
    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        if(userAccountDirectory == null){
        userAccountDirectory = new UserAccountDirectory();
        }
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public RequestDirectory getRequestDirectory() {
        if(requestDirectory == null){
        requestDirectory = new RequestDirectory();
        }
        return requestDirectory;
    }

    public GeneralTherapistDirectory getGeneralTherapistDirectory() {
        if(generalTherapistDirectory == null){
            generalTherapistDirectory = new GeneralTherapistDirectory();
        }
        return generalTherapistDirectory;
    }

    public void setGeneralTherapistDirectory(GeneralTherapistDirectory generalTherapistDirectory) {
        this.generalTherapistDirectory = generalTherapistDirectory;
    }

    public ExpertTherapistDirectory getExpertTherapistDirectory() {
        if(expertTherapistDirectory == null){
            expertTherapistDirectory = new ExpertTherapistDirectory();
        }
        return expertTherapistDirectory;
    }

    public void setExpertTherapistDirectory(ExpertTherapistDirectory expertTherapistDirectory) {
        this.expertTherapistDirectory = expertTherapistDirectory;
    }

    public OnlineReceptionistDirectory getOnlineReceptionistDirectory() {
        if(onlineReceptionistDirectory == null){
            onlineReceptionistDirectory = new OnlineReceptionistDirectory();
        }
        return onlineReceptionistDirectory;
    }

    public TestDefinerDirectory getTestDefinerDirectory() {
        if(testDefinerDirectory == null){
            testDefinerDirectory = new TestDefinerDirectory();
        }
        return testDefinerDirectory;
    }

    public void setTestDefinerDirectory(TestDefinerDirectory testDefinerDirectory) {
        this.testDefinerDirectory = testDefinerDirectory;
    }

    public TestReporterDirectory getTestReporterDirectory() {
        if(testReporterDirectory == null){
            testReporterDirectory = new TestReporterDirectory();
        }
        return testReporterDirectory;
    }

    public void setTestReporterDirectory(TestReporterDirectory testReporterDirectory) {
        this.testReporterDirectory = testReporterDirectory;
    }
    
    

    public BGAdminDirectory getBgAdminDirectory() {
        if(bgAdminDirectory == null){
        bgAdminDirectory = new BGAdminDirectory();
        }
        return bgAdminDirectory;
    }

    public void setBgAdminDirectory(BGAdminDirectory bgAdminDirectory) {
        this.bgAdminDirectory = bgAdminDirectory;
    }

    public VolunteeringHeadDirectory getVolunteeringHeadDirectory() {
        if(volunteeringHeadDirectory == null){
        volunteeringHeadDirectory = new VolunteeringHeadDirectory();
        }
        return volunteeringHeadDirectory;
    }

    public void setVolunteeringHeadDirectory(VolunteeringHeadDirectory volunteeringHeadDirectory) {
        this.volunteeringHeadDirectory = volunteeringHeadDirectory;
    }

    public DistributorDirectory getDistributorDirectory() {
        if(distributorDirectory == null){
        distributorDirectory = new DistributorDirectory();
        }
        return distributorDirectory;
    }

    public void setDistributorDirectory(DistributorDirectory distributorDirectory) {
        this.distributorDirectory = distributorDirectory;
    }

    public ExecutiveDirectory getExecutiveDirectory() {
        if(executiveDirectory == null){
        executiveDirectory = new ExecutiveDirectory();
        }
        return executiveDirectory;
    }

    public void setExecutiveDirectory(ExecutiveDirectory executiveDirectory) {
        this.executiveDirectory = executiveDirectory;
    }

    public RepresentativeDirectory getRepresentativeDirectory() {
        if(representativeDirectory == null){
        representativeDirectory = new RepresentativeDirectory();
        }
        return representativeDirectory;
    }

    public void setRepresentativeDirectory(RepresentativeDirectory representativeDirectory) {
        this.representativeDirectory = representativeDirectory;
    }

    public RationRequestDirectory getRationRequestDirectory() {
        if(rationRequestDirectory == null){
        rationRequestDirectory = new RationRequestDirectory();
        }
        return rationRequestDirectory;
    }

    public void setRationRequestDirectory(RationRequestDirectory rationRequestDirectory) {
        this.rationRequestDirectory = rationRequestDirectory;
    }

    public VolunteerRequestDirectory getVolunteerRequestDirectory() {
        if(volunteerRequestDirectory == null){
        volunteerRequestDirectory = new VolunteerRequestDirectory();
        }
        return volunteerRequestDirectory;
    }

    public void setVolunteerRequestDirectory(VolunteerRequestDirectory volunteerRequestDirectory) {
        this.volunteerRequestDirectory = volunteerRequestDirectory;
    }
    
    public FinanceRequestDirectory getFinanceRequestDirectory() {
        if(financeRequestDirectory == null){
            financeRequestDirectory = new FinanceRequestDirectory();
        }
        return financeRequestDirectory;
    }
    
    
    
    
    
    
    
    
   @Override
        public String toString(){
        return getName();
    }
    
}
