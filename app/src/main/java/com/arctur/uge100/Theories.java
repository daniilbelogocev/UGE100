package com.arctur.uge100;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;

public class Theories extends AppCompatActivity {

    ListView listView;

    int var2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_theories);

        listView = (ListView) findViewById(R.id.ListView);

        final String[] TaskNames = getResources().getStringArray(R.array.tasks);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                R.layout.resourse_item, TaskNames);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View itemClicked, int position,
                                    long id) {
                String a = ((TextView) itemClicked).getText().toString();
                a = a.substring(8,9);
                Intent intent = new Intent(Theories.this, Learn.class);
                intent.putExtra("FileName", a+".txt");
                startActivity(intent);
            }
        });
    }
}