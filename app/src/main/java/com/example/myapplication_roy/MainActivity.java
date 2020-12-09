package com.example.myapplication_roy;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;
import com.google.android.youtube.player.YouTubeStandalonePlayer;

public class MainActivity extends YouTubeBaseActivity {

    private static final String API_KEY = "AIzaSyC3l0Lg5WF0wrvkm6aHzy2GZEkGPn03zf0";
    private final String Youtube_ID = "ndAyMMOqWts";


    YouTubePlayerView mYoutubePlayerView;
    YouTubePlayer.OnInitializedListener mOnInitializedListener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //YouTube表示１
//		Intent intent = YouTubeStandalonePlayer.createVideoIntent(this, API_KEY,"ndAyMMOqWts" );
//		startActivity(intent);

        //YouTube表示２
        mYoutubePlayerView = findViewById(R.id.view);
        mOnInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo(Youtube_ID);
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
            }
        };

        mYoutubePlayerView.initialize(API_KEY, mOnInitializedListener);

        Log.i("log","onCreate");
    }


    //[[メニューバー]] p280
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_bar, menu);

        Log.i("log", "onCreateOptionsMenu");

        return true;
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.top:
                Intent i = new Intent(getApplication(), WebActivity.class);
                startActivity(i);
                break;

            case R.id.store:
                Intent i2 = new Intent(getApplication(), StoreActivity.class);
                startActivity(i2);
                break;

            case R.id.contact:
                Intent i3 = new Intent(getApplication(), ContactActivity.class);
                startActivity(i3);
                break;
        }

        Log.i("log", "onCreateOptionsItemSelected");

        return true;
    }
}