/*
Name: Rachael
Date: 10/19/2023
Project Name: I am poor part 5
 */
package com.example.iampoorpart5;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;

//IMPORT THESE IF NOT ALREADY PRESENT
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button;
    Button button2;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        text = findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                verifyRichness(button);
            }

        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                verifyRichness(button2);
            }
        });
    }
    private void verifyRichness(Button button){
        String buttonText = button.getText().toString();

        if (buttonText.equals("RICH")) {
            text.setText("I AM RICH");
        }
        else if (buttonText.equals("POOR")) {
            text.setText("I AM POOR");
        }
    }
}
