package com.mano.todolist;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {
    ListView myListView;
    Button addBtn;
    EditText task;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addBtn = findViewById(R.id.add);
        task = findViewById(R.id.task);
        myListView = findViewById(R.id.todo);
        ArrayList<String> friendList = new ArrayList<String>();


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, friendList);
        myListView.setAdapter(arrayAdapter);

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                String text = "Item" + position+ " " + ((TextView) view).getText().toString();
                Toast.makeText(MainActivity.this,text , Toast.LENGTH_SHORT).show();
            }
        });

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                friendList.add(task.getText().toString());
                arrayAdapter.notifyDataSetChanged();
                Collections.sort(friendList);
                task.setText("");
            }});

    }
}