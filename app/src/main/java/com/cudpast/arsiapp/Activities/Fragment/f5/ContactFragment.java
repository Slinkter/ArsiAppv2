package com.cudpast.arsiapp.Activities.Fragment.f5;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.cudpast.arsiapp.R;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public class ContactFragment  extends Fragment {



    TextView c1_wsp, c1_gmail, c1_phone;


    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_contact, container, false);

        c1_wsp = root.findViewById(R.id.c1_wsp);
        c1_gmail = root.findViewById(R.id.c1_gmail);
        c1_phone = root.findViewById(R.id.c1_phone);

        c1_wsp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("smsto:" + "+51986710389");
                Intent i = new Intent(Intent.ACTION_SENDTO, uri);
                i.setPackage("com.whatsapp");
                startActivity(i);
            }
        });

        c1_gmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                String[] recipients = {"asistente_gerencia@consultingarsi.com"};//Add multiple recipients here
                intent.putExtra(Intent.EXTRA_EMAIL, recipients);
                intent.putExtra(Intent.EXTRA_SUBJECT, "Presupuesto "); //Add Mail Subject
                intent.putExtra(Intent.EXTRA_TEXT, "Buenas , quisiera un presupuesto ...");//Add mail body
                intent.setType("text/html");
                intent.setPackage("com.google.android.gm");//Added Gmail Package to forcefully open Gmail App
                startActivity(Intent.createChooser(intent, "Send mail"));
            }
        });

        c1_phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:986710389"));
                startActivity(intent);
            }
        });


        return root;
    }



}
