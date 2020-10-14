package com.cudpast.arsiapp.Course;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.cudpast.arsiapp.Adapters.NotesAdapter;
import com.cudpast.arsiapp.Pojo.Note;
import com.cudpast.arsiapp.R;

import java.util.ArrayList;
import java.util.List;

public class curso01 extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Note> noteList;
    NotesAdapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curso01);

        Toolbar toolbar = findViewById(R.id.toolbarc01);
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back);
        toolbar.setTitle("Gestión de Seguridad");
        toolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        try {
            recyclerView = findViewById(R.id.reciclyView_A_Bloqueo);
            LinearLayoutManager lm = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
            recyclerView.setLayoutManager(lm);
            initializedData();
            adapter = new NotesAdapter(getApplicationContext(), noteList);
            recyclerView.setAdapter(adapter);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void initializedData() {
        noteList = new ArrayList<>();
        //Política de Seguridad y Salud Ocupacional
        noteList.add(new Note(0, "Presentación", "6OIKFUzEqow"));
        noteList.add(new Note(1, "Política de seguridad y salud ocupacional ", "vhKYUD_qZPs"));
        noteList.add(new Note(2, "Metodologías para La Implementación de IPERC- P1", "_1h5svhcpDg"));
        noteList.add(new Note(2, "Metodologías para La Implementación de IPERC- P2", "omQYa_j4eqY"));
        noteList.add(new Note(3, "Identificación ,Mantenimiento y Evaluación de Requisitos Legales", "d6WPC7esUy4"));
        noteList.add(new Note(4, "Objetivos ,Metas y Programas de Gestión de Seguridad y Salud Ocupacional", "OG9-dM-bFHA"));
        noteList.add(new Note(5, "Funciones y Resposabilidades ", "E1s9TwxvPpk"));
        noteList.add(new Note(6, "Interpretación de la Ley 29783 y su modificación Ley 30222", "ogg0xARsNbY"));
        noteList.add(new Note(7, "Interpretación del D.S. 005-2012-TR y su Modificación D.S. 006-2014-T", "_GRZAXtItYI"));
        noteList.add(new Note(8, "Problemas Globales e Introducción a la seguridad y salud ocupacional", "byNTf6OEf1s"));
        noteList.add(new Note(9, "Desarrollo e implementación de un sistema de gestión de seguridad", "-4eSHpyb5Ok"));

    }
}