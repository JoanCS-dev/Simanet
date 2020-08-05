package com.example.simanet.ui.diferencias;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.simanet.R;
import com.example.simanet.ui.predial.PredialViewModel;

public class DiferenciasFragment extends Fragment {

    private DiferenciasViewModel diferenciasViewModel;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        diferenciasViewModel = ViewModelProviders.of(this).get(DiferenciasViewModel.class);
        View root = inflater.inflate(R.layout.diferencias_fragment, container, false);
        final TextView txt = root.findViewById(R.id.txt_diferencias);

        diferenciasViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                txt.setText(s);
            }
        });
        return root;
    }

}