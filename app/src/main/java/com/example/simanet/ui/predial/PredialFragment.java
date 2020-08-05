package com.example.simanet.ui.predial;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.simanet.R;

public class PredialFragment extends Fragment {
    private PredialViewModel predialViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        predialViewModel = ViewModelProviders.of(this).get(PredialViewModel.class);
        View root = inflater.inflate(R.layout.fragment_predial, container, false);
        final TextView txt = root.findViewById(R.id.txt_test);

        predialViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                txt.setText(s);
            }
        });
        return root;
    }
}