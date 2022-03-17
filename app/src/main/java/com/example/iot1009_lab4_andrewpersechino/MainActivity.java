package com.example.iot1009_lab4_andrewpersechino;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> arrayList;
    EditText editText;
    ListView listView;
    Button addButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arrayList = new ArrayList<>();
        editText = findViewById(R.id.editText);
        listView = findViewById(R.id.listView);
        addButton = findViewById(R.id.addButton);

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.select_dialog_multichoice, arrayList);
        listView.setAdapter(arrayAdapter);

    }
}