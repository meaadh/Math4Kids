package com.example.socce.math4kids;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
public class StudentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_main);
        Button button= (Button) findViewById(R.id.button6);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent first= new Intent(StudentActivity.this ,AssignmentActivity.class);
                startActivity(first);
            }
        });
    }


    static {
        System.loadLibrary("native-lib");
    }
}
