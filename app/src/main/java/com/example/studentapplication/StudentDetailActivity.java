package com.example.studentapplication;

import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.studentapplication.model.Student;
import com.example.studentapplication.model.StudentDB;

public class StudentDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_detail);

        int studentIndex = getIntent().getIntExtra("StudentIndex", 0);

        // 1. Populate the First Name, Last Name, and CWID
        Student sObj = StudentDB.getInstance().getStudents().get(studentIndex);
        EditText fNameView = (EditText) findViewById(R.id.first_name_val_id);
        EditText lNameView = (EditText) findViewById(R.id.last_name_val_id);
        EditText cNameView = (EditText) findViewById(R.id.cwid_val_id);
        fNameView.setText(sObj.getFirstName());
        lNameView.setText(sObj.getLastName());
        cNameView.setText(String.valueOf(sObj.getCwid()));

        // 2. Populate the CourseEnrollment List
    }
}
