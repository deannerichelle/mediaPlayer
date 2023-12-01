package com.zybooks.mediaplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CompleteScreen extends AppCompatActivity {
    TextView tvDownloading;
    Button btnHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete_screen);
        tvDownloading = findViewById(R.id.tvDownloading);
        tvDownloading.setText("Download complete :)");

        // This button will open the MainActivity
        btnHome = findViewById(R.id.btnHome);
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CompleteScreen.this, MainActivity.class));
            }
        });
    }
}
