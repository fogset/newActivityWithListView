package com.example.tianhao.multipleactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        Toast.makeText(this,name,Toast.LENGTH_SHORT).show();

    }
    public void previous(View view){
        //Intent intent = new Intent(this,MainActivity.class);
        //startActivity(intent);
        finish();
    }
}
