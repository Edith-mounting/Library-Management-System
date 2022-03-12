package com.example.Library_Management_System.pojo;

import javax.persistence.*;

@Entity
@Table(name = "returned_books")
public class ReturnedBook {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rid")
    private int rid;

    @Column(name = "bid")
    private int bid;

    @Column(name = "uid")
    private int uid;

    @Override
    public String toString() {
        return "ReturnedBook{" +
                "rid=" + rid +
                ", bid=" + bid +
                ", uid=" + uid +
                ", returnDate='" + returnDate + '\'' +
                '}';
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
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

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    @Column(name = "return_date")
    private String returnDate;

}
