package com.example.simanet.ui.diferencias;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DiferenciasViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public DiferenciasViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("this is deferencias fragment");
    }

    public LiveData<String> getText(){return mText;}
}