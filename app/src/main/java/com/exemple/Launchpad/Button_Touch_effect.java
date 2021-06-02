package com.exemple.Launchpad;

import android.os.Handler;

public class Button_Touch_effect {

    MainActivity ma = new MainActivity();
    public void btn_1() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //9 10 11 12 15
                ma.button_2.setBackgroundResource(R.drawable.btn_orange);
                ma.button_5.setBackgroundResource(R.drawable.btn_orange);
                ma.button_6.setBackgroundResource(R.drawable.btn_orange);
            }
        },20);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //9 10 11 12 15
                ma.button_3.setBackgroundResource(R.drawable.btn_orange);
                ma.button_7.setBackgroundResource(R.drawable.btn_orange);
                ma.button_9.setBackgroundResource(R.drawable.btn_orange);
                ma.button_10.setBackgroundResource(R.drawable.btn_orange);
                ma.button_11.setBackgroundResource(R.drawable.btn_orange);
            }
        },70);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //9 10 11 12 15
                ma.button_2.setBackgroundResource(R.drawable.selector_blue);
                ma.button_5.setBackgroundResource(R.drawable.selector_orange);
                ma.button_6.setBackgroundResource(R.drawable.selector_blue);
            }
        },90);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                ma.button_4.setBackgroundResource(R.drawable.btn_orange);
                ma.button_8.setBackgroundResource(R.drawable.btn_orange);
                ma.button_12.setBackgroundResource(R.drawable.btn_orange);
            }
        },120);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                ma.button_3.setBackgroundResource(R.drawable.selector_purple);
                ma.button_7.setBackgroundResource(R.drawable.selector_purple);
                ma.button_9.setBackgroundResource(R.drawable.selector_orange);
                ma.button_10.setBackgroundResource(R.drawable.selector_blue);
                ma.button_11.setBackgroundResource(R.drawable.selector_purple);
            }
        },140);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                ma.button_13.setBackgroundResource(R.drawable.btn_orange);
                ma.button_14.setBackgroundResource(R.drawable.btn_orange);
                ma.button_15.setBackgroundResource(R.drawable.btn_orange);
            }
        },170);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                ma.button_4.setBackgroundResource(R.drawable.selector_yellow);
                ma.button_8.setBackgroundResource(R.drawable.selector_yellow);
                ma.button_12.setBackgroundResource(R.drawable.selector_yellow);
            }
        },190);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                ma.button_13.setBackgroundResource(R.drawable.selector_green);
                ma.button_14.setBackgroundResource(R.drawable.selector_green);
                ma.button_15.setBackgroundResource(R.drawable.selector_green);
            }
        },220);

    }

    public void btn_2() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //9 10 11 12 15
                ma.button_1.setBackgroundResource(R.drawable.btn_blue);
                ma.button_3.setBackgroundResource(R.drawable.btn_blue);
                ma.button_5.setBackgroundResource(R.drawable.btn_blue);
                ma.button_6.setBackgroundResource(R.drawable.btn_blue);
                ma.button_7.setBackgroundResource(R.drawable.btn_blue);
            }
        },20);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                ma.button_4.setBackgroundResource(R.drawable.btn_blue);
                ma.button_8.setBackgroundResource(R.drawable.btn_blue);
                ma.button_9.setBackgroundResource(R.drawable.btn_blue);
                ma.button_10.setBackgroundResource(R.drawable.btn_blue);
                ma.button_11.setBackgroundResource(R.drawable.btn_blue);
                ma.button_12.setBackgroundResource(R.drawable.btn_blue);
            }
        },70);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                ma.button_1.setBackgroundResource(R.drawable.selector_orange);
                ma.button_3.setBackgroundResource(R.drawable.selector_purple);
                ma.button_5.setBackgroundResource(R.drawable.selector_orange);
                ma.button_6.setBackgroundResource(R.drawable.selector_blue);
                ma.button_7.setBackgroundResource(R.drawable.selector_purple);
            }
        },90);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                ma.button_13.setBackgroundResource(R.drawable.btn_blue);
                ma.button_14.setBackgroundResource(R.drawable.btn_blue);
                ma.button_15.setBackgroundResource(R.drawable.btn_blue);
            }
        },120);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                ma.button_4.setBackgroundResource(R.drawable.selector_yellow);
                ma.button_8.setBackgroundResource(R.drawable.selector_yellow);
                ma.button_9.setBackgroundResource(R.drawable.selector_orange);
                ma.button_10.setBackgroundResource(R.drawable.selector_blue);
                ma.button_11.setBackgroundResource(R.drawable.selector_purple);
                ma.button_12.setBackgroundResource(R.drawable.selector_yellow);
            }
        },140);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                ma.button_13.setBackgroundResource(R.drawable.selector_blue);
                ma.button_14.setBackgroundResource(R.drawable.selector_blue);
                ma.button_15.setBackgroundResource(R.drawable.selector_blue);
            }
        },190);


    }

}
