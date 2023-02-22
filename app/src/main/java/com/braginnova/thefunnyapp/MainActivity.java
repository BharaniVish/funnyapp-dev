package com.braginnova.thefunnyapp;


import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {


    LinearLayout mainLayout,jokesLayout,punsLayout,songsLayout,memesLayout,themeLayout,settingsLayout,socialLayout;
    TextView titleText, captionText, menuText, jokesText, punsText, songsText, memesText, themeText, settingsText, socialText;
    ImageView theme;
    Boolean isNight = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        titleText = findViewById(R.id.titleText);
        captionText = findViewById(R.id.captionText);

        mainLayout = findViewById(R.id.mainLayout);
        jokesLayout = findViewById(R.id.jokesSwitch);
        punsLayout = findViewById(R.id.punsSwitch);
        songsLayout = findViewById(R.id.songsSwitch);
        memesLayout = findViewById(R.id.memesSwitch);
        themeLayout = findViewById(R.id.themeSwitch);
        settingsLayout = findViewById(R.id.settingsSwitch);
        socialLayout = findViewById(R.id.socialTab);

        menuText = findViewById(R.id.menuText);
        jokesText = findViewById(R.id.jokeText);
        punsText = findViewById(R.id.punsText);
        songsText = findViewById(R.id.songsText);
        memesText = findViewById(R.id.memeText);
        themeText = findViewById(R.id.themeText);
        settingsText = findViewById(R.id.settingsText);
        socialText = findViewById(R.id.socialText);

        theme = findViewById(R.id.theme);

    }

    @SuppressLint("NonConstantResourceId")
    public void onSwitchClick(View v)
    {
        Intent i;
        switch(v.getId())
        {
            case R.id.themeSwitch:
                if (!isNight)
                {
                    titleText.setTextColor(getResources().getColor(R.color.colorBlack));
                    captionText.setTextColor(getResources().getColor(R.color.colorBlack));

                    mainLayout.setBackgroundResource(R.color.colorPrimaryDark);
                    jokesLayout.setBackgroundResource(R.drawable.curve_black_bg);
                    punsLayout.setBackgroundResource(R.drawable.curve_black_bg);
                    songsLayout.setBackgroundResource(R.drawable.curve_black_bg);
                    memesLayout.setBackgroundResource(R.drawable.curve_black_bg);
                    themeLayout.setBackgroundResource(R.drawable.curve_black_bg);
                    settingsLayout.setBackgroundResource(R.drawable.curve_black_bg);
                    socialLayout.setBackgroundResource(R.drawable.curve_black_bg);

                    menuText.setTextColor(getResources().getColor(R.color.colorWhitish));
                    jokesText.setTextColor(getResources().getColor(R.color.colorWhitish));
                    punsText.setTextColor(getResources().getColor(R.color.colorWhitish));
                    songsText.setTextColor(getResources().getColor(R.color.colorWhitish));
                    memesText.setTextColor(getResources().getColor(R.color.colorWhitish));
                    themeText.setTextColor(getResources().getColor(R.color.colorWhitish));
                    themeText.setText(R.string.day_mode);
                    settingsText.setTextColor(getResources().getColor(R.color.colorWhitish));
                    socialText.setTextColor(getResources().getColor(R.color.colorWhitish));

                    theme.setImageResource(R.drawable.day_mode);

                    isNight = true;
                }
                else
                {
                    titleText.setTextColor(getResources().getColor(R.color.colorWhite));
                    captionText.setTextColor(getResources().getColor(R.color.colorWhite ));

                    mainLayout.setBackgroundResource(R.color.colorWhitish);
                    jokesLayout.setBackgroundResource(R.drawable.curve_white_bg);
                    punsLayout.setBackgroundResource(R.drawable.curve_white_bg);
                    songsLayout.setBackgroundResource(R.drawable.curve_white_bg);
                    memesLayout.setBackgroundResource(R.drawable.curve_white_bg);
                    themeLayout.setBackgroundResource(R.drawable.curve_white_bg);
                    settingsLayout.setBackgroundResource(R.drawable.curve_white_bg);
                    socialLayout.setBackgroundResource(R.drawable.curve_white_bg);

                    menuText.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    jokesText.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    punsText.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    songsText.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    memesText.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    themeText.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    themeText.setText(R.string.night_mode);
                    settingsText.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    socialText.setTextColor(getResources().getColor(R.color.colorPrimaryDark));

                    theme.setImageResource(R.drawable.night_mode);

                    isNight = false;
                }
                break;

            case R.id.settingsSwitch:
                i = new Intent(this, SettingsActivity.class);
                startActivity(i);
                break;

            case R.id.jokesSwitch:
                i = new Intent(this, JokesActivity.class);
                startActivity(i);
                break;

            case R.id.punsSwitch:
                i = new Intent(this, PunsActivity.class);
                startActivity(i);
                break;

            case R.id.songsSwitch:
                i = new Intent(this, SongsActivity.class);
                startActivity(i);
                break;

            case R.id.memesSwitch:
                i = new Intent(this, MemesActivity.class);
                startActivity(i);
                break;
        }
    }
}