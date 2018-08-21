package com.palepe.palepereg;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class TablesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tables);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        final String TAG = "mesages";
        Integer st1;
        final Integer st2;
        final Integer st3;
        final Integer st4;

        FrameLayout firstTable_fl = (FrameLayout) findViewById(R.id.stalas1_fl);
        FrameLayout secondTable_fl = (FrameLayout) findViewById(R.id.stalas2_fl);
        FrameLayout thirdTable_fl = (FrameLayout) findViewById(R.id.stalas3_fl);
        FrameLayout forthTablr_fl = (FrameLayout) findViewById(R.id.stalas4_fl);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference myRef1 = database.getReference("stalas1");
        final DatabaseReference myRef2 = database.getReference("stalas2");
        final DatabaseReference myRef3 = database.getReference("stalas3");
        final DatabaseReference myRef4 = database.getReference("stalas4");

        firstTable_fl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                myRef1.setValue("rezervuotas");
            }
        });

        secondTable_fl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myRef2.setValue("rezervuotas");
            }
        });

        thirdTable_fl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myRef3.setValue("rezervuotas");
            }
        });

        forthTablr_fl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myRef4.setValue("rezervuotas");
            }
        });

        // Read from the database
        myRef1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                String value = dataSnapshot.getValue(String.class);
                Log.d(TAG, "Stalas 1: " + value);

                TextView mStalas1Busena_tv = (TextView) findViewById(R.id.stalas1_busena_tv);
                mStalas1Busena_tv.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.w(TAG, "Failed to read value.", error.toException());
            }
        });

        // Read from the database
        myRef2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                String value = dataSnapshot.getValue(String.class);
                Log.d(TAG, "Stalas 2: " + value);
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.w(TAG, "Failed to read value.", error.toException());
            }
        });

        // Read from the database
        myRef3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                String value = dataSnapshot.getValue(String.class);
                Log.d(TAG, "Stalas 3: " + value);
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.w(TAG, "Failed to read value.", error.toException());
            }
        });

        // Read from the database
        myRef4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                String value = dataSnapshot.getValue(String.class);
                Log.d(TAG, "Stalas 4: " + value);
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.w(TAG, "Failed to read value.", error.toException());
            }
        });
    }
}
