package com.example.Library_Management_System.response;

public class UserResponse {
    private int uid;
    private String status;
    private int code;

    @Override
    public String toString() {
        return "UserResponse{" +
                "uid=" + uid +
                ", status='" + status + '\'' +
                ", code='" + code + '\'' +
                '}';
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
