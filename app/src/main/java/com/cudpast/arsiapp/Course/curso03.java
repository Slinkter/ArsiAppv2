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

public class curso03 extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Note> noteList;
    NotesAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curso03);

        Toolbar toolbar = findViewById(R.id.toolbarc03);
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back);
        toolbar.setTitle("Seguridad Basada ");
        toolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        recyclerView = (RecyclerView) findViewById(R.id.reciclyView_C_Bloqueo);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        initializedData();
        adapter = new NotesAdapter(getApplicationContext(), noteList);
        recyclerView.setAdapter(adapter);
    }

    public void initializedData() {
        noteList = new ArrayList<>();
        noteList.add(new Note(0, "Presentación", "d9WKjMFodsM"));
        noteList.add(new Note(1, "Introducción visual conductual", "pt8ypykwWSw"));
        noteList.add(new Note(2, "¿Por qué suceden los accidentes?", "-EYQ8-XMEZw"));
        noteList.add(new Note(3, "Modelo de causalidad de perdidas ", "9OEyEc5OQKM"));
        noteList.add(new Note(4, "Seguridad basada en el comportamiento (SBC) ", "e7tgxqp0JqU"));
        noteList.add(new Note(5, "Estrategia tradicional", "Rcm4QvuhNNo"));
        noteList.add(new Note(6, "¿En qué consiste la SBC?", "ZpSXXRienuI"));
        //parte 1
        noteList.add(new Note(7, "El trabajador como protagonista del programa de sbc", "cw63xv9HewA"));
        noteList.add(new Note(8, "Bases científicas del comportamiento", "NgAhDSJMojE"));
        noteList.add(new Note(9, "Mitos o realidades en la seguridad ", "P-BTIz9itiM"));
        noteList.add(new Note(10, "Análisis del comportamiento", "3dUg2MJvJhs"));
        noteList.add(new Note(11, "Ciclo de ACC", "HYYIcr_MGaw"));
        noteList.add(new Note(12, "Las consecuencias más efectivas ", "uDrqIK3P8Bs"));
        noteList.add(new Note(13, "Metodología ", "Hy1MxUGQJko"));
        noteList.add(new Note(14, "Elementos fundamentales", "S-NBvsTS9qI"));
        //parte 2
        noteList.add(new Note(15, "Estructura", "9Icjav5c9RQ"));
        noteList.add(new Note(16, "Rol y responsabilidades ", "4nOpxybXH40"));
        noteList.add(new Note(17, "Capacitación y entrenamiento", "KWcnFUQtjyo"));
        noteList.add(new Note(18, "Procedimientos instructivos y formatos", "8pmdjbvh9zE"));
        noteList.add(new Note(19, "Observación y retroalimentación", "cbVmNXzWSdw"));
        noteList.add(new Note(20, "Los cinco pasos básicos", "e32YsEkaOmU"));

    }
}