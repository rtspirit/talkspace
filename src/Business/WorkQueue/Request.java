/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.ExpertTherapist.ExpertTherapist;
import Business.GeneralTherapist.GeneralTherapist;
import Business.TestDefiner.TestDirectory;
import Business.TestReporter.TestReporter;
import Business.User.TestResultDirectory;
import Business.User.User;
import java.util.Random;

/**
 *
 * @author juhip
 */
public class Request {
    private String reasonForTreatment;
    private String therapistRequired;
    private String ifPreviousPsychiatrist;
    private String sleepingHabbit;
    private String currentPhysicalHealth;
    private String gender;
    private String preferedPsychiatristGender;
    private String state;
    private String requestId;
    private User user;
    private String status;
    private TestDirectory userAssignedTestDirectory;
    private TestReportDirectory testReportDirectory;
    private TestResultDirectory testResultDirectory;
    private PrescriptionDirectory prescriptionDirectry;
    private GeneralTherapist generalTherapist;
    private ExpertTherapist exprtTherapist;
    private TestReporter testReporter;
    private String testComment;

    public Request(String reasonForTreatment) {
        Random rnd = new Random();
        requestId = "Req-" + rnd.nextInt(99999);
        this.reasonForTreatment = reasonForTreatment;
    }
    

    public String getReasonForTreatment() {
        return reasonForTreatment;
    }

    public void setReasonForTreatment(String reasonForTreatment) {
        this.reasonForTreatment = reasonForTreatment;
    }

    public String getTherapistRequired() {
        return therapistRequired;
    }

    public void setTherapistRequired(String therapistRequired) {
        this.therapistRequired = therapistRequired;
    }

    public String getIfPreviousPsychiatrist() {
        return ifPreviousPsychiatrist;
    }

    public void setIfPreviousPsychiatrist(String ifPreviousPsychiatrist) {
        this.ifPreviousPsychiatrist = ifPreviousPsychiatrist;
    }

    public String getSleepingHabbit() {
        return sleepingHabbit;
    }

    public void setSleepingHabbit(String sleepingHabbit) {
        this.sleepingHabbit = sleepingHabbit;
    }

    public String getCurrentPhysicalHealth() {
        return currentPhysicalHealth;
    }

    public void setCurrentPhysicalHealth(String currentPhysicalHealth) {
        this.currentPhysicalHealth = currentPhysicalHealth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPreferedPsychiatristGender() {
        return preferedPsychiatristGender;
    }

    public void setPreferedPsychiatristGender(String preferedPsychiatristGender) {
        this.preferedPsychiatristGender = preferedPsychiatristGender;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public TestDirectory getUserAssignedTestDirectory() {
        if(userAssignedTestDirectory == null){
            userAssignedTestDirectory = new TestDirectory();
        }
        return userAssignedTestDirectory;
    }

    public TestReportDirectory getTestReportDirectory() {
        if(testReportDirectory == null){
            testReportDirectory = new TestReportDirectory();
        }
        return testReportDirectory;
    }

    public TestResultDirectory getTestResultDirectory() {
         if(testResultDirectory == null){
            testResultDirectory = new TestResultDirectory();
        }
        return testResultDirectory;
    }

    public PrescriptionDirectory getPrescriptionDirectry() {
        if(prescriptionDirectry == null){
            prescriptionDirectry = new PrescriptionDirectory();
        }
        return prescriptionDirectry;
    }

    public GeneralTherapist getGeneralTherapist() {
        return generalTherapist;
    }

    public void setGeneralTherapist(GeneralTherapist generalTherapist) {
        this.generalTherapist = generalTherapist;
    }

    public ExpertTherapist getExprtTherapist() {
        return exprtTherapist;
    }

    public void setExprtTherapist(ExpertTherapist exprtTherapist) {
        this.exprtTherapist = exprtTherapist;
    }

    public TestReporter getTestReporter() {
        return testReporter;
    }

    public void setTestReporter(TestReporter testReporter) {
        this.testReporter = testReporter;
    }

    public String getTestComment() {
        return testComment;
    }

    public void setTestComment(String testComment) {
        this.testComment = testComment;
    }
    
    
    @Override
    public String toString() {
        return requestId;
    }
 
}
