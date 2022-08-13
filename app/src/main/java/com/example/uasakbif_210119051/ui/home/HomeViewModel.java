package com.example.uasakbif_210119051.ui.home;

//<!--    //Nama :Rahmayudhi Prakoso-->
//        <!--    //Nim  :10119051-->
//        <!--    //Kelas:IF-2-->

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}