package com.example.Library_Management_System.response;

public class BookResponse {
    private int bid;
    private String status;
    private int statusCode;

    @Override
    public String toString() {
        return "BookResponse{" +
                "bid=" + bid +
                ", status='" + status + '\'' +
                ", statusCode=" + statusCode +
                '}';
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }
}
