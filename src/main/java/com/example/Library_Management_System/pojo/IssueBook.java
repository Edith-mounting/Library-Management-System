package com.example.Library_Management_System.pojo;

import javax.persistence.*;

@Entity
@Table(name = "issued_books")
public class IssueBook {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IID")
    private int iid;
    @Column(name = "bid")
    private int bid;
    @Column(name = "UID")
    private int uid;
    @Column(name = "Issued_date")
    private String issueDate;

    @Override
    public String toString() {
        return "IssueBook{" +
                "uid=" + uid +
                ", bid=" + bid +
                ", iid=" + iid +
                ", issueDate='" + issueDate + '\'' +
                '}';
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public int getIid() {
        return iid;
    }

    public void setIid(int iid) {
        this.iid = iid;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }
}
