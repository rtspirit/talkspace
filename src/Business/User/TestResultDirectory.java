/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.User;

import java.util.ArrayList;

/**
 *
 * @author juhip
 */
public class TestResultDirectory {
    ArrayList<TestResult> testResultList = new ArrayList<>();

    public ArrayList<TestResult> getTestResultList() {
        if(testResultList == null){
            testResultList = new ArrayList<>();
        }
        return testResultList;
    }
    
    public void addResult(TestResult testResult){
        testResultList.add(testResult);
    }
    
    public void removeResult(TestResult testResult){
        testResultList.remove(testResult);
    }
    
}
