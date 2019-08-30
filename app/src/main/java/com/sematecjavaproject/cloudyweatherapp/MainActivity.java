package com.sematecjavaproject.cloudyweatherapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        DrawerLayout drawerLayout = findViewById(R.id.drawerLayout);
        Button btnChangeCity = findViewById(R.id.btnChangeCity);

        btnChangeCity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent searchActivityIntent = new Intent(MainActivity.this, SearchActivity.class);
                startActivity(searchActivityIntent);
            }
        });
    }
}
