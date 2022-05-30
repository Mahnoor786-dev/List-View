package com.mano.todolist;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView myListView = findViewById(R.id.todo);
        ArrayList<String> toDo = new ArrayList<>();
        toDo.add("quiz");
        toDo.add("rest");
        toDo.add("workout");
        toDo.add("cooking");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>();
        ArrayAdapter<String> adapter1 = new ArrayAdapter<>()
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, grocery);
        myListView.setAdapter(arrayAdapter);

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String text = "Item" + position+ " " + ((TextView) view).getText().toString();
                Toast.makeText(MainActivity.this,text , Toast.LENGTH_SHORT).show();

            }
        });
    }
}

