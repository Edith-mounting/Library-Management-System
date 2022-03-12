package com.example.Library_Management_System.request;


public class ReturnRequest {
    private int bid;
    private int uid;

    @Override
    public String toString() {
        return "ReturnRequest{" +
                "bid=" + bid +
                ", uid=" + uid +
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
}
