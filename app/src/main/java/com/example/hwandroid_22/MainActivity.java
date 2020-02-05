package com.example.hwandroid_22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView txtBot = findViewById(R.id.textBot);
        txtBot.setText("http://myfile.org/" + rnd(100));

        BtnNext ();
        BtnBack();
    }

    public void BtnNext () {

        final TextView txtBot = findViewById(R.id.textBot);
        Button btnNext = findViewById(R.id.btnNext);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    public void BtnBack () {

        Button btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    public static void main(String... args) {
        final int max = 100;
        final int rnd = rnd(max);
    }

    public static int rnd(int max) {
        return (int) (Math.random() * ++max);
    }
}
