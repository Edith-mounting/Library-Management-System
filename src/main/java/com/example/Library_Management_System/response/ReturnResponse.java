package com.example.Library_Management_System.response;

public class ReturnResponse {
    private int rid;
    private int code;
    private String statusCode;

    @Override
    public String toString() {
        return "ReturnResponse{" +
                "rid=" + rid +
                ", code=" + code +
                ", statusCode='" + statusCode + '\'' +
                '}';
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }
}
