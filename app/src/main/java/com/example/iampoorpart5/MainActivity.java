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
        button = (Button)findViewById(R.id.button);
        button2 = (Button)findViewById(R.id.button2);
        text = findViewById(R.id.textView);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                if (button.getText().toString().equals("RICH")) {
                    text.setText("I AM RICH");
                    text.setTextColor(Color.RED);
                }
                else{
                    text.setText("I AM RICH");
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (button2.getText().toString().equals("POOR")) {
                    text.setText("I AM POOR");
                    text.setTextColor(Color.GREEN);
                } else {
                    text.setText("I AM RICH");
                }
            }
        });
    }
}
