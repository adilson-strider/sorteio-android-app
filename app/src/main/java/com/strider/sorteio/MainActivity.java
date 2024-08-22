package com.strider.sorteio;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void drawNumber(View view){

        // Set text by id
        TextView text = findViewById(R.id.textResult);

        // Create a random object
        Random rand = new Random();

        // Convert in string and set text
        text.setText(String.valueOf(rand.nextInt(10) + 1));
    }
}