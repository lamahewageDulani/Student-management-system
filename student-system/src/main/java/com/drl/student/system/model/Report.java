package com.drl.student.system.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Report {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int ReportID;
    private String ReportType;
    private String CreationDate;
    private String ReportTitle;
    private String Date;
    private String Issue;
    private String Event;
    private String EventDetails;

    private int AddedStoryPoints;

    private int CompletedStoryPoints;

    private int RemainingStoryPoints;

    public Report() {
    }

    public int getReportID() {
        return ReportID;
    }

    public void setReportID(int reportID) {
        ReportID = reportID;
    }

    public String getReportType() {
        return ReportType;
    }

    public void setReportType(String reportType) {
        ReportType = reportType;
    }

    public String getCreationDate() {
        return CreationDate;
    }

    public void setCreationDate(String creationDate) {
        CreationDate = creationDate;
    }

    public String getReportTitle() {
        return ReportTitle;
    }

    public void setReportTitle(String reportTitle) {
        ReportTitle = reportTitle;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getIssue() {
        return Issue;
    }

    public void setIssue(String issue) {
        Issue = issue;
    }

    public String getEvent() {
        return Event;
    }

    public void setEvent(String event) {
        Event = event;
    }

    public String getEventDetails() {
        return EventDetails;
    }

    public void setEventDetails(String eventDetails) {
        EventDetails = eventDetails;
    }

    public int getAddedStoryPoints() {
        return AddedStoryPoints;
    }

    public void setAddedStoryPoints(int addedStoryPoints) {
        AddedStoryPoints = addedStoryPoints;
    }

    public int getCompletedStoryPoints() {
        return CompletedStoryPoints;
    }

    public void setCompletedStoryPoints(int completedStoryPoints) {
        CompletedStoryPoints = completedStoryPoints;
    }

    public int getRemainingStoryPoints() {
        return RemainingStoryPoints;
    }

    public void setRemainingStoryPoints(int remainingStoryPoints) {
        RemainingStoryPoints = remainingStoryPoints;
    }
}
