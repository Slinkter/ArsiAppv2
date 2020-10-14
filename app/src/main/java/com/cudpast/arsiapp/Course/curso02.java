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

public class curso02 extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Note> noteList;
    NotesAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curso02);

        Toolbar toolbar = findViewById(R.id.toolbarc02);
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back);
        toolbar.setTitle("Investigación de Accodentes");
        toolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        recyclerView = findViewById(R.id.reciclyView_B_Bloqueo);
        LinearLayoutManager lm = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(lm);
        initializedData();
        adapter = new NotesAdapter(getApplicationContext(), noteList);
        recyclerView.setAdapter(adapter);
    }

    public void initializedData() {
        noteList = new ArrayList<>();
        noteList.add(new Note(0, "Presentación", "BgbIIvM_fTE"));
        noteList.add(new Note(1, "Procedimientos", "SHuS0VP3YaQ"));
        noteList.add(new Note(2, "¿Qué accidentes se deben de investigar?", "6-R63x9YPxI"));
        noteList.add(new Note(3, "¿Quién debe investigar los accidentes?", "XAs82n7hFh8"));
        noteList.add(new Note(4, "Investigaciones efectivas ", "ezWTXVY4tYE"));
        noteList.add(new Note(5, "¿Cómo fomentar el reporte de incidentes ?", "pGacnUSQPsk"));
        noteList.add(new Note(6, "Video ", "lz5TbmSW7CY"));
        noteList.add(new Note(7, "Responsabilidades del Investigador", "0_zXVV6uWxk"));
        noteList.add(new Note(8, "Tipos de evidencias", "kmOtHL0kHGs"));
        noteList.add(new Note(9, "Modelo de causalidad de accidentes y pérdidas", "s42VVj3_EFA"));
        noteList.add(new Note(10, "Modelo de causalidad de pérdidas del sistema NOSA", "HWLtpnzchak"));
        noteList.add(new Note(11, "Programa efectivo de investigación", "wJ3Sd_8x1WE"));
        noteList.add(new Note(12, "Casos de accidentes", "JtCwpCYnbRQ"));
        noteList.add(new Note(13, "Definición de investigación de incidentes", "7DWCGoGe25M"));
        noteList.add(new Note(14, "Definición ", "ji0G7iFpIN4"));
        noteList.add(new Note(15, "Contacto", "GTQD3CRlbjM"));
        noteList.add(new Note(16, "Causas de los incidentes", "mNyHv0dKuVE"));
        noteList.add(new Note(17, "Responsables", "-ahDJ5nSWTs"));

    }
}