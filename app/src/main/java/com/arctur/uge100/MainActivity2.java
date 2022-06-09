package com.arctur.uge100;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity2 extends AppCompatActivity {
    ImageButton Theory, Tests, Practice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main2);

        Theory = (ImageButton) findViewById(R.id.theory);
        Tests = (ImageButton) findViewById(R.id.tests);
        Practice = (ImageButton) findViewById(R.id.practice);

        Theory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent learn = new Intent(MainActivity2.this, Theories.class);
                startActivity(learn);
            }
        });
    }
}