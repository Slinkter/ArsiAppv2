package com.cudpast.arsiapp.Activities.Servicio;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.cudpast.arsiapp.R;

public class Servicio02 extends AppCompatActivity {

    Dialog myDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servicio02);

        Button btnsgi = findViewById(R.id.btnSgiPhone);
        btnsgi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:986710389"));
                startActivity(intent);
            }
        });

        myDialog = new Dialog(this);


    }


    public void ShowPopup(View v) {
        TextView txtclose;

        myDialog.setContentView(R.layout.popupsgi1);
        txtclose = myDialog.findViewById(R.id.txtclose);
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        // myDialog.getWindow().
        myDialog.show();


    }

    public void ShowPopup2(View v) {
        TextView txtclose;
        myDialog.setContentView(R.layout.popupsgi2);
        txtclose = myDialog.findViewById(R.id.txtclose);
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        // myDialog.getWindow().
        myDialog.show();
    }

    public void ShowPopup3(View v) {
        TextView txtclose;
        myDialog.setContentView(R.layout.popupsgi3);
        txtclose = myDialog.findViewById(R.id.txtclose);
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        // myDialog.getWindow().
        myDialog.show();
    }
}