package com.drl.student.system.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Childissue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int ChildIssueID;
    private String Type;
    private String Created_date;
    private String Description;
    private int Story_points;
    private int Status;

    private String Summary;

    private String Assignee;

    private String Sprint;

    private String ReqOfTest;

    private int DevEstimatedSP;

    private int TestEstimatedSP;

    private int TotalSP;

    private String Priority;

    private String Reporter;

    public Childissue() {
    }

    public int getIssueID() {
        return ChildIssueID;
    }

    public void setIssueID(int issueID) {
        ChildIssueID = issueID;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getCreated_date() {
        return Created_date;
    }

    public void setCreated_date(String created_date) {
        Created_date = created_date;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getStory_points() {
        return Story_points;
    }

    public void setStory_points(int story_points) {
        Story_points = story_points;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = status;
    }

    public String getSummary() {
        return Summary;
    }

    public void setSummary(String summary) {
        Summary = summary;
    }

    public String getAssignee() {
        return Assignee;
    }

    public void setAssignee(String assignee) {
        Assignee = assignee;
    }

    public String getSprint() {
        return Sprint;
    }

    public void setSprint(String sprint) {
        Sprint = sprint;
    }

    public String getReqOfTest() {
        return ReqOfTest;
    }

    public void setReqOfTest(String reqOfTest) {
        ReqOfTest = reqOfTest;
    }

    public int getDevEstimatedSP() {
        return DevEstimatedSP;
    }

    public void setDevEstimatedSP(int devEstimatedSP) {
        DevEstimatedSP = devEstimatedSP;
    }

    public int getTestEstimatedSP() {
        return TestEstimatedSP;
    }

    public void setTestEstimatedSP(int testEstimatedSP) {
        TestEstimatedSP = testEstimatedSP;
    }

    public int getTotalSP() {
        return TotalSP;
    }

    public void setTotalSP(int totalSP) {
        TotalSP = totalSP;
    }

    public String getPriority() {
        return Priority;
    }

    public void setPriority(String priority) {
        Priority = priority;
    }

    public String getReporter() {
        return Reporter;
    }

    public void setReporter(String reporter) {
        Reporter = reporter;
    }
}
