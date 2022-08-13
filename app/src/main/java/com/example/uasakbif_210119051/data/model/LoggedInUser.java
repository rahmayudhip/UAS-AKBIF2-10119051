package com.example.uasakbif_210119051.data.model;

//<!--    //Nama :Rahmayudhi Prakoso-->
//<!--    //Nim  :10119051-->
//<!--    //Kelas:IF-2-->

/**
 * Data class that captures user information for logged in users retrieved from LoginRepository
 */
public class LoggedInUser {

    private String userId;
    private String displayName;

    public LoggedInUser(String userId, String displayName) {
        this.userId = userId;
        this.displayName = displayName;
    }

    public String getUserId() {
        return userId;
    }

    public String getDisplayName() {
        return displayName;
    }
}