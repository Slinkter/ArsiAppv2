package com.cudpast.arsiapp.Activities.Fragment.f2;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;


import com.cudpast.arsiapp.Activities.Servicio.Servicio01;
import com.cudpast.arsiapp.Activities.Servicio.Servicio02;
import com.cudpast.arsiapp.Activities.Servicio.Servicio03;
import com.cudpast.arsiapp.R;

public class ServicesFragment extends Fragment {



    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View root = inflater.inflate(R.layout.fragment_services, container, false);
        CardView s1 = root.findViewById(R.id.btnservicio01);
        CardView s2 = root.findViewById(R.id.btnservicio02);
        CardView s3 = root.findViewById(R.id.btnservicio03);

        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplication(), Servicio01.class);
                startActivity(intent);
            }
        });


        s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplication(), Servicio02.class);
                startActivity(intent);
            }
        });

        s3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplication(), Servicio03.class);
                startActivity(intent);
            }
        });








        return root;
    }
}