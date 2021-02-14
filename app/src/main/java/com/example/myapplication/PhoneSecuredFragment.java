package com.example.myapplication;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

public class PhoneSecuredFragment extends Fragment {

    private Button btnCancel;
    private ImageButton imgBtnConfirm;
    private NavController navController;


    public PhoneSecuredFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_phone_secured, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(view);

        imgBtnConfirm = view.findViewById(R.id.BtnConfirm);
        btnCancel = view.findViewById(R.id.BtnCancel);

        imgBtnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_phoneSecuredFragment_to_measuringPunchFragment);
            }
        });

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_phoneSecuredFragment_to_studentProfileFragment);
            }
        });

    }
}