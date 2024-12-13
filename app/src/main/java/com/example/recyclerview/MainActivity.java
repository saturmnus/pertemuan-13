package com.example.recyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        // Hardcoded data
        List<Student> students = new ArrayList<>();
        students.add(new Student("123456", "Alice Johnson", "alice@gmail.com", "01/01/2000"));
        students.add(new Student("123457", "Bob Smith", "bob@gmail.com", "02/02/2001"));
        students.add(new Student("123458", "Charlie Brown", "charlie@gmail.com", "03/03/2002"));
        students.add(new Student("123459", "Diana Prince", "diana@gmail.com", "04/04/2003"));
        students.add(new Student("123460", "Eve Adams", "eve@gmail.com", "05/05/2004"));

        StudentAdapter adapter = new StudentAdapter(students);
        recyclerView.setAdapter(adapter);
    }
}