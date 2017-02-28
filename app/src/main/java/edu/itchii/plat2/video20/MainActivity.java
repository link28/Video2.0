package edu.itchii.plat2.video20;


import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    private VideoView miVideoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        miVideoView=(VideoView)findViewById(R.id.videoView);



        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+ R.raw.intromono);


        miVideoView.setVideoURI(uri);
        miVideoView.setMediaController(new MediaController(this));
        miVideoView.start();
        miVideoView.requestFocus();
    }
}
