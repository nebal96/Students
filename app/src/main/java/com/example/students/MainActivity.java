package com.example.students;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;
public class MainActivity extends AppCompatActivity {
    List<Student> studentsList = new ArrayList<>();
    RecyclerView students_rv;
    StudentAdapter studentAdapter ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        students_rv = findViewById(R.id.students_list);
        students_rv.setLayoutManager(new LinearLayoutManager(this));
        studentAdapter = new StudentAdapter(this, studentsList);
        students_rv.setAdapter(studentAdapter);
    }
    private void initData() {

        studentsList . add(new Student("nebal", "3th" , "91" , "20158588"));
        studentsList . add(new Student("lena", "4th" , "81" , "20158588"));
        studentsList . add(new Student("hadeel", "5th" , "79" , "20158588"));
        studentsList . add(new Student("mohammed", "1th" , "77" , "20158588"));
        studentsList . add(new Student("dena", "3th" , "88" , "20158588"));

    }
}