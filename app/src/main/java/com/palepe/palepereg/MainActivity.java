package com.palepe.palepereg;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        ShowLogo();

        FrameLayout mOpenTableWindow_fl =(FrameLayout) findViewById(R.id.rezervavimas_fl);
        FrameLayout mOpenAdminSettingsWindow_fl = (FrameLayout) findViewById(R.id.admin_settings_button_fl);
        FrameLayout mOpenInfoWindow_fl = (FrameLayout) findViewById(R.id.info_button_fl);

        mOpenTableWindow_fl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TablesActivity.class);
                startActivity(intent);
            }
        });

        mOpenAdminSettingsWindow_fl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AdminSettingsActivity.class);
                startActivity(intent);
            }
        });

        mOpenInfoWindow_fl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, InfoActivity.class);
                startActivity(intent);
            }
        });

    }

    public void ShowLogo (){
        Intent intent = new Intent(this, StartLogoActivity.class);
        startActivity(intent);
    }
}
