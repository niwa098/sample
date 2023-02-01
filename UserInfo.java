package com.example.mywordapp.data;

public class UserInfo {
    private String user;
    private String passWord;

    public UserInfo(String user, String passWord) {
        this.user = user;
        this.passWord = passWord;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "user='" + user + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }
}
