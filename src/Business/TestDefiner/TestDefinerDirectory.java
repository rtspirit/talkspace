/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.TestDefiner;

import Business.GeneralTherapist.GeneralTherapist;
import java.util.ArrayList;

/**
 *
 * @author juhip
 */
public class TestDefinerDirectory {
    ArrayList<TestDefiner> testDefinerList = new ArrayList<>();

    public ArrayList<TestDefiner> getTestDefinerList() {
        if(testDefinerList == null){
            testDefinerList = new ArrayList<>();
        }
        return testDefinerList;
    }
    
    public void addTestDefiner(TestDefiner testD){
        testDefinerList.add(testD);
    }
    public void removeTestDefiner(TestDefiner testD){
        testDefinerList.remove(testD);
    }
    
     public TestDefiner findUserByUserName(String username){
        TestDefiner user = null;
        
        for(TestDefiner usr: testDefinerList){
        if(usr.getUsername().equalsIgnoreCase(username)){
            user=usr;
        }
        }
        return user;
     }
}
