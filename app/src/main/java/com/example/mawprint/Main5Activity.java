package com.example.mawprint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }
    public void pindah6(View v) {
        Intent i = new Intent(this, Main6Activity.class);
        startActivity(i);
    }
    public void pindah4(View v) {
        Intent i = new Intent(this, Main4Activity.class);
        startActivity(i);
    }
}
