package com.ugb.parcial_i;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TabHost;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = findViewById(android.R.id.tabhost);
        tabHost.setup();

        TabHost.TabSpec spec;

        spec = tabHost.newTabSpec("Calcular");
        spec.setContent(R.id.Calcular);
        spec.setIndicator("Calcular");
        tabHost.addTab(spec);

        spec = tabHost.newTabSpec("Conversor");
        spec.setContent(R.id.Conversor);
        spec.setIndicator("Conversor");
        tabHost.addTab(spec);

    }

}

