package com.example.Library_Management_System.pojo;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class Users {
    //can see available books
    //can check or view his/her issued books
    //can check or view his/her returned book status
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="UID")
    private int UID;
    @Column(name = "USERNAME")
    private String userName;
    @Column(name = "USER_TYPE")
    private int userType;

    public int getUID() {
        return UID;
    }

    public void setUID(int UID) {
        this.UID = UID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    @Override
    public String toString() {
        return "User{" +
                "UID=" + UID +
                ", userName='" + userName + '\'' +
                ", userType=" + userType +
                '}';
    }
}
