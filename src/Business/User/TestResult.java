/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.User;

/**
 *
 * @author juhip
 */
public class TestResult {
    private String testName;
    private String question;
    private String answer;

    public TestResult(String testName, String question, String answer) {
        this.testName = testName;
        this.question = question;
        this.answer = answer;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return testName;
    }
    
    
    
}
