package com.example.iot1009_lab4_andrewpersechino;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener, View.OnClickListener {
    ArrayList<String> arrayList;
    EditText editText;
    ListView listView;
    Button addButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Setting default values
        arrayList = new ArrayList<>();
        editText = findViewById(R.id.editText);
        listView = findViewById(R.id.listView);
        addButton = findViewById(R.id.addButton);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.select_dialog_multichoice, arrayList);
        listView.setAdapter(arrayAdapter);

        // Setting listeners
        listView.setOnItemClickListener(this);
        addButton.setOnClickListener(this);
    }

    // Add text to list, and clear editText
    @Override
    public void onClick(View view) {
        arrayList.add(editText.getText().toString());
        editText.setText("");
    }

    // Change check value on List
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        CheckedTextView v = (CheckedTextView) view;
        v.setChecked(!v.isChecked());
    }
}