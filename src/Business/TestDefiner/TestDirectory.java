/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.TestDefiner;

import java.util.ArrayList;

/**
 *
 * @author juhip
 */
public class TestDirectory {
    
    ArrayList<Test> testList = new ArrayList<>();

    public ArrayList<Test> getTestList() {
        if(testList == null){
            testList = new ArrayList<>();
        }
        return testList;
    }

    public void setTestList(ArrayList<Test> testList) {
        this.testList = testList;
    }
    
    public void addTest(Test test){
        testList.add(test);
    }
    
    public  void removeTest(Test test){
        testList.remove(test);
    }
    
}
