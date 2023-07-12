package com.example.infobook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton special;
    private ImageButton taumiel;
    private ImageButton keter;
    private ImageButton euclid;
    private ImageButton safe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        special = findViewById(R.id.special);
        taumiel = findViewById(R.id.taumiel);
        keter = findViewById(R.id.keter);
        euclid = findViewById(R.id.euclid);
        safe = findViewById(R.id.safe);

        special.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), special.class);
                startActivity(intent);
            }
        });
        taumiel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), taumiel.class);
                startActivity(intent);
            }
        });
        keter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), keter.class);
                startActivity(intent);
            }
        });
        euclid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), euclid.class);
                startActivity(intent);
            }
        });
        safe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), safe.class);
                startActivity(intent);
            }
        });



    }
}