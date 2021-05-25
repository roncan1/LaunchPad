package com.exemple.Launchpad;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button_drum, button_piano, button_guitar, button_1, button_2, button_3,
    button_4, button_5, button_6, button_7, button_8, button_9, button_10, button_11, button_12;
    String select = "drum"; // 악기 선택 변수
    SoundPool soundPool;
    int sound1, sound2, sound3, sound4, sound5, sound6, sound7, sound8, sound9, sound10, sound11, sound12;

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

        soundPool = new SoundPool(1, AudioManager.STREAM_MUSIC,0);
        button_drum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                select = "drum";
                cate_set(select);
            }});
        button_piano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                select = "piano";
                cate_set(select);
            }});
        button_guitar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                select = "guitar";
                cate_set(select);
            }});

        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(sound1,1f,1f,0,0,1f);
            }
        });
        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(sound2,1f,1f,0,0,1f);
            }
        });
        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(sound3,1f,1f,0,0,1f);
            }
        });
        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(sound4,1f,1f,0,0,1f);
            }
        });
        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(sound5,1f,1f,0,0,1f);
            }
        });
        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(sound6,1f,1f,0,0,1f);
            }
        });
        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(sound7,1f,1f,0,0,1f);
            }
        });
        button_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(sound8,1f,1f,0,0,1f);
            }
        });
        button_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(sound9,1f,1f,0,0,1f);
            }
        });
        button_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(sound10,1f,1f,0,0,1f);
            }
        });
        button_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(sound11,1f,1f,0,0,1f);
            }
        });
        button_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(sound12,1f,1f,0,0,1f);
            }
        });


    }

    private void cate_set(String select) {
        switch (select) {
            case "drum" :
                sound1 = soundPool.load(this, R.raw.drum_base, 0);
                sound2 = soundPool.load(this, R.raw.drum_crash, 0);
                sound3 = soundPool.load(this, R.raw.drum_hihat, 0);
                sound4 = soundPool.load(this, R.raw.drum_ride, 0);
                sound5 = soundPool.load(this, R.raw.drum_snare, 0);
                sound6 = soundPool.load(this, R.raw.drum_snare2, 0);
                sound7 = soundPool.load(this, R.raw.drum_stick, 0);
                sound8 = soundPool.load(this, R.raw.drum_tom, 0);
                break;
            case "guitar":
                sound1 = soundPool.load(this, R.raw.guitar_ab, 0);
                sound2 = soundPool.load(this, R.raw.guitar_b, 0);
                sound3 = soundPool.load(this, R.raw.guitar_bb, 0);
                sound4 = soundPool.load(this, R.raw.guitar_c1, 0);
                sound5 = soundPool.load(this, R.raw.guitar_c2, 0);
                sound6 = soundPool.load(this, R.raw.guitar_d, 0);
                sound7 = soundPool.load(this, R.raw.guitar_e1, 0);
                sound8 = soundPool.load(this, R.raw.guitar_e2, 0);
                sound9 = soundPool.load(this, R.raw.guitar_eb, 0);
                sound10 = soundPool.load(this, R.raw.guitar_f1, 0);
                sound11 = soundPool.load(this, R.raw.guitar_f2, 0);
                sound12 = soundPool.load(this, R.raw.guitar_g, 0);
                break;

        }
    }


}