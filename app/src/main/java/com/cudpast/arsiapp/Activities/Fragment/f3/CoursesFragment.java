package com.cudpast.arsiapp.Activities.Fragment.f3;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;


import com.cudpast.arsiapp.Course.curso01;
import com.cudpast.arsiapp.Course.curso02;
import com.cudpast.arsiapp.Course.curso03;
import com.cudpast.arsiapp.R;


public class CoursesFragment extends Fragment {

    CardView btnc1,btnc2,btnc3;
    private ImageView p1, p2, p3;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_courses, container, false);

        btnc1 = root.findViewById(R.id.btnc1);
        btnc2 = root.findViewById(R.id.btnc2);
        btnc3 = root.findViewById(R.id.btnc3);

        p1 = root.findViewById(R.id.prueba1);
        p2 = root.findViewById(R.id.prueba2);
        p3 = root.findViewById(R.id.prueba3);


        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), curso01.class);
                startActivity(intent);
            }
        });

        p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), curso02.class);
                startActivity(intent);
            }
        });

        p3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), curso03.class);
                startActivity(intent);
            }
        });


        btnc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), curso01.class);
                startActivity(intent);
            }
        });

        btnc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), curso02.class);
                startActivity(intent);
            }
        });

        btnc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), curso03.class);
                startActivity(intent);
            }
        });




        return root;
    }
}