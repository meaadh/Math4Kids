package com.example.socce.math4kids;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button= (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent first= new Intent(MainActivity.this ,SignActivity.class);
                startActivity(first);
            }
        });
        Button button1= (Button) findViewById(R.id.button3);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent first2= new Intent(MainActivity.this ,StudentActivity.class);
                startActivity(first2);
            }
        });
    }


    static {
        System.loadLibrary("native-lib");
    }
}
