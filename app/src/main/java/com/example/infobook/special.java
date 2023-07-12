package com.example.infobook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;

public class special extends AppCompatActivity {

    private ListView list;
    private String[] objectList= {"SCP-@@@", "SCP-XXX"};
    private ArrayList<String> arrayList = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_special);
        list = findViewById(R.id.list);

        Collections.addAll(arrayList, objectList);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_multiple_choice, objectList);
        list.setAdapter(adapter);

    }
}