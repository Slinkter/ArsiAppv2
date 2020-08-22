package com.cudpast.arsiapp.Activities.Fragment.f5;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.cudpast.arsiapp.R;

public class ContactFragment  extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_contact, container, false);
        final TextView textView = root.findViewById(R.id.text_contact);
        textView.setText("hola desde 5");
        return root;
    }
}
