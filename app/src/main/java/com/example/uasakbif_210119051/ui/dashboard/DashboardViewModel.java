package com.example.uasakbif_210119051.ui.dashboard;

//<!--    //Nama :Rahmayudhi Prakoso-->
//        <!--    //Nim  :10119051-->
//        <!--    //Kelas:IF-2-->

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DashboardViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public DashboardViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dashboard fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}