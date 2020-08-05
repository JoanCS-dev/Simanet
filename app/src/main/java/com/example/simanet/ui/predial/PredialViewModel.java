package com.example.simanet.ui.predial;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PredialViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public PredialViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("this is predial fragment");
    }

    public LiveData<String> getText(){return mText;}
}
