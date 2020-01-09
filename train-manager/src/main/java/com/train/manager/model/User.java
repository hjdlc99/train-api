package com.train.manager.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class User implements Serializable {

    private int userId;
    private String userName;
    private String password;
    private String phone;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString(){

        Map<String,Object> userMap = new HashMap<>();
        userMap.put("userId",userId);
        userMap.put("userName",userName);
        userMap.put("password",password);
        userMap.put("phone",phone);
        return userMap.toString();
    }
}
