package com.arctur.uge100;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Learn extends AppCompatActivity {
    TextView theor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);
        theor = (TextView) findViewById(R.id.text_learn);
        String theori = (String) getIntent().getSerializableExtra("FileName");
        File file = new File("theories", theori);
        try {
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = null;
            line = reader.readLine();
            while (line != null) {
                theor.setText(line);
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}