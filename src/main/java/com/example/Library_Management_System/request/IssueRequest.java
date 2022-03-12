package com.example.Library_Management_System.request;

public class IssueRequest {
    private int bid;
    private int uid;
    private String issueDate;

    @Override
    public String toString() {
        return "IssueRequest{" +
                "bid=" + bid +
                ", uid=" + uid +
                ", issueDate='" + issueDate + '\'' +
                '}';
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }
}
