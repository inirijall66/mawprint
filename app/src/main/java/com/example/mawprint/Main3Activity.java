package com.example.mawprint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    public void pindah2(View v) {
        Intent i = new Intent(this, Main2Activity.class);
        startActivity(i);
    }
    public void pindah4(View v) {
        Intent i = new Intent(this, Main4Activity.class);
        startActivity(i);
    }
}
