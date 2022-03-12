package com.example.Library_Management_System.response;

public class IssueResponse {
    private int iid;
    private String status;
    private int statusCode;

    @Override
    public String toString() {
        return "IssueResponse{" +
                "iid=" + iid +
                ", status='" + status + '\'' +
                ", statusCode=" + statusCode +
                '}';
    }

    public int getIid() {
        return iid;
    }

    public void setIid(int iid) {
        this.iid = iid;
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
