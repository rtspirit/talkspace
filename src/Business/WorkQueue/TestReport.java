/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author juhip
 */
public class TestReport {
    private String reportDate;
    private String reportDetails;
    private String reportComment;
    private String reportAdvice;

    public TestReport(String reportDate, String reportDetails, String reportComment, String reportAdvice) {
        this.reportDate = reportDate;
        this.reportDetails = reportDetails;
        this.reportComment = reportComment;
        this.reportAdvice = reportAdvice;
    }

    public String getReportDate() {
        return reportDate;
    }

    public void setReportDate(String reportDate) {
        this.reportDate = reportDate;
    }

    public String getReportDetails() {
        return reportDetails;
    }

    public void setReportDetails(String reportDetails) {
        this.reportDetails = reportDetails;
    }

    public String getReportComment() {
        return reportComment;
    }

    public void setReportComment(String reportComment) {
        this.reportComment = reportComment;
    }

    public String getReportAdvice() {
        return reportAdvice;
    }

    public void setReportAdvice(String reportAdvice) {
        this.reportAdvice = reportAdvice;
    }

    @Override
    public String toString() {
        return reportComment;
    }

    
    
}
