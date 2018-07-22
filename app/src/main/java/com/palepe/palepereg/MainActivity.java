package com.palepe.palepereg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import java.nio.file.Files;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ShowLogo();

        FrameLayout mOpenTableWindow_fl =(FrameLayout) findViewById(R.id.rezervavimas_fl);

        mOpenTableWindow_fl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TablesActivity.class);
                startActivity(intent);
            }
        });

    }

    public void ShowLogo (){
        Intent intent = new Intent(this, StartLogoActivity.class);
        startActivity(intent);
    }
}
