package net.androidbootcamp.myplaylist;

import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RatingBar;

public class MainActivity extends AppCompatActivity {

    ImageButton song1, song2, song3;
    MediaPlayer mpMarsh, mpBoomBox, mpMigos;
    int playing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        song1 = (ImageButton) findViewById(R.id.marshBtn);
        song2 = (ImageButton) findViewById(R.id.boomBtn);
        song3 = (ImageButton) findViewById(R.id.migosBtn);

        mpMarsh = MediaPlayer.create(this, R.raw.selenaandmarsh);
        mpBoomBox = MediaPlayer.create(this, R.raw.boomboxcartel);
        mpMigos = MediaPlayer.create(this, R.raw.migos);

        song1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(playing){
                    case 0:
                        mpMarsh.start();
                        playing = 1;
                        song1.setImageResource(R.drawable.pause);
                        song2.setVisibility(View.INVISIBLE);
                        song3.setVisibility(View.INVISIBLE);
                        break;
                    case 1:
                        mpMarsh.pause();
                        playing = 0;
                        song1.setImageResource(R.drawable.play);
                        song2.setVisibility(View.VISIBLE);
                        song3.setVisibility(View.VISIBLE);
                        break;
                }
            }
        });

        song2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(playing){
                    case 0:
                        mpBoomBox.start();
                        playing = 1;
                        song2.setImageResource(R.drawable.pause);
                        song1.setVisibility(View.INVISIBLE);
                        song3.setVisibility(View.INVISIBLE);
                        break;
                    case 1:
                        mpBoomBox.pause();
                        playing = 0;
                        song2.setImageResource(R.drawable.play);
                        song1.setVisibility(View.VISIBLE);
                        song3.setVisibility(View.VISIBLE);
                        break;
                }

            }
        });

        song3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(playing){
                    case 0:
                        mpMigos.start();
                        playing = 1;
                        song3.setImageResource(R.drawable.pause);
                        song2.setVisibility(View.INVISIBLE);
                        song1.setVisibility(View.INVISIBLE);
                        break;
                    case 1:
                        mpMigos.pause();
                        playing = 0;
                        song3.setImageResource(R.drawable.play);
                        song2.setVisibility(View.VISIBLE);
                        song1.setVisibility(View.VISIBLE);
                        break;
                }
            }
        });

    }
}
