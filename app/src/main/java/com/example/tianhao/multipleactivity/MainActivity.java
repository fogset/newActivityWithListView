package com.example.tianhao.multipleactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listVIew = findViewById(R.id.listView);
        final ArrayList<String> friends = new ArrayList<String>();
        friends.add("Fido");
        friends.add("Sean");
        friends.add("Sarah");
        friends.add("Jane");
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,friends);
        listVIew.setAdapter(arrayAdapter);
        listVIew.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                intent.putExtra("name", friends.get(position));
                startActivity(intent);
            }
        });


    }
    /*
    public void goToNext(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("age", 28);
        startActivity(intent);
    }*/


}
