package com.exemple.Launchpad;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button_drum, button_piano, button_guitar, button_1, button_2, button_3,
    button_4, button_5, button_6, button_7, button_8, button_9, button_10, button_11, button_12;
    String select = "drum";
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_drum = (Button)findViewById(R.id.Button_drum);
        button_piano = (Button)findViewById(R.id.Button_piano);
        button_guitar = (Button)findViewById(R.id.Button_guitar);
        button_1 = (Button)findViewById(R.id.button_1); button_2 = (Button)findViewById(R.id.button_2);
        button_3 = (Button)findViewById(R.id.button_3); button_4 = (Button)findViewById(R.id.button_4);
        button_5 = (Button)findViewById(R.id.button_5); button_6 = (Button)findViewById(R.id.button_6);
        button_7 = (Button)findViewById(R.id.button_7); button_8 = (Button)findViewById(R.id.button_8);
        button_9 = (Button)findViewById(R.id.button_9); button_10 = (Button)findViewById(R.id.button_10);
        button_11 = (Button)findViewById(R.id.button_11); button_12 = (Button)findViewById(R.id.button_12);

        button_drum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                select = "drum";
            }
        });
        button_piano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                select = "piano";
            }
        });
        button_guitar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                select = "guitar";
            }
        });

        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (select){
                    case "drum":
                        mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.drum_base);
                        mediaPlayer.start();
                        break;
                    case "piano":
                        mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.drum_crash);
                        mediaPlayer.start();
                        break;
                    case "guitar":
                        mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.drum_snare);
                        mediaPlayer.start();
                        break;
                }
            }
        });

    }
}