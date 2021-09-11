package com.exemple.Launchpad;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    ImageButton button_drum, button_piano, button_guitar, button_left,
            button_right, button_up, button_down;
    ToggleButton button_effect;
    public static Button button_1, button_2, button_3, button_4, button_5, button_6,
            button_7, button_8, button_9, button_10, button_11, button_12,
            button_13, button_14, button_15;
    String select = "drum"; // 악기 선택 변수
    int sound1, sound2, sound3, sound4, sound5, sound6, sound7,
            sound8, sound9, sound10, sound11, sound12,
            sound13, sound14, sound15;
    Boolean effect = false;
    SoundPool soundPool;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_drum = (ImageButton)findViewById(R.id.Button_drum);
        button_piano = (ImageButton)findViewById(R.id.Button_piano);
        button_guitar = (ImageButton)findViewById(R.id.Button_guitar);
        button_1 = (Button)findViewById(R.id.button_1); button_2 = (Button)findViewById(R.id.button_2);
        button_3 = (Button)findViewById(R.id.button_3); button_4 = (Button)findViewById(R.id.button_4);
        button_5 = (Button)findViewById(R.id.button_5); button_6 = (Button)findViewById(R.id.button_6);
        button_7 = (Button)findViewById(R.id.button_7); button_8 = (Button)findViewById(R.id.button_8);
        button_9 = (Button)findViewById(R.id.button_9); button_10 = (Button)findViewById(R.id.button_10);
        button_11 = (Button)findViewById(R.id.button_11); button_12 = (Button)findViewById(R.id.button_12);
        button_13 = (Button)findViewById(R.id.button_13); button_14 = (Button)findViewById(R.id.button_14);
        button_15 = (Button)findViewById(R.id.button_15); button_up = (ImageButton)findViewById(R.id.Button_up);
        button_down = (ImageButton)findViewById(R.id.Button_down); button_left = (ImageButton)findViewById(R.id.Button_left);
        button_right = (ImageButton)findViewById(R.id.Button_right); button_effect = (ToggleButton) findViewById(R.id.button_effect);
        soundPool = new SoundPool(15, AudioManager.STREAM_MUSIC,0);
        Button_Touch_effect bte = new Button_Touch_effect();
        defaultSet();

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

        button_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bte.action_up();
            }
        });
        button_down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bte.action_down();
            }
        });
        button_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bte.action_left();
            }
        });
        button_right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bte.action_right();
            }
        });
        button_effect.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    effect = true;
                } else {
                    effect = false;
                }
            }
        });

        button_1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN :
                        soundPool.play(sound1,1f,1f,0,0,1f);
                        break;
                    case MotionEvent.ACTION_UP :
                        if (effect == true) bte.btn_1_1();
                        break;
                }
                return false;
            }
        });
        button_2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN :
                        soundPool.play(sound2,1f,1f,0,0,1f);
                        break;
                    case MotionEvent.ACTION_UP :
                        if (effect == true) bte.btn_1_2();
                        break;
                }
                return false;
            }
        });
        button_3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN :
                        soundPool.play(sound3,1f,1f,0,0,1f);
                        break;
                    case MotionEvent.ACTION_UP :
                        if (effect == true) bte.btn_1_3();
                        break;
                }
                return false;
            }
        });
        button_4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN :
                        soundPool.play(sound4,1f,1f,0,0,1f);
                        break;
                    case MotionEvent.ACTION_UP :
                        if (effect == true) bte.btn_1_4();
                        break;
                }
                return false;
            }
        });
        button_5.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN :
                        soundPool.play(sound5,1f,1f,0,0,1f);
                        break;
                    case MotionEvent.ACTION_UP :
                        if (effect == true) bte.btn_2_1();
                        break;
                }
                return false;
            }
        });
        button_6.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN :
                        soundPool.play(sound6,1f,1f,0,0,1f);
                        break;
                    case MotionEvent.ACTION_UP :
                        if (effect == true) bte.btn_2_2();
                        break;
                }
                return false;
            }
        });
        button_7.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN :
                        soundPool.play(sound7,1f,1f,0,0,1f);
                        break;
                    case MotionEvent.ACTION_UP :
                        if (effect == true) bte.btn_2_3();
                        break;
                }
                return false;
            }
        });
        button_8.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN :
                        soundPool.play(sound8,1f,1f,0,0,1f);
                        break;
                    case MotionEvent.ACTION_UP :
                        if (effect == true) bte.btn_2_4();
                        break;
                }
                return false;
            }
        });
        button_9.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN :
                        soundPool.play(sound9,1f,1f,0,0,1f);
                        break;
                    case MotionEvent.ACTION_UP :
                        if (effect == true) bte.btn_3_1();
                        break;
                }
                return false;
            }
        });
        button_10.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN :
                        soundPool.play(sound10,1f,1f,0,0,1f);
                        break;
                    case MotionEvent.ACTION_UP :
                        if (effect == true) bte.btn_3_2();
                        break;
                }
                return false;
            }
        });
        button_11.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN :
                        soundPool.play(sound11,1f,1f,0,0,1f);
                        break;
                    case MotionEvent.ACTION_UP :
                        if (effect == true) bte.btn_3_3();
                        break;
                }
                return false;
            }
        });
        button_12.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN :
                        soundPool.play(sound12,1f,1f,0,0,1f);
                        break;
                    case MotionEvent.ACTION_UP :
                        if (effect == true) bte.btn_3_4();
                        break;
                }
                return false;
            }
        });
        button_13.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN :
                        soundPool.play(sound13,1f,1f,0,0,1f);
                        break;
                    case MotionEvent.ACTION_UP :
                        if (effect == true) bte.btn_1_5();
                        break;
                }
                return false;
            }
        });
        button_14.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN :
                        soundPool.play(sound14,1f,1f,0,0,1f);
                        break;
                    case MotionEvent.ACTION_UP :
                        if (effect == true) bte.btn_2_5();
                        break;
                }
                return false;
            }
        });
        button_15.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN :
                        soundPool.play(sound15,1f,1f,0,0,1f);
                        break;
                    case MotionEvent.ACTION_UP :
                        if (effect == true) bte.btn_3_5();
                        break;
                }
                return false;
            }
        });

    }

    private void defaultSet() {
        sound1 = soundPool.load(this, R.raw.drum_base, 0);
        sound2 = soundPool.load(this, R.raw.drum_crash, 0);
        sound3 = soundPool.load(this, R.raw.drum_hihat, 0);
        sound4 = soundPool.load(this, R.raw.drum_ride, 0);
        sound5 = soundPool.load(this, R.raw.drum_1, 0);
        sound6 = soundPool.load(this, R.raw.drum_2, 0);
        sound7 = soundPool.load(this, R.raw.drum_stick, 0);
        sound8 = soundPool.load(this, R.raw.drum_3, 0);
        sound9 = soundPool.load(this, R.raw.drum_4, 0);
        sound10 = soundPool.load(this, R.raw.drum_5, 0);
        sound11 = soundPool.load(this, R.raw.drum_6, 0);
        sound12 = soundPool.load(this, R.raw.drum_7, 0);
        sound13 = soundPool.load(this, R.raw.drum_8, 0);
        sound14 = soundPool.load(this, R.raw.drum_9, 0);
        sound15 = soundPool.load(this, R.raw.drum_10, 0);
    }

    private void cate_set(String select) {
        switch (select) {
            case "drum" :
                sound1 = soundPool.load(this, R.raw.drum_base, 0);
                sound2 = soundPool.load(this, R.raw.drum_crash, 0);
                sound3 = soundPool.load(this, R.raw.drum_hihat, 0);
                sound4 = soundPool.load(this, R.raw.drum_ride, 0);
                sound5 = soundPool.load(this, R.raw.drum_1, 0);
                sound6 = soundPool.load(this, R.raw.drum_2, 0);
                sound7 = soundPool.load(this, R.raw.drum_stick, 0);
                sound8 = soundPool.load(this, R.raw.drum_3, 0);
                sound9 = soundPool.load(this, R.raw.drum_4, 0);
                sound10 = soundPool.load(this, R.raw.drum_5, 0);
                sound11 = soundPool.load(this, R.raw.drum_6, 0);
                sound12 = soundPool.load(this, R.raw.drum_7, 0);
                sound13 = soundPool.load(this, R.raw.drum_8, 0);
                sound14 = soundPool.load(this, R.raw.drum_9, 0);
                sound15 = soundPool.load(this, R.raw.drum_10, 0);
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
                sound13 = soundPool.load(this, R.raw.guitar_hit, 0);
                sound14 = soundPool.load(this, R.raw.guitar_slide, 0);
                sound15 = soundPool.load(this, R.raw.guitar_da_ra_ra, 0);
                break;
            case "piano":
                sound1 = soundPool.load(this, R.raw.piano_d3, 0);
                sound2 = soundPool.load(this, R.raw.piano_d4, 0);
                sound3 = soundPool.load(this, R.raw.piano_e3, 0);
                sound4 = soundPool.load(this, R.raw.piano_g2, 0);
                sound5 = soundPool.load(this, R.raw.piano_g3, 0);
                sound6 = soundPool.load(this, R.raw.piano_a2, 0);
                sound7 = soundPool.load(this, R.raw.piano_a3, 0);
                sound8 = soundPool.load(this, R.raw.piano_b2, 0);
                sound9 = soundPool.load(this, R.raw.piano_b3, 0);
                sound10 = soundPool.load(this, R.raw.piano_b3sharp, 0);
                sound11 = soundPool.load(this, R.raw.piano_do, 0);
                sound12 = soundPool.load(this, R.raw.piano_rae, 0);
                sound13 = soundPool.load(this, R.raw.piano_mi, 0);
                sound14 = soundPool.load(this, R.raw.piano_pha, 0);
                sound15 = soundPool.load(this, R.raw.piano_sol, 0);
                break;

        }
    }


}