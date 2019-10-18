package com.example.studentapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.studentapplication.adapter.SummaryLVAdapter;
import com.example.studentapplication.model.CourseEnrollment;
import com.example.studentapplication.model.Student;
import com.example.studentapplication.model.StudentDB;

import java.util.ArrayList;

public class SummaryLVActivity extends Activity {

    protected ListView mSummaryView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.summary_listview);

        createStudentObjects();
        mSummaryView = findViewById(R.id.summary_list_view_id);
        SummaryLVAdapter ad = new SummaryLVAdapter();
        mSummaryView.setAdapter(ad);

    }

    protected void createStudentObjects() {
        // Creating Adam Student object
        Student s = new Student("Adam", "Villarosa", 80311);
        ArrayList<CourseEnrollment> courses = new ArrayList<CourseEnrollment>();
        courses.add(new CourseEnrollment("CPSC256", "A"));
        s.setCourses(courses);
        ArrayList<Student> studentList = new ArrayList<Student>();
        studentList.add(s);

        // Creating Alan Student object
        s = new Student("Alan", "Newsie", 209345);
        courses = new ArrayList<CourseEnrollment>();
        courses.add(new CourseEnrollment("CPSC411", "C+"));
        s.setCourses(courses);
        studentList.add(s);



        //
        StudentDB.getInstance().setStudents(studentList);
    }
}
