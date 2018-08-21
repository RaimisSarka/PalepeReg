package com.palepe.palepereg;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AdminSettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_settings);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        FrameLayout mPlayingTable1Button_fl = (FrameLayout) findViewById(R.id.stalas1_uzimtas_fl);
        FrameLayout mReservedTable1Button_fl = (FrameLayout) findViewById(R.id.stalas1_rezervuotas_fl);
        FrameLayout mFreeTable1Button_fl = (FrameLayout) findViewById(R.id.stalas1_laisvas_fl);

        mPlayingTable1Button_fl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef1 = database.getReference("stalas1");

                myRef1.setValue("Užimtas");
            }
        });

        mReservedTable1Button_fl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef1 = database.getReference("stalas1");

                myRef1.setValue("Rezervuotas");
            }
        });

        mFreeTable1Button_fl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef1 = database.getReference("stalas1");

                myRef1.setValue("Laisvas");
            }
        });

    }
}
