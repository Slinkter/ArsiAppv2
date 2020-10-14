package com.cudpast.arsiapp.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.cudpast.arsiapp.Activities.GalleryActivity;
import com.cudpast.arsiapp.Pojo.Note;
import com.cudpast.arsiapp.R;

import java.util.List;

public class NotesAdapter extends RecyclerView.Adapter<NotesAdapter.ViewHolder> {

    Context context;
    List<Note> noteList;

    public NotesAdapter(Context context, List<Note> noteList) {
        this.context = context;
        this.noteList = noteList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.note_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {

        holder.id.setText(String.valueOf(noteList.get(position).getId()));
        holder.title.setText(noteList.get(position).getTitle());
        holder.body.setText(noteList.get(position).getBody());
        // dar click en el cuadro
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // pasar la informacion de un bloque a otra actvidad
                Intent intent = new Intent(context, GalleryActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP );
                intent.putExtra("title", noteList.get(position).getTitle());
                intent.putExtra("body", noteList.get(position).getBody());
                context.startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK));
            }
        });
    }

    @Override
    public int getItemCount() {
        return noteList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        CardView cardView;
        TextView id;
        TextView title;
        TextView body;
        ImageView imageView;
        Button link;

        public ViewHolder(View itemView) {
            super(itemView);

            cardView = (CardView) itemView.findViewById(R.id.cardView);
            id = (TextView) itemView.findViewById(R.id.id);
            title = (TextView) itemView.findViewById(R.id.title);
            body = (TextView) itemView.findViewById(R.id.body);
            imageView = (ImageView) itemView.findViewById(R.id.logo1);


        }
    }

}

