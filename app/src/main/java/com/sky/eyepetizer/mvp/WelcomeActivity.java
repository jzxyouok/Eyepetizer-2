package com.sky.eyepetizer.mvp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.sky.eyepetizer.R;

import tv.danmaku.ijk.media.player.IjkMediaPlayer;

public class WelcomeActivity extends AppCompatActivity {

    private IjkMediaPlayer mIjkMediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }
}
