package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView numbersTxtView = findViewById(R.id.numbers);
        TextView familyTxtView = findViewById(R.id.family);
        TextView colorsTxtView = findViewById(R.id.colors);
        TextView phrasesTxtView = findViewById(R.id.phrases);

        numbersTxtView.setOnClickListener(view -> {
            Intent intent = new Intent(this, NumbersActivity.class);
            startActivity(intent);
        });

        familyTxtView.setOnClickListener(view -> {
            Intent intent = new Intent(this, FamilyActivity.class);
            startActivity(intent);
        });

        colorsTxtView.setOnClickListener(view -> {
            Intent intent = new Intent(this, ColorsActivity.class);
            startActivity(intent);
        });

        phrasesTxtView.setOnClickListener(view -> {
            Intent intent = new Intent(this, PhrasesActivity.class);
            startActivity(intent);
        });
    }
}