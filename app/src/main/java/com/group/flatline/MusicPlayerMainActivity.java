package com.group.flatline;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MusicPlayerMainActivity extends AppCompatActivity {
    MediaPlayer music;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_player_main);

        music = MediaPlayer.create(this, R.raw.title);
    }
    public void musicplay(View v)
    {
        music.start();
    }

    public void musicpause(View v)
    {
        music.pause();
    }

    public void musicstop(View v)
    {
        music.stop();
        music = MediaPlayer.create(this, R.raw.title);
    }
}
