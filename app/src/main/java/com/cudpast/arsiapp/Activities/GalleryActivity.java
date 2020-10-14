package com.cudpast.arsiapp.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.cudpast.arsiapp.R;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class GalleryActivity extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener, YouTubePlayer.PlaybackEventListener {



    private static final String TAG = "GalleryActivity";
    private String ClaveYoutube;


    String id_video_youtube;
    YouTubePlayerView youTubePlayerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        ClaveYoutube = getString(R.string.clave_youtube);

        // "AIzaSyDPJIw5CtWwN8ytw6N8A7qDsgH9o_ns4E4";
        Toolbar toolbar = findViewById(R.id.toolbarvideo);
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back);

        toolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        getIncomingIntent();

        youTubePlayerView = findViewById(R.id.youtubeid);
        try {

            youTubePlayerView.initialize(ClaveYoutube, GalleryActivity.this);
        } catch (Exception e) {
            e.printStackTrace();
        }




    }




    private void getIncomingIntent() {
        if (getIntent().hasExtra("title") && getIntent().hasExtra("body")) {
            String image_name = getIntent().getStringExtra("title");
            id_video_youtube = getIntent().getStringExtra("body");
            setImage(image_name);
        }
    }

    private void setImage(String title) {
        TextView name = findViewById(R.id.image_description);
        name.setText(title);
    }


    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean fueR) {

        if (!fueR) {
            try {

                youTubePlayer.loadVideo(id_video_youtube);
                //youTubePlayer.cueVideo(id_video_youtube);
            } catch (Exception e) {

            }

        }


    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
        if (youTubeInitializationResult.isUserRecoverableError()) {
            youTubeInitializationResult.getErrorDialog(this, 1).show();
        } else {
            String a = "error al inciar youtube " + youTubeInitializationResult.toString();
            Toast.makeText(getApplicationContext(), a, Toast.LENGTH_SHORT).show();
        }
    }


    protected void onActivityResult(int requestCode, int resultcode, Intent data) {
        if (resultcode == 1) {
            getYoutubePlayerProvider().initialize(ClaveYoutube, this);
        }
    }

    protected YouTubePlayer.Provider getYoutubePlayerProvider() {
        return youTubePlayerView;
    }

    @Override
    public void onPlaying() {

    }

    @Override
    public void onPaused() {

    }

    @Override
    public void onStopped() {

    }

    @Override
    public void onBuffering(boolean b) {

    }

    @Override
    public void onSeekTo(int i) {

    }

}