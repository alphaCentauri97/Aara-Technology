package com.example.aaratechnology;

public class LoginResponse {

    RewardPoints rewardPoints;
    String response_code;
    UserData userData;


    public LoginResponse(RewardPoints rewardPoints, UserData userData, String response_code) {
        this.rewardPoints = rewardPoints;
        this.response_code = response_code;
        this.userData = userData;
    }

    public UserData getUserData() {
        return userData;
    }

    public void setUser(UserData userData) {
        this.userData = userData;
    }

    public String getResponse_code() {
        return response_code;
    }

    public void setResponse_code(String response_code) {
        this.response_code = response_code;
    }

}
