package com.example.students;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class studentcard extends AppCompatActivity {
     TextView student_name,student_id,student_avg,student_lvl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_studentcard);

        String id = getIntent().getStringExtra("id");
        String name = getIntent().getStringExtra("name");
        String lvl = getIntent().getStringExtra("lvl");
        String avg = getIntent().getStringExtra("avg");


        student_name = findViewById(R.id.student_name);
        student_id = findViewById(R.id.student_id);
        student_avg = findViewById(R.id.student_avg);
        student_lvl = findViewById(R.id.student_lvl);
        student_name.setText(name);
        student_avg.setText(avg);
        student_lvl.setText(lvl);
        student_id.setText(id);

    }
}
