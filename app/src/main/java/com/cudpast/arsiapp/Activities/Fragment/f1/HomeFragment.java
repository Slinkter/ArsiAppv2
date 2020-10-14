package com.cudpast.arsiapp.Activities.Fragment.f1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;


import com.cudpast.arsiapp.R;
import com.google.firebase.auth.FirebaseAuth;

public class HomeFragment extends Fragment {

    FirebaseAuth firebaseAuth;
    TextView username;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);

        username = root.findViewById(R.id.username);

        firebaseAuth = FirebaseAuth.getInstance();

        username.setText(firebaseAuth.getCurrentUser().getDisplayName());


        return root;
    }


}