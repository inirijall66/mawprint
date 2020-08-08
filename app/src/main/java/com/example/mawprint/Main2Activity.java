package com.example.mawprint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void home(View v) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
        public void pindah3(View v) {
            Intent i = new Intent(this, Main3Activity.class);
            startActivity(i);
        }
}
