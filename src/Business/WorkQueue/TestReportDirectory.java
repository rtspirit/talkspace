/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author juhip
 */
public class TestReportDirectory {
    ArrayList<TestReport> testReportDirectory = new ArrayList<>();

    public ArrayList<TestReport> getTestReportDirectory() {
        if(testReportDirectory == null){
              testReportDirectory = new ArrayList<>();
        }
        return testReportDirectory;
    }
    
    public void addTestReport(TestReport test){
            testReportDirectory.add(test);
    
    }
    
    public void removeTestReport(TestReport test){
        testReportDirectory.remove(test);
    }
    
    
}
