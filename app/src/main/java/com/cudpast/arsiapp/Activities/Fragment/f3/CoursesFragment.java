package com.cudpast.arsiapp.Activities.Fragment.f3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;


import com.cudpast.arsiapp.R;


public class CoursesFragment extends Fragment {



    public View onCreateView(@NonNull LayoutInflater inflater,                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_courses, container, false);

        return root;
    }
}