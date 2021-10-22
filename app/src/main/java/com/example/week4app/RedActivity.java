package com.example.week4app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.red_activity);

        final Button greenButton = findViewById(R.id.redbutton);

        Intent navigateToGreenActivity = new Intent(this, GreenActivity.class);

        greenButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(navigateToGreenActivity);
            }
        });
    }
}