/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.TestDefiner;

import Business.Organization.Organization;
import java.util.ArrayList;

/**
 *
 * @author juhip
 */
public class Test {
    private String testName;
    private String questions;
    private ArrayList<String> answerList = new ArrayList<>();

    public Test(String testName, String questions) {
        this.testName = testName;
        this.questions = questions;
    }

   
    public String getQuestions() {
        return questions;
    }

    public ArrayList<String> getAnswerList() {
        if(answerList == null){
        answerList = new ArrayList<>();
        }
        return answerList;
    }

    public void setQuestions(String questions) {
        this.questions = questions;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    @Override
    public String toString() {
        return getTestName();
    }
 
}
