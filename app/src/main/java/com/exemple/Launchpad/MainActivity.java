package com.exemple.Launchpad;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton button_drum, button_piano, button_guitar, button_1, button_2, button_3,
            button_4, button_5, button_6, button_7, button_8, button_9, button_10, button_11, button_12,
            button_13, button_14, button_15, button_left, button_right, button_up, button_down;
    String select = "drum"; // 악기 선택 변수
    int sound1, sound2, sound3, sound4, sound5, sound6, sound7, sound8, sound9, sound10, sound11, sound12,
            sound13, sound14, sound15;
    SoundPool soundPool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_drum = (ImageButton)findViewById(R.id.Button_drum);
        button_piano = (ImageButton)findViewById(R.id.Button_piano);
        button_guitar = (ImageButton)findViewById(R.id.Button_guitar);
        button_1 = (ImageButton)findViewById(R.id.button_1); button_2 = (ImageButton)findViewById(R.id.button_2);
        button_3 = (ImageButton)findViewById(R.id.button_3); button_4 = (ImageButton)findViewById(R.id.button_4);
        button_5 = (ImageButton)findViewById(R.id.button_5); button_6 = (ImageButton)findViewById(R.id.button_6);
        button_7 = (ImageButton)findViewById(R.id.button_7); button_8 = (ImageButton)findViewById(R.id.button_8);
        button_9 = (ImageButton)findViewById(R.id.button_9); button_10 = (ImageButton)findViewById(R.id.button_10);
        button_11 = (ImageButton)findViewById(R.id.button_11); button_12 = (ImageButton)findViewById(R.id.button_12);
        button_13 = (ImageButton)findViewById(R.id.button_13); button_14 = (ImageButton)findViewById(R.id.button_14);
        button_15 = (ImageButton)findViewById(R.id.button_15); button_up = (ImageButton)findViewById(R.id.Button_up);
        button_down = (ImageButton)findViewById(R.id.Button_down); button_left = (ImageButton)findViewById(R.id.Button_left);
        button_right = (ImageButton)findViewById(R.id.Button_right);
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

        button_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                action_up();
            }
        });

        button_down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                action_down();
            }
        });

        button_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                action_left();
            }
        });

        button_right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                action_right();
            }
        });

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
        button_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(sound13,1f,1f,0,0,1f);
            }
        });
        button_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(sound14,1f,1f,0,0,1f);
            }
        });
        button_15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(sound15,1f,1f,0,0,1f);
            }
        });


    }

    private void action_up() {
        button_9.setImageResource(R.drawable.btn_orange);
        button_10.setImageResource(R.drawable.btn_blue);
        button_11.setImageResource(R.drawable.btn_purple);
        button_12.setImageResource(R.drawable.btn_yellow);
        button_15.setImageResource(R.drawable.btn_green);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //9 10 11 12 15
                button_9.setImageResource(R.drawable.selector_orange);
                button_10.setImageResource(R.drawable.selector_blue);
                button_11.setImageResource(R.drawable.selector_purple);
                button_12.setImageResource(R.drawable.selector_yellow);
                button_15.setImageResource(R.drawable.selector_green);

                button_5.setImageResource(R.drawable.btn_orange);
                button_6.setImageResource(R.drawable.btn_blue);
                button_7.setImageResource(R.drawable.btn_purple);
                button_8.setImageResource(R.drawable.btn_yellow);
                button_14.setImageResource(R.drawable.btn_green);
            }
        },200);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //9 10 11 12 15
                button_5.setImageResource(R.drawable.selector_orange);
                button_6.setImageResource(R.drawable.selector_blue);
                button_7.setImageResource(R.drawable.selector_purple);
                button_8.setImageResource(R.drawable.selector_yellow);
                button_14.setImageResource(R.drawable.selector_green);

                button_1.setImageResource(R.drawable.btn_orange);
                button_2.setImageResource(R.drawable.btn_blue);
                button_3.setImageResource(R.drawable.btn_purple);
                button_4.setImageResource(R.drawable.btn_yellow);
                button_13.setImageResource(R.drawable.btn_green);
            }
        },400);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                button_1.setImageResource(R.drawable.selector_orange);
                button_2.setImageResource(R.drawable.selector_blue);
                button_3.setImageResource(R.drawable.selector_purple);
                button_4.setImageResource(R.drawable.selector_yellow);
                button_13.setImageResource(R.drawable.selector_green);
            }
        },600);

    }

    private void action_down() {
    }

    private void action_left() {
    }

    private void action_right() {
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